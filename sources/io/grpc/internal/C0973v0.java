package io.grpc.internal;

import e0.AbstractC0832m;
import io.grpc.internal.C0971u0;
import java.util.Map;
import y1.S;
import y1.c0;

/* JADX INFO: renamed from: io.grpc.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973v0 extends y1.T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f9357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9358c = 0;

    static {
        f9357b = !AbstractC0832m.a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // y1.S.c
    public y1.S a(S.e eVar) {
        return f9357b ? new C0967s0(eVar) : new C0971u0(eVar);
    }

    @Override // y1.T
    public String b() {
        return "pick_first";
    }

    @Override // y1.T
    public int c() {
        return 5;
    }

    @Override // y1.T
    public boolean d() {
        return true;
    }

    @Override // y1.T
    public c0.b e(Map map) {
        try {
            return c0.b.a(new C0971u0.c(AbstractC0936c0.d(map, "shuffleAddressList")));
        } catch (RuntimeException e3) {
            return c0.b.b(y1.l0.f11975t.p(e3).q("Failed parsing configuration for " + b()));
        }
    }
}
