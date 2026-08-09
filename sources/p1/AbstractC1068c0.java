package p1;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: p1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068c0 {

    /* JADX INFO: renamed from: p1.c0$A */
    public static final class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f10386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r f10387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s f10388c;

        /* JADX INFO: renamed from: p1.c0$A$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private B f10389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private r f10390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private s f10391c;

            public A a() {
                A a3 = new A();
                a3.d(this.f10389a);
                a3.b(this.f10390b);
                a3.c(this.f10391c);
                return a3;
            }

            public a b(r rVar) {
                this.f10390b = rVar;
                return this;
            }

            public a c(s sVar) {
                this.f10391c = sVar;
                return this;
            }

            public a d(B b3) {
                this.f10389a = b3;
                return this;
            }
        }

        static A a(ArrayList arrayList) {
            A a3 = new A();
            a3.d((B) arrayList.get(0));
            a3.b((r) arrayList.get(1));
            a3.c((s) arrayList.get(2));
            return a3;
        }

        public void b(r rVar) {
            this.f10387b = rVar;
        }

        public void c(s sVar) {
            this.f10388c = sVar;
        }

        public void d(B b3) {
            this.f10386a = b3;
        }

        ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10386a);
            arrayList.add(this.f10387b);
            arrayList.add(this.f10388c);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$B */
    public static final class B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C f10392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f10393b;

        /* JADX INFO: renamed from: p1.c0$B$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C f10394a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f10395b;

            public B a() {
                B b3 = new B();
                b3.e(this.f10394a);
                b3.d(this.f10395b);
                return b3;
            }

            public a b(List list) {
                this.f10395b = list;
                return this;
            }

            public a c(C c3) {
                this.f10394a = c3;
                return this;
            }
        }

        B() {
        }

        static B a(ArrayList arrayList) {
            B b3 = new B();
            b3.e((C) arrayList.get(0));
            b3.d((List) arrayList.get(1));
            return b3;
        }

        public List b() {
            return this.f10393b;
        }

        public C c() {
            return this.f10392a;
        }

        public void d(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.f10393b = list;
        }

        public void e(C c3) {
            if (c3 == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.f10392a = c3;
        }

        ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10392a);
            arrayList.add(this.f10393b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$C */
    public static final class C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f10401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Boolean f10402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f10403h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f10404i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f10405j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Long f10406k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Long f10407l;

        /* JADX INFO: renamed from: p1.c0$C$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10409b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f10410c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f10411d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f10412e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Boolean f10413f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Boolean f10414g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f10415h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f10416i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f10417j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Long f10418k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Long f10419l;

            public C a() {
                C c3 = new C();
                c3.m(this.f10408a);
                c3.d(this.f10409b);
                c3.c(this.f10410c);
                c3.i(this.f10411d);
                c3.h(this.f10412e);
                c3.e(this.f10413f);
                c3.f(this.f10414g);
                c3.j(this.f10415h);
                c3.l(this.f10416i);
                c3.k(this.f10417j);
                c3.b(this.f10418k);
                c3.g(this.f10419l);
                return c3;
            }

            public a b(Long l3) {
                this.f10418k = l3;
                return this;
            }

            public a c(String str) {
                this.f10410c = str;
                return this;
            }

            public a d(String str) {
                this.f10409b = str;
                return this;
            }

            public a e(Boolean bool) {
                this.f10413f = bool;
                return this;
            }

            public a f(Boolean bool) {
                this.f10414g = bool;
                return this;
            }

            public a g(Long l3) {
                this.f10419l = l3;
                return this;
            }

            public a h(String str) {
                this.f10412e = str;
                return this;
            }

            public a i(String str) {
                this.f10411d = str;
                return this;
            }

            public a j(String str) {
                this.f10416i = str;
                return this;
            }

            public a k(String str) {
                this.f10408a = str;
                return this;
            }
        }

        C() {
        }

        static C a(ArrayList arrayList) {
            Long lValueOf;
            C c3 = new C();
            c3.m((String) arrayList.get(0));
            c3.d((String) arrayList.get(1));
            c3.c((String) arrayList.get(2));
            c3.i((String) arrayList.get(3));
            c3.h((String) arrayList.get(4));
            c3.e((Boolean) arrayList.get(5));
            c3.f((Boolean) arrayList.get(6));
            c3.j((String) arrayList.get(7));
            c3.l((String) arrayList.get(8));
            c3.k((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            c3.b(lValueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            c3.g(lValueOf2);
            return c3;
        }

        public void b(Long l3) {
            this.f10406k = l3;
        }

        public void c(String str) {
            this.f10398c = str;
        }

        public void d(String str) {
            this.f10397b = str;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.f10401f = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.f10402g = bool;
        }

        public void g(Long l3) {
            this.f10407l = l3;
        }

        public void h(String str) {
            this.f10400e = str;
        }

        public void i(String str) {
            this.f10399d = str;
        }

        public void j(String str) {
            this.f10403h = str;
        }

        public void k(String str) {
            this.f10405j = str;
        }

        public void l(String str) {
            this.f10404i = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f10396a = str;
        }

        ArrayList n() {
            ArrayList arrayList = new ArrayList(12);
            arrayList.add(this.f10396a);
            arrayList.add(this.f10397b);
            arrayList.add(this.f10398c);
            arrayList.add(this.f10399d);
            arrayList.add(this.f10400e);
            arrayList.add(this.f10401f);
            arrayList.add(this.f10402g);
            arrayList.add(this.f10403h);
            arrayList.add(this.f10404i);
            arrayList.add(this.f10405j);
            arrayList.add(this.f10406k);
            arrayList.add(this.f10407l);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$D */
    public static final class D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f10422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f10423d;

        D() {
        }

        static D a(ArrayList arrayList) {
            D d3 = new D();
            d3.f((String) arrayList.get(0));
            d3.h((String) arrayList.get(1));
            d3.g((Boolean) arrayList.get(2));
            d3.i((Boolean) arrayList.get(3));
            return d3;
        }

        public String b() {
            return this.f10420a;
        }

        public Boolean c() {
            return this.f10422c;
        }

        public String d() {
            return this.f10421b;
        }

        public Boolean e() {
            return this.f10423d;
        }

        public void f(String str) {
            this.f10420a = str;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.f10422c = bool;
        }

        public void h(String str) {
            this.f10421b = str;
        }

        public void i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.f10423d = bool;
        }

        ArrayList j() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f10420a);
            arrayList.add(this.f10421b);
            arrayList.add(this.f10422c);
            arrayList.add(this.f10423d);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$E */
    public static final class E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f10425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f10429f;

        E() {
        }

        static E a(ArrayList arrayList) {
            Long lValueOf;
            E e3 = new E();
            e3.l((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e3.m(lValueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e3.i(lValueOf2);
            e3.h((String) arrayList.get(3));
            e3.j((String) arrayList.get(4));
            e3.k((String) arrayList.get(5));
            return e3;
        }

        public String b() {
            return this.f10427d;
        }

        public Long c() {
            return this.f10426c;
        }

        public String d() {
            return this.f10428e;
        }

        public String e() {
            return this.f10429f;
        }

        public String f() {
            return this.f10424a;
        }

        public Long g() {
            return this.f10425b;
        }

        public void h(String str) {
            this.f10427d = str;
        }

        public void i(Long l3) {
            this.f10426c = l3;
        }

        public void j(String str) {
            this.f10428e = str;
        }

        public void k(String str) {
            this.f10429f = str;
        }

        public void l(String str) {
            this.f10424a = str;
        }

        public void m(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.f10425b = l3;
        }

        ArrayList n() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.f10424a);
            arrayList.add(this.f10425b);
            arrayList.add(this.f10426c);
            arrayList.add(this.f10427d);
            arrayList.add(this.f10428e);
            arrayList.add(this.f10429f);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$F */
    public interface F {
        void a(Object obj);

        void b(Throwable th);
    }

    /* JADX INFO: renamed from: p1.c0$G */
    public interface G {
        void a();

        void b(Throwable th);
    }

    /* JADX INFO: renamed from: p1.c0$a, reason: case insensitive filesystem */
    public enum EnumC1069a {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10438a;

        EnumC1069a(int i3) {
            this.f10438a = i3;
        }
    }

    /* JADX INFO: renamed from: p1.c0$b, reason: case insensitive filesystem */
    public static final class C1070b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10441c;

        C1070b() {
        }

        static C1070b a(ArrayList arrayList) {
            C1070b c1070b = new C1070b();
            c1070b.e((String) arrayList.get(0));
            c1070b.g((String) arrayList.get(1));
            c1070b.f((String) arrayList.get(2));
            return c1070b;
        }

        public String b() {
            return this.f10439a;
        }

        public String c() {
            return this.f10441c;
        }

        public String d() {
            return this.f10440b;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f10439a = str;
        }

        public void f(String str) {
            this.f10441c = str;
        }

        public void g(String str) {
            this.f10440b = str;
        }

        ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10439a);
            arrayList.add(this.f10440b);
            arrayList.add(this.f10441c);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$c, reason: case insensitive filesystem */
    public interface InterfaceC1071c {
        void B(C1070b c1070b, String str, F f3);

        void a(C1070b c1070b, String str, G g3);

        void b(C1070b c1070b, G g3);

        void c(C1070b c1070b, String str, F f3);

        void d(C1070b c1070b, Map map, F f3);

        void e(C1070b c1070b, String str, String str2, F f3);

        void h(C1070b c1070b, F f3);

        void i(C1070b c1070b, String str, Long l3, G g3);

        void k(C1070b c1070b, String str, F f3);

        void l(C1070b c1070b, String str, q qVar, G g3);

        void m(C1070b c1070b, F f3);

        void n(C1070b c1070b, String str, G g3);

        void o(C1070b c1070b, String str, String str2, F f3);

        void p(C1070b c1070b, String str, F f3);

        void q(C1070b c1070b, String str, String str2, F f3);

        void r(C1070b c1070b, G g3);

        void s(C1070b c1070b, t tVar, G g3);

        void t(C1070b c1070b, String str, F f3);

        void u(C1070b c1070b, y yVar, F f3);

        void v(C1070b c1070b, F f3);

        void w(C1070b c1070b, String str, String str2, G g3);

        void x(C1070b c1070b, E e3, F f3);

        void z(C1070b c1070b, String str, q qVar, G g3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1.c0$d, reason: case insensitive filesystem */
    static class C1072d extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1072d f10442d = new C1072d();

        private C1072d() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return C1070b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return A.a((ArrayList) f(byteBuffer));
                case -114:
                    return B.a((ArrayList) f(byteBuffer));
                case -113:
                    return C.a((ArrayList) f(byteBuffer));
                case -112:
                    return D.a((ArrayList) f(byteBuffer));
                case -111:
                    return E.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListJ;
            if (obj instanceof C1070b) {
                byteArrayOutputStream.write(128);
                arrayListJ = ((C1070b) obj).h();
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                arrayListJ = ((o) obj).d();
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                arrayListJ = ((p) obj).d();
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                arrayListJ = ((q) obj).r();
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                arrayListJ = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                arrayListJ = ((s) obj).f();
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                arrayListJ = ((t) obj).k();
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                arrayListJ = ((u) obj).i();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                arrayListJ = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                arrayListJ = ((w) obj).c();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                arrayListJ = ((x) obj).f();
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                arrayListJ = ((y) obj).h();
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                arrayListJ = ((z) obj).g();
            } else if (obj instanceof A) {
                byteArrayOutputStream.write(141);
                arrayListJ = ((A) obj).e();
            } else if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                arrayListJ = ((B) obj).f();
            } else if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                arrayListJ = ((C) obj).n();
            } else {
                if (!(obj instanceof D)) {
                    if (!(obj instanceof E)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        p(byteArrayOutputStream, ((E) obj).n());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                arrayListJ = ((D) obj).j();
            }
            p(byteArrayOutputStream, arrayListJ);
        }
    }

    /* JADX INFO: renamed from: p1.c0$e, reason: case insensitive filesystem */
    public interface InterfaceC1073e {
        void a(C1070b c1070b, y yVar, F f3);

        void b(C1070b c1070b, G g3);

        void c(C1070b c1070b, String str, q qVar, G g3);

        void d(C1070b c1070b, String str, F f3);

        void e(C1070b c1070b, Boolean bool, F f3);

        void f(C1070b c1070b, y yVar, F f3);

        void g(C1070b c1070b, String str, F f3);

        void h(C1070b c1070b, q qVar, G g3);

        void i(C1070b c1070b, String str, F f3);

        void j(C1070b c1070b, Map map, F f3);

        void k(C1070b c1070b, D d3, F f3);

        void l(C1070b c1070b, Map map, F f3);

        void m(C1070b c1070b, Map map, F f3);

        void n(C1070b c1070b, F f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1.c0$f, reason: case insensitive filesystem */
    static class C1074f extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1074f f10443d = new C1074f();

        private C1074f() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return C1070b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return A.a((ArrayList) f(byteBuffer));
                case -114:
                    return B.a((ArrayList) f(byteBuffer));
                case -113:
                    return C.a((ArrayList) f(byteBuffer));
                case -112:
                    return D.a((ArrayList) f(byteBuffer));
                case -111:
                    return E.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListJ;
            if (obj instanceof C1070b) {
                byteArrayOutputStream.write(128);
                arrayListJ = ((C1070b) obj).h();
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                arrayListJ = ((o) obj).d();
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                arrayListJ = ((p) obj).d();
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                arrayListJ = ((q) obj).r();
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                arrayListJ = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                arrayListJ = ((s) obj).f();
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                arrayListJ = ((t) obj).k();
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                arrayListJ = ((u) obj).i();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                arrayListJ = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                arrayListJ = ((w) obj).c();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                arrayListJ = ((x) obj).f();
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                arrayListJ = ((y) obj).h();
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                arrayListJ = ((z) obj).g();
            } else if (obj instanceof A) {
                byteArrayOutputStream.write(141);
                arrayListJ = ((A) obj).e();
            } else if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                arrayListJ = ((B) obj).f();
            } else if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                arrayListJ = ((C) obj).n();
            } else {
                if (!(obj instanceof D)) {
                    if (!(obj instanceof E)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        p(byteArrayOutputStream, ((E) obj).n());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                arrayListJ = ((D) obj).j();
            }
            p(byteArrayOutputStream, arrayListJ);
        }
    }

    /* JADX INFO: renamed from: p1.c0$g, reason: case insensitive filesystem */
    public static class C1075g extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10445b;

        public C1075g(String str, String str2, Object obj) {
            super(str2);
            this.f10444a = str;
            this.f10445b = obj;
        }
    }

    /* JADX INFO: renamed from: p1.c0$h */
    public interface h {
        void f(String str, x xVar, String str2, F f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1.c0$i */
    static class i extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f10446d = new i();

        private i() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return r.a((ArrayList) f(byteBuffer));
                case -127:
                    return s.a((ArrayList) f(byteBuffer));
                case -126:
                    return x.a((ArrayList) f(byteBuffer));
                case -125:
                    return A.a((ArrayList) f(byteBuffer));
                case -124:
                    return B.a((ArrayList) f(byteBuffer));
                case -123:
                    return C.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListF;
            if (obj instanceof r) {
                byteArrayOutputStream.write(128);
                arrayListF = ((r) obj).g();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(129);
                arrayListF = ((s) obj).f();
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(130);
                arrayListF = ((x) obj).f();
            } else if (obj instanceof A) {
                byteArrayOutputStream.write(131);
                arrayListF = ((A) obj).e();
            } else {
                if (!(obj instanceof B)) {
                    if (!(obj instanceof C)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(133);
                        p(byteArrayOutputStream, ((C) obj).n());
                        return;
                    }
                }
                byteArrayOutputStream.write(132);
                arrayListF = ((B) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    /* JADX INFO: renamed from: p1.c0$j */
    public interface j {
        void a(String str, String str2, F f3);

        void b(String str, String str2, F f3);

        void c(String str, F f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1.c0$k */
    static class k extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f10447d = new k();

        private k() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            return b3 != -128 ? super.g(b3, byteBuffer) : z.a((ArrayList) f(byteBuffer));
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof z)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((z) obj).g());
            }
        }
    }

    /* JADX INFO: renamed from: p1.c0$l */
    public interface l {
        void a(String str, String str2, G g3);

        void b(String str, String str2, String str3, F f3);
    }

    /* JADX INFO: renamed from: p1.c0$m */
    public interface m {
        void a(C1070b c1070b, String str, String str2, G g3);

        void b(C1070b c1070b, F f3);

        void c(C1070b c1070b, String str, G g3);

        void d(C1070b c1070b, x xVar, String str, G g3);

        void e(C1070b c1070b, F f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1.c0$n */
    static class n extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f10448d = new n();

        private n() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return C1070b.a((ArrayList) f(byteBuffer));
                case -127:
                    return v.a((ArrayList) f(byteBuffer));
                case -126:
                    return w.a((ArrayList) f(byteBuffer));
                case -125:
                    return x.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListF;
            if (obj instanceof C1070b) {
                byteArrayOutputStream.write(128);
                arrayListF = ((C1070b) obj).h();
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(129);
                arrayListF = ((v) obj).g();
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(130);
                arrayListF = ((w) obj).c();
            } else if (!(obj instanceof x)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(131);
                arrayListF = ((x) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    /* JADX INFO: renamed from: p1.c0$o */
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EnumC1069a f10449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f10450b;

        /* JADX INFO: renamed from: p1.c0$o$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private EnumC1069a f10451a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p f10452b;

            public o a() {
                o oVar = new o();
                oVar.c(this.f10451a);
                oVar.b(this.f10452b);
                return oVar;
            }

            public a b(p pVar) {
                this.f10452b = pVar;
                return this;
            }

            public a c(EnumC1069a enumC1069a) {
                this.f10451a = enumC1069a;
                return this;
            }
        }

        o() {
        }

        static o a(ArrayList arrayList) {
            o oVar = new o();
            oVar.c(EnumC1069a.values()[((Integer) arrayList.get(0)).intValue()]);
            oVar.b((p) arrayList.get(1));
            return oVar;
        }

        public void b(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.f10450b = pVar;
        }

        public void c(EnumC1069a enumC1069a) {
            if (enumC1069a == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.f10449a = enumC1069a;
        }

        ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            EnumC1069a enumC1069a = this.f10449a;
            arrayList.add(enumC1069a == null ? null : Integer.valueOf(enumC1069a.f10438a));
            arrayList.add(this.f10450b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$p */
    public static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10454b;

        /* JADX INFO: renamed from: p1.c0$p$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10456b;

            public p a() {
                p pVar = new p();
                pVar.b(this.f10455a);
                pVar.c(this.f10456b);
                return pVar;
            }

            public a b(String str) {
                this.f10455a = str;
                return this;
            }

            public a c(String str) {
                this.f10456b = str;
                return this;
            }
        }

        static p a(ArrayList arrayList) {
            p pVar = new p();
            pVar.b((String) arrayList.get(0));
            pVar.c((String) arrayList.get(1));
            return pVar;
        }

        public void b(String str) {
            this.f10453a = str;
        }

        public void c(String str) {
            this.f10454b = str;
        }

        ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10453a);
            arrayList.add(this.f10454b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$q */
    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f10459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f10462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f10463g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f10464h;

        q() {
        }

        static q a(ArrayList arrayList) {
            q qVar = new q();
            qVar.q((String) arrayList.get(0));
            qVar.m((String) arrayList.get(1));
            qVar.n((Boolean) arrayList.get(2));
            qVar.o((String) arrayList.get(3));
            qVar.l((String) arrayList.get(4));
            qVar.j((Boolean) arrayList.get(5));
            qVar.k((String) arrayList.get(6));
            qVar.p((String) arrayList.get(7));
            return qVar;
        }

        public Boolean b() {
            return this.f10462f;
        }

        public String c() {
            return this.f10463g;
        }

        public String d() {
            return this.f10461e;
        }

        public String e() {
            return this.f10458b;
        }

        public Boolean f() {
            return this.f10459c;
        }

        public String g() {
            return this.f10460d;
        }

        public String h() {
            return this.f10464h;
        }

        public String i() {
            return this.f10457a;
        }

        public void j(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.f10462f = bool;
        }

        public void k(String str) {
            this.f10463g = str;
        }

        public void l(String str) {
            this.f10461e = str;
        }

        public void m(String str) {
            this.f10458b = str;
        }

        public void n(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.f10459c = bool;
        }

        public void o(String str) {
            this.f10460d = str;
        }

        public void p(String str) {
            this.f10464h = str;
        }

        public void q(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f10457a = str;
        }

        ArrayList r() {
            ArrayList arrayList = new ArrayList(8);
            arrayList.add(this.f10457a);
            arrayList.add(this.f10458b);
            arrayList.add(this.f10459c);
            arrayList.add(this.f10460d);
            arrayList.add(this.f10461e);
            arrayList.add(this.f10462f);
            arrayList.add(this.f10463g);
            arrayList.add(this.f10464h);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$r */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f10465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f10469e;

        /* JADX INFO: renamed from: p1.c0$r$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Boolean f10470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f10472c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f10473d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Map f10474e;

            public r a() {
                r rVar = new r();
                rVar.c(this.f10470a);
                rVar.e(this.f10471b);
                rVar.f(this.f10472c);
                rVar.b(this.f10473d);
                rVar.d(this.f10474e);
                return rVar;
            }

            public a b(Boolean bool) {
                this.f10470a = bool;
                return this;
            }

            public a c(Map map) {
                this.f10474e = map;
                return this;
            }

            public a d(String str) {
                this.f10471b = str;
                return this;
            }

            public a e(String str) {
                this.f10472c = str;
                return this;
            }
        }

        r() {
        }

        static r a(ArrayList arrayList) {
            r rVar = new r();
            rVar.c((Boolean) arrayList.get(0));
            rVar.e((String) arrayList.get(1));
            rVar.f((String) arrayList.get(2));
            rVar.b((String) arrayList.get(3));
            rVar.d((Map) arrayList.get(4));
            return rVar;
        }

        public void b(String str) {
            this.f10468d = str;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.f10465a = bool;
        }

        public void d(Map map) {
            this.f10469e = map;
        }

        public void e(String str) {
            this.f10466b = str;
        }

        public void f(String str) {
            this.f10467c = str;
        }

        ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10465a);
            arrayList.add(this.f10466b);
            arrayList.add(this.f10467c);
            arrayList.add(this.f10468d);
            arrayList.add(this.f10469e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$s */
    public static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10478d;

        /* JADX INFO: renamed from: p1.c0$s$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10480b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f10481c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f10482d;

            public s a() {
                s sVar = new s();
                sVar.d(this.f10479a);
                sVar.e(this.f10480b);
                sVar.c(this.f10481c);
                sVar.b(this.f10482d);
                return sVar;
            }

            public a b(String str) {
                this.f10482d = str;
                return this;
            }

            public a c(Long l3) {
                this.f10481c = l3;
                return this;
            }

            public a d(String str) {
                this.f10479a = str;
                return this;
            }

            public a e(String str) {
                this.f10480b = str;
                return this;
            }
        }

        s() {
        }

        static s a(ArrayList arrayList) {
            Long lValueOf;
            s sVar = new s();
            sVar.d((String) arrayList.get(0));
            sVar.e((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(lValueOf);
            sVar.b((String) arrayList.get(3));
            return sVar;
        }

        public void b(String str) {
            this.f10478d = str;
        }

        public void c(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.f10477c = l3;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f10475a = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.f10476b = str;
        }

        ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f10475a);
            arrayList.add(this.f10476b);
            arrayList.add(this.f10477c);
            arrayList.add(this.f10478d);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$t */
    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f10483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f10487e;

        t() {
        }

        static t a(ArrayList arrayList) {
            t tVar = new t();
            tVar.f((Boolean) arrayList.get(0));
            tVar.j((String) arrayList.get(1));
            tVar.h((String) arrayList.get(2));
            tVar.i((String) arrayList.get(3));
            tVar.g((Boolean) arrayList.get(4));
            return tVar;
        }

        public Boolean b() {
            return this.f10483a;
        }

        public Boolean c() {
            return this.f10487e;
        }

        public String d() {
            return this.f10485c;
        }

        public String e() {
            return this.f10486d;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.f10483a = bool;
        }

        public void g(Boolean bool) {
            this.f10487e = bool;
        }

        public void h(String str) {
            this.f10485c = str;
        }

        public void i(String str) {
            this.f10486d = str;
        }

        public void j(String str) {
            this.f10484b = str;
        }

        ArrayList k() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10483a);
            arrayList.add(this.f10484b);
            arrayList.add(this.f10485c);
            arrayList.add(this.f10486d);
            arrayList.add(this.f10487e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$u */
    public static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f10489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f10493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f10494g;

        /* JADX INFO: renamed from: p1.c0$u$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f10496b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f10497c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Long f10498d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f10499e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Map f10500f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f10501g;

            public u a() {
                u uVar = new u();
                uVar.h(this.f10495a);
                uVar.d(this.f10496b);
                uVar.b(this.f10497c);
                uVar.e(this.f10498d);
                uVar.f(this.f10499e);
                uVar.c(this.f10500f);
                uVar.g(this.f10501g);
                return uVar;
            }

            public a b(Long l3) {
                this.f10497c = l3;
                return this;
            }

            public a c(Map map) {
                this.f10500f = map;
                return this;
            }

            public a d(Long l3) {
                this.f10496b = l3;
                return this;
            }

            public a e(Long l3) {
                this.f10498d = l3;
                return this;
            }

            public a f(String str) {
                this.f10499e = str;
                return this;
            }

            public a g(String str) {
                this.f10501g = str;
                return this;
            }

            public a h(String str) {
                this.f10495a = str;
                return this;
            }
        }

        static u a(ArrayList arrayList) {
            Long lValueOf;
            Long lValueOf2;
            u uVar = new u();
            uVar.h((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long lValueOf3 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            uVar.d(lValueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            uVar.b(lValueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            uVar.e(lValueOf3);
            uVar.f((String) arrayList.get(4));
            uVar.c((Map) arrayList.get(5));
            uVar.g((String) arrayList.get(6));
            return uVar;
        }

        public void b(Long l3) {
            this.f10490c = l3;
        }

        public void c(Map map) {
            this.f10493f = map;
        }

        public void d(Long l3) {
            this.f10489b = l3;
        }

        public void e(Long l3) {
            this.f10491d = l3;
        }

        public void f(String str) {
            this.f10492e = str;
        }

        public void g(String str) {
            this.f10494g = str;
        }

        public void h(String str) {
            this.f10488a = str;
        }

        ArrayList i() {
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(this.f10488a);
            arrayList.add(this.f10489b);
            arrayList.add(this.f10490c);
            arrayList.add(this.f10491d);
            arrayList.add(this.f10492e);
            arrayList.add(this.f10493f);
            arrayList.add(this.f10494g);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$v */
    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f10503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10506e;

        /* JADX INFO: renamed from: p1.c0$v$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Double f10508b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f10509c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f10510d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f10511e;

            public v a() {
                v vVar = new v();
                vVar.b(this.f10507a);
                vVar.c(this.f10508b);
                vVar.d(this.f10509c);
                vVar.f(this.f10510d);
                vVar.e(this.f10511e);
                return vVar;
            }

            public a b(String str) {
                this.f10507a = str;
                return this;
            }

            public a c(Double d3) {
                this.f10508b = d3;
                return this;
            }

            public a d(String str) {
                this.f10509c = str;
                return this;
            }

            public a e(String str) {
                this.f10511e = str;
                return this;
            }

            public a f(String str) {
                this.f10510d = str;
                return this;
            }
        }

        v() {
        }

        static v a(ArrayList arrayList) {
            v vVar = new v();
            vVar.b((String) arrayList.get(0));
            vVar.c((Double) arrayList.get(1));
            vVar.d((String) arrayList.get(2));
            vVar.f((String) arrayList.get(3));
            vVar.e((String) arrayList.get(4));
            return vVar;
        }

        public void b(String str) {
            this.f10502a = str;
        }

        public void c(Double d3) {
            if (d3 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.f10503b = d3;
        }

        public void d(String str) {
            this.f10504c = str;
        }

        public void e(String str) {
            this.f10506e = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f10505d = str;
        }

        ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10502a);
            arrayList.add(this.f10503b);
            arrayList.add(this.f10504c);
            arrayList.add(this.f10505d);
            arrayList.add(this.f10506e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$w */
    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10512a;

        /* JADX INFO: renamed from: p1.c0$w$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10513a;

            public w a() {
                w wVar = new w();
                wVar.b(this.f10513a);
                return wVar;
            }

            public a b(String str) {
                this.f10513a = str;
                return this;
            }
        }

        w() {
        }

        static w a(ArrayList arrayList) {
            w wVar = new w();
            wVar.b((String) arrayList.get(0));
            return wVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f10512a = str;
        }

        ArrayList c() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f10512a);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$x */
    public static final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10515b;

        x() {
        }

        static x a(ArrayList arrayList) {
            x xVar = new x();
            xVar.e((String) arrayList.get(0));
            xVar.d((String) arrayList.get(1));
            return xVar;
        }

        public String b() {
            return this.f10515b;
        }

        public String c() {
            return this.f10514a;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.f10515b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.f10514a = str;
        }

        ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10514a);
            arrayList.add(this.f10515b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$y */
    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f10517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map f10518c;

        y() {
        }

        static y a(ArrayList arrayList) {
            y yVar = new y();
            yVar.f((String) arrayList.get(0));
            yVar.g((List) arrayList.get(1));
            yVar.e((Map) arrayList.get(2));
            return yVar;
        }

        public Map b() {
            return this.f10518c;
        }

        public String c() {
            return this.f10516a;
        }

        public List d() {
            return this.f10517b;
        }

        public void e(Map map) {
            this.f10518c = map;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f10516a = str;
        }

        public void g(List list) {
            this.f10517b = list;
        }

        ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10516a);
            arrayList.add(this.f10517b);
            arrayList.add(this.f10518c);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: p1.c0$z */
    public static final class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f10519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f10520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10523e;

        /* JADX INFO: renamed from: p1.c0$z$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f10524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f10525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f10526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f10527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f10528e;

            public z a() {
                z zVar = new z();
                zVar.b(this.f10524a);
                zVar.c(this.f10525b);
                zVar.d(this.f10526c);
                zVar.e(this.f10527d);
                zVar.f(this.f10528e);
                return zVar;
            }

            public a b(Long l3) {
                this.f10524a = l3;
                return this;
            }

            public a c(Long l3) {
                this.f10525b = l3;
                return this;
            }

            public a d(Long l3) {
                this.f10526c = l3;
                return this;
            }

            public a e(String str) {
                this.f10527d = str;
                return this;
            }

            public a f(String str) {
                this.f10528e = str;
                return this;
            }
        }

        z() {
        }

        static z a(ArrayList arrayList) {
            Long lValueOf;
            Long lValueOf2;
            z zVar = new z();
            Object obj = arrayList.get(0);
            Long lValueOf3 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            zVar.b(lValueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            zVar.c(lValueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            zVar.d(lValueOf3);
            zVar.e((String) arrayList.get(3));
            zVar.f((String) arrayList.get(4));
            return zVar;
        }

        public void b(Long l3) {
            this.f10519a = l3;
        }

        public void c(Long l3) {
            this.f10520b = l3;
        }

        public void d(Long l3) {
            this.f10521c = l3;
        }

        public void e(String str) {
            this.f10522d = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.f10523e = str;
        }

        ArrayList g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10519a);
            arrayList.add(this.f10520b);
            arrayList.add(this.f10521c);
            arrayList.add(this.f10522d);
            arrayList.add(this.f10523e);
            return arrayList;
        }
    }

    protected static ArrayList a(Throwable th) {
        Object obj;
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C1075g) {
            C1075g c1075g = (C1075g) th;
            arrayList.add(c1075g.f10444a);
            arrayList.add(c1075g.getMessage());
            obj = c1075g.f10445b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
