package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static N f7609c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LongSparseArray f7610a = new LongSparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue f7611b = new PriorityQueue();

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicLong f7612b = new AtomicLong(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f7613a;

        private a(long j3) {
            this.f7613a = j3;
        }

        public static a b() {
            return c(f7612b.incrementAndGet());
        }

        public static a c(long j3) {
            return new a(j3);
        }

        public long d() {
            return this.f7613a;
        }
    }

    private N() {
    }

    public static N a() {
        if (f7609c == null) {
            f7609c = new N();
        }
        return f7609c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f7611b.isEmpty() && ((Long) this.f7611b.peek()).longValue() < aVar.f7613a) {
            this.f7610a.remove(((Long) this.f7611b.poll()).longValue());
        }
        if (!this.f7611b.isEmpty() && ((Long) this.f7611b.peek()).longValue() == aVar.f7613a) {
            this.f7611b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f7610a.get(aVar.f7613a);
        this.f7610a.remove(aVar.f7613a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a aVarB = a.b();
        this.f7610a.put(aVarB.f7613a, MotionEvent.obtain(motionEvent));
        this.f7611b.add(Long.valueOf(aVarB.f7613a));
        return aVarB;
    }
}
