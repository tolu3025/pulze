package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements i, Serializable {
    private final int arity;

    public n(int i3) {
        this.arity = i3;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strH = z.h(this);
        m.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
