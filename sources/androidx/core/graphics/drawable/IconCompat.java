package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f3871k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f3873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f3875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f3879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3881j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            }
        }

        static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e5) {
                e = e5;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3872a = -1;
        this.f3874c = null;
        this.f3875d = null;
        this.f3876e = 0;
        this.f3877f = 0;
        this.f3878g = null;
        this.f3879h = f3871k;
        this.f3880i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z2) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i3) {
        j.d.c(str);
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3876e = i3;
        if (resources != null) {
            try {
                iconCompat.f3873b = resources.getResourceName(i3);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3873b = str;
        }
        iconCompat.f3881j = str;
        return iconCompat;
    }

    private static String l(int i3) {
        switch (i3) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i3 = this.f3872a;
        if (i3 == -1) {
            return a.a(this.f3873b);
        }
        if (i3 == 2) {
            return this.f3876e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String d() {
        int i3 = this.f3872a;
        if (i3 == -1) {
            return a.b(this.f3873b);
        }
        if (i3 == 2) {
            String str = this.f3881j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3873b).split(":", -1)[0] : this.f3881j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int e() {
        int i3 = this.f3872a;
        return i3 == -1 ? a.c(this.f3873b) : i3;
    }

    public Uri f() {
        int i3 = this.f3872a;
        if (i3 == -1) {
            return a.d(this.f3873b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f3873b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream g(Context context) {
        StringBuilder sb;
        String str;
        Uri uriF = f();
        String scheme = uriF.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriF);
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3873b));
            } catch (FileNotFoundException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriF);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void h() {
        Parcelable parcelable;
        this.f3879h = PorterDuff.Mode.valueOf(this.f3880i);
        switch (this.f3872a) {
            case -1:
                parcelable = this.f3875d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f3875d;
                if (parcelable == null) {
                    byte[] bArr = this.f3874c;
                    this.f3873b = bArr;
                    this.f3872a = 3;
                    this.f3876e = 0;
                    this.f3877f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3874c, Charset.forName("UTF-16"));
                this.f3873b = str;
                if (this.f3872a == 2 && this.f3881j == null) {
                    this.f3881j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3873b = this.f3874c;
                return;
        }
        this.f3873b = parcelable;
    }

    public void i(boolean z2) {
        this.f3880i = this.f3879h.name();
        switch (this.f3872a) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    Bitmap bitmap = (Bitmap) this.f3873b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3874c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3874c = ((String) this.f3873b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3874c = (byte[]) this.f3873b;
                return;
            case 4:
            case 6:
                this.f3874c = this.f3873b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f3875d = (Parcelable) this.f3873b;
    }

    public Icon j() {
        return k(null);
    }

    public Icon k(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        int height;
        if (this.f3872a == -1) {
            return String.valueOf(this.f3873b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(l(this.f3872a));
        switch (this.f3872a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3873b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f3873b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3881j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3876e);
                if (this.f3877f != 0) {
                    sb.append(" off=");
                    height = this.f3877f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3873b);
                break;
        }
        if (this.f3878g != null) {
            sb.append(" tint=");
            sb.append(this.f3878g);
        }
        if (this.f3879h != f3871k) {
            sb.append(" mode=");
            sb.append(this.f3879h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i3) {
        this.f3874c = null;
        this.f3875d = null;
        this.f3876e = 0;
        this.f3877f = 0;
        this.f3878g = null;
        this.f3879h = f3871k;
        this.f3880i = null;
        this.f3872a = i3;
    }
}
