package io.flutter.plugins.imagepicker;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8071b;

        /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.p$a$a, reason: collision with other inner class name */
        public static final class C0132a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f8072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f8073b;

            public a a() {
                a aVar = new a();
                aVar.b(this.f8072a);
                aVar.c(this.f8073b);
                return aVar;
            }

            public C0132a b(String str) {
                this.f8072a = str;
                return this;
            }

            public C0132a c(String str) {
                this.f8073b = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList arrayList) {
            a aVar = new a();
            aVar.b((String) arrayList.get(0));
            aVar.c((String) arrayList.get(1));
            return aVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.f8070a = str;
        }

        public void c(String str) {
            this.f8071b = str;
        }

        ArrayList d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f8070a);
            arrayList.add(this.f8071b);
            return arrayList;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f8074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f8075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f8076c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c f8077a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f8078b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f8079c;

            public b a() {
                b bVar = new b();
                bVar.d(this.f8077a);
                bVar.b(this.f8078b);
                bVar.c(this.f8079c);
                return bVar;
            }

            public a b(a aVar) {
                this.f8078b = aVar;
                return this;
            }

            public a c(List list) {
                this.f8079c = list;
                return this;
            }

            public a d(c cVar) {
                this.f8077a = cVar;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList arrayList) {
            b bVar = new b();
            bVar.d(c.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            bVar.b(obj == null ? null : a.a((ArrayList) obj));
            bVar.c((List) arrayList.get(2));
            return bVar;
        }

        public void b(a aVar) {
            this.f8075b = aVar;
        }

        public void c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.f8076c = list;
        }

        public void d(c cVar) {
            if (cVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f8074a = cVar;
        }

        ArrayList e() {
            ArrayList arrayList = new ArrayList(3);
            c cVar = this.f8074a;
            arrayList.add(cVar == null ? null : Integer.valueOf(cVar.f8083a));
            a aVar = this.f8075b;
            arrayList.add(aVar != null ? aVar.d() : null);
            arrayList.add(this.f8076c);
            return arrayList;
        }
    }

    public enum c {
        IMAGE(0),
        VIDEO(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8083a;

        c(int i3) {
            this.f8083a = i3;
        }
    }

    public static class d extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f8085b;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.f8084a = str;
            this.f8085b = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f8086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f8087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f8088c;

        e() {
        }

        static e a(ArrayList arrayList) {
            Long lValueOf;
            e eVar = new e();
            eVar.e((Boolean) arrayList.get(0));
            eVar.g((Boolean) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.f(lValueOf);
            return eVar;
        }

        public Boolean b() {
            return this.f8086a;
        }

        public Long c() {
            return this.f8088c;
        }

        public Boolean d() {
            return this.f8087b;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.f8086a = bool;
        }

        public void f(Long l3) {
            this.f8088c = l3;
        }

        public void g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.f8087b = bool;
        }

        ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f8086a);
            arrayList.add(this.f8087b);
            arrayList.add(this.f8088c);
            return arrayList;
        }
    }

    public interface f {
        void a(i iVar, e eVar, j jVar);

        void b(l lVar, h hVar, e eVar, j jVar);

        void c(l lVar, n nVar, e eVar, j jVar);

        b d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class g extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f8089d = new g();

        private g() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case -128:
                    return a.a((ArrayList) f(byteBuffer));
                case -127:
                    return b.a((ArrayList) f(byteBuffer));
                case -126:
                    return e.a((ArrayList) f(byteBuffer));
                case -125:
                    return h.a((ArrayList) f(byteBuffer));
                case -124:
                    return i.a((ArrayList) f(byteBuffer));
                case -123:
                    return l.a((ArrayList) f(byteBuffer));
                case -122:
                    return n.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b3, byteBuffer);
            }
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListF;
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                arrayListF = ((a) obj).d();
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                arrayListF = ((b) obj).e();
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(130);
                arrayListF = ((e) obj).h();
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(131);
                arrayListF = ((h) obj).h();
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(132);
                arrayListF = ((i) obj).d();
            } else {
                if (!(obj instanceof l)) {
                    if (!(obj instanceof n)) {
                        super.p(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(134);
                        p(byteArrayOutputStream, ((n) obj).d());
                        return;
                    }
                }
                byteArrayOutputStream.write(133);
                arrayListF = ((l) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f8090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f8091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f8092c;

        h() {
        }

        static h a(ArrayList arrayList) {
            Long lValueOf;
            h hVar = new h();
            hVar.f((Double) arrayList.get(0));
            hVar.e((Double) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.g(lValueOf);
            return hVar;
        }

        public Double b() {
            return this.f8091b;
        }

        public Double c() {
            return this.f8090a;
        }

        public Long d() {
            return this.f8092c;
        }

        public void e(Double d3) {
            this.f8091b = d3;
        }

        public void f(Double d3) {
            this.f8090a = d3;
        }

        public void g(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.f8092c = l3;
        }

        ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f8090a);
            arrayList.add(this.f8091b);
            arrayList.add(this.f8092c);
            return arrayList;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h f8093a;

        i() {
        }

        static i a(ArrayList arrayList) {
            i iVar = new i();
            Object obj = arrayList.get(0);
            iVar.c(obj == null ? null : h.a((ArrayList) obj));
            return iVar;
        }

        public h b() {
            return this.f8093a;
        }

        public void c(h hVar) {
            if (hVar == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.f8093a = hVar;
        }

        ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            h hVar = this.f8093a;
            arrayList.add(hVar == null ? null : hVar.h());
            return arrayList;
        }
    }

    public interface j {
        void a(Object obj);

        void b(Throwable th);
    }

    public enum k {
        REAR(0),
        FRONT(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8097a;

        k(int i3) {
            this.f8097a = i3;
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f8098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f8099b;

        l() {
        }

        static l a(ArrayList arrayList) {
            l lVar = new l();
            lVar.e(m.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            lVar.d(obj == null ? null : k.values()[((Integer) obj).intValue()]);
            return lVar;
        }

        public k b() {
            return this.f8099b;
        }

        public m c() {
            return this.f8098a;
        }

        public void d(k kVar) {
            this.f8099b = kVar;
        }

        public void e(m mVar) {
            if (mVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f8098a = mVar;
        }

        ArrayList f() {
            ArrayList arrayList = new ArrayList(2);
            m mVar = this.f8098a;
            arrayList.add(mVar == null ? null : Integer.valueOf(mVar.f8103a));
            k kVar = this.f8099b;
            arrayList.add(kVar != null ? Integer.valueOf(kVar.f8097a) : null);
            return arrayList;
        }
    }

    public enum m {
        CAMERA(0),
        GALLERY(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8103a;

        m(int i3) {
            this.f8103a = i3;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f8104a;

        static n a(ArrayList arrayList) {
            Long lValueOf;
            n nVar = new n();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            nVar.c(lValueOf);
            return nVar;
        }

        public Long b() {
            return this.f8104a;
        }

        public void c(Long l3) {
            this.f8104a = l3;
        }

        ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f8104a);
            return arrayList;
        }
    }

    protected static ArrayList a(Throwable th) {
        Object obj;
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f8084a);
            arrayList.add(dVar.getMessage());
            obj = dVar.f8085b;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
