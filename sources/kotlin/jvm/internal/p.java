package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends v implements Z1.f {
    public p(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, i3);
    }

    @Override // kotlin.jvm.internal.AbstractC1010d
    protected Z1.b computeReflected() {
        return z.d(this);
    }

    @Override // U1.a
    public Object invoke() {
        return get();
    }
}
