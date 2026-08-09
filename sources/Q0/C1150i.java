package q0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.InterfaceC0674e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.C0992f;

/* JADX INFO: renamed from: q0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150i extends com.google.firebase.auth.A {
    public static final Parcelable.Creator<C1150i> CREATOR = new C1148h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zzahv f10732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1142e f10733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f10736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f10737f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f10739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1152k f10740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.firebase.auth.E0 f10742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private M f10743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f10744r;

    C1150i(zzahv zzahvVar, C1142e c1142e, String str, String str2, List list, List list2, String str3, Boolean bool, C1152k c1152k, boolean z2, com.google.firebase.auth.E0 e02, M m3, List list3) {
        this.f10732a = zzahvVar;
        this.f10733b = c1142e;
        this.f10734c = str;
        this.f10735d = str2;
        this.f10736e = list;
        this.f10737f = list2;
        this.f10738l = str3;
        this.f10739m = bool;
        this.f10740n = c1152k;
        this.f10741o = z2;
        this.f10742p = e02;
        this.f10743q = m3;
        this.f10744r = list3;
    }

    @Override // com.google.firebase.auth.A
    public final synchronized com.google.firebase.auth.A N(List list) {
        try {
            AbstractC0643s.k(list);
            this.f10736e = new ArrayList(list.size());
            this.f10737f = new ArrayList(list.size());
            for (int i3 = 0; i3 < list.size(); i3++) {
                InterfaceC0674e0 interfaceC0674e0 = (InterfaceC0674e0) list.get(i3);
                if (interfaceC0674e0.c().equals("firebase")) {
                    this.f10733b = (C1142e) interfaceC0674e0;
                } else {
                    this.f10737f.add(interfaceC0674e0.c());
                }
                this.f10736e.add((C1142e) interfaceC0674e0);
            }
            if (this.f10733b == null) {
                this.f10733b = (C1142e) this.f10736e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.A
    public final C0992f O() {
        return C0992f.p(this.f10734c);
    }

    @Override // com.google.firebase.auth.A
    public final void P(zzahv zzahvVar) {
        this.f10732a = (zzahv) AbstractC0643s.k(zzahvVar);
    }

    @Override // com.google.firebase.auth.A
    public final /* synthetic */ com.google.firebase.auth.A Q() {
        this.f10739m = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.A
    public final void R(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f10744r = list;
    }

    @Override // com.google.firebase.auth.A
    public final zzahv S() {
        return this.f10732a;
    }

    @Override // com.google.firebase.auth.A
    public final void T(List list) {
        this.f10743q = M.t(list);
    }

    @Override // com.google.firebase.auth.A
    public final List U() {
        return this.f10744r;
    }

    @Override // com.google.firebase.auth.A
    public final List V() {
        return this.f10737f;
    }

    public final C1150i W(String str) {
        this.f10738l = str;
        return this;
    }

    public final void X(com.google.firebase.auth.E0 e02) {
        this.f10742p = e02;
    }

    public final void Y(C1152k c1152k) {
        this.f10740n = c1152k;
    }

    public final void Z(boolean z2) {
        this.f10741o = z2;
    }

    @Override // com.google.firebase.auth.A, com.google.firebase.auth.InterfaceC0674e0
    public final String a() {
        return this.f10733b.a();
    }

    public final com.google.firebase.auth.E0 a0() {
        return this.f10742p;
    }

    @Override // com.google.firebase.auth.A, com.google.firebase.auth.InterfaceC0674e0
    public final Uri b() {
        return this.f10733b.b();
    }

    public final List b0() {
        M m3 = this.f10743q;
        return m3 != null ? m3.s() : new ArrayList();
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String c() {
        return this.f10733b.c();
    }

    public final List c0() {
        return this.f10736e;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final boolean d() {
        return this.f10733b.d();
    }

    public final boolean d0() {
        return this.f10741o;
    }

    @Override // com.google.firebase.auth.A, com.google.firebase.auth.InterfaceC0674e0
    public final String i() {
        return this.f10733b.i();
    }

    @Override // com.google.firebase.auth.A, com.google.firebase.auth.InterfaceC0674e0
    public final String m() {
        return this.f10733b.m();
    }

    @Override // com.google.firebase.auth.A, com.google.firebase.auth.InterfaceC0674e0
    public final String p() {
        return this.f10733b.p();
    }

    @Override // com.google.firebase.auth.A
    public final com.google.firebase.auth.B u() {
        return this.f10740n;
    }

    @Override // com.google.firebase.auth.A
    public final /* synthetic */ com.google.firebase.auth.H v() {
        return new C1154m(this);
    }

    @Override // com.google.firebase.auth.A
    public final List w() {
        return this.f10736e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, S(), i3, false);
        N.c.A(parcel, 2, this.f10733b, i3, false);
        N.c.C(parcel, 3, this.f10734c, false);
        N.c.C(parcel, 4, this.f10735d, false);
        N.c.G(parcel, 5, this.f10736e, false);
        N.c.E(parcel, 6, V(), false);
        N.c.C(parcel, 7, this.f10738l, false);
        N.c.i(parcel, 8, Boolean.valueOf(y()), false);
        N.c.A(parcel, 9, u(), i3, false);
        N.c.g(parcel, 10, this.f10741o);
        N.c.A(parcel, 11, this.f10742p, i3, false);
        N.c.A(parcel, 12, this.f10743q, i3, false);
        N.c.G(parcel, 13, U(), false);
        N.c.b(parcel, iA);
    }

    @Override // com.google.firebase.auth.A
    public final String x() {
        Map map;
        zzahv zzahvVar = this.f10732a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) L.a(this.f10732a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.A
    public final boolean y() {
        com.google.firebase.auth.C cA;
        Boolean bool = this.f10739m;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.f10732a;
            String strE = "";
            if (zzahvVar != null && (cA = L.a(zzahvVar.zzc())) != null) {
                strE = cA.e();
            }
            boolean z2 = true;
            if (w().size() > 1 || (strE != null && strE.equals("custom"))) {
                z2 = false;
            }
            this.f10739m = Boolean.valueOf(z2);
        }
        return this.f10739m.booleanValue();
    }

    @Override // com.google.firebase.auth.A
    public final String zzd() {
        return S().zzc();
    }

    @Override // com.google.firebase.auth.A
    public final String zze() {
        return this.f10732a.zzf();
    }

    public C1150i(C0992f c0992f, List list) {
        AbstractC0643s.k(c0992f);
        this.f10734c = c0992f.q();
        this.f10735d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f10738l = "2";
        N(list);
    }
}
