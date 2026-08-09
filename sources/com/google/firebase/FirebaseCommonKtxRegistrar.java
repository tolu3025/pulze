package com.google.firebase;

import J1.AbstractC0412p;
import c2.AbstractC0586s0;
import c2.K;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import l0.InterfaceC1013a;
import l0.InterfaceC1014b;
import r0.C1200c;
import r0.F;
import r0.InterfaceC1202e;
import r0.h;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5901a = new a();

        @Override // r0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC1202e interfaceC1202e) {
            Object objG = interfaceC1202e.g(F.a(InterfaceC1013a.class, Executor.class));
            m.d(objG, "get(...)");
            return AbstractC0586s0.b((Executor) objG);
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5902a = new b();

        @Override // r0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC1202e interfaceC1202e) {
            Object objG = interfaceC1202e.g(F.a(l0.c.class, Executor.class));
            m.d(objG, "get(...)");
            return AbstractC0586s0.b((Executor) objG);
        }
    }

    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5903a = new c();

        @Override // r0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC1202e interfaceC1202e) {
            Object objG = interfaceC1202e.g(F.a(InterfaceC1014b.class, Executor.class));
            m.d(objG, "get(...)");
            return AbstractC0586s0.b((Executor) objG);
        }
    }

    public static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5904a = new d();

        @Override // r0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC1202e interfaceC1202e) {
            Object objG = interfaceC1202e.g(F.a(l0.d.class, Executor.class));
            m.d(objG, "get(...)");
            return AbstractC0586s0.b((Executor) objG);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        C1200c c1200cD = C1200c.e(F.a(InterfaceC1013a.class, K.class)).b(r.k(F.a(InterfaceC1013a.class, Executor.class))).e(a.f5901a).d();
        m.d(c1200cD, "build(...)");
        C1200c c1200cD2 = C1200c.e(F.a(l0.c.class, K.class)).b(r.k(F.a(l0.c.class, Executor.class))).e(b.f5902a).d();
        m.d(c1200cD2, "build(...)");
        C1200c c1200cD3 = C1200c.e(F.a(InterfaceC1014b.class, K.class)).b(r.k(F.a(InterfaceC1014b.class, Executor.class))).e(c.f5903a).d();
        m.d(c1200cD3, "build(...)");
        C1200c c1200cD4 = C1200c.e(F.a(l0.d.class, K.class)).b(r.k(F.a(l0.d.class, Executor.class))).e(d.f5904a).d();
        m.d(c1200cD4, "build(...)");
        return AbstractC0412p.j(c1200cD, c1200cD2, c1200cD3, c1200cD4);
    }
}
