package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.AbstractC0780a;
import com.google.protobuf.AbstractC0788f;
import com.google.protobuf.C;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0806y extends AbstractC0780a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0806y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w0 unknownFields = w0.c();

    /* JADX INFO: renamed from: com.google.protobuf.y$a */
    public static abstract class a extends AbstractC0780a.AbstractC0116a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0806y f6987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected AbstractC0806y f6988b;

        protected a(AbstractC0806y abstractC0806y) {
            this.f6987a = abstractC0806y;
            if (abstractC0806y.I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f6988b = v();
        }

        private static void u(Object obj, Object obj2) {
            i0.a().d(obj).a(obj, obj2);
        }

        private AbstractC0806y v() {
            return this.f6987a.O();
        }

        @Override // com.google.protobuf.W
        public final boolean d() {
            return AbstractC0806y.H(this.f6988b, false);
        }

        public final AbstractC0806y n() {
            AbstractC0806y abstractC0806yF = f();
            if (abstractC0806yF.d()) {
                return abstractC0806yF;
            }
            throw AbstractC0780a.AbstractC0116a.m(abstractC0806yF);
        }

        @Override // com.google.protobuf.V.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC0806y f() {
            if (!this.f6988b.I()) {
                return this.f6988b;
            }
            this.f6988b.J();
            return this.f6988b;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarC = b().c();
            aVarC.f6988b = f();
            return aVarC;
        }

        protected final void q() {
            if (this.f6988b.I()) {
                return;
            }
            r();
        }

        protected void r() {
            AbstractC0806y abstractC0806yV = v();
            u(abstractC0806yV, this.f6988b);
            this.f6988b = abstractC0806yV;
        }

        @Override // com.google.protobuf.W
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractC0806y b() {
            return this.f6987a;
        }

        public a t(AbstractC0806y abstractC0806y) {
            if (b().equals(abstractC0806y)) {
                return this;
            }
            q();
            u(this.f6988b, abstractC0806y);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$b */
    protected static class b extends AbstractC0782b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0806y f6989b;

        public b(AbstractC0806y abstractC0806y) {
            this.f6989b = abstractC0806y;
        }

        @Override // com.google.protobuf.f0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC0806y b(AbstractC0792j abstractC0792j, C0799q c0799q) {
            return AbstractC0806y.T(this.f6989b, abstractC0792j, c0799q);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$c */
    public static class c extends AbstractC0797o {
    }

    /* JADX INFO: renamed from: com.google.protobuf.y$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static C.e A() {
        return j0.d();
    }

    static AbstractC0806y B(Class cls) {
        AbstractC0806y abstractC0806yB = defaultInstanceMap.get(cls);
        if (abstractC0806yB == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0806yB = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0806yB == null) {
            abstractC0806yB = ((AbstractC0806y) z0.l(cls)).b();
            if (abstractC0806yB == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0806yB);
        }
        return abstractC0806yB;
    }

    static Object G(Method method, Object obj, Object... objArr) {
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

    protected static final boolean H(AbstractC0806y abstractC0806y, boolean z2) {
        byte bByteValue = ((Byte) abstractC0806y.w(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = i0.a().d(abstractC0806y).c(abstractC0806y);
        if (z2) {
            abstractC0806y.x(d.SET_MEMOIZED_IS_INITIALIZED, zC ? abstractC0806y : null);
        }
        return zC;
    }

    protected static C.e L(C.e eVar) {
        int size = eVar.size();
        return eVar.e(size == 0 ? 10 : size * 2);
    }

    protected static Object N(V v2, String str, Object[] objArr) {
        return new k0(v2, str, objArr);
    }

    protected static AbstractC0806y P(AbstractC0806y abstractC0806y, AbstractC0791i abstractC0791i) {
        return p(Q(abstractC0806y, abstractC0791i, C0799q.b()));
    }

    protected static AbstractC0806y Q(AbstractC0806y abstractC0806y, AbstractC0791i abstractC0791i, C0799q c0799q) {
        return p(S(abstractC0806y, abstractC0791i, c0799q));
    }

    protected static AbstractC0806y R(AbstractC0806y abstractC0806y, byte[] bArr) {
        return p(U(abstractC0806y, bArr, 0, bArr.length, C0799q.b()));
    }

    private static AbstractC0806y S(AbstractC0806y abstractC0806y, AbstractC0791i abstractC0791i, C0799q c0799q) throws D {
        AbstractC0792j abstractC0792jZ = abstractC0791i.z();
        AbstractC0806y abstractC0806yT = T(abstractC0806y, abstractC0792jZ, c0799q);
        try {
            abstractC0792jZ.a(0);
            return abstractC0806yT;
        } catch (D e3) {
            throw e3.k(abstractC0806yT);
        }
    }

    static AbstractC0806y T(AbstractC0806y abstractC0806y, AbstractC0792j abstractC0792j, C0799q c0799q) throws D {
        AbstractC0806y abstractC0806yO = abstractC0806y.O();
        try {
            n0 n0VarD = i0.a().d(abstractC0806yO);
            n0VarD.i(abstractC0806yO, C0793k.O(abstractC0792j), c0799q);
            n0VarD.b(abstractC0806yO);
            return abstractC0806yO;
        } catch (D e3) {
            e = e3;
            if (e.a()) {
                e = new D(e);
            }
            throw e.k(abstractC0806yO);
        } catch (u0 e4) {
            throw e4.a().k(abstractC0806yO);
        } catch (IOException e5) {
            if (e5.getCause() instanceof D) {
                throw ((D) e5.getCause());
            }
            throw new D(e5).k(abstractC0806yO);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof D) {
                throw ((D) e6.getCause());
            }
            throw e6;
        }
    }

    private static AbstractC0806y U(AbstractC0806y abstractC0806y, byte[] bArr, int i3, int i4, C0799q c0799q) throws D {
        AbstractC0806y abstractC0806yO = abstractC0806y.O();
        try {
            n0 n0VarD = i0.a().d(abstractC0806yO);
            n0VarD.j(abstractC0806yO, bArr, i3, i3 + i4, new AbstractC0788f.a(c0799q));
            n0VarD.b(abstractC0806yO);
            return abstractC0806yO;
        } catch (D e3) {
            e = e3;
            if (e.a()) {
                e = new D(e);
            }
            throw e.k(abstractC0806yO);
        } catch (u0 e4) {
            throw e4.a().k(abstractC0806yO);
        } catch (IOException e5) {
            if (e5.getCause() instanceof D) {
                throw ((D) e5.getCause());
            }
            throw new D(e5).k(abstractC0806yO);
        } catch (IndexOutOfBoundsException unused) {
            throw D.m().k(abstractC0806yO);
        }
    }

    protected static void V(Class cls, AbstractC0806y abstractC0806y) {
        abstractC0806y.K();
        defaultInstanceMap.put(cls, abstractC0806y);
    }

    private static AbstractC0806y p(AbstractC0806y abstractC0806y) throws D {
        if (abstractC0806y == null || abstractC0806y.d()) {
            return abstractC0806y;
        }
        throw abstractC0806y.n().a().k(abstractC0806y);
    }

    private int t(n0 n0Var) {
        return n0Var == null ? i0.a().d(this).e(this) : n0Var.e(this);
    }

    protected static C.d z() {
        return B.m();
    }

    @Override // com.google.protobuf.W
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final AbstractC0806y b() {
        return (AbstractC0806y) w(d.GET_DEFAULT_INSTANCE);
    }

    int D() {
        return this.memoizedHashCode;
    }

    int E() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    boolean F() {
        return D() == 0;
    }

    boolean I() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void J() {
        i0.a().d(this).b(this);
        K();
    }

    void K() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.V
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a c() {
        return (a) w(d.NEW_BUILDER);
    }

    AbstractC0806y O() {
        return (AbstractC0806y) w(d.NEW_MUTABLE_INSTANCE);
    }

    void W(int i3) {
        this.memoizedHashCode = i3;
    }

    void X(int i3) {
        if (i3 >= 0) {
            this.memoizedSerializedSize = (i3 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i3);
        }
    }

    public final a Y() {
        return ((a) w(d.NEW_BUILDER)).t(this);
    }

    @Override // com.google.protobuf.V
    public int a() {
        return l(null);
    }

    @Override // com.google.protobuf.W
    public final boolean d() {
        return H(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return i0.a().d(this).d(this, (AbstractC0806y) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.V
    public void h(AbstractC0794l abstractC0794l) {
        i0.a().d(this).h(this, C0795m.P(abstractC0794l));
    }

    public int hashCode() {
        if (I()) {
            return s();
        }
        if (F()) {
            W(s());
        }
        return D();
    }

    @Override // com.google.protobuf.V
    public final f0 j() {
        return (f0) w(d.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC0780a
    int l(n0 n0Var) {
        if (!I()) {
            if (E() != Integer.MAX_VALUE) {
                return E();
            }
            int iT = t(n0Var);
            X(iT);
            return iT;
        }
        int iT2 = t(n0Var);
        if (iT2 >= 0) {
            return iT2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iT2);
    }

    Object o() {
        return w(d.BUILD_MESSAGE_INFO);
    }

    void q() {
        this.memoizedHashCode = 0;
    }

    void r() {
        X(a.e.API_PRIORITY_OTHER);
    }

    int s() {
        return i0.a().d(this).g(this);
    }

    public String toString() {
        return X.f(this, super.toString());
    }

    protected final a u() {
        return (a) w(d.NEW_BUILDER);
    }

    protected final a v(AbstractC0806y abstractC0806y) {
        return u().t(abstractC0806y);
    }

    protected Object w(d dVar) {
        return y(dVar, null, null);
    }

    protected Object x(d dVar, Object obj) {
        return y(dVar, obj, null);
    }

    protected abstract Object y(d dVar, Object obj, Object obj2);
}
