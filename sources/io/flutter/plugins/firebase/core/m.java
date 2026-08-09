package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f7956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f7958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f7959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f7960h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f7961i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f7962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f7963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f7964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f7965m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f7966n;

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.m$a$a, reason: collision with other inner class name */
        public static final class C0131a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f7967a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f7968b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f7969c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f7970d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f7971e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f7972f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f7973g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f7974h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f7975i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private String f7976j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private String f7977k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private String f7978l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private String f7979m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f7980n;

            public a a() {
                a aVar = new a();
                aVar.k(this.f7967a);
                aVar.m(this.f7968b);
                aVar.t(this.f7969c);
                aVar.u(this.f7970d);
                aVar.n(this.f7971e);
                aVar.o(this.f7972f);
                aVar.v(this.f7973g);
                aVar.s(this.f7974h);
                aVar.w(this.f7975i);
                aVar.p(this.f7976j);
                aVar.j(this.f7977k);
                aVar.r(this.f7978l);
                aVar.q(this.f7979m);
                aVar.l(this.f7980n);
                return aVar;
            }

            public C0131a b(String str) {
                this.f7967a = str;
                return this;
            }

            public C0131a c(String str) {
                this.f7968b = str;
                return this;
            }

            public C0131a d(String str) {
                this.f7972f = str;
                return this;
            }

            public C0131a e(String str) {
                this.f7969c = str;
                return this;
            }

            public C0131a f(String str) {
                this.f7970d = str;
                return this;
            }

            public C0131a g(String str) {
                this.f7973g = str;
                return this;
            }

            public C0131a h(String str) {
                this.f7975i = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList arrayList) {
            a aVar = new a();
            aVar.k((String) arrayList.get(0));
            aVar.m((String) arrayList.get(1));
            aVar.t((String) arrayList.get(2));
            aVar.u((String) arrayList.get(3));
            aVar.n((String) arrayList.get(4));
            aVar.o((String) arrayList.get(5));
            aVar.v((String) arrayList.get(6));
            aVar.s((String) arrayList.get(7));
            aVar.w((String) arrayList.get(8));
            aVar.p((String) arrayList.get(9));
            aVar.j((String) arrayList.get(10));
            aVar.r((String) arrayList.get(11));
            aVar.q((String) arrayList.get(12));
            aVar.l((String) arrayList.get(13));
            return aVar;
        }

        public String b() {
            return this.f7953a;
        }

        public String c() {
            return this.f7954b;
        }

        public String d() {
            return this.f7957e;
        }

        public String e() {
            return this.f7958f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7953a.equals(aVar.f7953a) && this.f7954b.equals(aVar.f7954b) && this.f7955c.equals(aVar.f7955c) && this.f7956d.equals(aVar.f7956d) && Objects.equals(this.f7957e, aVar.f7957e) && Objects.equals(this.f7958f, aVar.f7958f) && Objects.equals(this.f7959g, aVar.f7959g) && Objects.equals(this.f7960h, aVar.f7960h) && Objects.equals(this.f7961i, aVar.f7961i) && Objects.equals(this.f7962j, aVar.f7962j) && Objects.equals(this.f7963k, aVar.f7963k) && Objects.equals(this.f7964l, aVar.f7964l) && Objects.equals(this.f7965m, aVar.f7965m) && Objects.equals(this.f7966n, aVar.f7966n);
        }

        public String f() {
            return this.f7955c;
        }

        public String g() {
            return this.f7956d;
        }

        public String h() {
            return this.f7959g;
        }

        public int hashCode() {
            return Objects.hash(this.f7953a, this.f7954b, this.f7955c, this.f7956d, this.f7957e, this.f7958f, this.f7959g, this.f7960h, this.f7961i, this.f7962j, this.f7963k, this.f7964l, this.f7965m, this.f7966n);
        }

        public String i() {
            return this.f7961i;
        }

        public void j(String str) {
            this.f7963k = str;
        }

        public void k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f7953a = str;
        }

        public void l(String str) {
            this.f7966n = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f7954b = str;
        }

        public void n(String str) {
            this.f7957e = str;
        }

        public void o(String str) {
            this.f7958f = str;
        }

        public void p(String str) {
            this.f7962j = str;
        }

        public void q(String str) {
            this.f7965m = str;
        }

        public void r(String str) {
            this.f7964l = str;
        }

        public void s(String str) {
            this.f7960h = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f7955c = str;
        }

        public void u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f7956d = str;
        }

        public void v(String str) {
            this.f7959g = str;
        }

        public void w(String str) {
            this.f7961i = str;
        }

        ArrayList x() {
            ArrayList arrayList = new ArrayList(14);
            arrayList.add(this.f7953a);
            arrayList.add(this.f7954b);
            arrayList.add(this.f7955c);
            arrayList.add(this.f7956d);
            arrayList.add(this.f7957e);
            arrayList.add(this.f7958f);
            arrayList.add(this.f7959g);
            arrayList.add(this.f7960h);
            arrayList.add(this.f7961i);
            arrayList.add(this.f7962j);
            arrayList.add(this.f7963k);
            arrayList.add(this.f7964l);
            arrayList.add(this.f7965m);
            arrayList.add(this.f7966n);
            return arrayList;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f7982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f7983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f7984d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f7985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private a f7986b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Boolean f7987c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Map f7988d;

            public b a() {
                b bVar = new b();
                bVar.c(this.f7985a);
                bVar.d(this.f7986b);
                bVar.b(this.f7987c);
                bVar.e(this.f7988d);
                return bVar;
            }

            public a b(Boolean bool) {
                this.f7987c = bool;
                return this;
            }

            public a c(String str) {
                this.f7985a = str;
                return this;
            }

            public a d(a aVar) {
                this.f7986b = aVar;
                return this;
            }

            public a e(Map map) {
                this.f7988d = map;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList arrayList) {
            b bVar = new b();
            bVar.c((String) arrayList.get(0));
            bVar.d((a) arrayList.get(1));
            bVar.b((Boolean) arrayList.get(2));
            bVar.e((Map) arrayList.get(3));
            return bVar;
        }

        public void b(Boolean bool) {
            this.f7983c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f7981a = str;
        }

        public void d(a aVar) {
            if (aVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f7982b = aVar;
        }

        public void e(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f7984d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7981a.equals(bVar.f7981a) && this.f7982b.equals(bVar.f7982b) && Objects.equals(this.f7983c, bVar.f7983c) && this.f7984d.equals(bVar.f7984d);
        }

        ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f7981a);
            arrayList.add(this.f7982b);
            arrayList.add(this.f7983c);
            arrayList.add(this.f7984d);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f7981a, this.f7982b, this.f7983c, this.f7984d);
        }
    }

    public interface c {
        void b(String str, Boolean bool, g gVar);

        void d(String str, Boolean bool, g gVar);

        void f(String str, g gVar);
    }

    public interface d {
        void a(f fVar);

        void c(f fVar);

        void e(String str, a aVar, f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e extends l1.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f7989d = new e();

        private e() {
        }

        @Override // l1.o
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            return b3 != -127 ? b3 != -126 ? super.g(b3, byteBuffer) : b.a((ArrayList) f(byteBuffer)) : a.a((ArrayList) f(byteBuffer));
        }

        @Override // l1.o
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList arrayListF;
            if (obj instanceof a) {
                byteArrayOutputStream.write(129);
                arrayListF = ((a) obj).x();
            } else if (!(obj instanceof b)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                arrayListF = ((b) obj).f();
            }
            p(byteArrayOutputStream, arrayListF);
        }
    }

    public interface f {
        void a(Object obj);

        void b(Throwable th);
    }

    public interface g {
        void a();

        void b(Throwable th);
    }

    protected static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
