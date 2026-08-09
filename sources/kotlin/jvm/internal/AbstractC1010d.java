package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1010d implements Z1.b, Serializable {
    public static final Object NO_RECEIVER = a.f9736a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Z1.b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.d$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f9736a = new a();

        private a() {
        }
    }

    protected AbstractC1010d(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // Z1.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Z1.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Z1.b compute() {
        Z1.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        Z1.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract Z1.b computeReflected();

    @Override // Z1.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Z1.b
    public String getName() {
        return this.name;
    }

    public Z1.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? z.c(cls) : z.b(cls);
    }

    @Override // Z1.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected Z1.b getReflected() {
        Z1.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new T1.b();
    }

    @Override // Z1.b
    public Z1.j getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Z1.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Z1.b
    public Z1.k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Z1.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Z1.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Z1.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
