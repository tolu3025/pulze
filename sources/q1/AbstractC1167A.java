package q1;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: q1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1167A {

    /* JADX INFO: renamed from: q1.A$A, reason: collision with other inner class name */
    public enum EnumC0162A {
        NONE(0),
        ESTIMATE(1),
        PREVIOUS(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10809a;

        EnumC0162A(int i3) {
            this.f10809a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$B */
    public enum B {
        SERVER_AND_CACHE(0),
        SERVER(1),
        CACHE(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10814a;

        B(int i3) {
            this.f10814a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f10815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10816b;

        a() {
        }

        static a a(ArrayList arrayList) {
            a aVar = new a();
            aVar.e(d.values()[((Integer) arrayList.get(0)).intValue()]);
            aVar.d((String) arrayList.get(1));
            return aVar;
        }

        public String b() {
            return this.f10816b;
        }

        public d c() {
            return this.f10815a;
        }

        public void d(String str) {
            this.f10816b = str;
        }

        public void e(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10815a = dVar;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            d dVar = this.f10815a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f10830a));
            arrayList.add(this.f10816b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$b, reason: case insensitive filesystem */
    public static final class C1168b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f10817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f10819c;

        /* JADX INFO: renamed from: q1.A$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private d f10820a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10821b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Double f10822c;

            public C1168b a() {
                C1168b c1168b = new C1168b();
                c1168b.c(this.f10820a);
                c1168b.b(this.f10821b);
                c1168b.d(this.f10822c);
                return c1168b;
            }

            public a b(String str) {
                this.f10821b = str;
                return this;
            }

            public a c(d dVar) {
                this.f10820a = dVar;
                return this;
            }

            public a d(Double d3) {
                this.f10822c = d3;
                return this;
            }
        }

        C1168b() {
        }

        static C1168b a(ArrayList arrayList) {
            C1168b c1168b = new C1168b();
            c1168b.c(d.values()[((Integer) arrayList.get(0)).intValue()]);
            c1168b.b((String) arrayList.get(1));
            c1168b.d((Double) arrayList.get(2));
            return c1168b;
        }

        public void b(String str) {
            this.f10818b = str;
        }

        public void c(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10817a = dVar;
        }

        public void d(Double d3) {
            this.f10819c = d3;
        }

        public ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            d dVar = this.f10817a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f10830a));
            arrayList.add(this.f10818b);
            arrayList.add(this.f10819c);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$c */
    public enum c {
        SERVER(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10825a;

        c(int i3) {
            this.f10825a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$d */
    public enum d {
        COUNT(0),
        SUM(1),
        AVERAGE(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10830a;

        d(int i3) {
            this.f10830a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$e */
    public enum e {
        ADDED(0),
        MODIFIED(1),
        REMOVED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10835a;

        e(int i3) {
            this.f10835a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$f */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f10837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f10838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private B f10839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private EnumC0162A f10840e;

        f() {
        }

        static f a(ArrayList arrayList) {
            f fVar = new f();
            fVar.i((String) arrayList.get(0));
            fVar.g((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            fVar.h(obj == null ? null : n.a((ArrayList) obj));
            Object obj2 = arrayList.get(3);
            fVar.k(obj2 == null ? null : B.values()[((Integer) obj2).intValue()]);
            Object obj3 = arrayList.get(4);
            fVar.j(obj3 != null ? EnumC0162A.values()[((Integer) obj3).intValue()] : null);
            return fVar;
        }

        public Map b() {
            return this.f10837b;
        }

        public n c() {
            return this.f10838c;
        }

        public String d() {
            return this.f10836a;
        }

        public EnumC0162A e() {
            return this.f10840e;
        }

        public B f() {
            return this.f10839d;
        }

        public void g(Map map) {
            this.f10837b = map;
        }

        public void h(n nVar) {
            this.f10838c = nVar;
        }

        public void i(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f10836a = str;
        }

        public void j(EnumC0162A enumC0162A) {
            this.f10840e = enumC0162A;
        }

        public void k(B b3) {
            this.f10839d = b3;
        }

        public ArrayList l() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10836a);
            arrayList.add(this.f10837b);
            n nVar = this.f10838c;
            arrayList.add(nVar == null ? null : nVar.f());
            B b3 = this.f10839d;
            arrayList.add(b3 == null ? null : Integer.valueOf(b3.f10814a));
            EnumC0162A enumC0162A = this.f10840e;
            arrayList.add(enumC0162A != null ? Integer.valueOf(enumC0162A.f10809a) : null);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$g */
    public interface g {
        void B(i iVar, String str, q qVar, z zVar);

        void D(Boolean bool, z zVar);

        void a(i iVar, f fVar, Boolean bool, k kVar, z zVar);

        void b(i iVar, String str, String str2, z zVar);

        void c(i iVar, String str, z zVar);

        void d(i iVar, f fVar, z zVar);

        void e(i iVar, String str, Boolean bool, t tVar, q qVar, z zVar);

        void h(i iVar, z zVar);

        void i(i iVar, z zVar);

        void k(i iVar, z zVar);

        void l(i iVar, String str, Boolean bool, t tVar, q qVar, Boolean bool2, k kVar, z zVar);

        void m(i iVar, f fVar, z zVar);

        void n(i iVar, z zVar);

        void o(i iVar, f fVar, z zVar);

        void p(i iVar, Long l3, Long l4, z zVar);

        void q(i iVar, String str, t tVar, c cVar, List list, Boolean bool, z zVar);

        void r(i iVar, z zVar);

        void s(String str, x xVar, List list, z zVar);

        void t(i iVar, List list, Map map, z zVar);

        void u(i iVar, l lVar, z zVar);

        void v(i iVar, z zVar);

        void w(i iVar, byte[] bArr, z zVar);

        void x(i iVar, f fVar, z zVar);

        void z(i iVar, List list, z zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1.A$h */
    static class h extends C1171c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f10841e = new h();

        private h() {
        }

        @Override // q1.C1171c, l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return a.a((ArrayList) f(byteBuffer));
                case -127:
                    return C1168b.a((ArrayList) f(byteBuffer));
                case -126:
                    return f.a((ArrayList) f(byteBuffer));
                case -125:
                    return i.a((ArrayList) f(byteBuffer));
                case -124:
                    return m.a((ArrayList) f(byteBuffer));
                case -123:
                    return n.a((ArrayList) f(byteBuffer));
                case -122:
                    return o.a((ArrayList) f(byteBuffer));
                case -121:
                    return p.a((ArrayList) f(byteBuffer));
                case -120:
                    return q.a((ArrayList) f(byteBuffer));
                case -119:
                    return r.a((ArrayList) f(byteBuffer));
                case -118:
                    return s.a((ArrayList) f(byteBuffer));
                case -117:
                    return t.a((ArrayList) f(byteBuffer));
                case -116:
                    return u.a((ArrayList) f(byteBuffer));
                case -115:
                    return v.a((ArrayList) f(byteBuffer));
                case -114:
                    return w.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // q1.C1171c, l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListD;
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                arrayListD = ((a) obj).f();
            } else if (obj instanceof C1168b) {
                byteArrayOutputStream.write(129);
                arrayListD = ((C1168b) obj).e();
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                arrayListD = ((f) obj).l();
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(131);
                arrayListD = ((i) obj).h();
            } else if (obj instanceof m) {
                byteArrayOutputStream.write(132);
                arrayListD = ((m) obj).f();
            } else if (obj instanceof n) {
                byteArrayOutputStream.write(133);
                arrayListD = ((n) obj).f();
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(134);
                arrayListD = ((o) obj).e();
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(135);
                arrayListD = ((p) obj).k();
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(136);
                arrayListD = ((q) obj).f();
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(137);
                arrayListD = ((r) obj).f();
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(138);
                arrayListD = ((s) obj).d();
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(139);
                arrayListD = ((t) obj).t();
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(140);
                arrayListD = ((u) obj).e();
            } else {
                if (!(obj instanceof v)) {
                    if (!(obj instanceof w)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(142);
                        p(byteArrayOutputStream, ((w) obj).j());
                        return;
                    }
                }
                byteArrayOutputStream.write(141);
                arrayListD = ((v) obj).d();
            }
            p(byteArrayOutputStream, arrayListD);
        }
    }

    /* JADX INFO: renamed from: q1.A$i */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f10843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10844c;

        i() {
        }

        static i a(ArrayList arrayList) {
            i iVar = new i();
            iVar.e((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            iVar.g(obj == null ? null : p.a((ArrayList) obj));
            iVar.f((String) arrayList.get(2));
            return iVar;
        }

        public String b() {
            return this.f10842a;
        }

        public String c() {
            return this.f10844c;
        }

        public p d() {
            return this.f10843b;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f10842a = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
            }
            this.f10844c = str;
        }

        public void g(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"settings\" is null.");
            }
            this.f10843b = pVar;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10842a);
            p pVar = this.f10843b;
            arrayList.add(pVar == null ? null : pVar.k());
            arrayList.add(this.f10844c);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$j */
    public static class j extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10846b;

        public j(String str, String str2, Object obj) {
            super(str2);
            this.f10845a = str;
            this.f10846b = obj;
        }
    }

    /* JADX INFO: renamed from: q1.A$k */
    public enum k {
        DEFAULT_SOURCE(0),
        CACHE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10850a;

        k(int i3) {
            this.f10850a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$l */
    public enum l {
        ENABLE_INDEX_AUTO_CREATION(0),
        DISABLE_INDEX_AUTO_CREATION(1),
        DELETE_ALL_INDEXES(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10855a;

        l(int i3) {
            this.f10855a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$m */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f10856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f10857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10859d;

        /* JADX INFO: renamed from: q1.A$m$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private e f10860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private o f10861b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f10862c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Long f10863d;

            public m a() {
                m mVar = new m();
                mVar.e(this.f10860a);
                mVar.b(this.f10861b);
                mVar.d(this.f10862c);
                mVar.c(this.f10863d);
                return mVar;
            }

            public a b(o oVar) {
                this.f10861b = oVar;
                return this;
            }

            public a c(Long l3) {
                this.f10863d = l3;
                return this;
            }

            public a d(Long l3) {
                this.f10862c = l3;
                return this;
            }

            public a e(e eVar) {
                this.f10860a = eVar;
                return this;
            }
        }

        m() {
        }

        static m a(ArrayList arrayList) {
            Long lValueOf;
            m mVar = new m();
            mVar.e(e.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            Long lValueOf2 = null;
            mVar.b(obj == null ? null : o.a((ArrayList) obj));
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            mVar.d(lValueOf);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                lValueOf2 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            mVar.c(lValueOf2);
            return mVar;
        }

        public void b(o oVar) {
            if (oVar == null) {
                throw new IllegalStateException("Nonnull field \"document\" is null.");
            }
            this.f10857b = oVar;
        }

        public void c(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
            }
            this.f10859d = l3;
        }

        public void d(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
            }
            this.f10858c = l3;
        }

        public void e(e eVar) {
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10856a = eVar;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            e eVar = this.f10856a;
            arrayList.add(eVar == null ? null : Integer.valueOf(eVar.f10835a));
            o oVar = this.f10857b;
            arrayList.add(oVar != null ? oVar.e() : null);
            arrayList.add(this.f10858c);
            arrayList.add(this.f10859d);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$n */
    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f10864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f10865b;

        static n a(ArrayList arrayList) {
            n nVar = new n();
            nVar.d((Boolean) arrayList.get(0));
            nVar.e((List) arrayList.get(1));
            return nVar;
        }

        public Boolean b() {
            return this.f10864a;
        }

        public List c() {
            return this.f10865b;
        }

        public void d(Boolean bool) {
            this.f10864a = bool;
        }

        public void e(List list) {
            this.f10865b = list;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10864a);
            arrayList.add(this.f10865b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$o */
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f10867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v f10868c;

        /* JADX INFO: renamed from: q1.A$o$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map f10870b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private v f10871c;

            public o a() {
                o oVar = new o();
                oVar.d(this.f10869a);
                oVar.b(this.f10870b);
                oVar.c(this.f10871c);
                return oVar;
            }

            public a b(Map map) {
                this.f10870b = map;
                return this;
            }

            public a c(v vVar) {
                this.f10871c = vVar;
                return this;
            }

            public a d(String str) {
                this.f10869a = str;
                return this;
            }
        }

        o() {
        }

        static o a(ArrayList arrayList) {
            o oVar = new o();
            oVar.d((String) arrayList.get(0));
            oVar.b((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            oVar.c(obj == null ? null : v.a((ArrayList) obj));
            return oVar;
        }

        public void b(Map map) {
            this.f10867b = map;
        }

        public void c(v vVar) {
            if (vVar == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.f10868c = vVar;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f10866a = str;
        }

        public ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10866a);
            arrayList.add(this.f10867b);
            v vVar = this.f10868c;
            arrayList.add(vVar == null ? null : vVar.d());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$p */
    public static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f10872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f10874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f10876e;

        p() {
        }

        static p a(ArrayList arrayList) {
            Long lValueOf;
            p pVar = new p();
            pVar.i((Boolean) arrayList.get(0));
            pVar.g((String) arrayList.get(1));
            pVar.j((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pVar.f(lValueOf);
            pVar.h((Boolean) arrayList.get(4));
            return pVar;
        }

        public Long b() {
            return this.f10875d;
        }

        public String c() {
            return this.f10873b;
        }

        public Boolean d() {
            return this.f10872a;
        }

        public Boolean e() {
            return this.f10874c;
        }

        public void f(Long l3) {
            this.f10875d = l3;
        }

        public void g(String str) {
            this.f10873b = str;
        }

        public void h(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
            }
            this.f10876e = bool;
        }

        public void i(Boolean bool) {
            this.f10872a = bool;
        }

        public void j(Boolean bool) {
            this.f10874c = bool;
        }

        public ArrayList k() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f10872a);
            arrayList.add(this.f10873b);
            arrayList.add(this.f10874c);
            arrayList.add(this.f10875d);
            arrayList.add(this.f10876e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$q */
    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f10877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumC0162A f10878b;

        q() {
        }

        static q a(ArrayList arrayList) {
            q qVar = new q();
            qVar.e(B.values()[((Integer) arrayList.get(0)).intValue()]);
            qVar.d(EnumC0162A.values()[((Integer) arrayList.get(1)).intValue()]);
            return qVar;
        }

        public EnumC0162A b() {
            return this.f10878b;
        }

        public B c() {
            return this.f10877a;
        }

        public void d(EnumC0162A enumC0162A) {
            if (enumC0162A == null) {
                throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
            }
            this.f10878b = enumC0162A;
        }

        public void e(B b3) {
            if (b3 == null) {
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.f10877a = b3;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            B b3 = this.f10877a;
            arrayList.add(b3 == null ? null : Integer.valueOf(b3.f10814a));
            EnumC0162A enumC0162A = this.f10878b;
            arrayList.add(enumC0162A != null ? Integer.valueOf(enumC0162A.f10809a) : null);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$r */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f10880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f10882d;

        /* JADX INFO: renamed from: q1.A$r$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f10884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Long f10885c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Map f10886d;

            public r a() {
                r rVar = new r();
                rVar.d(this.f10883a);
                rVar.b(this.f10884b);
                rVar.e(this.f10885c);
                rVar.c(this.f10886d);
                return rVar;
            }

            public a b(Long l3) {
                this.f10884b = l3;
                return this;
            }

            public a c(Map map) {
                this.f10886d = map;
                return this;
            }

            public a d(String str) {
                this.f10883a = str;
                return this;
            }

            public a e(Long l3) {
                this.f10885c = l3;
                return this;
            }
        }

        static r a(ArrayList arrayList) {
            Long lValueOf;
            r rVar = new r();
            rVar.d((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            rVar.b(lValueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            rVar.e(lValueOf2);
            rVar.c((Map) arrayList.get(3));
            return rVar;
        }

        public void b(Long l3) {
            this.f10880b = l3;
        }

        public void c(Map map) {
            this.f10882d = map;
        }

        public void d(String str) {
            this.f10879a = str;
        }

        public void e(Long l3) {
            this.f10881c = l3;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f10879a);
            arrayList.add(this.f10880b);
            arrayList.add(this.f10881c);
            arrayList.add(this.f10882d);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$s */
    public static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f10887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f10888b;

        /* JADX INFO: renamed from: q1.A$s$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f10889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Long f10890b;

            public s a() {
                s sVar = new s();
                sVar.c(this.f10889a);
                sVar.b(this.f10890b);
                return sVar;
            }

            public a b(Long l3) {
                this.f10890b = l3;
                return this;
            }

            public a c(List list) {
                this.f10889a = list;
                return this;
            }
        }

        s() {
        }

        static s a(ArrayList arrayList) {
            Long lValueOf;
            s sVar = new s();
            sVar.c((List) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.b(lValueOf);
            return sVar;
        }

        public void b(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"executionTime\" is null.");
            }
            this.f10888b = l3;
        }

        public void c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"results\" is null.");
            }
            this.f10887a = list;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10887a);
            arrayList.add(this.f10888b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$t */
    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f10891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f10892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f10893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f10894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f10895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f10896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f10897g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f10898h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Map f10899i;

        static t a(ArrayList arrayList) {
            Long lValueOf;
            t tVar = new t();
            tVar.s((List) arrayList.get(0));
            tVar.p((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            tVar.n(lValueOf);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            tVar.o(lValueOf2);
            tVar.r((List) arrayList.get(4));
            tVar.q((List) arrayList.get(5));
            tVar.k((List) arrayList.get(6));
            tVar.l((List) arrayList.get(7));
            tVar.m((Map) arrayList.get(8));
            return tVar;
        }

        public List b() {
            return this.f10897g;
        }

        public List c() {
            return this.f10898h;
        }

        public Map d() {
            return this.f10899i;
        }

        public Long e() {
            return this.f10893c;
        }

        public Long f() {
            return this.f10894d;
        }

        public List g() {
            return this.f10892b;
        }

        public List h() {
            return this.f10896f;
        }

        public List i() {
            return this.f10895e;
        }

        public List j() {
            return this.f10891a;
        }

        public void k(List list) {
            this.f10897g = list;
        }

        public void l(List list) {
            this.f10898h = list;
        }

        public void m(Map map) {
            this.f10899i = map;
        }

        public void n(Long l3) {
            this.f10893c = l3;
        }

        public void o(Long l3) {
            this.f10894d = l3;
        }

        public void p(List list) {
            this.f10892b = list;
        }

        public void q(List list) {
            this.f10896f = list;
        }

        public void r(List list) {
            this.f10895e = list;
        }

        public void s(List list) {
            this.f10891a = list;
        }

        public ArrayList t() {
            ArrayList arrayList = new ArrayList(9);
            arrayList.add(this.f10891a);
            arrayList.add(this.f10892b);
            arrayList.add(this.f10893c);
            arrayList.add(this.f10894d);
            arrayList.add(this.f10895e);
            arrayList.add(this.f10896f);
            arrayList.add(this.f10897g);
            arrayList.add(this.f10898h);
            arrayList.add(this.f10899i);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$u */
    public static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f10900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f10901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v f10902c;

        /* JADX INFO: renamed from: q1.A$u$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private List f10903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f10904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private v f10905c;

            public u a() {
                u uVar = new u();
                uVar.c(this.f10903a);
                uVar.b(this.f10904b);
                uVar.d(this.f10905c);
                return uVar;
            }

            public a b(List list) {
                this.f10904b = list;
                return this;
            }

            public a c(List list) {
                this.f10903a = list;
                return this;
            }

            public a d(v vVar) {
                this.f10905c = vVar;
                return this;
            }
        }

        u() {
        }

        static u a(ArrayList arrayList) {
            u uVar = new u();
            uVar.c((List) arrayList.get(0));
            uVar.b((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            uVar.d(obj == null ? null : v.a((ArrayList) obj));
            return uVar;
        }

        public void b(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
            }
            this.f10901b = list;
        }

        public void c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documents\" is null.");
            }
            this.f10900a = list;
        }

        public void d(v vVar) {
            if (vVar == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.f10902c = vVar;
        }

        public ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f10900a);
            arrayList.add(this.f10901b);
            v vVar = this.f10902c;
            arrayList.add(vVar == null ? null : vVar.d());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$v */
    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f10906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f10907b;

        /* JADX INFO: renamed from: q1.A$v$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Boolean f10908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Boolean f10909b;

            public v a() {
                v vVar = new v();
                vVar.b(this.f10908a);
                vVar.c(this.f10909b);
                return vVar;
            }

            public a b(Boolean bool) {
                this.f10908a = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f10909b = bool;
                return this;
            }
        }

        v() {
        }

        static v a(ArrayList arrayList) {
            v vVar = new v();
            vVar.b((Boolean) arrayList.get(0));
            vVar.c((Boolean) arrayList.get(1));
            return vVar;
        }

        public void b(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
            }
            this.f10906a = bool;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
            }
            this.f10907b = bool;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f10906a);
            arrayList.add(this.f10907b);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$w */
    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f10910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map f10912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n f10913d;

        w() {
        }

        static w a(ArrayList arrayList) {
            w wVar = new w();
            wVar.i(y.values()[((Integer) arrayList.get(0)).intValue()]);
            wVar.h((String) arrayList.get(1));
            wVar.f((Map) arrayList.get(2));
            Object obj = arrayList.get(3);
            wVar.g(obj == null ? null : n.a((ArrayList) obj));
            return wVar;
        }

        public Map b() {
            return this.f10912c;
        }

        public n c() {
            return this.f10913d;
        }

        public String d() {
            return this.f10911b;
        }

        public y e() {
            return this.f10910a;
        }

        public void f(Map map) {
            this.f10912c = map;
        }

        public void g(n nVar) {
            this.f10913d = nVar;
        }

        public void h(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f10911b = str;
        }

        public void i(y yVar) {
            if (yVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10910a = yVar;
        }

        public ArrayList j() {
            ArrayList arrayList = new ArrayList(4);
            y yVar = this.f10910a;
            arrayList.add(yVar == null ? null : Integer.valueOf(yVar.f10923a));
            arrayList.add(this.f10911b);
            arrayList.add(this.f10912c);
            n nVar = this.f10913d;
            arrayList.add(nVar != null ? nVar.f() : null);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: q1.A$x */
    public enum x {
        SUCCESS(0),
        FAILURE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10917a;

        x(int i3) {
            this.f10917a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$y */
    public enum y {
        GET(0),
        UPDATE(1),
        SET(2),
        DELETE_TYPE(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10923a;

        y(int i3) {
            this.f10923a = i3;
        }
    }

    /* JADX INFO: renamed from: q1.A$z */
    public interface z {
        void a(Object obj);

        void b(Throwable th);
    }

    protected static ArrayList a(Throwable th) {
        Object obj;
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof j) {
            j jVar = (j) th;
            arrayList.add(jVar.f10845a);
            arrayList.add(jVar.getMessage());
            obj = jVar.f10846b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
