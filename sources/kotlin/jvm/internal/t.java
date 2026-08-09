package kotlin.jvm.internal;

import Z1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends v implements Z1.h {
    public t(Class cls, String str, String str2, int i3) {
        super(AbstractC1010d.NO_RECEIVER, cls, str, str2, i3);
    }

    @Override // Z1.h
    public h.a a() {
        ((Z1.h) getReflected()).a();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC1010d
    protected Z1.b computeReflected() {
        return z.f(this);
    }

    @Override // U1.p
    public Object invoke(Object obj, Object obj2) {
        return f(obj, obj2);
    }
}
