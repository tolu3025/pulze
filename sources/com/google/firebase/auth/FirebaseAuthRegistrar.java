package com.google.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;
import l0.InterfaceC1013a;
import l0.InterfaceC1014b;
import p0.InterfaceC1059b;
import q0.C1146g;
import q0.InterfaceC1136b;
import r0.C1200c;
import r0.InterfaceC1202e;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(r0.F f3, r0.F f4, r0.F f5, r0.F f6, r0.F f7, InterfaceC1202e interfaceC1202e) {
        return new C1146g((C0992f) interfaceC1202e.a(C0992f.class), interfaceC1202e.e(InterfaceC1059b.class), interfaceC1202e.e(K0.i.class), (Executor) interfaceC1202e.g(f3), (Executor) interfaceC1202e.g(f4), (Executor) interfaceC1202e.g(f5), (ScheduledExecutorService) interfaceC1202e.g(f6), (Executor) interfaceC1202e.g(f7));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        final r0.F fA = r0.F.a(InterfaceC1013a.class, Executor.class);
        final r0.F fA2 = r0.F.a(InterfaceC1014b.class, Executor.class);
        final r0.F fA3 = r0.F.a(l0.c.class, Executor.class);
        final r0.F fA4 = r0.F.a(l0.c.class, ScheduledExecutorService.class);
        final r0.F fA5 = r0.F.a(l0.d.class, Executor.class);
        return Arrays.asList(C1200c.d(FirebaseAuth.class, InterfaceC1136b.class).b(r0.r.j(C0992f.class)).b(r0.r.l(K0.i.class)).b(r0.r.k(fA)).b(r0.r.k(fA2)).b(r0.r.k(fA3)).b(r0.r.k(fA4)).b(r0.r.k(fA5)).b(r0.r.i(InterfaceC1059b.class)).e(new r0.h() { // from class: com.google.firebase.auth.l0
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(fA, fA2, fA3, fA4, fA5, interfaceC1202e);
            }
        }).d(), K0.h.a(), O0.h.b("fire-auth", "24.0.1"));
    }
}
