package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.firebase.auth.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0673e extends N.a {
    public static final Parcelable.Creator<C0673e> CREATOR = new C0678g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6046f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f6047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f6048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f6050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f6051p;

    /* JADX INFO: renamed from: com.google.firebase.auth.e$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f6056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f6058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f6059h;

        private a() {
            this.f6057f = false;
        }

        public C0673e a() {
            if (this.f6052a != null) {
                return new C0673e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z2, String str2) {
            this.f6054c = str;
            this.f6055d = z2;
            this.f6056e = str2;
            return this;
        }

        public a c(String str) {
            this.f6058g = str;
            return this;
        }

        public a d(boolean z2) {
            this.f6057f = z2;
            return this;
        }

        public a e(String str) {
            this.f6053b = str;
            return this;
        }

        public a f(String str) {
            this.f6059h = str;
            return this;
        }

        public a g(String str) {
            this.f6052a = str;
            return this;
        }
    }

    private C0673e(a aVar) {
        this.f6041a = aVar.f6052a;
        this.f6042b = aVar.f6053b;
        this.f6043c = null;
        this.f6044d = aVar.f6054c;
        this.f6045e = aVar.f6055d;
        this.f6046f = aVar.f6056e;
        this.f6047l = aVar.f6057f;
        this.f6050o = aVar.f6058g;
        this.f6051p = aVar.f6059h;
    }

    public static C0673e D() {
        return new C0673e(new a());
    }

    public static a z() {
        return new a();
    }

    public final int A() {
        return this.f6049n;
    }

    public final void B(int i3) {
        this.f6049n = i3;
    }

    public final void C(String str) {
        this.f6048m = str;
    }

    public boolean s() {
        return this.f6047l;
    }

    public boolean t() {
        return this.f6045e;
    }

    public String u() {
        return this.f6046f;
    }

    public String v() {
        return this.f6044d;
    }

    public String w() {
        return this.f6042b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, y(), false);
        N.c.C(parcel, 2, w(), false);
        N.c.C(parcel, 3, this.f6043c, false);
        N.c.C(parcel, 4, v(), false);
        N.c.g(parcel, 5, t());
        N.c.C(parcel, 6, u(), false);
        N.c.g(parcel, 7, s());
        N.c.C(parcel, 8, this.f6048m, false);
        N.c.s(parcel, 9, this.f6049n);
        N.c.C(parcel, 10, this.f6050o, false);
        N.c.C(parcel, 11, x(), false);
        N.c.b(parcel, iA);
    }

    public String x() {
        return this.f6051p;
    }

    public String y() {
        return this.f6041a;
    }

    public final String zzc() {
        return this.f6050o;
    }

    public final String zzd() {
        return this.f6043c;
    }

    public final String zze() {
        return this.f6048m;
    }

    C0673e(String str, String str2, String str3, String str4, boolean z2, String str5, boolean z3, String str6, int i3, String str7, String str8) {
        this.f6041a = str;
        this.f6042b = str2;
        this.f6043c = str3;
        this.f6044d = str4;
        this.f6045e = z2;
        this.f6046f = str5;
        this.f6047l = z3;
        this.f6048m = str6;
        this.f6049n = i3;
        this.f6050o = str7;
        this.f6051p = str8;
    }
}
