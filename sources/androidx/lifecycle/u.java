package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f4775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I1.g f4778d;

    static final class a extends kotlin.jvm.internal.n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f4779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D d3) {
            super(0);
            this.f4779a = d3;
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            return t.e(this.f4779a);
        }
    }

    public u(androidx.savedstate.a savedStateRegistry, D viewModelStoreOwner) {
        kotlin.jvm.internal.m.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.m.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f4775a = savedStateRegistry;
        this.f4778d = I1.i.a(new a(viewModelStoreOwner));
    }

    private final v c() {
        return (v) this.f4778d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4777c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((s) entry.getValue()).c().a();
            if (!kotlin.jvm.internal.m.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f4776b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        d();
        Bundle bundle = this.f4777c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f4777c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f4777c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f4777c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f4776b) {
            return;
        }
        Bundle bundleB = this.f4775a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4777c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f4777c = bundle;
        this.f4776b = true;
        c();
    }
}
