package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610j {
    protected final InterfaceC0611k mLifecycleFragment;

    protected AbstractC0610j(InterfaceC0611k interfaceC0611k) {
        this.mLifecycleFragment = interfaceC0611k;
    }

    public static InterfaceC0611k getFragment(Activity activity) {
        return getFragment(new C0609i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityD = this.mLifecycleFragment.d();
        AbstractC0643s.k(activityD);
        return activityD;
    }

    public void onActivityResult(int i3, int i4, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC0611k getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static InterfaceC0611k getFragment(C0609i c0609i) {
        if (c0609i.a()) {
            return v0.p1(c0609i.d());
        }
        if (c0609i.b()) {
            return s0.a(c0609i.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
