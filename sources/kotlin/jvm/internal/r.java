package kotlin.jvm.internal;

import Z1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends v implements Z1.g {
    public r(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, i3);
    }

    @Override // Z1.g
    public g.a a() {
        ((Z1.g) getReflected()).a();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC1010d
    protected Z1.b computeReflected() {
        return z.e(this);
    }

    @Override // U1.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
