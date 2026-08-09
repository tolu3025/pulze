package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.Map;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends c0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0947i f8615d;

    public I0(boolean z2, int i3, int i4, C0947i c0947i) {
        this.f8612a = z2;
        this.f8613b = i3;
        this.f8614c = i4;
        this.f8615d = (C0947i) AbstractC0829j.o(c0947i, "autoLoadBalancerFactory");
    }

    @Override // y1.c0.f
    public c0.b a(Map map) {
        Object objC;
        try {
            c0.b bVarF = this.f8615d.f(map);
            if (bVarF == null) {
                objC = null;
            } else {
                if (bVarF.d() != null) {
                    return c0.b.b(bVarF.d());
                }
                objC = bVarF.c();
            }
            return c0.b.a(C0952k0.b(map, this.f8612a, this.f8613b, this.f8614c, objC));
        } catch (RuntimeException e3) {
            return c0.b.b(y1.l0.f11962g.q("failed to parse service config").p(e3));
        }
    }
}
