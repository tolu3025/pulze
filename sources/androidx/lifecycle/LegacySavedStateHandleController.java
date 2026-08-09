package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.a;
import java.util.Iterator;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f4702a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0100a {
        @Override // androidx.savedstate.a.InterfaceC0100a
        public void a(InterfaceC1277d owner) {
            kotlin.jvm.internal.m.e(owner, "owner");
            if (!(owner instanceof D)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            C cE = ((D) owner).e();
            androidx.savedstate.a aVarK = owner.k();
            Iterator it = cE.c().iterator();
            while (it.hasNext()) {
                y yVarB = cE.b((String) it.next());
                kotlin.jvm.internal.m.b(yVarB);
                LegacySavedStateHandleController.a(yVarB, aVarK, owner.a());
            }
            if (!cE.c().isEmpty()) {
                aVarK.i(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(y viewModel, androidx.savedstate.a registry, AbstractC0516e lifecycle) {
        kotlin.jvm.internal.m.e(viewModel, "viewModel");
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.e(registry, lifecycle);
        f4702a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, AbstractC0516e lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
        kotlin.jvm.internal.m.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, s.f4764f.a(registry.b(str), bundle));
        savedStateHandleController.e(registry, lifecycle);
        f4702a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final AbstractC0516e abstractC0516e) {
        AbstractC0516e.b bVarB = abstractC0516e.b();
        if (bVarB == AbstractC0516e.b.INITIALIZED || bVarB.e(AbstractC0516e.b.STARTED)) {
            aVar.i(a.class);
        } else {
            abstractC0516e.a(new g() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.g
                public void d(i source, AbstractC0516e.a event) {
                    kotlin.jvm.internal.m.e(source, "source");
                    kotlin.jvm.internal.m.e(event, "event");
                    if (event == AbstractC0516e.a.ON_START) {
                        abstractC0516e.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
