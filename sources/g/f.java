package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class f extends N.a {
    public static final Parcelable.Creator<f> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1579f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f1583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1585f;

        public f a() {
            return new f(this.f1580a, this.f1581b, this.f1582c, this.f1583d, this.f1584e, this.f1585f);
        }

        public a b(String str) {
            this.f1581b = str;
            return this;
        }

        public a c(String str) {
            this.f1583d = str;
            return this;
        }

        public a d(boolean z2) {
            this.f1584e = z2;
            return this;
        }

        public a e(String str) {
            AbstractC0643s.k(str);
            this.f1580a = str;
            return this;
        }

        public final a f(String str) {
            this.f1582c = str;
            return this;
        }

        public final a g(int i3) {
            this.f1585f = i3;
            return this;
        }
    }

    f(String str, String str2, String str3, String str4, boolean z2, int i3) {
        AbstractC0643s.k(str);
        this.f1574a = str;
        this.f1575b = str2;
        this.f1576c = str3;
        this.f1577d = str4;
        this.f1578e = z2;
        this.f1579f = i3;
    }

    public static a s() {
        return new a();
    }

    public static a x(f fVar) {
        AbstractC0643s.k(fVar);
        a aVarS = s();
        aVarS.e(fVar.v());
        aVarS.c(fVar.u());
        aVarS.b(fVar.t());
        aVarS.d(fVar.f1578e);
        aVarS.g(fVar.f1579f);
        String str = fVar.f1576c;
        if (str != null) {
            aVarS.f(str);
        }
        return aVarS;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC0642q.b(this.f1574a, fVar.f1574a) && AbstractC0642q.b(this.f1577d, fVar.f1577d) && AbstractC0642q.b(this.f1575b, fVar.f1575b) && AbstractC0642q.b(Boolean.valueOf(this.f1578e), Boolean.valueOf(fVar.f1578e)) && this.f1579f == fVar.f1579f;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1574a, this.f1575b, this.f1577d, Boolean.valueOf(this.f1578e), Integer.valueOf(this.f1579f));
    }

    public String t() {
        return this.f1575b;
    }

    public String u() {
        return this.f1577d;
    }

    public String v() {
        return this.f1574a;
    }

    public boolean w() {
        return this.f1578e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, v(), false);
        N.c.C(parcel, 2, t(), false);
        N.c.C(parcel, 3, this.f1576c, false);
        N.c.C(parcel, 4, u(), false);
        N.c.g(parcel, 5, w());
        N.c.s(parcel, 6, this.f1579f);
        N.c.b(parcel, iA);
    }
}
