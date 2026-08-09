package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.AbstractC0527b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0656f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f5877o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f5879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5880c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f5885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final N f5886i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f5890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f5891n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5881d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f5882e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f5883f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f5888k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.I
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0656f.k(this.f5864a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f5889l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f5887j = new WeakReference(null);

    public C0656f(Context context, G g3, String str, Intent intent, N n3, M m3) {
        this.f5878a = context;
        this.f5879b = g3;
        this.f5880c = str;
        this.f5885h = intent;
        this.f5886i = n3;
    }

    public static /* synthetic */ void k(C0656f c0656f) {
        c0656f.f5879b.d("reportBinderDeath", new Object[0]);
        AbstractC0527b.a(c0656f.f5887j.get());
        c0656f.f5879b.d("%s : Binder has died.", c0656f.f5880c);
        Iterator it = c0656f.f5881d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(c0656f.w());
        }
        c0656f.f5881d.clear();
        synchronized (c0656f.f5883f) {
            c0656f.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final C0656f c0656f, final TaskCompletionSource taskCompletionSource) {
        c0656f.f5882e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f5865a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(C0656f c0656f, H h3) {
        if (c0656f.f5891n != null || c0656f.f5884g) {
            if (!c0656f.f5884g) {
                h3.run();
                return;
            } else {
                c0656f.f5879b.d("Waiting to bind to the service.", new Object[0]);
                c0656f.f5881d.add(h3);
                return;
            }
        }
        c0656f.f5879b.d("Initiate binding to the service.", new Object[0]);
        c0656f.f5881d.add(h3);
        ServiceConnectionC0655e serviceConnectionC0655e = new ServiceConnectionC0655e(c0656f, null);
        c0656f.f5890m = serviceConnectionC0655e;
        c0656f.f5884g = true;
        if (c0656f.f5878a.bindService(c0656f.f5885h, serviceConnectionC0655e, 1)) {
            return;
        }
        c0656f.f5879b.d("Failed to bind to the service.", new Object[0]);
        c0656f.f5884g = false;
        Iterator it = c0656f.f5881d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(new C0657g());
        }
        c0656f.f5881d.clear();
    }

    static /* bridge */ /* synthetic */ void r(C0656f c0656f) {
        c0656f.f5879b.d("linkToDeath", new Object[0]);
        try {
            c0656f.f5891n.asBinder().linkToDeath(c0656f.f5888k, 0);
        } catch (RemoteException e3) {
            c0656f.f5879b.c(e3, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C0656f c0656f) {
        c0656f.f5879b.d("unlinkToDeath", new Object[0]);
        c0656f.f5891n.asBinder().unlinkToDeath(c0656f.f5888k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f5880c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f5882e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f5882e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f5877o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f5880c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f5880c, 10);
                    handlerThread.start();
                    map.put(this.f5880c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f5880c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f5891n;
    }

    public final void t(H h3, TaskCompletionSource taskCompletionSource) {
        c().post(new K(this, h3.c(), taskCompletionSource, h3));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f5883f) {
            this.f5882e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f5883f) {
            this.f5882e.remove(taskCompletionSource);
        }
        c().post(new L(this));
    }
}
