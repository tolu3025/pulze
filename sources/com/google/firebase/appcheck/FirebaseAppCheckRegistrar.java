package com.google.firebase.appcheck;

import K0.i;
import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;
import l0.InterfaceC1013a;
import l0.InterfaceC1014b;
import l0.d;
import m0.c;
import n0.e;
import p0.InterfaceC1059b;
import r0.C1200c;
import r0.F;
import r0.InterfaceC1202e;
import r0.h;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c b(F f3, F f4, F f5, F f6, InterfaceC1202e interfaceC1202e) {
        return new e((C0992f) interfaceC1202e.a(C0992f.class), interfaceC1202e.e(i.class), (Executor) interfaceC1202e.g(f3), (Executor) interfaceC1202e.g(f4), (Executor) interfaceC1202e.g(f5), (ScheduledExecutorService) interfaceC1202e.g(f6));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final F fA = F.a(d.class, Executor.class);
        final F fA2 = F.a(l0.c.class, Executor.class);
        final F fA3 = F.a(InterfaceC1013a.class, Executor.class);
        final F fA4 = F.a(InterfaceC1014b.class, ScheduledExecutorService.class);
        return Arrays.asList(C1200c.d(c.class, InterfaceC1059b.class).g("fire-app-check").b(r.j(C0992f.class)).b(r.k(fA)).b(r.k(fA2)).b(r.k(fA3)).b(r.k(fA4)).b(r.i(i.class)).e(new h() { // from class: m0.d
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return FirebaseAppCheckRegistrar.b(fA, fA2, fA3, fA4, interfaceC1202e);
            }
        }).c().d(), K0.h.a(), O0.h.b("fire-app-check", "19.0.2"));
    }
}
