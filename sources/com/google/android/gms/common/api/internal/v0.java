package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends Fragment implements InterfaceC0611k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final WeakHashMap f5471e0 = new WeakHashMap();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final u0 f5472d0 = new u0();

    public static v0 p1(androidx.fragment.app.d dVar) {
        v0 v0Var;
        androidx.fragment.app.i iVarI = dVar.I();
        WeakHashMap weakHashMap = f5471e0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(dVar);
        if (weakReference == null || (v0Var = (v0) weakReference.get()) == null) {
            try {
                v0Var = (v0) iVarI.d("SLifecycleFragmentImpl");
                if (v0Var == null || v0Var.S()) {
                    v0Var = new v0();
                    iVarI.a().b(v0Var, "SLifecycleFragmentImpl").e();
                }
                weakHashMap.put(dVar, new WeakReference(v0Var));
            } catch (ClassCastException e3) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e3);
            }
        }
        return v0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(int i3, int i4, Intent intent) {
        super.W(i3, i4, intent);
        this.f5472d0.f(i3, i4, intent);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final void b(String str, AbstractC0610j abstractC0610j) {
        this.f5472d0.b(str, abstractC0610j);
    }

    @Override // androidx.fragment.app.Fragment
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.f5472d0.c(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final AbstractC0610j c(String str, Class cls) {
        return this.f5472d0.a(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0611k
    public final Activity d() {
        return l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        this.f5472d0.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        this.f5472d0.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void w0() {
        super.w0();
        this.f5472d0.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        this.f5472d0.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0() {
        super.y0();
        this.f5472d0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void z0() {
        super.z0();
        this.f5472d0.h();
    }
}
