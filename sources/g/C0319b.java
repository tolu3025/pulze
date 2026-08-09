package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: G.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0319b extends N.a {
    public static final Parcelable.Creator<C0319b> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f1532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0013b f1533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f1537f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f1538l;

    /* JADX INFO: renamed from: G.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f1539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0013b f1540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f1541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f1542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f1543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1545g;

        public a() {
            e.a aVarS = e.s();
            aVarS.b(false);
            this.f1539a = aVarS.a();
            C0013b.a aVarS2 = C0013b.s();
            aVarS2.b(false);
            this.f1540b = aVarS2.a();
            d.a aVarS3 = d.s();
            aVarS3.b(false);
            this.f1541c = aVarS3.a();
            c.a aVarS4 = c.s();
            aVarS4.b(false);
            this.f1542d = aVarS4.a();
        }

        public C0319b a() {
            return new C0319b(this.f1539a, this.f1540b, this.f1543e, this.f1544f, this.f1545g, this.f1541c, this.f1542d);
        }

        public a b(boolean z2) {
            this.f1544f = z2;
            return this;
        }

        public a c(C0013b c0013b) {
            this.f1540b = (C0013b) AbstractC0643s.k(c0013b);
            return this;
        }

        public a d(c cVar) {
            this.f1542d = (c) AbstractC0643s.k(cVar);
            return this;
        }

        public a e(d dVar) {
            this.f1541c = (d) AbstractC0643s.k(dVar);
            return this;
        }

        public a f(e eVar) {
            this.f1539a = (e) AbstractC0643s.k(eVar);
            return this;
        }

        public final a g(String str) {
            this.f1543e = str;
            return this;
        }

        public final a h(int i3) {
            this.f1545g = i3;
            return this;
        }
    }

    /* JADX INFO: renamed from: G.b$b, reason: collision with other inner class name */
    public static final class C0013b extends N.a {
        public static final Parcelable.Creator<C0013b> CREATOR = new v();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f1547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f1549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f1550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f1551f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final boolean f1552l;

        /* JADX INFO: renamed from: G.b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f1553a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f1554b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f1555c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f1556d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f1557e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f1558f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f1559g = false;

            public C0013b a() {
                return new C0013b(this.f1553a, this.f1554b, this.f1555c, this.f1556d, this.f1557e, this.f1558f, this.f1559g);
            }

            public a b(boolean z2) {
                this.f1553a = z2;
                return this;
            }
        }

        C0013b(boolean z2, String str, String str2, boolean z3, String str3, List list, boolean z4) {
            boolean z5 = true;
            if (z3 && z4) {
                z5 = false;
            }
            AbstractC0643s.b(z5, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f1546a = z2;
            if (z2) {
                AbstractC0643s.l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f1547b = str;
            this.f1548c = str2;
            this.f1549d = z3;
            Parcelable.Creator<C0319b> creator = C0319b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f1551f = arrayList;
            this.f1550e = str3;
            this.f1552l = z4;
        }

        public static a s() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0013b)) {
                return false;
            }
            C0013b c0013b = (C0013b) obj;
            return this.f1546a == c0013b.f1546a && AbstractC0642q.b(this.f1547b, c0013b.f1547b) && AbstractC0642q.b(this.f1548c, c0013b.f1548c) && this.f1549d == c0013b.f1549d && AbstractC0642q.b(this.f1550e, c0013b.f1550e) && AbstractC0642q.b(this.f1551f, c0013b.f1551f) && this.f1552l == c0013b.f1552l;
        }

        public int hashCode() {
            return AbstractC0642q.c(Boolean.valueOf(this.f1546a), this.f1547b, this.f1548c, Boolean.valueOf(this.f1549d), this.f1550e, this.f1551f, Boolean.valueOf(this.f1552l));
        }

        public boolean t() {
            return this.f1549d;
        }

        public List u() {
            return this.f1551f;
        }

        public String v() {
            return this.f1550e;
        }

        public String w() {
            return this.f1548c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            int iA = N.c.a(parcel);
            N.c.g(parcel, 1, y());
            N.c.C(parcel, 2, x(), false);
            N.c.C(parcel, 3, w(), false);
            N.c.g(parcel, 4, t());
            N.c.C(parcel, 5, v(), false);
            N.c.E(parcel, 6, u(), false);
            N.c.g(parcel, 7, z());
            N.c.b(parcel, iA);
        }

        public String x() {
            return this.f1547b;
        }

        public boolean y() {
            return this.f1546a;
        }

        public boolean z() {
            return this.f1552l;
        }
    }

    /* JADX INFO: renamed from: G.b$c */
    public static final class c extends N.a {
        public static final Parcelable.Creator<c> CREATOR = new w();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f1561b;

        /* JADX INFO: renamed from: G.b$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f1562a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f1563b;

            public c a() {
                return new c(this.f1562a, this.f1563b);
            }

            public a b(boolean z2) {
                this.f1562a = z2;
                return this;
            }
        }

        c(boolean z2, String str) {
            if (z2) {
                AbstractC0643s.k(str);
            }
            this.f1560a = z2;
            this.f1561b = str;
        }

        public static a s() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1560a == cVar.f1560a && AbstractC0642q.b(this.f1561b, cVar.f1561b);
        }

        public int hashCode() {
            return AbstractC0642q.c(Boolean.valueOf(this.f1560a), this.f1561b);
        }

        public String t() {
            return this.f1561b;
        }

        public boolean u() {
            return this.f1560a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            int iA = N.c.a(parcel);
            N.c.g(parcel, 1, u());
            N.c.C(parcel, 2, t(), false);
            N.c.b(parcel, iA);
        }
    }

    /* JADX INFO: renamed from: G.b$d */
    public static final class d extends N.a {
        public static final Parcelable.Creator<d> CREATOR = new x();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f1565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1566c;

        /* JADX INFO: renamed from: G.b$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f1567a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f1568b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f1569c;

            public d a() {
                return new d(this.f1567a, this.f1568b, this.f1569c);
            }

            public a b(boolean z2) {
                this.f1567a = z2;
                return this;
            }
        }

        d(boolean z2, byte[] bArr, String str) {
            if (z2) {
                AbstractC0643s.k(bArr);
                AbstractC0643s.k(str);
            }
            this.f1564a = z2;
            this.f1565b = bArr;
            this.f1566c = str;
        }

        public static a s() {
            return new a();
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1564a == dVar.f1564a && Arrays.equals(this.f1565b, dVar.f1565b) && ((str = this.f1566c) == (str2 = dVar.f1566c) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1564a), this.f1566c}) * 31) + Arrays.hashCode(this.f1565b);
        }

        public byte[] t() {
            return this.f1565b;
        }

        public String u() {
            return this.f1566c;
        }

        public boolean v() {
            return this.f1564a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            int iA = N.c.a(parcel);
            N.c.g(parcel, 1, v());
            N.c.k(parcel, 2, t(), false);
            N.c.C(parcel, 3, u(), false);
            N.c.b(parcel, iA);
        }
    }

    /* JADX INFO: renamed from: G.b$e */
    public static final class e extends N.a {
        public static final Parcelable.Creator<e> CREATOR = new y();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1570a;

        /* JADX INFO: renamed from: G.b$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f1571a = false;

            public e a() {
                return new e(this.f1571a);
            }

            public a b(boolean z2) {
                this.f1571a = z2;
                return this;
            }
        }

        e(boolean z2) {
            this.f1570a = z2;
        }

        public static a s() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f1570a == ((e) obj).f1570a;
        }

        public int hashCode() {
            return AbstractC0642q.c(Boolean.valueOf(this.f1570a));
        }

        public boolean t() {
            return this.f1570a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            int iA = N.c.a(parcel);
            N.c.g(parcel, 1, t());
            N.c.b(parcel, iA);
        }
    }

    C0319b(e eVar, C0013b c0013b, String str, boolean z2, int i3, d dVar, c cVar) {
        this.f1532a = (e) AbstractC0643s.k(eVar);
        this.f1533b = (C0013b) AbstractC0643s.k(c0013b);
        this.f1534c = str;
        this.f1535d = z2;
        this.f1536e = i3;
        if (dVar == null) {
            d.a aVarS = d.s();
            aVarS.b(false);
            dVar = aVarS.a();
        }
        this.f1537f = dVar;
        if (cVar == null) {
            c.a aVarS2 = c.s();
            aVarS2.b(false);
            cVar = aVarS2.a();
        }
        this.f1538l = cVar;
    }

    public static a s() {
        return new a();
    }

    public static a y(C0319b c0319b) {
        AbstractC0643s.k(c0319b);
        a aVarS = s();
        aVarS.c(c0319b.t());
        aVarS.f(c0319b.w());
        aVarS.e(c0319b.v());
        aVarS.d(c0319b.u());
        aVarS.b(c0319b.f1535d);
        aVarS.h(c0319b.f1536e);
        String str = c0319b.f1534c;
        if (str != null) {
            aVarS.g(str);
        }
        return aVarS;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0319b)) {
            return false;
        }
        C0319b c0319b = (C0319b) obj;
        return AbstractC0642q.b(this.f1532a, c0319b.f1532a) && AbstractC0642q.b(this.f1533b, c0319b.f1533b) && AbstractC0642q.b(this.f1537f, c0319b.f1537f) && AbstractC0642q.b(this.f1538l, c0319b.f1538l) && AbstractC0642q.b(this.f1534c, c0319b.f1534c) && this.f1535d == c0319b.f1535d && this.f1536e == c0319b.f1536e;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1532a, this.f1533b, this.f1537f, this.f1538l, this.f1534c, Boolean.valueOf(this.f1535d));
    }

    public C0013b t() {
        return this.f1533b;
    }

    public c u() {
        return this.f1538l;
    }

    public d v() {
        return this.f1537f;
    }

    public e w() {
        return this.f1532a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, w(), i3, false);
        N.c.A(parcel, 2, t(), i3, false);
        N.c.C(parcel, 3, this.f1534c, false);
        N.c.g(parcel, 4, x());
        N.c.s(parcel, 5, this.f1536e);
        N.c.A(parcel, 6, v(), i3, false);
        N.c.A(parcel, 7, u(), i3, false);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f1535d;
    }
}
