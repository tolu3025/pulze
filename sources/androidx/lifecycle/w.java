package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import v.AbstractC1252a;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public final class w extends z.d implements z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f4781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.b f4782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f4783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC0516e f4784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.savedstate.a f4785e;

    public w(Application application, InterfaceC1277d owner, Bundle bundle) {
        kotlin.jvm.internal.m.e(owner, "owner");
        this.f4785e = owner.k();
        this.f4784d = owner.a();
        this.f4783c = bundle;
        this.f4781a = application;
        this.f4782b = application != null ? z.a.f4794e.a(application) : new z.a();
    }

    @Override // androidx.lifecycle.z.b
    public y a(Class modelClass) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.b
    public y b(Class modelClass, AbstractC1252a extras) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        kotlin.jvm.internal.m.e(extras, "extras");
        String str = (String) extras.a(z.c.f4801c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(t.f4771a) == null || extras.a(t.f4772b) == null) {
            if (this.f4784d != null) {
                return d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(z.a.f4796g);
        boolean zIsAssignableFrom = AbstractC0512a.class.isAssignableFrom(modelClass);
        Constructor constructorC = x.c(modelClass, (!zIsAssignableFrom || application == null) ? x.f4787b : x.f4786a);
        return constructorC == null ? this.f4782b.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? x.d(modelClass, constructorC, t.a(extras)) : x.d(modelClass, constructorC, application, t.a(extras));
    }

    @Override // androidx.lifecycle.z.d
    public void c(y viewModel) {
        kotlin.jvm.internal.m.e(viewModel, "viewModel");
        if (this.f4784d != null) {
            androidx.savedstate.a aVar = this.f4785e;
            kotlin.jvm.internal.m.b(aVar);
            AbstractC0516e abstractC0516e = this.f4784d;
            kotlin.jvm.internal.m.b(abstractC0516e);
            LegacySavedStateHandleController.a(viewModel, aVar, abstractC0516e);
        }
    }

    public final y d(String key, Class modelClass) {
        y yVarD;
        Application application;
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        AbstractC0516e abstractC0516e = this.f4784d;
        if (abstractC0516e == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0512a.class.isAssignableFrom(modelClass);
        Constructor constructorC = x.c(modelClass, (!zIsAssignableFrom || this.f4781a == null) ? x.f4787b : x.f4786a);
        if (constructorC == null) {
            return this.f4781a != null ? this.f4782b.a(modelClass) : z.c.f4799a.a().a(modelClass);
        }
        androidx.savedstate.a aVar = this.f4785e;
        kotlin.jvm.internal.m.b(aVar);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(aVar, abstractC0516e, key, this.f4783c);
        if (!zIsAssignableFrom || (application = this.f4781a) == null) {
            yVarD = x.d(modelClass, constructorC, savedStateHandleControllerB.i());
        } else {
            kotlin.jvm.internal.m.b(application);
            yVarD = x.d(modelClass, constructorC, application, savedStateHandleControllerB.i());
        }
        yVarD.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return yVarD;
    }
}
