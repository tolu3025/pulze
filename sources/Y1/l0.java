package y1;

import e0.AbstractC0821b;
import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import e0.AbstractC0834o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f11959d = f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f11960e = b.OK.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f11961f = b.CANCELLED.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l0 f11962g = b.UNKNOWN.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f11963h = b.INVALID_ARGUMENT.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0 f11964i = b.DEADLINE_EXCEEDED.e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l0 f11965j = b.NOT_FOUND.e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l0 f11966k = b.ALREADY_EXISTS.e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l0 f11967l = b.PERMISSION_DENIED.e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l0 f11968m = b.UNAUTHENTICATED.e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l0 f11969n = b.RESOURCE_EXHAUSTED.e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l0 f11970o = b.FAILED_PRECONDITION.e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l0 f11971p = b.ABORTED.e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l0 f11972q = b.OUT_OF_RANGE.e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0 f11973r = b.UNIMPLEMENTED.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l0 f11974s = b.INTERNAL.e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l0 f11975t = b.UNAVAILABLE.e();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l0 f11976u = b.DATA_LOSS.e();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Z.g f11977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Z.j f11978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Z.g f11979x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f11982c;

    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f12002b;

        b(int i3) {
            this.f12001a = i3;
            this.f12002b = Integer.toString(i3).getBytes(AbstractC0821b.f7061a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] h() {
            return this.f12002b;
        }

        public l0 e() {
            return (l0) l0.f11959d.get(this.f12001a);
        }

        public int g() {
            return this.f12001a;
        }
    }

    private static final class c implements Z.j {
        private c() {
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public l0 b(byte[] bArr) {
            return l0.i(bArr);
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(l0 l0Var) {
            return l0Var.m().h();
        }
    }

    private static final class d implements Z.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f12003a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b3) {
            return b3 < 32 || b3 >= 126 || b3 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i3 = 0;
            while (i3 < bArr.length) {
                if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, AbstractC0821b.f7061a), 16));
                        i3 += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i3]);
                        i3++;
                    }
                }
                byteBufferAllocate.put(bArr[i3]);
                i3++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0821b.f7063c);
        }

        private static byte[] g(byte[] bArr, int i3) {
            byte[] bArr2 = new byte[((bArr.length - i3) * 3) + i3];
            if (i3 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i3);
            }
            int i4 = i3;
            while (i3 < bArr.length) {
                byte b3 = bArr[i3];
                if (c(b3)) {
                    bArr2[i4] = 37;
                    byte[] bArr3 = f12003a;
                    bArr2[i4 + 1] = bArr3[(b3 >> 4) & 15];
                    bArr2[i4 + 2] = bArr3[b3 & 15];
                    i4 += 3;
                } else {
                    bArr2[i4] = b3;
                    i4++;
                }
                i3++;
            }
            return Arrays.copyOf(bArr2, i4);
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                byte b3 = bArr[i3];
                if (b3 < 32 || b3 >= 126 || (b3 == 37 && i3 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(AbstractC0821b.f7063c);
            for (int i3 = 0; i3 < bytes.length; i3++) {
                if (c(bytes[i3])) {
                    return g(bytes, i3);
                }
            }
            return bytes;
        }
    }

    static {
        f11977v = Z.g.g("grpc-status", false, new c());
        d dVar = new d();
        f11978w = dVar;
        f11979x = Z.g.g("grpc-message", false, dVar);
    }

    private l0(b bVar) {
        this(bVar, null, null);
    }

    private static List f() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            l0 l0Var = (l0) treeMap.put(Integer.valueOf(bVar.g()), new l0(bVar));
            if (l0Var != null) {
                throw new IllegalStateException("Code value duplication between " + l0Var.m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String g(l0 l0Var) {
        if (l0Var.f11981b == null) {
            return l0Var.f11980a.toString();
        }
        return l0Var.f11980a + ": " + l0Var.f11981b;
    }

    public static l0 h(int i3) {
        if (i3 >= 0) {
            List list = f11959d;
            if (i3 < list.size()) {
                return (l0) list.get(i3);
            }
        }
        return f11962g.q("Unknown code " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f11960e : j(bArr);
    }

    private static l0 j(byte[] bArr) {
        int i3;
        byte b3;
        int length = bArr.length;
        char c3 = 1;
        if (length != 1) {
            i3 = (length == 2 && (b3 = bArr[0]) >= 48 && b3 <= 57) ? (b3 - 48) * 10 : 0;
            return f11962g.q("Unknown code " + new String(bArr, AbstractC0821b.f7061a));
        }
        c3 = 0;
        byte b4 = bArr[c3];
        if (b4 >= 48 && b4 <= 57) {
            int i4 = i3 + (b4 - 48);
            List list = f11959d;
            if (i4 < list.size()) {
                return (l0) list.get(i4);
            }
        }
        return f11962g.q("Unknown code " + new String(bArr, AbstractC0821b.f7061a));
    }

    public static l0 k(Throwable th) {
        for (Throwable cause = (Throwable) AbstractC0829j.o(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof m0) {
                return ((m0) cause).a();
            }
            if (cause instanceof n0) {
                return ((n0) cause).a();
            }
        }
        return f11962g.p(th);
    }

    public m0 c() {
        return new m0(this);
    }

    public n0 d() {
        return new n0(this);
    }

    public l0 e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f11981b == null) {
            return new l0(this.f11980a, str, this.f11982c);
        }
        return new l0(this.f11980a, this.f11981b + "\n" + str, this.f11982c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable l() {
        return this.f11982c;
    }

    public b m() {
        return this.f11980a;
    }

    public String n() {
        return this.f11981b;
    }

    public boolean o() {
        return b.OK == this.f11980a;
    }

    public l0 p(Throwable th) {
        return AbstractC0826g.a(this.f11982c, th) ? this : new l0(this.f11980a, this.f11981b, th);
    }

    public l0 q(String str) {
        return AbstractC0826g.a(this.f11981b, str) ? this : new l0(this.f11980a, str, this.f11982c);
    }

    public String toString() {
        AbstractC0825f.b bVarD = AbstractC0825f.b(this).d("code", this.f11980a.name()).d("description", this.f11981b);
        Throwable th = this.f11982c;
        Object objE = th;
        if (th != null) {
            objE = AbstractC0834o.e(th);
        }
        return bVarD.d("cause", objE).toString();
    }

    private l0(b bVar, String str, Throwable th) {
        this.f11980a = (b) AbstractC0829j.o(bVar, "code");
        this.f11981b = str;
        this.f11982c = th;
    }
}
