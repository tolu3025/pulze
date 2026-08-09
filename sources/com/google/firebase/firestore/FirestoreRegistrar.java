package com.google.firebase.firestore;

import I0.C0378t;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k0.C0992f;
import k0.C1001o;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;
import r0.C1200c;
import r0.InterfaceC1202e;

/* JADX INFO: loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ X lambda$getComponents$0(InterfaceC1202e interfaceC1202e) {
        return new X((Context) interfaceC1202e.a(Context.class), (C0992f) interfaceC1202e.a(C0992f.class), interfaceC1202e.h(InterfaceC1136b.class), interfaceC1202e.h(InterfaceC1059b.class), new C0378t(interfaceC1202e.e(O0.i.class), interfaceC1202e.e(K0.j.class), (C1001o) interfaceC1202e.a(C1001o.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return Arrays.asList(C1200c.c(X.class).g(LIBRARY_NAME).b(r0.r.j(C0992f.class)).b(r0.r.j(Context.class)).b(r0.r.i(K0.j.class)).b(r0.r.i(O0.i.class)).b(r0.r.a(InterfaceC1136b.class)).b(r0.r.a(InterfaceC1059b.class)).b(r0.r.h(C1001o.class)).e(new r0.h() { // from class: com.google.firebase.firestore.Y
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return FirestoreRegistrar.lambda$getComponents$0(interfaceC1202e);
            }
        }).d(), O0.h.b(LIBRARY_NAME, "26.2.0"));
    }
}
