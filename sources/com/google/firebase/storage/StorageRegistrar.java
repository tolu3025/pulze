package com.google.firebase.storage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k0.C0992f;
import l0.InterfaceC1014b;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;
import r0.C1200c;
import r0.InterfaceC1202e;

/* JADX INFO: loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    r0.F blockingExecutor = r0.F.a(InterfaceC1014b.class, Executor.class);
    r0.F uiExecutor = r0.F.a(l0.d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0772g lambda$getComponents$0(InterfaceC1202e interfaceC1202e) {
        return new C0772g((C0992f) interfaceC1202e.a(C0992f.class), interfaceC1202e.e(InterfaceC1136b.class), interfaceC1202e.e(InterfaceC1059b.class), (Executor) interfaceC1202e.g(this.blockingExecutor), (Executor) interfaceC1202e.g(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return Arrays.asList(C1200c.c(C0772g.class).g(LIBRARY_NAME).b(r0.r.j(C0992f.class)).b(r0.r.k(this.blockingExecutor)).b(r0.r.k(this.uiExecutor)).b(r0.r.i(InterfaceC1136b.class)).b(r0.r.i(InterfaceC1059b.class)).e(new r0.h() { // from class: com.google.firebase.storage.q
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return this.f6616a.lambda$getComponents$0(interfaceC1202e);
            }
        }).d(), O0.h.b(LIBRARY_NAME, "22.0.1"));
    }
}
