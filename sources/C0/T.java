package C0;

import C0.T;
import J0.C0391g;
import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f891d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f893b;

    public class a implements P1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0391g f894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M f895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f896c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C0391g.b f897d;

        public a(C0391g c0391g, M m3) {
            this.f894a = c0391g;
            this.f895b = m3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f895b.z(T.this);
            this.f896c = true;
            d();
        }

        private void d() {
            this.f897d = this.f894a.k(C0391g.d.GARBAGE_COLLECTION, this.f896c ? T.f891d : T.f890c, new Runnable() { // from class: C0.S
                @Override // java.lang.Runnable
                public final void run() {
                    this.f888a.c();
                }
            });
        }

        @Override // C0.P1
        public void a() {
            C0391g.b bVar = this.f897d;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // C0.P1
        public void start() {
            if (T.this.f893b.f899a != -1) {
                d();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f901c;

        b(long j3, int i3, int i4) {
            this.f899a = j3;
            this.f900b = i3;
            this.f901c = i4;
        }

        public static b a(long j3) {
            return new b(j3, 10, 1000);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f905d;

        c(boolean z2, int i3, int i4, int i5) {
            this.f902a = z2;
            this.f903b = i3;
            this.f904c = i4;
            this.f905d = i5;
        }

        static c a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f906c = new Comparator() { // from class: C0.U
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return T.d.d((Long) obj, (Long) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PriorityQueue f907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f908b;

        d(int i3) {
            this.f908b = i3;
            this.f907a = new PriorityQueue(i3, f906c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int d(Long l3, Long l4) {
            return l4.compareTo(l3);
        }

        void b(Long l3) {
            if (this.f907a.size() >= this.f908b) {
                if (l3.longValue() >= ((Long) this.f907a.peek()).longValue()) {
                    return;
                } else {
                    this.f907a.poll();
                }
            }
            this.f907a.add(l3);
        }

        long c() {
            return ((Long) this.f907a.peek()).longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f890c = timeUnit.toMillis(1L);
        f891d = timeUnit.toMillis(5L);
    }

    T(O o2, b bVar) {
        this.f892a = o2;
        this.f893b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(d dVar, R1 r12) {
        dVar.b(Long.valueOf(r12.e()));
    }

    private c m(SparseArray sparseArray) {
        boolean z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iE = e(this.f893b.f900b);
        if (iE > this.f893b.f901c) {
            J0.A.a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f893b.f901c + " from " + iE, new Object[0]);
            iE = this.f893b.f901c;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jH = h(iE);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iL = l(jH, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iK = k(jH);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (J0.A.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(iE), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2)));
            String str = sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(iL), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            z2 = true;
            sb2.append(String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(iK), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis4)));
            J0.A.a("LruGarbageCollector", sb2.toString() + String.format(locale, "Total Duration: %dms", Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis)), new Object[0]);
        } else {
            z2 = true;
        }
        return new c(z2, iE, iL, iK);
    }

    int e(int i3) {
        return (int) ((i3 / 100.0f) * this.f892a.b());
    }

    c f(SparseArray sparseArray) {
        if (this.f893b.f899a == -1) {
            J0.A.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
        } else {
            long jG = g();
            if (jG >= this.f893b.f899a) {
                return m(sparseArray);
            }
            J0.A.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + jG + " is lower than threshold " + this.f893b.f899a, new Object[0]);
        }
        return c.a();
    }

    long g() {
        return this.f892a.l();
    }

    long h(int i3) {
        if (i3 == 0) {
            return -1L;
        }
        final d dVar = new d(i3);
        this.f892a.n(new J0.n() { // from class: C0.P
            @Override // J0.n
            public final void accept(Object obj) {
                T.i(dVar, (R1) obj);
            }
        });
        this.f892a.m(new J0.n() { // from class: C0.Q
            @Override // J0.n
            public final void accept(Object obj) {
                dVar.b((Long) obj);
            }
        });
        return dVar.c();
    }

    public a j(C0391g c0391g, M m3) {
        return new a(c0391g, m3);
    }

    int k(long j3) {
        return this.f892a.e(j3);
    }

    int l(long j3, SparseArray sparseArray) {
        return this.f892a.c(j3, sparseArray);
    }
}
