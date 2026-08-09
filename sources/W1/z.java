package w1;

import J1.AbstractC0411o;
import java.util.List;
import java.util.Map;
import l1.C1015a;
import l1.InterfaceC1017c;
import w1.z;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11709b = a.f11710a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11710a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final I1.g f11711b = I1.i.a(C0188a.f11712a);

        /* JADX INFO: renamed from: w1.z$a$a, reason: collision with other inner class name */
        static final class C0188a extends kotlin.jvm.internal.n implements U1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0188a f11712a = new C0188a();

            C0188a() {
                super(0);
            }

            @Override // U1.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C1261A invoke() {
                return C1261A.f11561d;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(z zVar, Object obj, C1015a.e reply) {
            long jLongValue;
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            if (obj3 instanceof Integer) {
                jLongValue = ((Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                jLongValue = ((Long) obj3).longValue();
            }
            Object obj4 = list.get(2);
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.e(str, jLongValue, (C1263C) obj4);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.j(str, dDoubleValue, (C1263C) obj4);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.b(str, zBooleanValue, (C1263C) obj4);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list2 = (List) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.d(str, list2, (C1263C) obj4);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.l(str, (C1263C) obj3));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.m(str, (C1263C) obj3));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.a(str, (C1263C) obj3));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.i(str, (C1263C) obj3));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.g(str, (C1263C) obj3));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.f(list2, (C1263C) obj2);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.h(list2, (C1263C) obj2));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = AbstractC0411o.d(zVar.c(list2, (C1263C) obj2));
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(z zVar, Object obj, C1015a.e reply) {
            List listB;
            kotlin.jvm.internal.m.e(reply, "reply");
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                zVar.k(str, str2, (C1263C) obj4);
                listB = AbstractC0411o.d(null);
            } catch (Throwable th) {
                listB = l.b(th);
            }
            reply.a(listB);
        }

        public final l1.i n() {
            return (l1.i) f11711b.getValue();
        }

        public final void o(InterfaceC1017c binaryMessenger, final z zVar) {
            kotlin.jvm.internal.m.e(binaryMessenger, "binaryMessenger");
            C1015a c1015a = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a.e(new C1015a.d() { // from class: w1.m
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.p(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a.e(null);
            }
            C1015a c1015a2 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a2.e(new C1015a.d() { // from class: w1.t
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.z(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a2.e(null);
            }
            C1015a c1015a3 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a3.e(new C1015a.d() { // from class: w1.u
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.A(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a3.e(null);
            }
            C1015a c1015a4 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a4.e(new C1015a.d() { // from class: w1.v
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.B(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a4.e(null);
            }
            C1015a c1015a5 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a5.e(new C1015a.d() { // from class: w1.w
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.q(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a5.e(null);
            }
            C1015a c1015a6 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", n());
            if (zVar != null) {
                c1015a6.e(new C1015a.d() { // from class: w1.x
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.r(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a6.e(null);
            }
            C1015a c1015a7 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", n());
            if (zVar != null) {
                c1015a7.e(new C1015a.d() { // from class: w1.y
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.s(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a7.e(null);
            }
            C1015a c1015a8 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", n());
            if (zVar != null) {
                c1015a8.e(new C1015a.d() { // from class: w1.n
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.t(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a8.e(null);
            }
            C1015a c1015a9 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", n());
            if (zVar != null) {
                c1015a9.e(new C1015a.d() { // from class: w1.o
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.u(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a9.e(null);
            }
            C1015a c1015a10 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", n());
            if (zVar != null) {
                c1015a10.e(new C1015a.d() { // from class: w1.p
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.v(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a10.e(null);
            }
            C1015a c1015a11 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a11.e(new C1015a.d() { // from class: w1.q
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.w(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a11.e(null);
            }
            C1015a c1015a12 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a12.e(new C1015a.d() { // from class: w1.r
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.x(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a12.e(null);
            }
            C1015a c1015a13 = new C1015a(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", n(), binaryMessenger.d());
            if (zVar != null) {
                c1015a13.e(new C1015a.d() { // from class: w1.s
                    @Override // l1.C1015a.d
                    public final void a(Object obj, C1015a.e eVar) {
                        z.a.y(zVar, obj, eVar);
                    }
                });
            } else {
                c1015a13.e(null);
            }
        }
    }

    Double a(String str, C1263C c1263c);

    void b(String str, boolean z2, C1263C c1263c);

    List c(List list, C1263C c1263c);

    void d(String str, List list, C1263C c1263c);

    void e(String str, long j3, C1263C c1263c);

    void f(List list, C1263C c1263c);

    List g(String str, C1263C c1263c);

    Map h(List list, C1263C c1263c);

    Long i(String str, C1263C c1263c);

    void j(String str, double d3, C1263C c1263c);

    void k(String str, String str2, C1263C c1263c);

    String l(String str, C1263C c1263c);

    Boolean m(String str, C1263C c1263c);
}
