package androidx.window.java.layout;

import I1.u;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import c2.AbstractC0570k;
import c2.AbstractC0586s0;
import c2.InterfaceC0600z0;
import c2.O;
import f2.b;
import j.InterfaceC0980a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<InterfaceC0980a, InterfaceC0600z0> consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker tracker) {
        m.e(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, InterfaceC0980a interfaceC0980a, b bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(interfaceC0980a) == null) {
                this.consumerToJobMap.put(interfaceC0980a, AbstractC0570k.d(O.a(AbstractC0586s0.b(executor)), null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, interfaceC0980a, null), 3, null));
            }
            u uVar = u.f2419a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void removeListener(InterfaceC0980a interfaceC0980a) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            InterfaceC0600z0 interfaceC0600z0 = this.consumerToJobMap.get(interfaceC0980a);
            if (interfaceC0600z0 != null) {
                InterfaceC0600z0.a.b(interfaceC0600z0, null, 1, null);
            }
            this.consumerToJobMap.remove(interfaceC0980a);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, InterfaceC0980a consumer) {
        m.e(activity, "activity");
        m.e(executor, "executor");
        m.e(consumer, "consumer");
        addListener(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(InterfaceC0980a consumer) {
        m.e(consumer, "consumer");
        removeListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public b windowLayoutInfo(Activity activity) {
        m.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
