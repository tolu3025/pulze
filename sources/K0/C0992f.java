package k0;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r0.C1200c;
import r0.C1204g;
import r0.o;
import r0.x;
import x0.InterfaceC1271b;

/* JADX INFO: renamed from: k0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0992f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f9452k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f9453l = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1001o f9456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0.o f9457d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f9460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L0.b f9461h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9458e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9459f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f9462i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f9463j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: k0.f$a */
    public interface a {
        void a(boolean z2);
    }

    /* JADX INFO: renamed from: k0.f$b */
    private static class b implements ComponentCallbacks2C0603c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f9464a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f9464a.get() == null) {
                    b bVar = new b();
                    if (m0.a(f9464a, null, bVar)) {
                        ComponentCallbacks2C0603c.c(application);
                        ComponentCallbacks2C0603c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c.a
        public void a(boolean z2) {
            synchronized (C0992f.f9452k) {
                try {
                    for (C0992f c0992f : new ArrayList(C0992f.f9453l.values())) {
                        if (c0992f.f9458e.get()) {
                            c0992f.C(z2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k0.f$c */
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f9465b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9466a;

        public c(Context context) {
            this.f9466a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f9465b.get() == null) {
                c cVar = new c(context);
                if (m0.a(f9465b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f9466a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C0992f.f9452k) {
                try {
                    Iterator it = C0992f.f9453l.values().iterator();
                    while (it.hasNext()) {
                        ((C0992f) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected C0992f(final Context context, String str, C1001o c1001o) {
        this.f9454a = (Context) AbstractC0643s.k(context);
        this.f9455b = AbstractC0643s.e(str);
        this.f9456c = (C1001o) AbstractC0643s.k(c1001o);
        AbstractC1003q abstractC1003qB = FirebaseInitProvider.b();
        S0.c.b("Firebase");
        S0.c.b("ComponentDiscovery");
        List listB = C1204g.c(context, ComponentDiscoveryService.class).b();
        S0.c.a();
        S0.c.b("Runtime");
        o.b bVarG = r0.o.m(s0.n.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C1200c.s(context, Context.class, new Class[0])).b(C1200c.s(this, C0992f.class, new Class[0])).b(C1200c.s(c1001o, C1001o.class, new Class[0])).g(new S0.b());
        if (androidx.core.os.n.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(C1200c.s(abstractC1003qB, AbstractC1003q.class, new Class[0]));
        }
        r0.o oVarE = bVarG.e();
        this.f9457d = oVarE;
        S0.c.a();
        this.f9460g = new x(new L0.b() { // from class: k0.d
            @Override // L0.b
            public final Object get() {
                return this.f9449a.z(context);
            }
        });
        this.f9461h = oVarE.e(K0.f.class);
        g(new a() { // from class: k0.e
            @Override // k0.C0992f.a
            public final void a(boolean z2) {
                this.f9451a.A(z2);
            }
        });
        S0.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(boolean z2) {
        if (z2) {
            return;
        }
        ((K0.f) this.f9461h.get()).l();
    }

    private static String B(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z2) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f9462i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z2);
        }
    }

    private void D() {
        Iterator it = this.f9463j.iterator();
        while (it.hasNext()) {
            ((InterfaceC0993g) it.next()).b(this.f9455b, this.f9456c);
        }
    }

    private void i() {
        AbstractC0643s.n(!this.f9459f.get(), "FirebaseApp was deleted");
    }

    private static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f9452k) {
            try {
                Iterator it = f9453l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0992f) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f9452k) {
            arrayList = new ArrayList(f9453l.values());
        }
        return arrayList;
    }

    public static C0992f o() {
        C0992f c0992f;
        synchronized (f9452k) {
            try {
                c0992f = (C0992f) f9453l.get("[DEFAULT]");
                if (c0992f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((K0.f) c0992f.f9461h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0992f;
    }

    public static C0992f p(String str) {
        C0992f c0992f;
        String str2;
        synchronized (f9452k) {
            try {
                c0992f = (C0992f) f9453l.get(B(str));
                if (c0992f == null) {
                    List listL = l();
                    if (listL.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listL);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((K0.f) c0992f.f9461h.get()).l();
            } finally {
            }
        }
        return c0992f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!androidx.core.os.n.a(this.f9454a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f9454a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f9457d.p(y());
        ((K0.f) this.f9461h.get()).l();
    }

    public static C0992f u(Context context) {
        synchronized (f9452k) {
            try {
                if (f9453l.containsKey("[DEFAULT]")) {
                    return o();
                }
                C1001o c1001oA = C1001o.a(context);
                if (c1001oA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, c1001oA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0992f v(Context context, C1001o c1001o) {
        return w(context, c1001o, "[DEFAULT]");
    }

    public static C0992f w(Context context, C1001o c1001o, String str) {
        C0992f c0992f;
        b.c(context);
        String strB = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9452k) {
            Map map = f9453l;
            AbstractC0643s.n(!map.containsKey(strB), "FirebaseApp name " + strB + " already exists!");
            AbstractC0643s.l(context, "Application context cannot be null.");
            c0992f = new C0992f(context, strB, c1001o);
            map.put(strB, c0992f);
        }
        c0992f.t();
        return c0992f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ M0.a z(Context context) {
        return new M0.a(context, s(), (InterfaceC1271b) this.f9457d.a(InterfaceC1271b.class));
    }

    public void E(boolean z2) {
        boolean z3;
        i();
        if (this.f9458e.compareAndSet(!z2, z2)) {
            boolean zD = ComponentCallbacks2C0603c.b().d();
            if (z2 && zD) {
                z3 = true;
            } else if (z2 || !zD) {
                return;
            } else {
                z3 = false;
            }
            C(z3);
        }
    }

    public void F(Boolean bool) {
        i();
        ((M0.a) this.f9460g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0992f) {
            return this.f9455b.equals(((C0992f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f9458e.get() && ComponentCallbacks2C0603c.b().d()) {
            aVar.a(true);
        }
        this.f9462i.add(aVar);
    }

    public void h(InterfaceC0993g interfaceC0993g) {
        i();
        AbstractC0643s.k(interfaceC0993g);
        this.f9463j.add(interfaceC0993g);
    }

    public int hashCode() {
        return this.f9455b.hashCode();
    }

    public void j() {
        if (this.f9459f.compareAndSet(false, true)) {
            synchronized (f9452k) {
                f9453l.remove(this.f9455b);
            }
            D();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f9457d.a(cls);
    }

    public Context m() {
        i();
        return this.f9454a;
    }

    public String q() {
        i();
        return this.f9455b;
    }

    public C1001o r() {
        i();
        return this.f9456c;
    }

    public String s() {
        return com.google.android.gms.common.util.c.e(q().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return AbstractC0642q.d(this).a("name", this.f9455b).a("options", this.f9456c).toString();
    }

    public boolean x() {
        i();
        return ((M0.a) this.f9460g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
