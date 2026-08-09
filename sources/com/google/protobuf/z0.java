package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f7005a = H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f7006b = AbstractC0786d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f7007c = q(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f7008d = q(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f7009e = F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f7010f = X();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f7011g = W();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f7012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f7013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f7015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f7016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f7017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f7018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f7019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f7020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f7021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f7022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f7023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f7024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f7025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f7026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f7027w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j3, byte[] bArr, long j4, long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j3) {
            return z0.f7027w ? z0.u(obj, j3) : z0.v(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j3) {
            return z0.f7027w ? z0.y(obj, j3) : z0.z(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j3) {
            return Double.longBitsToDouble(k(obj, j3));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j3) {
            return Float.intBitsToFloat(i(obj, j3));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j3, boolean z2) {
            if (z0.f7027w) {
                z0.M(obj, j3, z2);
            } else {
                z0.N(obj, j3, z2);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j3, byte b3) {
            if (z0.f7027w) {
                z0.P(obj, j3, b3);
            } else {
                z0.Q(obj, j3, b3);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j3, double d3) {
            s(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j3, float f3) {
            r(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j3, byte[] bArr, long j4, long j5) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j3) {
            return z0.f7027w ? z0.u(obj, j3) : z0.v(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j3) {
            return z0.f7027w ? z0.y(obj, j3) : z0.z(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j3) {
            return Double.longBitsToDouble(k(obj, j3));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j3) {
            return Float.intBitsToFloat(i(obj, j3));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j3, boolean z2) {
            if (z0.f7027w) {
                z0.M(obj, j3, z2);
            } else {
                z0.N(obj, j3, z2);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j3, byte b3) {
            if (z0.f7027w) {
                z0.P(obj, j3, b3);
            } else {
                z0.Q(obj, j3, b3);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j3, double d3) {
            s(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j3, float f3) {
            r(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j3, byte[] bArr, long j4, long j5) {
            this.f7028a.copyMemory((Object) null, j3, bArr, z0.f7012h + j4, j5);
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j3) {
            return this.f7028a.getBoolean(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j3) {
            return this.f7028a.getByte(j3);
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j3) {
            return this.f7028a.getByte(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j3) {
            return this.f7028a.getDouble(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j3) {
            return this.f7028a.getFloat(obj, j3);
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j3) {
            return this.f7028a.getLong(j3);
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j3, boolean z2) {
            this.f7028a.putBoolean(obj, j3, z2);
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j3, byte b3) {
            this.f7028a.putByte(obj, j3, b3);
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j3, double d3) {
            this.f7028a.putDouble(obj, j3, d3);
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j3, float f3) {
            this.f7028a.putFloat(obj, j3, f3);
        }

        @Override // com.google.protobuf.z0.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.f7028a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f7028a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f7028a;

        e(Unsafe unsafe) {
            this.f7028a = unsafe;
        }

        public final int a(Class cls) {
            return this.f7028a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f7028a.arrayIndexScale(cls);
        }

        public abstract void c(long j3, byte[] bArr, long j4, long j5);

        public abstract boolean d(Object obj, long j3);

        public abstract byte e(long j3);

        public abstract byte f(Object obj, long j3);

        public abstract double g(Object obj, long j3);

        public abstract float h(Object obj, long j3);

        public final int i(Object obj, long j3) {
            return this.f7028a.getInt(obj, j3);
        }

        public abstract long j(long j3);

        public final long k(Object obj, long j3) {
            return this.f7028a.getLong(obj, j3);
        }

        public final Object l(Object obj, long j3) {
            return this.f7028a.getObject(obj, j3);
        }

        public final long m(Field field) {
            return this.f7028a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j3, boolean z2);

        public abstract void o(Object obj, long j3, byte b3);

        public abstract void p(Object obj, long j3, double d3);

        public abstract void q(Object obj, long j3, float f3);

        public final void r(Object obj, long j3, int i3) {
            this.f7028a.putInt(obj, j3, i3);
        }

        public final void s(Object obj, long j3, long j4) {
            this.f7028a.putLong(obj, j3, j4);
        }

        public final void t(Object obj, long j3, Object obj2) {
            this.f7028a.putObject(obj, j3, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f7028a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f7028a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z0.o() != null;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f7012h = jM;
        f7013i = m(boolean[].class);
        f7014j = n(boolean[].class);
        f7015k = m(int[].class);
        f7016l = n(int[].class);
        f7017m = m(long[].class);
        f7018n = n(long[].class);
        f7019o = m(float[].class);
        f7020p = n(float[].class);
        f7021q = m(double[].class);
        f7022r = n(double[].class);
        f7023s = m(Object[].class);
        f7024t = n(Object[].class);
        f7025u = s(o());
        f7026v = (int) (jM & 7);
        f7027w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double A(Object obj, long j3) {
        return f7009e.g(obj, j3);
    }

    static float B(Object obj, long j3) {
        return f7009e.h(obj, j3);
    }

    static int C(Object obj, long j3) {
        return f7009e.i(obj, j3);
    }

    static long D(long j3) {
        return f7009e.j(j3);
    }

    static long E(Object obj, long j3) {
        return f7009e.k(obj, j3);
    }

    private static e F() {
        Unsafe unsafe = f7005a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0786d.c()) {
            return new d(unsafe);
        }
        if (f7007c) {
            return new c(unsafe);
        }
        if (f7008d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j3) {
        return f7009e.l(obj, j3);
    }

    static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean I() {
        return f7011g;
    }

    static boolean J() {
        return f7010f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Throwable th) {
        Logger.getLogger(z0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void L(Object obj, long j3, boolean z2) {
        f7009e.n(obj, j3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j3, boolean z2) {
        P(obj, j3, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j3, boolean z2) {
        Q(obj, j3, z2 ? (byte) 1 : (byte) 0);
    }

    static void O(byte[] bArr, long j3, byte b3) {
        f7009e.o(bArr, f7012h + j3, b3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int iC = C(obj, j4);
        int i3 = ((~((int) j3)) & 3) << 3;
        T(obj, j4, ((255 & b3) << i3) | (iC & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        T(obj, j4, ((255 & b3) << i3) | (C(obj, j4) & (~(255 << i3))));
    }

    static void R(Object obj, long j3, double d3) {
        f7009e.p(obj, j3, d3);
    }

    static void S(Object obj, long j3, float f3) {
        f7009e.q(obj, j3, f3);
    }

    static void T(Object obj, long j3, int i3) {
        f7009e.r(obj, j3, i3);
    }

    static void U(Object obj, long j3, long j4) {
        f7009e.s(obj, j3, j4);
    }

    static void V(Object obj, long j3, Object obj2) {
        f7009e.t(obj, j3, obj2);
    }

    private static boolean W() {
        e eVar = f7009e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    private static boolean X() {
        e eVar = f7009e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    static long k(ByteBuffer byteBuffer) {
        return f7009e.k(byteBuffer, f7025u);
    }

    static Object l(Class cls) {
        try {
            return f7005a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    private static int m(Class cls) {
        if (f7011g) {
            return f7009e.a(cls);
        }
        return -1;
    }

    private static int n(Class cls) {
        if (f7011g) {
            return f7009e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field o() {
        Field fieldR;
        if (AbstractC0786d.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    static void p(long j3, byte[] bArr, long j4, long j5) {
        f7009e.c(j3, bArr, j4, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean q(Class cls) {
        if (!AbstractC0786d.c()) {
            return false;
        }
        try {
            Class cls2 = f7006b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f7009e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    static boolean t(Object obj, long j3) {
        return f7009e.d(obj, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j3) {
        return y(obj, j3) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j3) {
        return z(obj, j3) != 0;
    }

    static byte w(long j3) {
        return f7009e.e(j3);
    }

    static byte x(byte[] bArr, long j3) {
        return f7009e.f(bArr, f7012h + j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j3) {
        return (byte) ((C(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j3) {
        return (byte) ((C(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }
}
