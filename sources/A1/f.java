package A1;

import B1.b;
import com.google.android.gms.common.api.a;
import e0.AbstractC0829j;
import io.grpc.internal.C0938d0;
import io.grpc.internal.C0943g;
import io.grpc.internal.C0948i0;
import io.grpc.internal.InterfaceC0964q0;
import io.grpc.internal.InterfaceC0970u;
import io.grpc.internal.InterfaceC0974w;
import io.grpc.internal.M0;
import io.grpc.internal.N0;
import io.grpc.internal.S;
import io.grpc.internal.V0;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import y1.AbstractC1303f;
import y1.AbstractC1321y;
import y1.W;
import y1.r0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1321y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f350r = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final B1.b f351s = new b.C0003b(B1.b.f660f).f(B1.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, B1.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, B1.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, B1.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, B1.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, B1.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(B1.k.TLS_1_2).h(true).e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f352t = TimeUnit.DAYS.toNanos(1000);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final M0.d f353u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final InterfaceC0964q0 f354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final EnumSet f355w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0948i0 f356a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SocketFactory f360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SSLSocketFactory f361f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HostnameVerifier f363h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f369n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V0.b f357b = V0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0964q0 f358c = f354v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0964q0 f359d = N0.c(S.f8672v);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private B1.b f364i = f351s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f365j = c.TLS;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f366k = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f367l = S.f8664n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f368m = 65535;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f370o = 4194304;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f371p = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f372q = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f362g = false;

    class a implements M0.d {
        a() {
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.M0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(S.j("grpc-okhttp-%d", true));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f374b;

        static {
            int[] iArr = new int[c.values().length];
            f374b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f374b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[A1.e.values().length];
            f373a = iArr2;
            try {
                iArr2[A1.e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f373a[A1.e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum c {
        TLS,
        PLAINTEXT
    }

    private final class d implements C0948i0.b {
        private d() {
        }

        @Override // io.grpc.internal.C0948i0.b
        public int a() {
            return f.this.i();
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    private final class e implements C0948i0.c {
        private e() {
        }

        @Override // io.grpc.internal.C0948i0.c
        public InterfaceC0970u a() {
            return f.this.f();
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: A1.f$f, reason: collision with other inner class name */
    static final class C0002f implements InterfaceC0970u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0964q0 f380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0964q0 f382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ScheduledExecutorService f383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final V0.b f384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SocketFactory f385f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final SSLSocketFactory f386l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final HostnameVerifier f387m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final B1.b f388n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f389o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f390p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long f391q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final C0943g f392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final long f393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f395u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final int f396v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final boolean f397w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f398x;

        /* JADX INFO: renamed from: A1.f$f$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0943g.b f399a;

            a(C0943g.b bVar) {
                this.f399a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f399a.a();
            }
        }

        private C0002f(InterfaceC0964q0 interfaceC0964q0, InterfaceC0964q0 interfaceC0964q02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, B1.b bVar, int i3, boolean z2, long j3, long j4, int i4, boolean z3, int i5, V0.b bVar2, boolean z4) {
            this.f380a = interfaceC0964q0;
            this.f381b = (Executor) interfaceC0964q0.a();
            this.f382c = interfaceC0964q02;
            this.f383d = (ScheduledExecutorService) interfaceC0964q02.a();
            this.f385f = socketFactory;
            this.f386l = sSLSocketFactory;
            this.f387m = hostnameVerifier;
            this.f388n = bVar;
            this.f389o = i3;
            this.f390p = z2;
            this.f391q = j3;
            this.f392r = new C0943g("keepalive time nanos", j3);
            this.f393s = j4;
            this.f394t = i4;
            this.f395u = z3;
            this.f396v = i5;
            this.f397w = z4;
            this.f384e = (V0.b) AbstractC0829j.o(bVar2, "transportTracerFactory");
        }

        @Override // io.grpc.internal.InterfaceC0970u
        public ScheduledExecutorService F() {
            return this.f383d;
        }

        @Override // io.grpc.internal.InterfaceC0970u
        public InterfaceC0974w H(SocketAddress socketAddress, InterfaceC0970u.a aVar, AbstractC1303f abstractC1303f) {
            if (this.f398x) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C0943g.b bVarD = this.f392r.d();
            i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(bVarD));
            if (this.f390p) {
                iVar.U(true, bVarD.b(), this.f393s, this.f395u);
            }
            return iVar;
        }

        @Override // io.grpc.internal.InterfaceC0970u
        public Collection Q() {
            return f.j();
        }

        @Override // io.grpc.internal.InterfaceC0970u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f398x) {
                return;
            }
            this.f398x = true;
            this.f380a.b(this.f381b);
            this.f382c.b(this.f383d);
        }

        /* synthetic */ C0002f(InterfaceC0964q0 interfaceC0964q0, InterfaceC0964q0 interfaceC0964q02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, B1.b bVar, int i3, boolean z2, long j3, long j4, int i4, boolean z3, int i5, V0.b bVar2, boolean z4, a aVar) {
            this(interfaceC0964q0, interfaceC0964q02, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i3, z2, j3, j4, i4, z3, i5, bVar2, z4);
        }
    }

    static {
        a aVar = new a();
        f353u = aVar;
        f354v = N0.c(aVar);
        f355w = EnumSet.of(r0.MTLS, r0.CUSTOM_MANAGERS);
    }

    private f(String str) {
        a aVar = null;
        this.f356a = new C0948i0(str, new e(this, aVar), new d(this, aVar));
    }

    public static f h(String str) {
        return new f(str);
    }

    static Collection j() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // y1.AbstractC1321y
    protected W e() {
        return this.f356a;
    }

    C0002f f() {
        return new C0002f(this.f358c, this.f359d, this.f360e, g(), this.f363h, this.f364i, this.f370o, this.f366k != Long.MAX_VALUE, this.f366k, this.f367l, this.f368m, this.f369n, this.f371p, this.f357b, false, null);
    }

    SSLSocketFactory g() {
        int i3 = b.f374b[this.f365j.ordinal()];
        if (i3 == 1) {
            return null;
        }
        if (i3 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f365j);
        }
        try {
            if (this.f361f == null) {
                this.f361f = SSLContext.getInstance("Default", B1.h.e().g()).getSocketFactory();
            }
            return this.f361f;
        } catch (GeneralSecurityException e3) {
            throw new RuntimeException("TLS Provider failure", e3);
        }
    }

    int i() {
        int i3 = b.f374b[this.f365j.ordinal()];
        if (i3 == 1) {
            return 80;
        }
        if (i3 == 2) {
            return 443;
        }
        throw new AssertionError(this.f365j + " not handled");
    }

    @Override // y1.W
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f c(long j3, TimeUnit timeUnit) {
        AbstractC0829j.e(j3 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j3);
        this.f366k = nanos;
        long jL = C0938d0.l(nanos);
        this.f366k = jL;
        if (jL >= f352t) {
            this.f366k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // y1.W
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d() {
        AbstractC0829j.u(!this.f362g, "Cannot change security when using ChannelCredentials");
        this.f365j = c.PLAINTEXT;
        return this;
    }
}
