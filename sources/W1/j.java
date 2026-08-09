package w1;

import java.util.ArrayList;
import java.util.List;
import l1.C1015a;
import l1.InterfaceC1017c;
import w1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static l1.i a() {
        return new l1.o();
    }

    public static /* synthetic */ void b(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.g((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.d((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(k.a aVar, Object obj, C1015a.e eVar) {
        Long lValueOf;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = k.a(th);
            }
        }
        arrayList.add(0, aVar.b(str, lValueOf));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.h((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.f((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.e((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(k.a aVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.c((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = k.a(th);
        }
        eVar.a(arrayList);
    }

    public static void j(InterfaceC1017c interfaceC1017c, final k.a aVar) {
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a.e(new C1015a.d() { // from class: w1.b
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.b(aVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a2.e(new C1015a.d() { // from class: w1.c
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.c(aVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a3.e(new C1015a.d() { // from class: w1.d
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.d(aVar, obj, eVar);
                }
            });
        } else {
            c1015a3.e(null);
        }
        C1015a c1015a4 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a4.e(new C1015a.d() { // from class: w1.e
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.e(aVar, obj, eVar);
                }
            });
        } else {
            c1015a4.e(null);
        }
        C1015a c1015a5 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a5.e(new C1015a.d() { // from class: w1.f
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.f(aVar, obj, eVar);
                }
            });
        } else {
            c1015a5.e(null);
        }
        C1015a c1015a6 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setStringList", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a6.e(new C1015a.d() { // from class: w1.g
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.g(aVar, obj, eVar);
                }
            });
        } else {
            c1015a6.e(null);
        }
        C1015a c1015a7 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a7.e(new C1015a.d() { // from class: w1.h
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.h(aVar, obj, eVar);
                }
            });
        } else {
            c1015a7.e(null);
        }
        C1015a c1015a8 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", a(), interfaceC1017c.d());
        if (aVar != null) {
            c1015a8.e(new C1015a.d() { // from class: w1.i
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    j.i(aVar, obj, eVar);
                }
            });
        } else {
            c1015a8.e(null);
        }
    }
}
