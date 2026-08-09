package io.grpc.internal;

import c.AbstractC0527b;
import e0.AbstractC0829j;
import io.grpc.internal.F;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.AbstractC1297I;
import y1.AbstractC1299b;
import y1.AbstractC1302e;
import y1.C1293E;
import y1.C1312o;
import y1.C1318v;

/* JADX INFO: renamed from: io.grpc.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948i0 extends y1.W {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final Logger f9088H = Logger.getLogger(C0948i0.class.getName());

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final long f9089I = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final long f9090J = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final InterfaceC0964q0 f9091K = N0.c(S.f8671u);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final C1318v f9092L = C1318v.c();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final C1312o f9093M = C1312o.a();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Method f9094N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f9095A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f9096B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f9097C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f9098D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f9099E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final c f9100F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final b f9101G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0964q0 f9102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterfaceC0964q0 f9103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    y1.e0 f9105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f9106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f9107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AbstractC1299b f9108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SocketAddress f9109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f9110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f9111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f9112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f9113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    C1318v f9114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    C1312o f9115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f9116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f9117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f9118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f9119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f9120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f9121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    C1293E f9122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f9123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Map f9124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f9125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    y1.h0 f9126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f9127z;

    /* JADX INFO: renamed from: io.grpc.internal.i0$b */
    public interface b {
        int a();
    }

    /* JADX INFO: renamed from: io.grpc.internal.i0$c */
    public interface c {
        InterfaceC0970u a();
    }

    /* JADX INFO: renamed from: io.grpc.internal.i0$d */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.C0948i0.b
        public int a() {
            return 443;
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            f9088H.log(Level.FINE, "Unable to apply census stats", e3);
            declaredMethod = null;
        }
        f9094N = declaredMethod;
    }

    public C0948i0(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // y1.W
    public y1.V a() {
        return new C0950j0(new C0946h0(this, this.f9100F.a(), new F.a(), N0.c(S.f8671u), S.f8673w, f(), S0.f8694a));
    }

    int e() {
        return this.f9101G.a();
    }

    List f() {
        boolean z2;
        Method method;
        ArrayList arrayList = new ArrayList(this.f9104c);
        List listA = AbstractC1297I.a();
        if (listA != null) {
            arrayList.addAll(listA);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && this.f9127z && (method = f9094N) != null) {
            try {
                AbstractC0527b.a(method.invoke(null, Boolean.valueOf(this.f9095A), Boolean.valueOf(this.f9096B), Boolean.valueOf(this.f9097C), Boolean.valueOf(this.f9098D)));
            } catch (IllegalAccessException | InvocationTargetException e3) {
                f9088H.log(Level.FINE, "Unable to apply census stats", e3);
            }
        }
        if (!z2 && this.f9099E) {
            try {
                AbstractC0527b.a(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                f9088H.log(Level.FINE, "Unable to apply census stats", e4);
            }
        }
        return arrayList;
    }

    public C0948i0(String str, AbstractC1302e abstractC1302e, AbstractC1299b abstractC1299b, c cVar, b bVar) {
        InterfaceC0964q0 interfaceC0964q0 = f9091K;
        this.f9102a = interfaceC0964q0;
        this.f9103b = interfaceC0964q0;
        this.f9104c = new ArrayList();
        this.f9105d = y1.e0.b();
        this.f9106e = new ArrayList();
        this.f9112k = "pick_first";
        this.f9114m = f9092L;
        this.f9115n = f9093M;
        this.f9116o = f9089I;
        this.f9117p = 5;
        this.f9118q = 5;
        this.f9119r = 16777216L;
        this.f9120s = 1048576L;
        this.f9121t = true;
        this.f9122u = C1293E.g();
        this.f9125x = true;
        this.f9127z = true;
        this.f9095A = true;
        this.f9096B = true;
        this.f9097C = false;
        this.f9098D = true;
        this.f9099E = true;
        this.f9107f = (String) AbstractC0829j.o(str, "target");
        this.f9108g = abstractC1299b;
        this.f9100F = (c) AbstractC0829j.o(cVar, "clientTransportFactoryBuilder");
        this.f9109h = null;
        if (bVar != null) {
            this.f9101G = bVar;
        } else {
            this.f9101G = new d();
        }
    }
}
