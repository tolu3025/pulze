package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j implements kotlin.jvm.internal.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9724a;

    public k(int i3, M1.d dVar) {
        super(dVar);
        this.f9724a = i3;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f9724a;
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
