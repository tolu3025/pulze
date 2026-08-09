package com.google.android.gms.common.api.internal;

import M.C0413a;
import M.C0421i;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c.AbstractC0527b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0612l;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.AbstractC0634i;
import com.google.android.gms.common.internal.AbstractC0648x;
import com.google.android.gms.common.internal.C0641p;
import com.google.android.gms.common.internal.C0644t;
import com.google.android.gms.common.internal.C0645u;
import com.google.android.gms.common.internal.C0647w;
import com.google.android.gms.common.internal.InterfaceC0649y;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0607g implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static C0607g f5415s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0647w f5419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0649y f5420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f5421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0421i f5422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.internal.K f5423g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f5430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f5431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f5412p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Status f5413q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f5414r = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile boolean f5416t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f5417a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5418b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f5424h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f5425i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f5426j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0624y f5427k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f5428l = new androidx.collection.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f5429m = new androidx.collection.b();

    private C0607g(Context context, Looper looper, C0421i c0421i) {
        this.f5431o = true;
        this.f5421e = context;
        zao zaoVar = new zao(looper, this);
        this.f5430n = zaoVar;
        this.f5422f = c0421i;
        this.f5423g = new com.google.android.gms.common.internal.K(c0421i);
        if (com.google.android.gms.common.util.g.a(context)) {
            this.f5431o = false;
        }
        zaoVar.sendMessage(zaoVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f5414r) {
            try {
                C0607g c0607g = f5415s;
                if (c0607g != null) {
                    c0607g.f5425i.incrementAndGet();
                    Handler handler = c0607g.f5430n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final G i(com.google.android.gms.common.api.e eVar) {
        Map map = this.f5426j;
        C0602b apiKey = eVar.getApiKey();
        G g3 = (G) map.get(apiKey);
        if (g3 == null) {
            g3 = new G(this, eVar);
            map.put(apiKey, g3);
        }
        if (g3.D()) {
            this.f5429m.add(apiKey);
        }
        g3.C();
        return g3;
    }

    private final void j(TaskCompletionSource taskCompletionSource, int i3, com.google.android.gms.common.api.e eVar) {
        Q qA;
        if (i3 == 0 || (qA = Q.a(this, i3, eVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f5430n;
        Objects.requireNonNull(handler);
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.L
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, qA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status k(C0602b c0602b, C0413a c0413a) {
        String strB = c0602b.b();
        String strValueOf = String.valueOf(c0413a);
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strB);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(c0413a, sb.toString());
    }

    private final void l() {
        C0647w c0647w = this.f5419c;
        if (c0647w != null) {
            if (c0647w.s() > 0 || x()) {
                m().a(c0647w);
            }
            this.f5419c = null;
        }
    }

    private final InterfaceC0649y m() {
        if (this.f5420d == null) {
            this.f5420d = AbstractC0648x.a(this.f5421e);
        }
        return this.f5420d;
    }

    public static C0607g n(Context context) {
        C0607g c0607g;
        synchronized (f5414r) {
            try {
                if (f5415s == null) {
                    f5415s = new C0607g(context.getApplicationContext(), AbstractC0634i.b().getLooper(), C0421i.m());
                    if (f5416t) {
                        final Handler handler = f5415s.f5430n;
                        Objects.requireNonNull(handler);
                        AbstractC0633h.zag(new Executor() { // from class: com.google.android.gms.common.api.internal.K
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        });
                    }
                }
                c0607g = f5415s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0607g;
    }

    public final void A(C0413a c0413a, int i3) {
        if (z(c0413a, i3)) {
            return;
        }
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(5, i3, 0, c0413a));
    }

    final void B(C0641p c0641p, int i3, long j3, int i4) {
        S s2 = new S(c0641p, i3, j3, i4);
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(18, s2));
    }

    final /* synthetic */ long E() {
        return this.f5417a;
    }

    final /* synthetic */ void F(boolean z2) {
        this.f5418b = true;
    }

    final /* synthetic */ Context H() {
        return this.f5421e;
    }

    final /* synthetic */ C0421i b() {
        return this.f5422f;
    }

    final /* synthetic */ com.google.android.gms.common.internal.K c() {
        return this.f5423g;
    }

    final /* synthetic */ Map d() {
        return this.f5426j;
    }

    final /* synthetic */ C0624y e() {
        return this.f5427k;
    }

    final /* synthetic */ Set f() {
        return this.f5428l;
    }

    final /* synthetic */ Handler g() {
        return this.f5430n;
    }

    final /* synthetic */ boolean h() {
        return this.f5431o;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource taskCompletionSourceB;
        Boolean boolValueOf;
        int i3 = message.what;
        G g3 = null;
        switch (i3) {
            case 1:
                this.f5417a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.f5430n;
                handler.removeMessages(12);
                Iterator it = this.f5426j.keySet().iterator();
                while (it.hasNext()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, (C0602b) it.next()), this.f5417a);
                }
                return true;
            case 2:
                AbstractC0527b.a(message.obj);
                throw null;
            case 3:
                for (G g4 : this.f5426j.values()) {
                    g4.y();
                    g4.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                U u2 = (U) message.obj;
                Map map = this.f5426j;
                com.google.android.gms.common.api.e eVar = u2.f5379c;
                G gI = (G) map.get(eVar.getApiKey());
                if (gI == null) {
                    gI = i(eVar);
                }
                if (!gI.D() || this.f5425i.get() == u2.f5378b) {
                    gI.u(u2.f5377a);
                } else {
                    u2.f5377a.a(f5412p);
                    gI.v();
                }
                return true;
            case 5:
                int i4 = message.arg1;
                C0413a c0413a = (C0413a) message.obj;
                Iterator it2 = this.f5426j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        G g5 = (G) it2.next();
                        if (g5.E() == i4) {
                            g3 = g5;
                        }
                    }
                }
                if (g3 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i4);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (c0413a.t() == 13) {
                    String strD = this.f5422f.d(c0413a.t());
                    String strU = c0413a.u();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 69 + String.valueOf(strU).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(strD);
                    sb2.append(": ");
                    sb2.append(strU);
                    g3.J(new Status(17, sb2.toString()));
                } else {
                    g3.J(k(g3.c(), c0413a));
                }
                return true;
            case 6:
                Context context = this.f5421e;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0603c.c((Application) context.getApplicationContext());
                    ComponentCallbacks2C0603c.b().a(new B(this));
                    if (!ComponentCallbacks2C0603c.b().e(true)) {
                        this.f5417a = 300000L;
                    }
                }
                return true;
            case 7:
                i((com.google.android.gms.common.api.e) message.obj);
                return true;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                Map map2 = this.f5426j;
                if (map2.containsKey(message.obj)) {
                    ((G) map2.get(message.obj)).z();
                }
                return true;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                Set set = this.f5429m;
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    G g6 = (G) this.f5426j.remove((C0602b) it3.next());
                    if (g6 != null) {
                        g6.v();
                    }
                }
                set.clear();
                return true;
            case 11:
                Map map3 = this.f5426j;
                if (map3.containsKey(message.obj)) {
                    ((G) map3.get(message.obj)).A();
                }
                return true;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                Map map4 = this.f5426j;
                if (map4.containsKey(message.obj)) {
                    ((G) map4.get(message.obj)).B();
                }
                return true;
            case 14:
                C0625z c0625z = (C0625z) message.obj;
                C0602b c0602bA = c0625z.a();
                Map map5 = this.f5426j;
                if (map5.containsKey(c0602bA)) {
                    boolean zK = ((G) map5.get(c0602bA)).K(false);
                    taskCompletionSourceB = c0625z.b();
                    boolValueOf = Boolean.valueOf(zK);
                } else {
                    taskCompletionSourceB = c0625z.b();
                    boolValueOf = Boolean.FALSE;
                }
                taskCompletionSourceB.setResult(boolValueOf);
                return true;
            case 15:
                H h3 = (H) message.obj;
                Map map6 = this.f5426j;
                if (map6.containsKey(h3.a())) {
                    ((G) map6.get(h3.a())).L(h3);
                }
                return true;
            case 16:
                H h4 = (H) message.obj;
                Map map7 = this.f5426j;
                if (map7.containsKey(h4.a())) {
                    ((G) map7.get(h4.a())).M(h4);
                }
                return true;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                l();
                return true;
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                S s2 = (S) message.obj;
                long j3 = s2.f5375c;
                if (j3 == 0) {
                    m().a(new C0647w(s2.f5374b, Arrays.asList(s2.f5373a)));
                } else {
                    C0647w c0647w = this.f5419c;
                    if (c0647w != null) {
                        List listT = c0647w.t();
                        if (c0647w.s() != s2.f5374b || (listT != null && listT.size() >= s2.f5376d)) {
                            this.f5430n.removeMessages(17);
                            l();
                        } else {
                            this.f5419c.u(s2.f5373a);
                        }
                    }
                    if (this.f5419c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(s2.f5373a);
                        this.f5419c = new C0647w(s2.f5374b, arrayList);
                        Handler handler2 = this.f5430n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j3);
                    }
                }
                return true;
            case V0.I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
                this.f5418b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 20);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int o() {
        return this.f5424h.getAndIncrement();
    }

    public final void p(com.google.android.gms.common.api.e eVar) {
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void q(C0624y c0624y) {
        synchronized (f5414r) {
            try {
                if (this.f5427k != c0624y) {
                    this.f5427k = c0624y;
                    this.f5428l.clear();
                }
                this.f5428l.addAll(c0624y.j());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void r(C0624y c0624y) {
        synchronized (f5414r) {
            try {
                if (this.f5427k == c0624y) {
                    this.f5427k = null;
                    this.f5428l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final G s(C0602b c0602b) {
        return (G) this.f5426j.get(c0602b);
    }

    public final void t() {
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final Task u(com.google.android.gms.common.api.e eVar) {
        C0625z c0625z = new C0625z(eVar.getApiKey());
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(14, c0625z));
        return c0625z.b().getTask();
    }

    public final void v(com.google.android.gms.common.api.e eVar, int i3, AbstractC0604d abstractC0604d) {
        U u2 = new U(new f0(i3, abstractC0604d), this.f5425i.get(), eVar);
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(4, u2));
    }

    public final void w(com.google.android.gms.common.api.e eVar, int i3, AbstractC0620u abstractC0620u, TaskCompletionSource taskCompletionSource, InterfaceC0618s interfaceC0618s) {
        j(taskCompletionSource, abstractC0620u.e(), eVar);
        U u2 = new U(new g0(i3, abstractC0620u, taskCompletionSource, interfaceC0618s), this.f5425i.get(), eVar);
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(4, u2));
    }

    final boolean x() {
        if (this.f5418b) {
            return false;
        }
        C0645u c0645uA = C0644t.b().a();
        if (c0645uA != null && !c0645uA.u()) {
            return false;
        }
        int iB = this.f5423g.b(this.f5421e, 203400000);
        return iB == -1 || iB == 0;
    }

    public final Task y(com.google.android.gms.common.api.e eVar, C0612l.a aVar, int i3) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j(taskCompletionSource, i3, eVar);
        U u2 = new U(new h0(aVar, taskCompletionSource), this.f5425i.get(), eVar);
        Handler handler = this.f5430n;
        handler.sendMessage(handler.obtainMessage(13, u2));
        return taskCompletionSource.getTask();
    }

    final boolean z(C0413a c0413a, int i3) {
        return this.f5422f.s(this.f5421e, c0413a, i3);
    }
}
