package androidx.window.layout;

import android.app.Activity;
import j.InterfaceC0980a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, InterfaceC0980a interfaceC0980a);

    void unregisterLayoutChangeCallback(InterfaceC0980a interfaceC0980a);
}
