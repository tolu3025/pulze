package e0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: e0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0835p f7083a = AbstractC0835p.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7086d;

    /* JADX INFO: renamed from: e0.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7087a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f7087a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7087a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7087a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7087a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7087a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7087a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7087a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C0831l() {
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f7087a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j3) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j3, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j3, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j3, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j3, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j3, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j3, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static C0831l c() {
        return new C0831l();
    }

    private long e() {
        return this.f7084b ? (this.f7083a.a() - this.f7086d) + this.f7085c : this.f7085c;
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public C0831l f() {
        this.f7085c = 0L;
        this.f7084b = false;
        return this;
    }

    public C0831l g() {
        AbstractC0829j.u(!this.f7084b, "This stopwatch is already running.");
        this.f7084b = true;
        this.f7086d = this.f7083a.a();
        return this;
    }

    public String toString() {
        long jE = e();
        TimeUnit timeUnitB = b(jE);
        return AbstractC0828i.a(jE / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }
}
