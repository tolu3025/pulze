package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ScheduledFuture f6165m;

    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.s(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.r(obj);
        }
    }

    interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f6165m = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void e() {
        this.f6165m.cancel(u());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f6165m.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f6165m.compareTo(delayed);
    }
}
