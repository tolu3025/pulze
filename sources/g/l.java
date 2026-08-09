package G;

import Y.C0462t;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class l extends N.a {
    public static final Parcelable.Creator<l> CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f1598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1599f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f1600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f1601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0462t f1602n;

    l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0462t c0462t) {
        this.f1594a = AbstractC0643s.e(str);
        this.f1595b = str2;
        this.f1596c = str3;
        this.f1597d = str4;
        this.f1598e = uri;
        this.f1599f = str5;
        this.f1600l = str6;
        this.f1601m = str7;
        this.f1602n = c0462t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC0642q.b(this.f1594a, lVar.f1594a) && AbstractC0642q.b(this.f1595b, lVar.f1595b) && AbstractC0642q.b(this.f1596c, lVar.f1596c) && AbstractC0642q.b(this.f1597d, lVar.f1597d) && AbstractC0642q.b(this.f1598e, lVar.f1598e) && AbstractC0642q.b(this.f1599f, lVar.f1599f) && AbstractC0642q.b(this.f1600l, lVar.f1600l) && AbstractC0642q.b(this.f1601m, lVar.f1601m) && AbstractC0642q.b(this.f1602n, lVar.f1602n);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1594a, this.f1595b, this.f1596c, this.f1597d, this.f1598e, this.f1599f, this.f1600l, this.f1601m, this.f1602n);
    }

    public String i() {
        return this.f1601m;
    }

    public String p() {
        return this.f1595b;
    }

    public String s() {
        return this.f1597d;
    }

    public String t() {
        return this.f1596c;
    }

    public String u() {
        return this.f1600l;
    }

    public String v() {
        return this.f1594a;
    }

    public String w() {
        return this.f1599f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, v(), false);
        N.c.C(parcel, 2, p(), false);
        N.c.C(parcel, 3, t(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.A(parcel, 5, x(), i3, false);
        N.c.C(parcel, 6, w(), false);
        N.c.C(parcel, 7, u(), false);
        N.c.C(parcel, 8, i(), false);
        N.c.A(parcel, 9, y(), i3, false);
        N.c.b(parcel, iA);
    }

    public Uri x() {
        return this.f1598e;
    }

    public C0462t y() {
        return this.f1602n;
    }
}
