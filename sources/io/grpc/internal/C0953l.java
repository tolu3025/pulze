package io.grpc.internal;

import io.grpc.internal.InterfaceC0949j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.p0;

/* JADX INFO: renamed from: io.grpc.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0953l implements F0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f9154f = Logger.getLogger(C0953l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f9155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.p0 f9156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0949j.a f9157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0949j f9158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p0.d f9159e;

    C0953l(InterfaceC0949j.a aVar, ScheduledExecutorService scheduledExecutorService, y1.p0 p0Var) {
        this.f9157c = aVar;
        this.f9155a = scheduledExecutorService;
        this.f9156b = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        p0.d dVar = this.f9159e;
        if (dVar != null && dVar.b()) {
            this.f9159e.a();
        }
        this.f9158d = null;
    }

    @Override // io.grpc.internal.F0
    public void a(Runnable runnable) {
        this.f9156b.f();
        if (this.f9158d == null) {
            this.f9158d = this.f9157c.get();
        }
        p0.d dVar = this.f9159e;
        if (dVar == null || !dVar.b()) {
            long jA = this.f9158d.a();
            this.f9159e = this.f9156b.d(runnable, jA, TimeUnit.NANOSECONDS, this.f9155a);
            f9154f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }

    @Override // io.grpc.internal.F0
    public void reset() {
        this.f9156b.f();
        this.f9156b.execute(new Runnable() { // from class: io.grpc.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f9139a.c();
            }
        });
    }
}
