package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.m;
import io.flutter.plugins.firebase.core.u;
import java.util.ArrayList;
import java.util.List;
import l1.C1015a;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {

    class a implements m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8003b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f8002a = arrayList;
            this.f8003b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        public void b(Throwable th) {
            this.f8003b.a(m.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(m.b bVar) {
            this.f8002a.add(0, bVar);
            this.f8003b.a(this.f8002a);
        }
    }

    class b implements m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8005b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f8004a = arrayList;
            this.f8005b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        public void b(Throwable th) {
            this.f8005b.a(m.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f8004a.add(0, list);
            this.f8005b.a(this.f8004a);
        }
    }

    class c implements m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8007b;

        c(ArrayList arrayList, C1015a.e eVar) {
            this.f8006a = arrayList;
            this.f8007b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        public void b(Throwable th) {
            this.f8007b.a(m.a(th));
        }

        @Override // io.flutter.plugins.firebase.core.m.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(m.a aVar) {
            this.f8006a.add(0, aVar);
            this.f8007b.a(this.f8006a);
        }
    }

    public static l1.i a() {
        return m.e.f7989d;
    }

    public static /* synthetic */ void b(m.d dVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        dVar.e((String) arrayList.get(0), (m.a) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static void e(InterfaceC1017c interfaceC1017c, m.d dVar) {
        f(interfaceC1017c, "", dVar);
    }

    public static void f(InterfaceC1017c interfaceC1017c, String str, final m.d dVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "." + str;
        }
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp" + str2, a());
        if (dVar != null) {
            c1015a.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.r
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    u.b(dVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore" + str2, a());
        if (dVar != null) {
            c1015a2.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.s
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    dVar.a(new u.b(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource" + str2, a());
        if (dVar != null) {
            c1015a3.e(new C1015a.d() { // from class: io.flutter.plugins.firebase.core.t
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    dVar.c(new u.c(new ArrayList(), eVar));
                }
            });
        } else {
            c1015a3.e(null);
        }
    }
}
