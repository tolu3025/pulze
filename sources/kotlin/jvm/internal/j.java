package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends AbstractC1010d implements i, Z1.e {
    private final int arity;
    private final int flags;

    public j(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.arity = i3;
        this.flags = i4 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC1010d
    protected Z1.b computeReflected() {
        return z.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && m.a(getBoundReceiver(), jVar.getBoundReceiver()) && m.a(getOwner(), jVar.getOwner());
        }
        if (obj instanceof Z1.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // Z1.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Z1.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Z1.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Z1.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // Z1.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Z1.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC1010d
    public Z1.e getReflected() {
        return (Z1.e) super.getReflected();
    }
}
