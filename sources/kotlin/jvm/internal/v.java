package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends AbstractC1010d implements Z1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9747a;

    public v(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f9747a = (i3 & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC1010d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z1.i getReflected() {
        if (this.f9747a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (Z1.i) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC1010d
    public Z1.b compute() {
        return this.f9747a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return getOwner().equals(vVar.getOwner()) && getName().equals(vVar.getName()) && getSignature().equals(vVar.getSignature()) && m.a(getBoundReceiver(), vVar.getBoundReceiver());
        }
        if (obj instanceof Z1.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        Z1.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
