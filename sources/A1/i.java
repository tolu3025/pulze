package A1;

import A1.b;
import A1.f;
import A1.h;
import A1.j;
import A1.r;
import C1.b;
import D1.a;
import D1.b;
import com.google.android.gms.common.api.a;
import e0.AbstractC0825f;
import e0.AbstractC0829j;
import e0.C0831l;
import e0.InterfaceC0833n;
import io.grpc.internal.C0938d0;
import io.grpc.internal.InterfaceC0954l0;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.InterfaceC0968t;
import io.grpc.internal.InterfaceC0974w;
import io.grpc.internal.K0;
import io.grpc.internal.P0;
import io.grpc.internal.Q;
import io.grpc.internal.S;
import io.grpc.internal.V0;
import io.grpc.internal.W;
import io.grpc.internal.X;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m2.t;
import y1.AbstractC1291C;
import y1.AbstractC1308k;
import y1.C1292D;
import y1.C1293E;
import y1.C1298a;
import y1.C1300c;
import y1.K;
import y1.Z;
import y1.a0;
import y1.i0;
import y1.l0;
import y1.m0;

/* JADX INFO: loaded from: classes.dex */
class i implements InterfaceC0974w, b.a, r.d {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final Map f428V = R();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final Logger f429W = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final SocketFactory f430A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private SSLSocketFactory f431B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private HostnameVerifier f432C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Socket f433D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f434E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Deque f435F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final B1.b f436G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private C0938d0 f437H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f438I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f439J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f440K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f441L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Runnable f442M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f443N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f444O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final V0 f445P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final X f446Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private C1293E.b f447R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final C1292D f448S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f449T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    Runnable f450U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InetSocketAddress f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0833n f455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1.j f457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0954l0.a f458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private A1.b f459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final K f462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Executor f465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final K0 f466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C1298a f471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private l0 f472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private W f474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f475y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f476z;

    class a extends X {
        a() {
        }

        @Override // io.grpc.internal.X
        protected void b() {
            i.this.f458h.b(true);
        }

        @Override // io.grpc.internal.X
        protected void c() {
            i.this.f458h.b(false);
        }
    }

    class b implements V0.c {
        b() {
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = i.this.f450U;
            if (runnable != null) {
                runnable.run();
            }
            i.this.f465o.execute(i.this.f470t);
            synchronized (i.this.f461k) {
                i.this.f434E = a.e.API_PRIORITY_OTHER;
                i.this.l0();
            }
            i.this.getClass();
        }
    }

    private i(f.C0002f c0002f, InetSocketAddress inetSocketAddress, String str, String str2, C1298a c1298a, InterfaceC0833n interfaceC0833n, C1.j jVar, C1292D c1292d, Runnable runnable) {
        this.f454d = new Random();
        this.f461k = new Object();
        this.f464n = new HashMap();
        this.f434E = 0;
        this.f435F = new LinkedList();
        this.f446Q = new a();
        this.f449T = 30000;
        this.f451a = (InetSocketAddress) AbstractC0829j.o(inetSocketAddress, "address");
        this.f452b = str;
        this.f468r = c0002f.f389o;
        this.f456f = c0002f.f394t;
        this.f465o = (Executor) AbstractC0829j.o(c0002f.f381b, "executor");
        this.f466p = new K0(c0002f.f381b);
        this.f467q = (ScheduledExecutorService) AbstractC0829j.o(c0002f.f383d, "scheduledExecutorService");
        this.f463m = 3;
        SocketFactory socketFactory = c0002f.f385f;
        this.f430A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f431B = c0002f.f386l;
        this.f432C = c0002f.f387m;
        this.f436G = (B1.b) AbstractC0829j.o(c0002f.f388n, "connectionSpec");
        this.f455e = (InterfaceC0833n) AbstractC0829j.o(interfaceC0833n, "stopwatchFactory");
        this.f457g = (C1.j) AbstractC0829j.o(jVar, "variant");
        this.f453c = S.h("okhttp", str2);
        this.f448S = c1292d;
        this.f442M = (Runnable) AbstractC0829j.o(runnable, "tooManyPingsRunnable");
        this.f443N = c0002f.f396v;
        this.f445P = c0002f.f384e.a();
        this.f462l = K.a(getClass(), inetSocketAddress.toString());
        this.f471u = C1298a.c().d(Q.f8650b, c1298a).a();
        this.f444O = c0002f.f397w;
        a0();
    }

    static /* synthetic */ int E(i iVar, int i3) {
        int i4 = iVar.f469s + i3;
        iVar.f469s = i4;
        return i4;
    }

    private static Map R() {
        EnumMap enumMap = new EnumMap(C1.a.class);
        C1.a aVar = C1.a.NO_ERROR;
        l0 l0Var = l0.f11974s;
        enumMap.put(aVar, l0Var.q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(C1.a.PROTOCOL_ERROR, l0Var.q("Protocol error"));
        enumMap.put(C1.a.INTERNAL_ERROR, l0Var.q("Internal error"));
        enumMap.put(C1.a.FLOW_CONTROL_ERROR, l0Var.q("Flow control error"));
        enumMap.put(C1.a.STREAM_CLOSED, l0Var.q("Stream closed"));
        enumMap.put(C1.a.FRAME_TOO_LARGE, l0Var.q("Frame too large"));
        enumMap.put(C1.a.REFUSED_STREAM, l0.f11975t.q("Refused stream"));
        enumMap.put(C1.a.CANCEL, l0.f11961f.q("Cancelled"));
        enumMap.put(C1.a.COMPRESSION_ERROR, l0Var.q("Compression error"));
        enumMap.put(C1.a.CONNECT_ERROR, l0Var.q("Connect error"));
        enumMap.put(C1.a.ENHANCE_YOUR_CALM, l0.f11969n.q("Enhance your calm"));
        enumMap.put(C1.a.INADEQUATE_SECURITY, l0.f11967l.q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private D1.b S(InetSocketAddress inetSocketAddress, String str, String str2) {
        D1.a aVarA = new a.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0009b c0009bD = new b.C0009b().e(aVarA).d("Host", aVarA.c() + ":" + aVarA.f()).d("User-Agent", this.f453c);
        if (str != null && str2 != null) {
            c0009bD.d("Proxy-Authorization", B1.c.a(str, str2));
        }
        return c0009bD.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket T(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws m0 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.f430A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f430A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.f449T);
            t tVarE = m2.i.e(socketCreateSocket);
            m2.e eVarA = m2.i.a(m2.i.d(socketCreateSocket));
            D1.b bVarS = S(inetSocketAddress, str, str2);
            D1.a aVarB = bVarS.b();
            eVarA.O(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVarB.c(), Integer.valueOf(aVarB.f()))).O("\r\n");
            int iB = bVarS.a().b();
            for (int i3 = 0; i3 < iB; i3++) {
                eVarA.O(bVarS.a().a(i3)).O(": ").O(bVarS.a().c(i3)).O("\r\n");
            }
            eVarA.O("\r\n");
            eVarA.flush();
            B1.j jVarA = B1.j.a(g0(tVarE));
            while (!g0(tVarE).equals("")) {
            }
            int i4 = jVarA.f717b;
            if (i4 >= 200 && i4 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            m2.d dVar = new m2.d();
            try {
                socketCreateSocket.shutdownOutput();
                tVarE.A(dVar, 1024L);
            } catch (IOException e3) {
                dVar.O("Unable to read body: " + e3.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw l0.f11975t.q(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(jVarA.f717b), jVarA.f718c, dVar.W())).c();
        } catch (IOException e4) {
            if (socketCreateSocket != null) {
                S.e(socketCreateSocket);
            }
            throw l0.f11975t.q("Failed trying to connect with proxy").p(e4).c();
        }
    }

    private Throwable Y() {
        synchronized (this.f461k) {
            try {
                l0 l0Var = this.f472v;
                if (l0Var != null) {
                    return l0Var.c();
                }
                return l0.f11975t.q("Connection closed").c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a0() {
        synchronized (this.f461k) {
            this.f445P.g(new b());
        }
    }

    private void d0(h hVar) {
        if (this.f476z && this.f435F.isEmpty() && this.f464n.isEmpty()) {
            this.f476z = false;
            C0938d0 c0938d0 = this.f437H;
            if (c0938d0 != null) {
                c0938d0.o();
            }
        }
        if (hVar.y()) {
            this.f446Q.e(hVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C1.a aVar, String str) {
        k0(0, aVar, p0(aVar).e(str));
    }

    private static String g0(t tVar) throws EOFException {
        m2.d dVar = new m2.d();
        while (tVar.A(dVar, 1L) != -1) {
            if (dVar.z(dVar.b0() - 1) == 10) {
                return dVar.Y();
            }
        }
        throw new EOFException("\\n not found: " + dVar.R().m());
    }

    private void i0() {
        synchronized (this.f461k) {
            try {
                this.f459i.w();
                C1.i iVar = new C1.i();
                n.c(iVar, 7, this.f456f);
                this.f459i.n(iVar);
                if (this.f456f > 65535) {
                    this.f459i.g(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j0(h hVar) {
        if (!this.f476z) {
            this.f476z = true;
            C0938d0 c0938d0 = this.f437H;
            if (c0938d0 != null) {
                c0938d0.n();
            }
        }
        if (hVar.y()) {
            this.f446Q.e(hVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i3, C1.a aVar, l0 l0Var) {
        synchronized (this.f461k) {
            try {
                if (this.f472v == null) {
                    this.f472v = l0Var;
                    this.f458h.c(l0Var);
                }
                if (aVar != null && !this.f473w) {
                    this.f473w = true;
                    this.f459i.G(0, aVar, new byte[0]);
                }
                Iterator it = this.f464n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i3) {
                        it.remove();
                        ((h) entry.getValue()).u().M(l0Var, InterfaceC0966s.a.REFUSED, false, new Z());
                        d0((h) entry.getValue());
                    }
                }
                for (h hVar : this.f435F) {
                    hVar.u().M(l0Var, InterfaceC0966s.a.MISCARRIED, true, new Z());
                    d0(hVar);
                }
                this.f435F.clear();
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l0() {
        boolean z2 = false;
        while (!this.f435F.isEmpty() && this.f464n.size() < this.f434E) {
            m0((h) this.f435F.poll());
            z2 = true;
        }
        return z2;
    }

    private void m0(h hVar) {
        AbstractC0829j.u(hVar.u().c0() == -1, "StreamId already assigned");
        this.f464n.put(Integer.valueOf(this.f463m), hVar);
        j0(hVar);
        hVar.u().f0(this.f463m);
        if ((hVar.M() != a0.d.UNARY && hVar.M() != a0.d.SERVER_STREAMING) || hVar.O()) {
            this.f459i.flush();
        }
        int i3 = this.f463m;
        if (i3 < 2147483645) {
            this.f463m = i3 + 2;
        } else {
            this.f463m = a.e.API_PRIORITY_OTHER;
            k0(a.e.API_PRIORITY_OTHER, C1.a.NO_ERROR, l0.f11975t.q("Stream ids exhausted"));
        }
    }

    private void n0() {
        if (this.f472v == null || !this.f464n.isEmpty() || !this.f435F.isEmpty() || this.f475y) {
            return;
        }
        this.f475y = true;
        C0938d0 c0938d0 = this.f437H;
        if (c0938d0 != null) {
            c0938d0.q();
        }
        W w2 = this.f474x;
        if (w2 != null) {
            w2.f(Y());
            this.f474x = null;
        }
        if (!this.f473w) {
            this.f473w = true;
            this.f459i.G(0, C1.a.NO_ERROR, new byte[0]);
        }
        this.f459i.close();
    }

    static l0 p0(C1.a aVar) {
        l0 l0Var = (l0) f428V.get(aVar);
        if (l0Var != null) {
            return l0Var;
        }
        return l0.f11962g.q("Unknown http2 error code: " + aVar.f1153a);
    }

    void U(boolean z2, long j3, long j4, boolean z3) {
        this.f438I = z2;
        this.f439J = j3;
        this.f440K = j4;
        this.f441L = z3;
    }

    void V(int i3, l0 l0Var, InterfaceC0966s.a aVar, boolean z2, C1.a aVar2, Z z3) {
        synchronized (this.f461k) {
            try {
                h hVar = (h) this.f464n.remove(Integer.valueOf(i3));
                if (hVar != null) {
                    if (aVar2 != null) {
                        this.f459i.d(i3, C1.a.CANCEL);
                    }
                    if (l0Var != null) {
                        h.b bVarN = hVar.u();
                        if (z3 == null) {
                            z3 = new Z();
                        }
                        bVarN.M(l0Var, aVar, z2, z3);
                    }
                    if (!l0()) {
                        n0();
                        d0(hVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    String W() {
        URI uriB = S.b(this.f452b);
        return uriB.getHost() != null ? uriB.getHost() : this.f452b;
    }

    int X() {
        URI uriB = S.b(this.f452b);
        return uriB.getPort() != -1 ? uriB.getPort() : this.f451a.getPort();
    }

    h Z(int i3) {
        h hVar;
        synchronized (this.f461k) {
            hVar = (h) this.f464n.get(Integer.valueOf(i3));
        }
        return hVar;
    }

    @Override // A1.r.d
    public r.c[] a() {
        r.c[] cVarArr;
        synchronized (this.f461k) {
            try {
                cVarArr = new r.c[this.f464n.size()];
                Iterator it = this.f464n.values().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    cVarArr[i3] = ((h) it.next()).u().b0();
                    i3++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarArr;
    }

    boolean b0() {
        return this.f431B == null;
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public Runnable c(InterfaceC0954l0.a aVar) {
        this.f458h = (InterfaceC0954l0.a) AbstractC0829j.o(aVar, "listener");
        if (this.f438I) {
            C0938d0 c0938d0 = new C0938d0(new C0938d0.c(this), this.f467q, this.f439J, this.f440K, this.f441L);
            this.f437H = c0938d0;
            c0938d0.p();
        }
        A1.a aVarR = A1.a.R(this.f466p, this, 10000);
        C1.c cVarP = aVarR.P(this.f457g.b(m2.i.a(aVarR), true));
        synchronized (this.f461k) {
            A1.b bVar = new A1.b(this, cVarP);
            this.f459i = bVar;
            this.f460j = new r(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f466p.execute(new c(countDownLatch, aVarR));
        try {
            i0();
            countDownLatch.countDown();
            this.f466p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean c0(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f461k
            monitor-enter(r0)
            int r1 = r2.f463m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.i.c0(int):boolean");
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public void d(l0 l0Var) {
        synchronized (this.f461k) {
            try {
                if (this.f472v != null) {
                    return;
                }
                this.f472v = l0Var;
                this.f458h.c(l0Var);
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A1.b.a
    public void e(Throwable th) {
        AbstractC0829j.o(th, "failureCause");
        k0(0, C1.a.INTERNAL_ERROR, l0.f11975t.p(th));
    }

    @Override // io.grpc.internal.InterfaceC0968t
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public h b(a0 a0Var, Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) throws Throwable {
        AbstractC0829j.o(a0Var, "method");
        AbstractC0829j.o(z2, "headers");
        P0 p0H = P0.h(abstractC1308kArr, f(), z2);
        synchronized (this.f461k) {
            try {
                try {
                    return new h(a0Var, z2, this.f459i, this, this.f460j, this.f461k, this.f468r, this.f456f, this.f452b, this.f453c, p0H, this.f445P, c1300c, this.f444O);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC0974w
    public C1298a f() {
        return this.f471u;
    }

    @Override // y1.P
    public K g() {
        return this.f462l;
    }

    @Override // io.grpc.internal.InterfaceC0968t
    public void h(InterfaceC0968t.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.f461k) {
            try {
                boolean z2 = true;
                AbstractC0829j.t(this.f459i != null);
                if (this.f475y) {
                    W.g(aVar, executor, Y());
                    return;
                }
                W w2 = this.f474x;
                if (w2 != null) {
                    jNextLong = 0;
                    z2 = false;
                } else {
                    jNextLong = this.f454d.nextLong();
                    C0831l c0831l = (C0831l) this.f455e.get();
                    c0831l.g();
                    W w3 = new W(jNextLong, c0831l);
                    this.f474x = w3;
                    this.f445P.b();
                    w2 = w3;
                }
                if (z2) {
                    this.f459i.e(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                w2.a(aVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void h0(h hVar) {
        this.f435F.remove(hVar);
        d0(hVar);
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public void i(l0 l0Var) {
        d(l0Var);
        synchronized (this.f461k) {
            try {
                Iterator it = this.f464n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((h) entry.getValue()).u().N(l0Var, false, new Z());
                    d0((h) entry.getValue());
                }
                for (h hVar : this.f435F) {
                    hVar.u().M(l0Var, InterfaceC0966s.a.MISCARRIED, true, new Z());
                    d0(hVar);
                }
                this.f435F.clear();
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o0(h hVar) {
        if (this.f472v != null) {
            hVar.u().M(this.f472v, InterfaceC0966s.a.MISCARRIED, true, new Z());
        } else if (this.f464n.size() < this.f434E) {
            m0(hVar);
        } else {
            this.f435F.add(hVar);
            j0(hVar);
        }
    }

    public String toString() {
        return AbstractC0825f.b(this).c("logId", this.f462l.d()).d("address", this.f451a).toString();
    }

    public i(f.C0002f c0002f, InetSocketAddress inetSocketAddress, String str, String str2, C1298a c1298a, C1292D c1292d, Runnable runnable) {
        this(c0002f, inetSocketAddress, str, str2, c1298a, S.f8673w, new C1.g(), c1292d, runnable);
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ A1.a f480b;

        c(CountDownLatch countDownLatch, A1.a aVar) {
            this.f479a = countDownLatch;
            this.f480b = aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            i iVar;
            e eVar;
            Socket socketT;
            SSLSession session;
            Socket socket;
            try {
                this.f479a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            m2.f fVarB = m2.i.b(new a());
            try {
                try {
                    i iVar2 = i.this;
                    C1292D c1292d = iVar2.f448S;
                    if (c1292d == null) {
                        socketT = iVar2.f430A.createSocket(i.this.f451a.getAddress(), i.this.f451a.getPort());
                    } else {
                        if (!(c1292d.b() instanceof InetSocketAddress)) {
                            throw l0.f11974s.q("Unsupported SocketAddress implementation " + i.this.f448S.b().getClass()).c();
                        }
                        i iVar3 = i.this;
                        socketT = iVar3.T(iVar3.f448S.c(), (InetSocketAddress) i.this.f448S.b(), i.this.f448S.d(), i.this.f448S.a());
                    }
                    Socket socket2 = socketT;
                    if (i.this.f431B != null) {
                        SSLSocket sSLSocketB = o.b(i.this.f431B, i.this.f432C, socket2, i.this.W(), i.this.X(), i.this.f436G);
                        session = sSLSocketB.getSession();
                        socket = sSLSocketB;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    m2.f fVarB2 = m2.i.b(m2.i.e(socket));
                    this.f480b.L(m2.i.d(socket), socket);
                    i iVar4 = i.this;
                    iVar4.f471u = iVar4.f471u.d().d(AbstractC1291C.f11754a, socket.getRemoteSocketAddress()).d(AbstractC1291C.f11755b, socket.getLocalSocketAddress()).d(AbstractC1291C.f11756c, session).d(Q.f8649a, session == null ? i0.NONE : i0.PRIVACY_AND_INTEGRITY).a();
                    i iVar5 = i.this;
                    iVar5.f470t = iVar5.new e(iVar5.f457g.a(fVarB2, true));
                    synchronized (i.this.f461k) {
                        try {
                            i.this.f433D = (Socket) AbstractC0829j.o(socket, "socket");
                            if (session != null) {
                                i.this.f447R = new C1293E.b(new C1293E.c(session));
                            }
                        } finally {
                        }
                    }
                } catch (m0 e3) {
                    i.this.k0(0, C1.a.INTERNAL_ERROR, e3.a());
                    iVar = i.this;
                    eVar = iVar.new e(iVar.f457g.a(fVarB, true));
                    iVar.f470t = eVar;
                } catch (Exception e4) {
                    i.this.e(e4);
                    iVar = i.this;
                    eVar = iVar.new e(iVar.f457g.a(fVarB, true));
                    iVar.f470t = eVar;
                }
            } catch (Throwable th) {
                i iVar6 = i.this;
                iVar6.f470t = iVar6.new e(iVar6.f457g.a(fVarB, true));
                throw th;
            }
        }

        class a implements t {
            a() {
            }

            @Override // m2.t
            public long A(m2.d dVar, long j3) {
                return -1L;
            }

            @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }

    class e implements b.a, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C1.b f485b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f484a = new j(Level.FINE, i.class);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f486c = true;

        e(C1.b bVar) {
            this.f485b = bVar;
        }

        private int a(List list) {
            long jU = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C1.d dVar = (C1.d) list.get(i3);
                jU += (long) (dVar.f1163a.u() + 32 + dVar.f1164b.u());
            }
            return (int) Math.min(jU, 2147483647L);
        }

        @Override // C1.b.a
        public void d(int i3, C1.a aVar) {
            this.f484a.h(j.a.INBOUND, i3, aVar);
            l0 l0VarE = i.p0(aVar).e("Rst Stream");
            boolean z2 = l0VarE.m() == l0.b.CANCELLED || l0VarE.m() == l0.b.DEADLINE_EXCEEDED;
            synchronized (i.this.f461k) {
                try {
                    h hVar = (h) i.this.f464n.get(Integer.valueOf(i3));
                    if (hVar != null) {
                        H1.c.d("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.u().h0());
                        i.this.V(i3, l0VarE, aVar == C1.a.REFUSED_STREAM ? InterfaceC0966s.a.REFUSED : InterfaceC0966s.a.PROCESSED, z2, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // C1.b.a
        public void e(boolean z2, int i3, int i4) {
            W w2;
            long j3 = (((long) i3) << 32) | (((long) i4) & 4294967295L);
            this.f484a.e(j.a.INBOUND, j3);
            if (!z2) {
                synchronized (i.this.f461k) {
                    i.this.f459i.e(true, i3, i4);
                }
                return;
            }
            synchronized (i.this.f461k) {
                try {
                    w2 = null;
                    if (i.this.f474x == null) {
                        i.f429W.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (i.this.f474x.h() == j3) {
                        W w3 = i.this.f474x;
                        i.this.f474x = null;
                        w2 = w3;
                    } else {
                        i.f429W.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(i.this.f474x.h()), Long.valueOf(j3)));
                    }
                } finally {
                }
            }
            if (w2 != null) {
                w2.d();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // C1.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(int r8, long r9) {
            /*
                r7 = this;
                A1.j r0 = r7.f484a
                A1.j$a r1 = A1.j.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                A1.i r8 = A1.i.this
                C1.a r10 = C1.a.PROTOCOL_ERROR
                A1.i.B(r8, r10, r9)
                goto L2b
            L19:
                A1.i r0 = A1.i.this
                y1.l0 r10 = y1.l0.f11974s
                y1.l0 r2 = r10.q(r9)
                io.grpc.internal.s$a r3 = io.grpc.internal.InterfaceC0966s.a.PROCESSED
                C1.a r5 = C1.a.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.V(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                A1.i r0 = A1.i.this
                java.lang.Object r0 = A1.i.k(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L44
                A1.i r8 = A1.i.this     // Catch: java.lang.Throwable -> L42
                A1.r r8 = A1.i.x(r8)     // Catch: java.lang.Throwable -> L42
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r8.g(r1, r9)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r8 = move-exception
                goto L90
            L44:
                A1.i r1 = A1.i.this     // Catch: java.lang.Throwable -> L42
                java.util.Map r1 = A1.i.G(r1)     // Catch: java.lang.Throwable -> L42
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
                A1.h r1 = (A1.h) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L69
                A1.i r2 = A1.i.this     // Catch: java.lang.Throwable -> L42
                A1.r r2 = A1.i.x(r2)     // Catch: java.lang.Throwable -> L42
                A1.h$b r1 = r1.u()     // Catch: java.lang.Throwable -> L42
                A1.r$c r1 = r1.b0()     // Catch: java.lang.Throwable -> L42
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r2.g(r1, r9)     // Catch: java.lang.Throwable -> L42
                goto L73
            L69:
                A1.i r9 = A1.i.this     // Catch: java.lang.Throwable -> L42
                boolean r9 = r9.c0(r8)     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto L73
                r9 = 1
                goto L74
            L73:
                r9 = 0
            L74:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                if (r9 == 0) goto L8f
                A1.i r9 = A1.i.this
                C1.a r10 = C1.a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                A1.i.B(r9, r10, r8)
            L8f:
                return
            L90:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.i.e.g(int, long):void");
        }

        @Override // C1.b.a
        public void h(int i3, C1.a aVar, m2.g gVar) {
            this.f484a.c(j.a.INBOUND, i3, aVar, gVar);
            if (aVar == C1.a.ENHANCE_YOUR_CALM) {
                String strY = gVar.y();
                i.f429W.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strY));
                if ("too_many_pings".equals(strY)) {
                    i.this.f442M.run();
                }
            }
            l0 l0VarE = S.h.i(aVar.f1153a).e("Received Goaway");
            if (gVar.u() > 0) {
                l0VarE = l0VarE.e(gVar.y());
            }
            i.this.k0(i3, null, l0VarE);
        }

        @Override // C1.b.a
        public void k(boolean z2, C1.i iVar) {
            boolean zF;
            this.f484a.i(j.a.INBOUND, iVar);
            synchronized (i.this.f461k) {
                try {
                    if (n.b(iVar, 4)) {
                        i.this.f434E = n.a(iVar, 4);
                    }
                    if (n.b(iVar, 7)) {
                        zF = i.this.f460j.f(n.a(iVar, 7));
                    } else {
                        zF = false;
                    }
                    if (this.f486c) {
                        i iVar2 = i.this;
                        iVar2.f471u = iVar2.f458h.e(i.this.f471u);
                        i.this.f458h.d();
                        this.f486c = false;
                    }
                    i.this.f459i.j(iVar);
                    if (zF) {
                        i.this.f460j.h();
                    }
                    i.this.l0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // C1.b.a
        public void l(int i3, int i4, List list) {
            this.f484a.g(j.a.INBOUND, i3, i4, list);
            synchronized (i.this.f461k) {
                i.this.f459i.d(i3, C1.a.PROTOCOL_ERROR);
            }
        }

        @Override // C1.b.a
        public void m(boolean z2, int i3, m2.f fVar, int i4, int i5) {
            this.f484a.b(j.a.INBOUND, i3, fVar.s(), i4, z2);
            h hVarZ = i.this.Z(i3);
            if (hVarZ != null) {
                long j3 = i4;
                fVar.M(j3);
                m2.d dVar = new m2.d();
                dVar.T(fVar.s(), j3);
                H1.c.d("OkHttpClientTransport$ClientFrameHandler.data", hVarZ.u().h0());
                synchronized (i.this.f461k) {
                    hVarZ.u().i0(dVar, z2, i5 - i4);
                }
            } else {
                if (!i.this.c0(i3)) {
                    i.this.f0(C1.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i3);
                    return;
                }
                synchronized (i.this.f461k) {
                    i.this.f459i.d(i3, C1.a.STREAM_CLOSED);
                }
                fVar.k(i4);
            }
            i.E(i.this, i5);
            if (i.this.f469s >= i.this.f456f * 0.5f) {
                synchronized (i.this.f461k) {
                    i.this.f459i.g(0, i.this.f469s);
                }
                i.this.f469s = 0;
            }
        }

        @Override // C1.b.a
        public void n(boolean z2, boolean z3, int i3, int i4, List list, C1.e eVar) {
            l0 l0VarQ;
            int iA;
            this.f484a.d(j.a.INBOUND, i3, list, z3);
            boolean z4 = true;
            if (i.this.f443N == Integer.MAX_VALUE || (iA = a(list)) <= i.this.f443N) {
                l0VarQ = null;
            } else {
                l0 l0Var = l0.f11969n;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z3 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(i.this.f443N);
                objArr[2] = Integer.valueOf(iA);
                l0VarQ = l0Var.q(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (i.this.f461k) {
                try {
                    h hVar = (h) i.this.f464n.get(Integer.valueOf(i3));
                    if (hVar == null) {
                        if (i.this.c0(i3)) {
                            i.this.f459i.d(i3, C1.a.STREAM_CLOSED);
                        }
                    } else if (l0VarQ == null) {
                        H1.c.d("OkHttpClientTransport$ClientFrameHandler.headers", hVar.u().h0());
                        hVar.u().j0(list, z3);
                    } else {
                        if (!z3) {
                            i.this.f459i.d(i3, C1.a.CANCEL);
                        }
                        hVar.u().N(l0VarQ, false, new Z());
                    }
                    z4 = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                i.this.f0(C1.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0VarQ;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f485b.C(this)) {
                try {
                    if (i.this.f437H != null) {
                        i.this.f437H.m();
                    }
                } catch (Throwable th) {
                    try {
                        i.this.k0(0, C1.a.PROTOCOL_ERROR, l0.f11974s.q("error in frame handler").p(th));
                        try {
                            this.f485b.close();
                        } catch (IOException e3) {
                            e = e3;
                            i.f429W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e4) {
                            if (!"bio == null".equals(e4.getMessage())) {
                                throw e4;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f485b.close();
                        } catch (IOException e5) {
                            i.f429W.log(Level.INFO, "Exception closing frame reader", (Throwable) e5);
                        } catch (RuntimeException e6) {
                            if (!"bio == null".equals(e6.getMessage())) {
                                throw e6;
                            }
                        }
                        i.this.f458h.a();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (i.this.f461k) {
                l0VarQ = i.this.f472v;
            }
            if (l0VarQ == null) {
                l0VarQ = l0.f11975t.q("End of stream or IOException");
            }
            i.this.k0(0, C1.a.INTERNAL_ERROR, l0VarQ);
            try {
                this.f485b.close();
            } catch (IOException e7) {
                e = e7;
                i.f429W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e8) {
                if (!"bio == null".equals(e8.getMessage())) {
                    throw e8;
                }
            }
            i.this.f458h.a();
            Thread.currentThread().setName(name);
        }

        @Override // C1.b.a
        public void i() {
        }

        @Override // C1.b.a
        public void j(int i3, int i4, int i5, boolean z2) {
        }
    }
}
