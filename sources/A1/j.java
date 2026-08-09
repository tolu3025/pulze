package A1;

import e0.AbstractC0829j;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f489b;

    enum a {
        INBOUND,
        OUTBOUND
    }

    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f500a;

        b(int i3) {
            this.f500a = i3;
        }

        public int c() {
            return this.f500a;
        }
    }

    j(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f488a.isLoggable(this.f489b);
    }

    private static String l(C1.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.c())) {
                enumMap.put(bVar, Integer.valueOf(iVar.a(bVar.c())));
            }
        }
        return enumMap.toString();
    }

    private static String m(m2.d dVar) {
        if (dVar.b0() <= 64) {
            return dVar.c0().m();
        }
        return dVar.d0((int) Math.min(dVar.b0(), 64L)).m() + "...";
    }

    void b(a aVar, int i3, m2.d dVar, int i4, boolean z2) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " DATA: streamId=" + i3 + " endStream=" + z2 + " length=" + i4 + " bytes=" + m(dVar));
        }
    }

    void c(a aVar, int i3, C1.a aVar2, m2.g gVar) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " GO_AWAY: lastStreamId=" + i3 + " errorCode=" + aVar2 + " length=" + gVar.u() + " bytes=" + m(new m2.d().f0(gVar)));
        }
    }

    void d(a aVar, int i3, List list, boolean z2) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " HEADERS: streamId=" + i3 + " headers=" + list + " endStream=" + z2);
        }
    }

    void e(a aVar, long j3) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " PING: ack=false bytes=" + j3);
        }
    }

    void f(a aVar, long j3) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " PING: ack=true bytes=" + j3);
        }
    }

    void g(a aVar, int i3, int i4, List list) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " PUSH_PROMISE: streamId=" + i3 + " promisedStreamId=" + i4 + " headers=" + list);
        }
    }

    void h(a aVar, int i3, C1.a aVar2) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " RST_STREAM: streamId=" + i3 + " errorCode=" + aVar2);
        }
    }

    void i(a aVar, C1.i iVar) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    void j(a aVar) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " SETTINGS: ack=true");
        }
    }

    void k(a aVar, int i3, long j3) {
        if (a()) {
            this.f488a.log(this.f489b, aVar + " WINDOW_UPDATE: streamId=" + i3 + " windowSizeIncrement=" + j3);
        }
    }

    j(Level level, Logger logger) {
        this.f489b = (Level) AbstractC0829j.o(level, "level");
        this.f488a = (Logger) AbstractC0829j.o(logger, "logger");
    }
}
