package p1;

import java.util.ArrayList;
import java.util.List;
import l1.C1015a;
import l1.InterfaceC1017c;
import p1.AbstractC1068c0;
import p1.e1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e1 {

    class a implements AbstractC1068c0.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10536b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f10535a = arrayList;
            this.f10536b = eVar;
        }

        @Override // p1.AbstractC1068c0.G
        public void a() {
            this.f10535a.add(0, null);
            this.f10536b.a(this.f10535a);
        }

        @Override // p1.AbstractC1068c0.G
        public void b(Throwable th) {
            this.f10536b.a(AbstractC1068c0.a(th));
        }
    }

    class b implements AbstractC1068c0.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10538b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f10537a = arrayList;
            this.f10538b = eVar;
        }

        @Override // p1.AbstractC1068c0.G
        public void a() {
            this.f10537a.add(0, null);
            this.f10538b.a(this.f10537a);
        }

        @Override // p1.AbstractC1068c0.G
        public void b(Throwable th) {
            this.f10538b.a(AbstractC1068c0.a(th));
        }
    }

    class c implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10540b;

        c(ArrayList arrayList, C1015a.e eVar) {
            this.f10539a = arrayList;
            this.f10540b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10540b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC1068c0.w wVar) {
            this.f10539a.add(0, wVar);
            this.f10540b.a(this.f10539a);
        }
    }

    class d implements AbstractC1068c0.G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10542b;

        d(ArrayList arrayList, C1015a.e eVar) {
            this.f10541a = arrayList;
            this.f10542b = eVar;
        }

        @Override // p1.AbstractC1068c0.G
        public void a() {
            this.f10541a.add(0, null);
            this.f10542b.a(this.f10541a);
        }

        @Override // p1.AbstractC1068c0.G
        public void b(Throwable th) {
            this.f10542b.a(AbstractC1068c0.a(th));
        }
    }

    class e implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10544b;

        e(ArrayList arrayList, C1015a.e eVar) {
            this.f10543a = arrayList;
            this.f10544b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10544b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f10543a.add(0, list);
            this.f10544b.a(this.f10543a);
        }
    }

    public static l1.i a() {
        return AbstractC1068c0.n.f10448d;
    }

    public static /* synthetic */ void b(AbstractC1068c0.m mVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.d((AbstractC1068c0.C1070b) arrayList.get(0), (AbstractC1068c0.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(AbstractC1068c0.m mVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.a((AbstractC1068c0.C1070b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void e(AbstractC1068c0.m mVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.c((AbstractC1068c0.C1070b) arrayList.get(0), (String) arrayList.get(1), new d(new ArrayList(), eVar));
    }

    public static void g(InterfaceC1017c interfaceC1017c, String str, final AbstractC1068c0.m mVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone" + str2, a());
        if (mVar != null) {
            c1015a.e(new C1015a.d() { // from class: p1.Z0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    e1.b(mVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp" + str2, a());
        if (mVar != null) {
            c1015a2.e(new C1015a.d() { // from class: p1.a1
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    e1.c(mVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession" + str2, a());
        if (mVar != null) {
            c1015a3.e(new C1015a.d() { // from class: p1.b1
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    mVar.b((AbstractC1068c0.C1070b) ((ArrayList) obj).get(0), new e1.c(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a3.e(null);
        }
        C1015a c1015a4 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll" + str2, a());
        if (mVar != null) {
            c1015a4.e(new C1015a.d() { // from class: p1.c1
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    e1.e(mVar, obj, eVar);
                }
            });
        } else {
            c1015a4.e(null);
        }
        C1015a c1015a5 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors" + str2, a());
        if (mVar != null) {
            c1015a5.e(new C1015a.d() { // from class: p1.d1
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    mVar.e((AbstractC1068c0.C1070b) ((ArrayList) obj).get(0), new e1.e(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a5.e(null);
        }
    }

    public static void h(InterfaceC1017c interfaceC1017c, AbstractC1068c0.m mVar) {
        g(interfaceC1017c, "", mVar);
    }
}
