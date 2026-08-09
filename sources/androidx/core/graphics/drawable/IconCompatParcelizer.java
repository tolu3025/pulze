package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3872a = aVar.p(iconCompat.f3872a, 1);
        iconCompat.f3874c = aVar.j(iconCompat.f3874c, 2);
        iconCompat.f3875d = aVar.r(iconCompat.f3875d, 3);
        iconCompat.f3876e = aVar.p(iconCompat.f3876e, 4);
        iconCompat.f3877f = aVar.p(iconCompat.f3877f, 5);
        iconCompat.f3878g = (ColorStateList) aVar.r(iconCompat.f3878g, 6);
        iconCompat.f3880i = aVar.t(iconCompat.f3880i, 7);
        iconCompat.f3881j = aVar.t(iconCompat.f3881j, 8);
        iconCompat.h();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.i(aVar.f());
        int i3 = iconCompat.f3872a;
        if (-1 != i3) {
            aVar.F(i3, 1);
        }
        byte[] bArr = iconCompat.f3874c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3875d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i4 = iconCompat.f3876e;
        if (i4 != 0) {
            aVar.F(i4, 4);
        }
        int i5 = iconCompat.f3877f;
        if (i5 != 0) {
            aVar.F(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f3878g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f3880i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f3881j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
