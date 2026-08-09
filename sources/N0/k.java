package n0;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o0.InterfaceC1040a;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f9947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1040a f9948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f9949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f9950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f9951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f9952f;

    class a implements ComponentCallbacks2C0603c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f9953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1040a f9954b;

        a(h hVar, InterfaceC1040a interfaceC1040a) {
            this.f9953a = hVar;
            this.f9954b = interfaceC1040a;
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c.a
        public void a(boolean z2) {
            k.this.f9949c = z2;
            if (z2) {
                this.f9953a.c();
            } else if (k.this.e()) {
                this.f9953a.g(k.this.f9951e - this.f9954b.a());
            }
        }
    }

    k(Context context, e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this((Context) AbstractC0643s.k(context), new h((e) AbstractC0643s.k(eVar), executor, scheduledExecutorService), new InterfaceC1040a.C0153a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return this.f9952f && !this.f9949c && this.f9950d > 0 && this.f9951e != -1;
    }

    public void d(int i3) {
        if (this.f9950d == 0 && i3 > 0) {
            this.f9950d = i3;
            if (e()) {
                this.f9947a.g(this.f9951e - this.f9948b.a());
            }
        } else if (this.f9950d > 0 && i3 == 0) {
            this.f9947a.c();
        }
        this.f9950d = i3;
    }

    k(Context context, h hVar, InterfaceC1040a interfaceC1040a) {
        this.f9947a = hVar;
        this.f9948b = interfaceC1040a;
        this.f9951e = -1L;
        ComponentCallbacks2C0603c.c((Application) context.getApplicationContext());
        ComponentCallbacks2C0603c.b().a(new a(hVar, interfaceC1040a));
    }
}
