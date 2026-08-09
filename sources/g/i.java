package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class i extends N.a {
    public static final Parcelable.Creator<i> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f1587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1589c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f1590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1592c;

        public i a() {
            return new i(this.f1590a, this.f1591b, this.f1592c);
        }

        public a b(m mVar) {
            this.f1590a = mVar;
            return this;
        }

        public final a c(String str) {
            this.f1591b = str;
            return this;
        }

        public final a d(int i3) {
            this.f1592c = i3;
            return this;
        }
    }

    i(m mVar, String str, int i3) {
        this.f1587a = (m) AbstractC0643s.k(mVar);
        this.f1588b = str;
        this.f1589c = i3;
    }

    public static a s() {
        return new a();
    }

    public static a u(i iVar) {
        AbstractC0643s.k(iVar);
        a aVarS = s();
        aVarS.b(iVar.t());
        aVarS.d(iVar.f1589c);
        String str = iVar.f1588b;
        if (str != null) {
            aVarS.c(str);
        }
        return aVarS;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC0642q.b(this.f1587a, iVar.f1587a) && AbstractC0642q.b(this.f1588b, iVar.f1588b) && this.f1589c == iVar.f1589c;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1587a, this.f1588b);
    }

    public m t() {
        return this.f1587a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, t(), i3, false);
        N.c.C(parcel, 2, this.f1588b, false);
        N.c.s(parcel, 3, this.f1589c);
        N.c.b(parcel, iA);
    }
}
