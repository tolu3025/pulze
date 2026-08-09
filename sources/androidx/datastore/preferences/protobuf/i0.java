package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f4120a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f4121b = AbstractC0490d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f4122c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f4123d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f4124e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f4125f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f4126g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f4127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f4128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f4129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f4130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f4131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f4132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f4133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f4134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f4135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f4136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f4137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f4138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f4139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f4140u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f4141v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f4142w;

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

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j3) {
            return i0.f4142w ? i0.q(obj, j3) : i0.r(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j3) {
            return Double.longBitsToDouble(g(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j3) {
            return Float.intBitsToFloat(f(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j3, boolean z2) {
            if (i0.f4142w) {
                i0.F(obj, j3, z2);
            } else {
                i0.G(obj, j3, z2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j3, byte b3) {
            if (i0.f4142w) {
                i0.I(obj, j3, b3);
            } else {
                i0.J(obj, j3, b3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j3, double d3) {
            o(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j3, float f3) {
            n(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j3) {
            return i0.f4142w ? i0.q(obj, j3) : i0.r(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j3) {
            return Double.longBitsToDouble(g(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j3) {
            return Float.intBitsToFloat(f(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j3, boolean z2) {
            if (i0.f4142w) {
                i0.F(obj, j3, z2);
            } else {
                i0.G(obj, j3, z2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j3, byte b3) {
            if (i0.f4142w) {
                i0.I(obj, j3, b3);
            } else {
                i0.J(obj, j3, b3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j3, double d3) {
            o(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j3, float f3) {
            n(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j3) {
            return this.f4143a.getBoolean(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j3) {
            return this.f4143a.getDouble(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j3) {
            return this.f4143a.getFloat(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j3, boolean z2) {
            this.f4143a.putBoolean(obj, j3, z2);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j3, byte b3) {
            this.f4143a.putByte(obj, j3, b3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j3, double d3) {
            this.f4143a.putDouble(obj, j3, d3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j3, float f3) {
            this.f4143a.putFloat(obj, j3, f3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f4143a.getClass();
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
                i0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f4143a.getClass();
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
                i0.D(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f4143a;

        e(Unsafe unsafe) {
            this.f4143a = unsafe;
        }

        public final int a(Class cls) {
            return this.f4143a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f4143a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j3);

        public abstract double d(Object obj, long j3);

        public abstract float e(Object obj, long j3);

        public final int f(Object obj, long j3) {
            return this.f4143a.getInt(obj, j3);
        }

        public final long g(Object obj, long j3) {
            return this.f4143a.getLong(obj, j3);
        }

        public final Object h(Object obj, long j3) {
            return this.f4143a.getObject(obj, j3);
        }

        public final long i(Field field) {
            return this.f4143a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j3, boolean z2);

        public abstract void k(Object obj, long j3, byte b3);

        public abstract void l(Object obj, long j3, double d3);

        public abstract void m(Object obj, long j3, float f3);

        public final void n(Object obj, long j3, int i3) {
            this.f4143a.putInt(obj, j3, i3);
        }

        public final void o(Object obj, long j3, long j4) {
            this.f4143a.putLong(obj, j3, j4);
        }

        public final void p(Object obj, long j3, Object obj2) {
            this.f4143a.putObject(obj, j3, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f4143a;
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
                i0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f4143a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return i0.l() != null;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }
    }

    static {
        long j3 = j(byte[].class);
        f4127h = j3;
        f4128i = j(boolean[].class);
        f4129j = k(boolean[].class);
        f4130k = j(int[].class);
        f4131l = k(int[].class);
        f4132m = j(long[].class);
        f4133n = k(long[].class);
        f4134o = j(float[].class);
        f4135p = k(float[].class);
        f4136q = j(double[].class);
        f4137r = k(double[].class);
        f4138s = j(Object[].class);
        f4139t = k(Object[].class);
        f4140u = o(l());
        f4141v = (int) (j3 & 7);
        f4142w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f4126g;
    }

    static boolean C() {
        return f4125f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j3, boolean z2) {
        f4124e.j(obj, j3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j3, boolean z2) {
        I(obj, j3, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j3, boolean z2) {
        J(obj, j3, z2 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j3, byte b3) {
        f4124e.k(bArr, f4127h + j3, b3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int iW = w(obj, j4);
        int i3 = ((~((int) j3)) & 3) << 3;
        M(obj, j4, ((255 & b3) << i3) | (iW & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        M(obj, j4, ((255 & b3) << i3) | (w(obj, j4) & (~(255 << i3))));
    }

    static void K(Object obj, long j3, double d3) {
        f4124e.l(obj, j3, d3);
    }

    static void L(Object obj, long j3, float f3) {
        f4124e.m(obj, j3, f3);
    }

    static void M(Object obj, long j3, int i3) {
        f4124e.n(obj, j3, i3);
    }

    static void N(Object obj, long j3, long j4) {
        f4124e.o(obj, j3, j4);
    }

    static void O(Object obj, long j3, Object obj2) {
        f4124e.p(obj, j3, obj2);
    }

    private static boolean P() {
        e eVar = f4124e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f4124e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f4120a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    private static int j(Class cls) {
        if (f4126g) {
            return f4124e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f4126g) {
            return f4124e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC0490d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean m(Class cls) {
        if (!AbstractC0490d.c()) {
            return false;
        }
        try {
            Class cls2 = f4121b;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f4124e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j3) {
        return f4124e.c(obj, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j3) {
        return s(obj, j3) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j3) {
        return t(obj, j3) != 0;
    }

    private static byte s(Object obj, long j3) {
        return (byte) ((w(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j3) {
        return (byte) ((w(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j3) {
        return f4124e.d(obj, j3);
    }

    static float v(Object obj, long j3) {
        return f4124e.e(obj, j3);
    }

    static int w(Object obj, long j3) {
        return f4124e.f(obj, j3);
    }

    static long x(Object obj, long j3) {
        return f4124e.g(obj, j3);
    }

    private static e y() {
        Unsafe unsafe = f4120a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0490d.c()) {
            return new d(unsafe);
        }
        if (f4122c) {
            return new c(unsafe);
        }
        if (f4123d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j3) {
        return f4124e.h(obj, j3);
    }
}
