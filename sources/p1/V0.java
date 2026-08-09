package p1;

import java.util.ArrayList;
import l1.C1015a;
import l1.InterfaceC1017c;
import p1.AbstractC1068c0;
import p1.V0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class V0 {

    class a implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10357b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f10356a = arrayList;
            this.f10357b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10357b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC1068c0.z zVar) {
            this.f10356a.add(0, zVar);
            this.f10357b.a(this.f10356a);
        }
    }

    class b implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10359b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f10358a = arrayList;
            this.f10359b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10359b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f10358a.add(0, str);
            this.f10359b.a(this.f10358a);
        }
    }

    class c implements AbstractC1068c0.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f10361b;

        c(ArrayList arrayList, C1015a.e eVar) {
            this.f10360a = arrayList;
            this.f10361b = eVar;
        }

        @Override // p1.AbstractC1068c0.F
        public void b(Throwable th) {
            this.f10361b.a(AbstractC1068c0.a(th));
        }

        @Override // p1.AbstractC1068c0.F
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f10360a.add(0, str);
            this.f10361b.a(this.f10360a);
        }
    }

    public static l1.i a() {
        return AbstractC1068c0.k.f10447d;
    }

    public static /* synthetic */ void c(AbstractC1068c0.j jVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.a((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void d(AbstractC1068c0.j jVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.b((String) arrayList.get(0), (String) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    public static void e(InterfaceC1017c interfaceC1017c, String str, final AbstractC1068c0.j jVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret" + str2, a());
        if (jVar != null) {
            c1015a.e(new C1015a.d() { // from class: p1.S0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    jVar.c((String) ((ArrayList) obj).get(0), new V0.a(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment" + str2, a());
        if (jVar != null) {
            c1015a2.e(new C1015a.d() { // from class: p1.T0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    V0.c(jVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn" + str2, a());
        if (jVar != null) {
            c1015a3.e(new C1015a.d() { // from class: p1.U0
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    V0.d(jVar, obj, eVar);
                }
            });
        } else {
            c1015a3.e(null);
        }
    }

    public static void f(InterfaceC1017c interfaceC1017c, AbstractC1068c0.j jVar) {
        e(interfaceC1017c, "", jVar);
    }
}
