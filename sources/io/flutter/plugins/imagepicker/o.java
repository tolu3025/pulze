package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8069b;

    o(Context context, a aVar) {
        this.f8068a = context;
        this.f8069b = aVar;
    }

    private int a(BitmapFactory.Options options, int i3, int i4) {
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        int i7 = 1;
        if (i5 > i4 || i6 > i3) {
            int i8 = i5 / 2;
            int i9 = i6 / 2;
            while (i8 / i7 >= i4 && i9 / i7 >= i3) {
                i7 *= 2;
            }
        }
        return i7;
    }

    private j.f b(double d3, double d4, Double d5, Double d6) {
        double d7 = d3 / d4;
        boolean z2 = false;
        boolean z3 = d5 != null;
        boolean z4 = d6 != null;
        double dMin = z3 ? Math.min(d3, Math.round(d5.doubleValue())) : d3;
        double dMin2 = z4 ? Math.min(d4, Math.round(d6.doubleValue())) : d4;
        boolean z5 = z3 && d5.doubleValue() < d3;
        if (z4 && d6.doubleValue() < d4) {
            z2 = true;
        }
        if (z5 || z2) {
            double d8 = dMin2 * d7;
            double d9 = dMin / d7;
            if (d9 > dMin2) {
                dMin = Math.round(d8);
            } else {
                dMin2 = Math.round(d9);
            }
        }
        return new j.f((float) dMin, (float) dMin2);
    }

    private void c(String str, String str2) throws Throwable {
        try {
            this.f8069b.a(new androidx.exifinterface.media.a(str), new androidx.exifinterface.media.a(str2));
        } catch (Exception e3) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e3);
        }
    }

    private File d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File e(String str, Bitmap bitmap, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        File fileD = d(this.f8068a.getCacheDir(), str);
        FileOutputStream fileOutputStreamF = f(fileD);
        fileOutputStreamF.write(byteArrayOutputStream.toByteArray());
        fileOutputStreamF.close();
        return fileD;
    }

    private FileOutputStream f(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap g(Bitmap bitmap, int i3, int i4, boolean z2) {
        return Bitmap.createScaledBitmap(bitmap, i3, i4, z2);
    }

    private Bitmap h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private File k(Bitmap bitmap, Double d3, Double d4, int i3, String str) {
        return e("/scaled_" + str, g(bitmap, d3.intValue(), d4.intValue(), false), i3);
    }

    j.f i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h(str, options);
        return new j.f(options.outWidth, options.outHeight);
    }

    String j(String str, Double d3, Double d4, int i3) throws Throwable {
        j.f fVarI = i(str);
        if (fVarI.b() == -1.0f || fVarI.a() == -1.0f) {
            return str;
        }
        if (d3 == null && d4 == null && i3 >= 100) {
            return str;
        }
        try {
            String str2 = str.split("/")[r2.length - 1];
            j.f fVarB = b(fVarI.b(), fVarI.a(), d3, d4);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = a(options, (int) fVarB.b(), (int) fVarB.a());
            Bitmap bitmapH = h(str, options);
            if (bitmapH == null) {
                return str;
            }
            File fileK = k(bitmapH, Double.valueOf(fVarB.b()), Double.valueOf(fVarB.a()), i3, str2);
            c(str, fileK.getPath());
            return fileK.getPath();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
