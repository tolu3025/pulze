package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends Fragment implements InterfaceC0611k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f5456b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f5457a = new u0();

    public static s0 a(Activity activity) {
        s0 s0Var;
        WeakHashMap weakHashMap = f5456b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (s0Var = (s0) weakReference.get()) != null) {
            return s0Var;
        }
        try {
            s0 s0Var2 = (s0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (s0Var2 == null || s0Var2.isRemoving()) {
                s0Var2 = new s0();
                activity.getFragmentManager().beginTransaction().add(s0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(s0Var2));
            return s0Var2;
        } catch (ClassCastException e3) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final void b(String str, AbstractC0610j abstractC0610j) {
        this.f5457a.b(str, abstractC0610j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final AbstractC0610j c(String str, Class cls) {
        return this.f5457a.a(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f5457a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        this.f5457a.f(i3, i4, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5457a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5457a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f5457a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f5457a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5457a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f5457a.h();
    }
}
