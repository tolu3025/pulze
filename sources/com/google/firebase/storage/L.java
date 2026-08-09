package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.storage.E;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f6498a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f6499b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E f6500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f6502e;

    interface a {
        void a(Object obj, Object obj2);
    }

    public L(E e3, int i3, a aVar) {
        this.f6500c = e3;
        this.f6501d = i3;
        this.f6502e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Object obj, E.a aVar) {
        this.f6502e.a(obj, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj, E.a aVar) {
        this.f6502e.a(obj, aVar);
    }

    public void d(Activity activity, Executor executor, final Object obj) {
        boolean z2;
        P0.g gVar;
        AbstractC0643s.k(obj);
        synchronized (this.f6500c.J()) {
            try {
                z2 = (this.f6500c.B() & this.f6501d) != 0;
                this.f6498a.add(obj);
                gVar = new P0.g(executor);
                this.f6499b.put(obj, gVar);
                if (activity != null) {
                    AbstractC0643s.b(!activity.isDestroyed(), "Activity is already destroyed!");
                    P0.a.a().c(activity, obj, new Runnable() { // from class: com.google.firebase.storage.J
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6493a.e(obj);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            final E.a aVarG0 = this.f6500c.g0();
            gVar.a(new Runnable() { // from class: com.google.firebase.storage.K
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6495a.f(obj, aVarG0);
                }
            });
        }
    }

    public void h() {
        if ((this.f6500c.B() & this.f6501d) != 0) {
            final E.a aVarG0 = this.f6500c.g0();
            for (final Object obj : this.f6498a) {
                P0.g gVar = (P0.g) this.f6499b.get(obj);
                if (gVar != null) {
                    gVar.a(new Runnable() { // from class: com.google.firebase.storage.I
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6490a.g(obj, aVarG0);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(Object obj) {
        AbstractC0643s.k(obj);
        synchronized (this.f6500c.J()) {
            this.f6499b.remove(obj);
            this.f6498a.remove(obj);
            P0.a.a().b(obj);
        }
    }
}
