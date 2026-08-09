package y1;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: y1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1316t implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f12054d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f12055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f12056f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f12057l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f12058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f12060c;

    /* JADX INFO: renamed from: y1.t$b */
    private static class b extends c {
        private b() {
        }

        @Override // y1.C1316t.c
        public long a() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: y1.t$c */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f12055e = nanos;
        f12056f = -nanos;
        f12057l = TimeUnit.SECONDS.toNanos(1L);
    }

    private C1316t(c cVar, long j3, long j4, boolean z2) {
        this.f12058a = cVar;
        long jMin = Math.min(f12055e, Math.max(f12056f, j4));
        this.f12059b = j3 + jMin;
        this.f12060c = z2 && jMin <= 0;
    }

    public static C1316t c(long j3, TimeUnit timeUnit) {
        return e(j3, timeUnit, f12054d);
    }

    public static C1316t e(long j3, TimeUnit timeUnit, c cVar) {
        g(timeUnit, "units");
        return new C1316t(cVar, timeUnit.toNanos(j3), true);
    }

    private static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    private void h(C1316t c1316t) {
        if (this.f12058a == c1316t.f12058a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f12058a + " and " + c1316t.f12058a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static c j() {
        return f12054d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1316t)) {
            return false;
        }
        C1316t c1316t = (C1316t) obj;
        c cVar = this.f12058a;
        if (cVar != null ? cVar == c1316t.f12058a : c1316t.f12058a == null) {
            return this.f12059b == c1316t.f12059b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f12058a, Long.valueOf(this.f12059b)).hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1316t c1316t) {
        h(c1316t);
        long j3 = this.f12059b - c1316t.f12059b;
        if (j3 < 0) {
            return -1;
        }
        return j3 > 0 ? 1 : 0;
    }

    public boolean k(C1316t c1316t) {
        h(c1316t);
        return this.f12059b - c1316t.f12059b < 0;
    }

    public boolean l() {
        if (!this.f12060c) {
            if (this.f12059b - this.f12058a.a() > 0) {
                return false;
            }
            this.f12060c = true;
        }
        return true;
    }

    public C1316t m(C1316t c1316t) {
        h(c1316t);
        return k(c1316t) ? this : c1316t;
    }

    public long n(TimeUnit timeUnit) {
        long jA = this.f12058a.a();
        if (!this.f12060c && this.f12059b - jA <= 0) {
            this.f12060c = true;
        }
        return timeUnit.convert(this.f12059b - jA, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jN = n(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jN);
        long j3 = f12057l;
        long j4 = jAbs / j3;
        long jAbs2 = Math.abs(jN) % j3;
        StringBuilder sb = new StringBuilder();
        if (jN < 0) {
            sb.append('-');
        }
        sb.append(j4);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.f12058a != f12054d) {
            sb.append(" (ticker=" + this.f12058a + ")");
        }
        return sb.toString();
    }

    private C1316t(c cVar, long j3, boolean z2) {
        this(cVar, cVar.a(), j3, z2);
    }
}
