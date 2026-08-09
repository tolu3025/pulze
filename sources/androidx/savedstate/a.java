package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import f.C0840b;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f4885g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Recreator.b f4890e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0840b f4886a = new C0840b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4891f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0100a {
        void a(InterfaceC1277d interfaceC1277d);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, i iVar, AbstractC0516e.a event) {
        boolean z2;
        m.e(this$0, "this$0");
        m.e(iVar, "<anonymous parameter 0>");
        m.e(event, "event");
        if (event == AbstractC0516e.a.ON_START) {
            z2 = true;
        } else if (event != AbstractC0516e.a.ON_STOP) {
            return;
        } else {
            z2 = false;
        }
        this$0.f4891f = z2;
    }

    public final Bundle b(String key) {
        m.e(key, "key");
        if (!this.f4889d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f4888c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f4888c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f4888c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f4888c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        m.e(key, "key");
        for (Map.Entry components : this.f4886a) {
            m.d(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (m.a(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC0516e lifecycle) {
        m.e(lifecycle, "lifecycle");
        if (!(!this.f4887b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new g() { // from class: y.b
            @Override // androidx.lifecycle.g
            public final void d(i iVar, AbstractC0516e.a aVar) {
                androidx.savedstate.a.d(this.f11730a, iVar, aVar);
            }
        });
        this.f4887b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f4887b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f4889d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f4888c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f4889d = true;
    }

    public final void g(Bundle outBundle) {
        m.e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4888c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C0840b.d dVarD = this.f4886a.d();
        m.d(dVarD, "this.components.iteratorWithAdditions()");
        while (dVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        m.e(key, "key");
        m.e(provider, "provider");
        if (((c) this.f4886a.m(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class clazz) {
        m.e(clazz, "clazz");
        if (!this.f4891f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f4890e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f4890e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f4890e;
            if (bVar2 != null) {
                String name = clazz.getName();
                m.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
