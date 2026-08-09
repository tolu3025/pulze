package io.grpc.internal;

import e0.AbstractC0829j;
import e0.AbstractC0832m;
import e0.C0830k;
import e0.C0831l;
import e0.InterfaceC0833n;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.M0;
import io.grpc.internal.R0;
import j0.C0984c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.AbstractC1308k;
import y1.C1300c;
import y1.M;
import y1.S;
import y1.Z;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f8651a = Logger.getLogger(S.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f8652b = Collections.unmodifiableSet(EnumSet.of(l0.b.OK, l0.b.INVALID_ARGUMENT, l0.b.NOT_FOUND, l0.b.ALREADY_EXISTS, l0.b.FAILED_PRECONDITION, l0.b.ABORTED, l0.b.OUT_OF_RANGE, l0.b.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8653c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z.g f8654d = Z.g.e("grpc-timeout", new i());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z.g f8655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z.g f8656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Z.g f8657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z.g f8658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Z.g f8659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z.g f8660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z.g f8661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z.g f8662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0830k f8663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f8664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f8665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f8666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y1.h0 f8667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y1.h0 f8668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1300c.C0193c f8669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AbstractC1308k f8670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final M0.d f8671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final M0.d f8672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC0833n f8673w;

    class a implements y1.h0 {
        a() {
        }

        @Override // y1.h0
        public y1.g0 a(SocketAddress socketAddress) {
            return null;
        }
    }

    class b extends AbstractC1308k {
        b() {
        }
    }

    class c implements M0.d {
        c() {
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(S.j("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    class d implements M0.d {
        d() {
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService a() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, S.j("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    class e implements InterfaceC0833n {
        e() {
        }

        @Override // e0.InterfaceC0833n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0831l get() {
            return C0831l.c();
        }
    }

    class f implements InterfaceC0968t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1308k.a f8674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0968t f8675b;

        f(AbstractC1308k.a aVar, InterfaceC0968t interfaceC0968t) {
            this.f8674a = aVar;
            this.f8675b = interfaceC0968t;
        }

        @Override // io.grpc.internal.InterfaceC0968t
        public r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
            AbstractC1308k abstractC1308kA = this.f8674a.a(AbstractC1308k.b.a().b(c1300c).a(), z2);
            AbstractC0829j.u(abstractC1308kArr[abstractC1308kArr.length - 1] == S.f8670t, "lb tracer already assigned");
            abstractC1308kArr[abstractC1308kArr.length - 1] = abstractC1308kA;
            return this.f8675b.b(a0Var, z2, c1300c, abstractC1308kArr);
        }

        @Override // y1.P
        public y1.K g() {
            return this.f8675b.g();
        }
    }

    private static final class g implements M.a {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f8676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f8677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f8678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h f8679f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final h f8680l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final h f8681m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final h f8682n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final h f8683o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final h f8684p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final h f8685q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final h f8686r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final h f8687s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final h f8688t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final h f8689u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final h[] f8690v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ h[] f8691w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y1.l0 f8693b;

        static {
            y1.l0 l0Var = y1.l0.f11975t;
            h hVar = new h("NO_ERROR", 0, 0, l0Var);
            f8676c = hVar;
            y1.l0 l0Var2 = y1.l0.f11974s;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, l0Var2);
            f8677d = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, l0Var2);
            f8678e = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, l0Var2);
            f8679f = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, l0Var2);
            f8680l = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, l0Var2);
            f8681m = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, l0Var2);
            f8682n = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, l0Var);
            f8683o = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, y1.l0.f11961f);
            f8684p = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, l0Var2);
            f8685q = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, l0Var2);
            f8686r = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, y1.l0.f11969n.q("Bandwidth exhausted"));
            f8687s = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, y1.l0.f11967l.q("Permission denied as protocol is not secure enough to call"));
            f8688t = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, y1.l0.f11962g);
            f8689u = hVar14;
            f8691w = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f8690v = c();
        }

        private h(String str, int i3, int i4, y1.l0 l0Var) {
            this.f8692a = i4;
            String str2 = "HTTP/2 error code: " + name();
            if (l0Var.n() != null) {
                str2 = str2 + " (" + l0Var.n() + ")";
            }
            this.f8693b = l0Var.q(str2);
        }

        private static h[] c() {
            h[] hVarArrValues = values();
            h[] hVarArr = new h[((int) hVarArrValues[hVarArrValues.length - 1].e()) + 1];
            for (h hVar : hVarArrValues) {
                hVarArr[(int) hVar.e()] = hVar;
            }
            return hVarArr;
        }

        public static h g(long j3) {
            h[] hVarArr = f8690v;
            if (j3 >= hVarArr.length || j3 < 0) {
                return null;
            }
            return hVarArr[(int) j3];
        }

        public static y1.l0 i(long j3) {
            h hVarG = g(j3);
            if (hVarG != null) {
                return hVarG.h();
            }
            return y1.l0.h(f8678e.h().m().g()).q("Unrecognized HTTP/2 error code: " + j3);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f8691w.clone();
        }

        public long e() {
            return this.f8692a;
        }

        public y1.l0 h() {
            return this.f8693b;
        }
    }

    static class i implements Z.d {
        i() {
        }

        @Override // y1.Z.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(String str) {
            TimeUnit timeUnit;
            AbstractC0829j.e(str.length() > 0, "empty timeout");
            AbstractC0829j.e(str.length() <= 9, "bad timeout format");
            long j3 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                timeUnit = TimeUnit.HOURS;
            } else if (cCharAt == 'M') {
                timeUnit = TimeUnit.MINUTES;
            } else if (cCharAt == 'S') {
                timeUnit = TimeUnit.SECONDS;
            } else if (cCharAt == 'u') {
                timeUnit = TimeUnit.MICROSECONDS;
            } else {
                if (cCharAt != 'm') {
                    if (cCharAt == 'n') {
                        return Long.valueOf(j3);
                    }
                    throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
                }
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return Long.valueOf(timeUnit.toNanos(j3));
        }

        @Override // y1.Z.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(Long l3) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l3.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l3.longValue() < 100000000) {
                return l3 + "n";
            }
            if (l3.longValue() < 100000000000L) {
                return timeUnit.toMicros(l3.longValue()) + "u";
            }
            if (l3.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l3.longValue()) + "m";
            }
            if (l3.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l3.longValue()) + "S";
            }
            if (l3.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l3.longValue()) + "M";
            }
            return timeUnit.toHours(l3.longValue()) + "H";
        }
    }

    static {
        Z.d dVar = y1.Z.f11842e;
        f8655e = Z.g.e("grpc-encoding", dVar);
        a aVar = null;
        f8656f = y1.M.b("grpc-accept-encoding", new g(aVar));
        f8657g = Z.g.e("content-encoding", dVar);
        f8658h = y1.M.b("accept-encoding", new g(aVar));
        f8659i = Z.g.e("content-length", dVar);
        f8660j = Z.g.e("content-type", dVar);
        f8661k = Z.g.e("te", dVar);
        f8662l = Z.g.e("user-agent", dVar);
        f8663m = C0830k.a(',').c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8664n = timeUnit.toNanos(20L);
        f8665o = TimeUnit.HOURS.toNanos(2L);
        f8666p = timeUnit.toNanos(20L);
        f8667q = new C0977x0();
        f8668r = new a();
        f8669s = C1300c.C0193c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f8670t = new b();
        f8671u = new c();
        f8672v = new d();
        f8673w = new e();
    }

    public static URI b(String str) {
        AbstractC0829j.o(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e3) {
            throw new IllegalArgumentException("Invalid authority: " + str, e3);
        }
    }

    public static String c(String str) {
        AbstractC0829j.j(b(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    static void d(R0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                e(next);
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e3) {
            f8651a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e3);
        }
    }

    public static AbstractC1308k[] f(C1300c c1300c, y1.Z z2, int i3, boolean z3) {
        List listI = c1300c.i();
        int size = listI.size();
        AbstractC1308k[] abstractC1308kArr = new AbstractC1308k[size + 1];
        AbstractC1308k.b bVarA = AbstractC1308k.b.a().b(c1300c).d(i3).c(z3).a();
        for (int i4 = 0; i4 < listI.size(); i4++) {
            abstractC1308kArr[i4] = ((AbstractC1308k.a) listI.get(i4)).a(bVarA, z2);
        }
        abstractC1308kArr[size] = f8670t;
        return abstractC1308kArr;
    }

    public static boolean g(String str, boolean z2) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        return z2 ? AbstractC0832m.a(property) || Boolean.parseBoolean(property) : !AbstractC0832m.a(property) && Boolean.parseBoolean(property);
    }

    public static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.62.2");
        return sb.toString();
    }

    public static String i(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory j(String str, boolean z2) {
        return new C0984c().e(z2).f(str).b();
    }

    static InterfaceC0968t k(S.f fVar, boolean z2) {
        S.i iVarC = fVar.c();
        InterfaceC0968t interfaceC0968tA = iVarC != null ? ((U0) iVarC.e()).a() : null;
        if (interfaceC0968tA != null) {
            AbstractC1308k.a aVarB = fVar.b();
            return aVarB == null ? interfaceC0968tA : new f(aVarB, interfaceC0968tA);
        }
        if (!fVar.a().o()) {
            if (fVar.d()) {
                return new H(o(fVar.a()), InterfaceC0966s.a.DROPPED);
            }
            if (!z2) {
                return new H(o(fVar.a()), InterfaceC0966s.a.PROCESSED);
            }
        }
        return null;
    }

    private static l0.b l(int i3) {
        if (i3 >= 100 && i3 < 200) {
            return l0.b.INTERNAL;
        }
        if (i3 != 400) {
            if (i3 == 401) {
                return l0.b.UNAUTHENTICATED;
            }
            if (i3 == 403) {
                return l0.b.PERMISSION_DENIED;
            }
            if (i3 == 404) {
                return l0.b.UNIMPLEMENTED;
            }
            if (i3 != 429) {
                if (i3 != 431) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return l0.b.UNKNOWN;
                    }
                }
            }
            return l0.b.UNAVAILABLE;
        }
        return l0.b.INTERNAL;
    }

    public static y1.l0 m(int i3) {
        return l(i3).e().q("HTTP status code " + i3);
    }

    public static boolean n(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char cCharAt = lowerCase.charAt(16);
        return cCharAt == '+' || cCharAt == ';';
    }

    public static y1.l0 o(y1.l0 l0Var) {
        AbstractC0829j.d(l0Var != null);
        if (!f8652b.contains(l0Var.m())) {
            return l0Var;
        }
        return y1.l0.f11974s.q("Inappropriate status code from control plane: " + l0Var.m() + " " + l0Var.n()).p(l0Var.l());
    }

    public static boolean p(C1300c c1300c) {
        return !Boolean.TRUE.equals(c1300c.h(f8669s));
    }
}
