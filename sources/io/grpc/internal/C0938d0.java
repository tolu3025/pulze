package io.grpc.internal;

import e0.AbstractC0829j;
import e0.C0831l;
import io.grpc.internal.InterfaceC0968t;
import j0.AbstractC0983b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.grpc.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0938d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f8858l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f8859m = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f8860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0831l f8861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f8862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f8864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScheduledFuture f8865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f8866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f8867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f8868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f8869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f8870k;

    /* JADX INFO: renamed from: io.grpc.internal.d0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            synchronized (C0938d0.this) {
                try {
                    e eVar = C0938d0.this.f8864e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        C0938d0.this.f8864e = eVar2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                C0938d0.this.f8862c.a();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            synchronized (C0938d0.this) {
                try {
                    C0938d0.this.f8866g = null;
                    e eVar = C0938d0.this.f8864e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        C0938d0.this.f8864e = e.PING_SENT;
                        C0938d0 c0938d0 = C0938d0.this;
                        c0938d0.f8865f = c0938d0.f8860a.schedule(C0938d0.this.f8867h, C0938d0.this.f8870k, TimeUnit.NANOSECONDS);
                        z2 = true;
                    } else {
                        if (C0938d0.this.f8864e == e.PING_DELAYED) {
                            C0938d0 c0938d02 = C0938d0.this;
                            ScheduledExecutorService scheduledExecutorService = c0938d02.f8860a;
                            Runnable runnable = C0938d0.this.f8868i;
                            long j3 = C0938d0.this.f8869j;
                            C0831l c0831l = C0938d0.this.f8861b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c0938d02.f8866g = scheduledExecutorService.schedule(runnable, j3 - c0831l.d(timeUnit), timeUnit);
                            C0938d0.this.f8864e = eVar2;
                        }
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                C0938d0.this.f8862c.b();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$c */
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0974w f8873a;

        /* JADX INFO: renamed from: io.grpc.internal.d0$c$a */
        class a implements InterfaceC0968t.a {
            a() {
            }

            @Override // io.grpc.internal.InterfaceC0968t.a
            public void a(Throwable th) {
                c.this.f8873a.i(y1.l0.f11975t.q("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.InterfaceC0968t.a
            public void b(long j3) {
            }
        }

        public c(InterfaceC0974w interfaceC0974w) {
            this.f8873a = interfaceC0974w;
        }

        @Override // io.grpc.internal.C0938d0.d
        public void a() {
            this.f8873a.i(y1.l0.f11975t.q("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.C0938d0.d
        public void b() {
            this.f8873a.h(new a(), AbstractC0983b.a());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$d */
    public interface d {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$e */
    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C0938d0(d dVar, ScheduledExecutorService scheduledExecutorService, long j3, long j4, boolean z2) {
        this(dVar, scheduledExecutorService, C0831l.c(), j3, j4, z2);
    }

    public static long l(long j3) {
        return Math.max(j3, f8858l);
    }

    public synchronized void m() {
        try {
            this.f8861b.f().g();
            e eVar = this.f8864e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f8864e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f8865f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f8864e == e.IDLE_AND_PING_SENT) {
                    this.f8864e = e.IDLE;
                } else {
                    this.f8864e = eVar2;
                    AbstractC0829j.u(this.f8866g == null, "There should be no outstanding pingFuture");
                    this.f8866g = this.f8860a.schedule(this.f8868i, this.f8869j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n() {
        try {
            e eVar = this.f8864e;
            if (eVar == e.IDLE) {
                this.f8864e = e.PING_SCHEDULED;
                if (this.f8866g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f8860a;
                    Runnable runnable = this.f8868i;
                    long j3 = this.f8869j;
                    C0831l c0831l = this.f8861b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f8866g = scheduledExecutorService.schedule(runnable, j3 - c0831l.d(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f8864e = e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void o() {
        try {
            if (this.f8863d) {
                return;
            }
            e eVar = this.f8864e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.f8864e = e.IDLE;
            }
            if (this.f8864e == e.PING_SENT) {
                this.f8864e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void p() {
        if (this.f8863d) {
            n();
        }
    }

    public synchronized void q() {
        try {
            e eVar = this.f8864e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f8864e = eVar2;
                ScheduledFuture scheduledFuture = this.f8865f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f8866g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f8866g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    C0938d0(d dVar, ScheduledExecutorService scheduledExecutorService, C0831l c0831l, long j3, long j4, boolean z2) {
        this.f8864e = e.IDLE;
        this.f8867h = new RunnableC0940e0(new a());
        this.f8868i = new RunnableC0940e0(new b());
        this.f8862c = (d) AbstractC0829j.o(dVar, "keepAlivePinger");
        this.f8860a = (ScheduledExecutorService) AbstractC0829j.o(scheduledExecutorService, "scheduler");
        this.f8861b = (C0831l) AbstractC0829j.o(c0831l, "stopwatch");
        this.f8869j = j3;
        this.f8870k = j4;
        this.f8863d = z2;
        c0831l.f().g();
    }
}
