package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import j.InterfaceC0980a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f7621a;

    public Q(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f7621a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, InterfaceC0980a interfaceC0980a) {
        this.f7621a.addWindowLayoutInfoListener(activity, executor, interfaceC0980a);
    }

    public void b(InterfaceC0980a interfaceC0980a) {
        this.f7621a.removeWindowLayoutInfoListener(interfaceC0980a);
    }
}
