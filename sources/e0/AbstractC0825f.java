package e0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: e0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825f {

    /* JADX INFO: renamed from: e0.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0120b f7069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0120b f7070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7072e;

        /* JADX INFO: renamed from: e0.f$b$a */
        private static final class a extends C0120b {
            private a() {
                super();
            }
        }

        /* JADX INFO: renamed from: e0.f$b$b, reason: collision with other inner class name */
        private static class C0120b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f7073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f7074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0120b f7075c;

            private C0120b() {
            }
        }

        private b(String str) {
            C0120b c0120b = new C0120b();
            this.f7069b = c0120b;
            this.f7070c = c0120b;
            this.f7071d = false;
            this.f7072e = false;
            this.f7068a = (String) AbstractC0829j.n(str);
        }

        private C0120b f() {
            C0120b c0120b = new C0120b();
            this.f7070c.f7075c = c0120b;
            this.f7070c = c0120b;
            return c0120b;
        }

        private b g(String str, Object obj) {
            C0120b c0120bF = f();
            c0120bF.f7074b = obj;
            c0120bF.f7073a = (String) AbstractC0829j.n(str);
            return this;
        }

        private a h() {
            a aVar = new a();
            this.f7070c.f7075c = aVar;
            this.f7070c = aVar;
            return aVar;
        }

        private b i(String str, Object obj) {
            a aVarH = h();
            aVarH.f7074b = obj;
            aVarH.f7073a = (String) AbstractC0829j.n(str);
            return this;
        }

        private static boolean j(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d3) {
            return i(str, String.valueOf(d3));
        }

        public b b(String str, int i3) {
            return i(str, String.valueOf(i3));
        }

        public b c(String str, long j3) {
            return i(str, String.valueOf(j3));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public b e(String str, boolean z2) {
            return i(str, String.valueOf(z2));
        }

        public b k() {
            this.f7071d = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f7071d
                boolean r2 = r8.f7072e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f7068a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                e0.f$b$b r4 = r8.f7069b
                e0.f$b$b r4 = r4.f7075c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L66
                java.lang.Object r6 = r4.f7074b
                boolean r7 = r4 instanceof e0.AbstractC0825f.b.a
                if (r7 != 0) goto L31
                if (r6 != 0) goto L29
                if (r1 != 0) goto L63
                goto L31
            L29:
                if (r2 == 0) goto L31
                boolean r7 = j(r6)
                if (r7 != 0) goto L63
            L31:
                r3.append(r5)
                java.lang.String r5 = r4.f7073a
                if (r5 == 0) goto L40
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L40:
                if (r6 == 0) goto L5e
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5e
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L61
            L5e:
                r3.append(r6)
            L61:
                java.lang.String r5 = ", "
            L63:
                e0.f$b$b r4 = r4.f7075c
                goto L1c
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.AbstractC0825f.b.toString():java.lang.String");
        }
    }

    public static b a(Class cls) {
        return new b(cls.getSimpleName());
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
