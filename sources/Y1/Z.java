package y1;

import c.AbstractC0527b;
import e0.AbstractC0821b;
import e0.AbstractC0829j;
import g0.AbstractC0870a;
import g0.AbstractC0871b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f11840c = Logger.getLogger(Z.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f11841d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f11842e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC0870a f11843f = AbstractC0870a.a().k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f11844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11845b;

    class a implements e {
        a() {
        }
    }

    private static class c extends g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f11846f;

        private c(String str, boolean z2, d dVar) {
            super(str, z2, dVar, null);
            AbstractC0829j.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f11846f = (d) AbstractC0829j.o(dVar, "marshaller");
        }

        @Override // y1.Z.g
        Object h(byte[] bArr) {
            return this.f11846f.b(new String(bArr, AbstractC0821b.f7061a));
        }

        @Override // y1.Z.g
        byte[] j(Object obj) {
            return ((String) AbstractC0829j.o(this.f11846f.a(obj), "null marshaller.toAsciiString()")).getBytes(AbstractC0821b.f7061a);
        }

        /* synthetic */ c(String str, boolean z2, d dVar, a aVar) {
            this(str, z2, dVar);
        }
    }

    public interface d {
        String a(Object obj);

        Object b(String str);
    }

    public interface e {
    }

    public interface f {
    }

    public static abstract class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BitSet f11847e = b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f11850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f11851d;

        private g(String str, boolean z2, Object obj) {
            String str2 = (String) AbstractC0829j.o(str, "name");
            this.f11848a = str2;
            String strK = k(str2.toLowerCase(Locale.ROOT), z2);
            this.f11849b = strK;
            this.f11850c = strK.getBytes(AbstractC0821b.f7061a);
            this.f11851d = obj;
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c3 = '0'; c3 <= '9'; c3 = (char) (c3 + 1)) {
                bitSet.set(c3);
            }
            for (char c4 = 'a'; c4 <= 'z'; c4 = (char) (c4 + 1)) {
                bitSet.set(c4);
            }
            return bitSet;
        }

        public static g e(String str, d dVar) {
            return f(str, false, dVar);
        }

        static g f(String str, boolean z2, d dVar) {
            return new c(str, z2, dVar, null);
        }

        static g g(String str, boolean z2, j jVar) {
            return new i(str, z2, jVar, null);
        }

        private static String k(String str, boolean z2) {
            AbstractC0829j.o(str, "name");
            AbstractC0829j.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                Z.f11840c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (!z2 || cCharAt != ':' || i3 != 0) {
                    AbstractC0829j.g(f11847e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f11850c;
        }

        final Object c(Class cls) {
            if (cls.isInstance(this.f11851d)) {
                return cls.cast(this.f11851d);
            }
            return null;
        }

        public final String d() {
            return this.f11849b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f11849b.equals(((g) obj).f11849b);
        }

        abstract Object h(byte[] bArr);

        public final int hashCode() {
            return this.f11849b.hashCode();
        }

        boolean i() {
            return false;
        }

        abstract byte[] j(Object obj);

        public String toString() {
            return "Key{name='" + this.f11849b + "'}";
        }

        /* synthetic */ g(String str, boolean z2, Object obj, a aVar) {
            this(str, z2, obj);
        }
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile byte[] f11853b;

        h(f fVar, Object obj) {
            this.f11852a = obj;
        }

        static h a(g gVar, Object obj) {
            b(gVar);
            AbstractC0527b.a(AbstractC0829j.n(null));
            return new h(null, obj);
        }

        private static f b(g gVar) {
            AbstractC0527b.a(gVar.c(f.class));
            return null;
        }

        byte[] c() {
            if (this.f11853b == null) {
                synchronized (this) {
                    try {
                        if (this.f11853b == null) {
                            this.f11853b = Z.r(e());
                        }
                    } finally {
                    }
                }
            }
            return this.f11853b;
        }

        Object d(g gVar) {
            if (gVar.i()) {
                b(gVar);
            }
            return gVar.h(c());
        }

        InputStream e() {
            throw null;
        }
    }

    private static final class i extends g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final j f11854f;

        private i(String str, boolean z2, j jVar) {
            super(str, z2, jVar, null);
            AbstractC0829j.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f11854f = (j) AbstractC0829j.o(jVar, "marshaller");
        }

        @Override // y1.Z.g
        Object h(byte[] bArr) {
            return this.f11854f.b(bArr);
        }

        @Override // y1.Z.g
        byte[] j(Object obj) {
            return (byte[]) AbstractC0829j.o(this.f11854f.a(obj), "null marshaller.toAsciiString()");
        }

        /* synthetic */ i(String str, boolean z2, j jVar, a aVar) {
            this(str, z2, jVar);
        }
    }

    interface j {
        byte[] a(Object obj);

        Object b(byte[] bArr);
    }

    public Z() {
    }

    Z(int i3, Object[] objArr) {
        this.f11845b = i3;
        this.f11844a = objArr;
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f11844a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i3) {
        Object[] objArr = new Object[i3];
        if (!i()) {
            System.arraycopy(this.f11844a, 0, objArr, 0, k());
        }
        this.f11844a = objArr;
    }

    private boolean i() {
        return this.f11845b == 0;
    }

    private int k() {
        return this.f11845b * 2;
    }

    private void l() {
        if (k() == 0 || k() == d()) {
            f(Math.max(k() * 2, 8));
        }
    }

    private void n(int i3, byte[] bArr) {
        this.f11844a[i3 * 2] = bArr;
    }

    private byte[] o(int i3) {
        return (byte[]) this.f11844a[i3 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return AbstractC0871b.d(inputStream);
        } catch (IOException e3) {
            throw new RuntimeException("failure reading serialized stream", e3);
        }
    }

    private Object s(int i3) {
        return this.f11844a[(i3 * 2) + 1];
    }

    private void t(int i3, Object obj) {
        if (this.f11844a instanceof byte[][]) {
            f(d());
        }
        this.f11844a[(i3 * 2) + 1] = obj;
    }

    private void u(int i3, byte[] bArr) {
        this.f11844a[(i3 * 2) + 1] = bArr;
    }

    private byte[] v(int i3) {
        Object objS = s(i3);
        return objS instanceof byte[] ? (byte[]) objS : ((h) objS).c();
    }

    private Object w(int i3, g gVar) {
        Object objS = s(i3);
        return objS instanceof byte[] ? gVar.h((byte[]) objS) : ((h) objS).d(gVar);
    }

    public void e(g gVar) {
        if (i()) {
            return;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11845b; i4++) {
            if (!c(gVar.a(), o(i4))) {
                n(i3, o(i4));
                t(i3, s(i4));
                i3++;
            }
        }
        Arrays.fill(this.f11844a, i3 * 2, k(), (Object) null);
        this.f11845b = i3;
    }

    public Object g(g gVar) {
        for (int i3 = this.f11845b - 1; i3 >= 0; i3--) {
            if (c(gVar.a(), o(i3))) {
                return w(i3, gVar);
            }
        }
        return null;
    }

    int h() {
        return this.f11845b;
    }

    public Set j() {
        if (i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f11845b);
        for (int i3 = 0; i3 < this.f11845b; i3++) {
            hashSet.add(new String(o(i3), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void m(Z z2) {
        if (z2.i()) {
            return;
        }
        int iD = d() - k();
        if (i() || iD < z2.k()) {
            f(k() + z2.k());
        }
        System.arraycopy(z2.f11844a, 0, this.f11844a, k(), z2.k());
        this.f11845b += z2.f11845b;
    }

    public void p(g gVar, Object obj) {
        AbstractC0829j.o(gVar, "key");
        AbstractC0829j.o(obj, "value");
        l();
        n(this.f11845b, gVar.a());
        if (gVar.i()) {
            t(this.f11845b, h.a(gVar, obj));
        } else {
            u(this.f11845b, gVar.j(obj));
        }
        this.f11845b++;
    }

    byte[][] q() {
        byte[][] bArr = new byte[k()][];
        Object[] objArr = this.f11844a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, k());
        } else {
            for (int i3 = 0; i3 < this.f11845b; i3++) {
                int i4 = i3 * 2;
                bArr[i4] = o(i3);
                bArr[i4 + 1] = v(i3);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i3 = 0; i3 < this.f11845b; i3++) {
            if (i3 != 0) {
                sb.append(',');
            }
            byte[] bArrO = o(i3);
            Charset charset = AbstractC0821b.f7061a;
            String str = new String(bArrO, charset);
            sb.append(str);
            sb.append('=');
            sb.append(str.endsWith("-bin") ? f11843f.e(v(i3)) : new String(v(i3), charset));
        }
        sb.append(')');
        return sb.toString();
    }

    Z(int i3, byte[]... bArr) {
        this(i3, (Object[]) bArr);
    }

    Z(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    class b implements d {
        b() {
        }

        @Override // y1.Z.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // y1.Z.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }
}
