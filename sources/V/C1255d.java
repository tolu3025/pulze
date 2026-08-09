package v;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import v.AbstractC1252a;

/* JADX INFO: renamed from: v.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1255d extends AbstractC1252a {
    public C1255d(AbstractC1252a initialExtras) {
        m.e(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    @Override // v.AbstractC1252a
    public Object a(AbstractC1252a.b key) {
        m.e(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC1252a.b key, Object obj) {
        m.e(key, "key");
        b().put(key, obj);
    }

    public /* synthetic */ C1255d(AbstractC1252a abstractC1252a, int i3, h hVar) {
        this((i3 & 1) != 0 ? AbstractC1252a.C0174a.f11493b : abstractC1252a);
    }
}
