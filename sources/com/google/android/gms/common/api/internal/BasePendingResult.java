package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import c.AbstractC0527b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.InterfaceC0637l;
import com.google.android.gms.internal.base.zao;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.g {
    static final ThreadLocal zaa = new o0();
    public static final /* synthetic */ int zad = 0;
    private p0 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.k zah;
    private com.google.android.gms.common.api.j zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC0637l zao;
    private volatile c0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public static class a extends zao {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.j jVar) {
            int i3 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.k) AbstractC0643s.k(kVar), jVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i3 = message.what;
            if (i3 != 1) {
                if (i3 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5315n);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 34);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.first;
            com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e3) {
                BasePendingResult.zal(jVar);
                throw e3;
            }
        }
    }

    protected BasePendingResult(com.google.android.gms.common.api.f fVar) {
        this.zab = new a(fVar != null ? fVar.f() : Looper.getMainLooper());
        this.zac = new WeakReference(fVar);
    }

    private final com.google.android.gms.common.api.j a() {
        com.google.android.gms.common.api.j jVar;
        synchronized (this.zae) {
            AbstractC0643s.n(!this.zal, "Result has already been consumed.");
            AbstractC0643s.n(isReady(), "Result is not ready.");
            jVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        AbstractC0527b.a(this.zai.getAndSet(null));
        return (com.google.android.gms.common.api.j) AbstractC0643s.k(jVar);
    }

    private final void b(com.google.android.gms.common.api.j jVar) {
        this.zaj = jVar;
        this.zak = jVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.k kVar = this.zah;
            if (kVar != null) {
                a aVar = this.zab;
                aVar.removeMessages(2);
                aVar.a(kVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((g.a) arrayList.get(i3)).a(this.zak);
        }
        arrayList.clear();
    }

    public static void zal(com.google.android.gms.common.api.j jVar) {
    }

    @Override // com.google.android.gms.common.api.g
    public final void addStatusListener(g.a aVar) {
        AbstractC0643s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R await() {
        AbstractC0643s.j("await must not be called on the UI thread");
        AbstractC0643s.n(!this.zal, "Result has already been consumed");
        AbstractC0643s.n(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5313l);
        }
        AbstractC0643s.n(isReady(), "Result is not ready.");
        return (R) a();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f5316o));
                }
            } finally {
            }
        }
    }

    protected abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z2;
        synchronized (this.zae) {
            z2 = this.zam;
        }
        return z2;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    protected final void setCancelToken(InterfaceC0637l interfaceC0637l) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r2) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r2);
                    return;
                }
                isReady();
                AbstractC0643s.n(!isReady(), "Results have already been set");
                AbstractC0643s.n(!this.zal, "Result has already been consumed");
                b(r2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.k kVar) {
        synchronized (this.zae) {
            try {
                if (kVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                AbstractC0643s.n(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z2 = false;
                }
                AbstractC0643s.n(z2, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(kVar, a());
                } else {
                    this.zah = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.j> com.google.android.gms.common.api.m then(com.google.android.gms.common.api.l lVar) {
        com.google.android.gms.common.api.m mVarB;
        AbstractC0643s.n(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                AbstractC0643s.n(this.zap == null, "Cannot call then() twice.");
                AbstractC0643s.n(this.zah == null, "Cannot call then() if callbacks are set.");
                AbstractC0643s.n(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new c0(this.zac);
                mVarB = this.zap.b(lVar);
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVarB;
    }

    public final boolean zaj() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.f) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zak() {
        boolean z2 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z2 = false;
        }
        this.zaq = z2;
    }

    final /* synthetic */ com.google.android.gms.common.api.j zam() {
        return this.zaj;
    }

    public final void zan(d0 d0Var) {
        this.zai.set(d0Var);
    }

    @Override // com.google.android.gms.common.api.g
    public final R await(long j3, TimeUnit timeUnit) {
        if (j3 > 0) {
            AbstractC0643s.j("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC0643s.n(!this.zal, "Result has already been consumed.");
        AbstractC0643s.n(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j3, timeUnit)) {
                forceFailureUnlessReady(Status.f5315n);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5313l);
        }
        AbstractC0643s.n(isReady(), "Result is not ready.");
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.k kVar, long j3, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (kVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                AbstractC0643s.n(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z2 = false;
                }
                AbstractC0643s.n(z2, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(kVar, a());
                } else {
                    this.zah = kVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
