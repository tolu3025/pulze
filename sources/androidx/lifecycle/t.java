package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import v.AbstractC1252a;
import v.C1254c;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1252a.b f4771a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1252a.b f4772b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1252a.b f4773c = new a();

    public static final class a implements AbstractC1252a.b {
        a() {
        }
    }

    public static final class b implements AbstractC1252a.b {
        b() {
        }
    }

    public static final class c implements AbstractC1252a.b {
        c() {
        }
    }

    static final class d extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4774a = new d();

        d() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke(AbstractC1252a initializer) {
            kotlin.jvm.internal.m.e(initializer, "$this$initializer");
            return new v();
        }
    }

    public static final s a(AbstractC1252a abstractC1252a) {
        kotlin.jvm.internal.m.e(abstractC1252a, "<this>");
        InterfaceC1277d interfaceC1277d = (InterfaceC1277d) abstractC1252a.a(f4771a);
        if (interfaceC1277d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        D d3 = (D) abstractC1252a.a(f4772b);
        if (d3 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC1252a.a(f4773c);
        String str = (String) abstractC1252a.a(z.c.f4801c);
        if (str != null) {
            return b(interfaceC1277d, d3, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final s b(InterfaceC1277d interfaceC1277d, D d3, String str, Bundle bundle) {
        u uVarD = d(interfaceC1277d);
        v vVarE = e(d3);
        s sVar = (s) vVarE.f().get(str);
        if (sVar != null) {
            return sVar;
        }
        s sVarA = s.f4764f.a(uVarD.b(str), bundle);
        vVarE.f().put(str, sVarA);
        return sVarA;
    }

    public static final void c(InterfaceC1277d interfaceC1277d) {
        kotlin.jvm.internal.m.e(interfaceC1277d, "<this>");
        AbstractC0516e.b bVarB = interfaceC1277d.a().b();
        if (bVarB != AbstractC0516e.b.INITIALIZED && bVarB != AbstractC0516e.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC1277d.k().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            u uVar = new u(interfaceC1277d.k(), (D) interfaceC1277d);
            interfaceC1277d.k().h("androidx.lifecycle.internal.SavedStateHandlesProvider", uVar);
            interfaceC1277d.a().a(new SavedStateHandleAttacher(uVar));
        }
    }

    public static final u d(InterfaceC1277d interfaceC1277d) {
        kotlin.jvm.internal.m.e(interfaceC1277d, "<this>");
        a.c cVarC = interfaceC1277d.k().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        u uVar = cVarC instanceof u ? (u) cVarC : null;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final v e(D d3) {
        kotlin.jvm.internal.m.e(d3, "<this>");
        C1254c c1254c = new C1254c();
        c1254c.a(kotlin.jvm.internal.z.b(v.class), d.f4774a);
        return (v) new z(d3, c1254c.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", v.class);
    }
}
