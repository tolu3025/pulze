package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import y1.AbstractC1303f;
import y1.C1294F;

/* JADX INFO: renamed from: io.grpc.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0961p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Logger f9241f = Logger.getLogger(AbstractC1303f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9242a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.K f9243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f9244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9246e;

    /* JADX INFO: renamed from: io.grpc.internal.p$a */
    class a extends ArrayDeque {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9247a;

        a(int i3) {
            this.f9247a = i3;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(C1294F c1294f) {
            if (size() == this.f9247a) {
                removeFirst();
            }
            C0961p.a(C0961p.this);
            return super.add(c1294f);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.p$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9249a;

        static {
            int[] iArr = new int[C1294F.b.values().length];
            f9249a = iArr;
            try {
                iArr[C1294F.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9249a[C1294F.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    C0961p(y1.K k3, int i3, long j3, String str) {
        AbstractC0829j.o(str, "description");
        this.f9243b = (y1.K) AbstractC0829j.o(k3, "logId");
        this.f9244c = i3 > 0 ? new a(i3) : null;
        this.f9245d = j3;
        e(new C1294F.a().b(str + " created").c(C1294F.b.CT_INFO).e(j3).a());
    }

    static /* synthetic */ int a(C0961p c0961p) {
        int i3 = c0961p.f9246e;
        c0961p.f9246e = i3 + 1;
        return i3;
    }

    static void d(y1.K k3, Level level, String str) {
        Logger logger = f9241f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + k3 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    y1.K b() {
        return this.f9243b;
    }

    boolean c() {
        boolean z2;
        synchronized (this.f9242a) {
            z2 = this.f9244c != null;
        }
        return z2;
    }

    void e(C1294F c1294f) {
        int i3 = b.f9249a[c1294f.f11777b.ordinal()];
        Level level = i3 != 1 ? i3 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(c1294f);
        d(this.f9243b, level, c1294f.f11776a);
    }

    void f(C1294F c1294f) {
        synchronized (this.f9242a) {
            try {
                Collection collection = this.f9244c;
                if (collection != null) {
                    collection.add(c1294f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
