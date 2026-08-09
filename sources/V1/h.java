package v1;

import java.util.ArrayList;
import l1.C1015a;
import l1.InterfaceC1017c;
import l1.o;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static l1.i a() {
        return new o();
    }

    public static /* synthetic */ void b(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.b());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.f());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.d());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.c());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.g());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.e());
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(i.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.a(arrayList2.get(0) == null ? null : i.b.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = i.a(th);
        }
        eVar.a(arrayList);
    }

    public static void i(InterfaceC1017c interfaceC1017c, final i.a aVar) {
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a.e(new C1015a.d() { // from class: v1.a
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.b(aVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a2.e(new C1015a.d() { // from class: v1.b
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.c(aVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a3.e(new C1015a.d() { // from class: v1.c
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.d(aVar, obj, eVar);
                }
            });
        } else {
            c1015a3.e(null);
        }
        C1015a c1015a4 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a4.e(new C1015a.d() { // from class: v1.d
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.e(aVar, obj, eVar);
                }
            });
        } else {
            c1015a4.e(null);
        }
        C1015a c1015a5 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a5.e(new C1015a.d() { // from class: v1.e
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.f(aVar, obj, eVar);
                }
            });
        } else {
            c1015a5.e(null);
        }
        C1015a c1015a6 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a6.e(new C1015a.d() { // from class: v1.f
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.g(aVar, obj, eVar);
                }
            });
        } else {
            c1015a6.e(null);
        }
        C1015a c1015a7 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a7.e(new C1015a.d() { // from class: v1.g
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    h.h(aVar, obj, eVar);
                }
            });
        } else {
            c1015a7.e(null);
        }
    }
}
