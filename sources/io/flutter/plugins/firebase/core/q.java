package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.m;
import io.flutter.plugins.firebase.core.q;
import java.util.ArrayList;
import l1.C1015a;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {

    class a implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f7993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f7994b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f7993a = arrayList;
            this.f7994b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void a() {
            this.f7993a.add(0, null);
            this.f7994b.a(this.f7993a);
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void b(Throwable th) {
            this.f7994b.a(m.a(th));
        }
    }

    class b implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f7995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f7996b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f7995a = arrayList;
            this.f7996b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void a() {
            this.f7995a.add(0, null);
            this.f7996b.a(this.f7995a);
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void b(Throwable th) {
            this.f7996b.a(m.a(th));
        }
    }

    class c implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f7997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f7998b;

        c(ArrayList arrayList, C1015a.e eVar) {
            this.f7997a = arrayList;
            this.f7998b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void a() {
            this.f7997a.add(0, null);
            this.f7998b.a(this.f7997a);
        }

        @Override // io.flutter.plugins.firebase.core.m.g
        public void b(Throwable th) {
            this.f7998b.a(m.a(th));
        }
    }

    public static l1.i a() {
        return m.e.f7989d;
    }

    public static /* synthetic */ void b(m.c cVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        cVar.b((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(m.c cVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        cVar.d((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void e(InterfaceC1017c interfaceC1017c, m.c cVar) {
        f(interfaceC1017c, "", cVar);
    }

    public static void f(InterfaceC1017c interfaceC1017c, String str, final m.c cVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled" + str2, a());
        if (cVar != null) {
            c1015a.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.n
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    q.b(cVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled" + str2, a());
        if (cVar != null) {
            c1015a2.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.o
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    q.c(cVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete" + str2, a());
        if (cVar != null) {
            c1015a3.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.p
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    cVar.f((String) ((ArrayList) obj).get(0), new q.c(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a3.e(null);
        }
    }
}
