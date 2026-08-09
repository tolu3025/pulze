package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends d implements kotlin.jvm.internal.i {
    private final int arity;

    public l(int i3, M1.d dVar) {
        super(dVar);
        this.arity = i3;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strG = z.g(this);
        m.d(strG, "renderLambdaToString(...)");
        return strG;
    }
}
