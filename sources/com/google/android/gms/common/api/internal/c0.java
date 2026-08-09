package com.google.android.gms.common.api.internal;

import android.os.Looper;
import c.AbstractC0527b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.google.android.gms.common.api.m implements com.google.android.gms.common.api.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f5407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f5408f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c0 f5403a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.api.g f5404b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5405c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Status f5406d = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5409g = false;

    public c0(WeakReference weakReference) {
        AbstractC0643s.l(weakReference, "GoogleApiClient reference must not be null");
        this.f5407e = weakReference;
        com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) weakReference.get();
        this.f5408f = new b0(this, fVar != null ? fVar.f() : Looper.getMainLooper());
    }

    private final void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void d(Status status) {
        synchronized (this.f5405c) {
            this.f5406d = status;
            i(status);
        }
    }

    private final void i(Status status) {
        synchronized (this.f5405c) {
            try {
                if (j()) {
                    AbstractC0527b.a(AbstractC0643s.k(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean j() {
        return false;
    }

    private static final void k(com.google.android.gms.common.api.j jVar) {
    }

    @Override // com.google.android.gms.common.api.k
    public final void a(com.google.android.gms.common.api.j jVar) {
        synchronized (this.f5405c) {
            try {
                if (!jVar.getStatus().x()) {
                    d(jVar.getStatus());
                    k(jVar);
                } else if (j()) {
                    AbstractC0527b.a(AbstractC0643s.k(null));
                    throw null;
                }
            } finally {
            }
        }
    }

    public final com.google.android.gms.common.api.m b(com.google.android.gms.common.api.l lVar) {
        c0 c0Var;
        synchronized (this.f5405c) {
            AbstractC0643s.n(true, "Cannot call then() twice.");
            AbstractC0643s.n(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            c0Var = new c0(this.f5407e);
            this.f5403a = c0Var;
            g();
        }
        return c0Var;
    }

    public final void c(com.google.android.gms.common.api.g gVar) {
        synchronized (this.f5405c) {
            this.f5404b = gVar;
            g();
        }
    }

    final /* synthetic */ c0 e() {
        return this.f5403a;
    }

    final /* synthetic */ Object f() {
        return this.f5405c;
    }
}
