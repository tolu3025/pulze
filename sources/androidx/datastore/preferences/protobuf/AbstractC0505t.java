package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0487a;
import androidx.datastore.preferences.protobuf.AbstractC0506u;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0505t extends AbstractC0487a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0505t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected g0 unknownFields = g0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC0487a.AbstractC0085a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0505t f4268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected AbstractC0505t f4269b;

        protected a(AbstractC0505t abstractC0505t) {
            this.f4268a = abstractC0505t;
            if (abstractC0505t.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f4269b = p();
        }

        private static void o(Object obj, Object obj2) {
            U.a().d(obj).a(obj, obj2);
        }

        private AbstractC0505t p() {
            return this.f4268a.I();
        }

        public final AbstractC0505t i() {
            AbstractC0505t abstractC0505tF = f();
            if (abstractC0505tF.A()) {
                return abstractC0505tF;
            }
            throw AbstractC0487a.AbstractC0085a.h(abstractC0505tF);
        }

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC0505t f() {
            if (!this.f4269b.C()) {
                return this.f4269b;
            }
            this.f4269b.D();
            return this.f4269b;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarC = b().c();
            aVarC.f4269b = f();
            return aVarC;
        }

        protected final void l() {
            if (this.f4269b.C()) {
                return;
            }
            m();
        }

        protected void m() {
            AbstractC0505t abstractC0505tP = p();
            o(abstractC0505tP, this.f4269b);
            this.f4269b = abstractC0505tP;
        }

        @Override // androidx.datastore.preferences.protobuf.K
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC0505t b() {
            return this.f4268a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    protected static class b extends AbstractC0488b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0505t f4270b;

        public b(AbstractC0505t abstractC0505t) {
            this.f4270b = abstractC0505t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC0497k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean B(AbstractC0505t abstractC0505t, boolean z2) {
        byte bByteValue = ((Byte) abstractC0505t.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = U.a().d(abstractC0505t).c(abstractC0505t);
        if (z2) {
            abstractC0505t.r(d.SET_MEMOIZED_IS_INITIALIZED, zC ? abstractC0505t : null);
        }
        return zC;
    }

    protected static AbstractC0506u.b F(AbstractC0506u.b bVar) {
        int size = bVar.size();
        return bVar.e(size == 0 ? 10 : size * 2);
    }

    protected static Object H(J j3, String str, Object[] objArr) {
        return new W(j3, str, objArr);
    }

    protected static AbstractC0505t J(AbstractC0505t abstractC0505t, InputStream inputStream) {
        return k(K(abstractC0505t, AbstractC0493g.g(inputStream), C0499m.b()));
    }

    static AbstractC0505t K(AbstractC0505t abstractC0505t, AbstractC0493g abstractC0493g, C0499m c0499m) throws C0507v {
        AbstractC0505t abstractC0505tI = abstractC0505t.I();
        try {
            Y yD = U.a().d(abstractC0505tI);
            yD.h(abstractC0505tI, C0494h.O(abstractC0493g), c0499m);
            yD.b(abstractC0505tI);
            return abstractC0505tI;
        } catch (e0 e3) {
            throw e3.a().k(abstractC0505tI);
        } catch (C0507v e4) {
            e = e4;
            if (e.a()) {
                e = new C0507v(e);
            }
            throw e.k(abstractC0505tI);
        } catch (IOException e5) {
            if (e5.getCause() instanceof C0507v) {
                throw ((C0507v) e5.getCause());
            }
            throw new C0507v(e5).k(abstractC0505tI);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof C0507v) {
                throw ((C0507v) e6.getCause());
            }
            throw e6;
        }
    }

    protected static void L(Class cls, AbstractC0505t abstractC0505t) {
        abstractC0505t.E();
        defaultInstanceMap.put(cls, abstractC0505t);
    }

    private static AbstractC0505t k(AbstractC0505t abstractC0505t) throws C0507v {
        if (abstractC0505t == null || abstractC0505t.A()) {
            return abstractC0505t;
        }
        throw abstractC0505t.h().a().k(abstractC0505t);
    }

    private int o(Y y2) {
        return y2 == null ? U.a().d(this).e(this) : y2.e(this);
    }

    protected static AbstractC0506u.b t() {
        return V.d();
    }

    static AbstractC0505t u(Class cls) {
        AbstractC0505t abstractC0505tB = defaultInstanceMap.get(cls);
        if (abstractC0505tB == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0505tB = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0505tB == null) {
            abstractC0505tB = ((AbstractC0505t) i0.i(cls)).b();
            if (abstractC0505tB == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0505tB);
        }
        return abstractC0505tB;
    }

    static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean A() {
        return B(this, true);
    }

    boolean C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void D() {
        U.a().d(this).b(this);
        E();
    }

    void E() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a c() {
        return (a) q(d.NEW_BUILDER);
    }

    AbstractC0505t I() {
        return (AbstractC0505t) q(d.NEW_MUTABLE_INSTANCE);
    }

    void M(int i3) {
        this.memoizedHashCode = i3;
    }

    void N(int i3) {
        if (i3 >= 0) {
            this.memoizedSerializedSize = (i3 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int a() {
        return g(null);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public void d(AbstractC0495i abstractC0495i) {
        U.a().d(this).i(this, C0496j.P(abstractC0495i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return U.a().d(this).d(this, (AbstractC0505t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0487a
    int g(Y y2) {
        if (!C()) {
            if (x() != Integer.MAX_VALUE) {
                return x();
            }
            int iO = o(y2);
            N(iO);
            return iO;
        }
        int iO2 = o(y2);
        if (iO2 >= 0) {
            return iO2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iO2);
    }

    public int hashCode() {
        if (C()) {
            return n();
        }
        if (y()) {
            M(n());
        }
        return w();
    }

    Object j() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    void l() {
        this.memoizedHashCode = 0;
    }

    void m() {
        N(a.e.API_PRIORITY_OTHER);
    }

    int n() {
        return U.a().d(this).g(this);
    }

    protected final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    protected Object q(d dVar) {
        return s(dVar, null, null);
    }

    protected Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    protected abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return L.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC0505t b() {
        return (AbstractC0505t) q(d.GET_DEFAULT_INSTANCE);
    }

    int w() {
        return this.memoizedHashCode;
    }

    int x() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    boolean y() {
        return w() == 0;
    }
}
