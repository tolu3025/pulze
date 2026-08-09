package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import b1.AbstractC0525b;
import c.AbstractC0527b;
import g1.InterfaceC0872a;
import g1.InterfaceC0873b;
import h1.InterfaceC0881a;
import h1.InterfaceC0882b;
import h1.InterfaceC0883c;
import io.flutter.embedding.android.InterfaceC0907d;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l1.m;
import l1.n;

/* JADX INFO: loaded from: classes.dex */
class c implements InterfaceC0873b, InterfaceC0882b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f7703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0872a.b f7704c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0907d f7706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0130c f7707f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Service f7710i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f7712k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContentProvider f7714m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7702a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7705d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7708g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f7709h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7711j = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f7713l = new HashMap();

    private static class b implements InterfaceC0872a.InterfaceC0127a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e1.d f7715a;

        private b(e1.d dVar) {
            this.f7715a = dVar;
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.c$c, reason: collision with other inner class name */
    private static class C0130c implements InterfaceC0883c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f7716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f7717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f7718c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f7719d = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f7720e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set f7721f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f7722g = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Set f7723h = new HashSet();

        public C0130c(Activity activity, AbstractC0516e abstractC0516e) {
            this.f7716a = activity;
            this.f7717b = new HiddenLifecycleReference(abstractC0516e);
        }

        @Override // h1.InterfaceC0883c
        public Object a() {
            return this.f7717b;
        }

        boolean b(int i3, int i4, Intent intent) {
            Iterator it = new HashSet(this.f7719d).iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((m) it.next()).a(i3, i4, intent) || z2) {
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        void c(Intent intent) {
            Iterator it = this.f7720e.iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
        }

        @Override // h1.InterfaceC0883c
        public Activity d() {
            return this.f7716a;
        }

        @Override // h1.InterfaceC0883c
        public void e(m mVar) {
            this.f7719d.add(mVar);
        }

        @Override // h1.InterfaceC0883c
        public void f(n nVar) {
            this.f7718c.add(nVar);
        }

        @Override // h1.InterfaceC0883c
        public void g(m mVar) {
            this.f7719d.remove(mVar);
        }

        @Override // h1.InterfaceC0883c
        public void h(n nVar) {
            this.f7718c.remove(nVar);
        }

        boolean i(int i3, String[] strArr, int[] iArr) {
            Iterator it = this.f7718c.iterator();
            while (true) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((n) it.next()).b(i3, strArr, iArr) || z2) {
                        z2 = true;
                    }
                }
                return z2;
            }
        }

        void j(Bundle bundle) {
            Iterator it = this.f7723h.iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
        }

        void k(Bundle bundle) {
            Iterator it = this.f7723h.iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
        }

        void l() {
            Iterator it = this.f7721f.iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
        }
    }

    c(Context context, io.flutter.embedding.engine.a aVar, e1.d dVar, d dVar2) {
        this.f7703b = aVar;
        this.f7704c = new InterfaceC0872a.b(context, aVar, aVar.k(), aVar.t(), aVar.q().M(), new b(dVar), dVar2);
    }

    private void k(Activity activity, AbstractC0516e abstractC0516e) {
        this.f7707f = new C0130c(activity, abstractC0516e);
        this.f7703b.q().f0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f7703b.q().u(activity, this.f7703b.t(), this.f7703b.k());
        for (InterfaceC0881a interfaceC0881a : this.f7705d.values()) {
            if (this.f7708g) {
                interfaceC0881a.g(this.f7707f);
            } else {
                interfaceC0881a.f(this.f7707f);
            }
        }
        this.f7708g = false;
    }

    private void m() {
        this.f7703b.q().E();
        this.f7706e = null;
        this.f7707f = null;
    }

    private void n() {
        if (s()) {
            h();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    private boolean s() {
        return this.f7706e != null;
    }

    private boolean t() {
        return this.f7712k != null;
    }

    private boolean u() {
        return this.f7714m != null;
    }

    private boolean v() {
        return this.f7710i != null;
    }

    @Override // h1.InterfaceC0882b
    public boolean a(int i3, int i4, Intent intent) {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean zB = this.f7707f.b(i3, i4, intent);
            if (fVarR != null) {
                fVarR.close();
            }
            return zB;
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public boolean b(int i3, String[] strArr, int[] iArr) {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean zI = this.f7707f.i(i3, strArr, iArr);
            if (fVarR != null) {
                fVarR.close();
            }
            return zI;
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // g1.InterfaceC0873b
    public void c(InterfaceC0872a interfaceC0872a) {
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#add " + interfaceC0872a.getClass().getSimpleName());
        try {
            if (r(interfaceC0872a.getClass())) {
                AbstractC0525b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0872a + ") but it was already registered with this FlutterEngine (" + this.f7703b + ").");
                if (fVarR != null) {
                    fVarR.close();
                    return;
                }
                return;
            }
            AbstractC0525b.f("FlutterEngineCxnRegstry", "Adding plugin: " + interfaceC0872a);
            this.f7702a.put(interfaceC0872a.getClass(), interfaceC0872a);
            interfaceC0872a.A(this.f7704c);
            if (interfaceC0872a instanceof InterfaceC0881a) {
                InterfaceC0881a interfaceC0881a = (InterfaceC0881a) interfaceC0872a;
                this.f7705d.put(interfaceC0872a.getClass(), interfaceC0881a);
                if (s()) {
                    interfaceC0881a.f(this.f7707f);
                }
            }
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void d(InterfaceC0907d interfaceC0907d, AbstractC0516e abstractC0516e) {
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            InterfaceC0907d interfaceC0907d2 = this.f7706e;
            if (interfaceC0907d2 != null) {
                interfaceC0907d2.e();
            }
            n();
            this.f7706e = interfaceC0907d;
            k((Activity) interfaceC0907d.f(), abstractC0516e);
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void e() {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f7708g = true;
            Iterator it = this.f7705d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0881a) it.next()).C();
            }
            m();
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void f(Intent intent) {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f7707f.c(intent);
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void g(Bundle bundle) {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f7707f.j(bundle);
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void h() {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f7705d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0881a) it.next()).j();
            }
            m();
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void i(Bundle bundle) {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f7707f.k(bundle);
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // h1.InterfaceC0882b
    public void j() {
        if (!s()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f7707f.l();
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void l() {
        AbstractC0525b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public void o() {
        if (!t()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.f7711j.values().iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.f7713l.values().iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            AbstractC0525b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.f7709h.values().iterator();
            if (it.hasNext()) {
                AbstractC0527b.a(it.next());
                throw null;
            }
            this.f7710i = null;
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class cls) {
        return this.f7702a.containsKey(cls);
    }

    public void w(Class cls) {
        InterfaceC0872a interfaceC0872a = (InterfaceC0872a) this.f7702a.get(cls);
        if (interfaceC0872a == null) {
            return;
        }
        x1.f fVarR = x1.f.r("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (interfaceC0872a instanceof InterfaceC0881a) {
                if (s()) {
                    ((InterfaceC0881a) interfaceC0872a).j();
                }
                this.f7705d.remove(cls);
            }
            interfaceC0872a.y(this.f7704c);
            this.f7702a.remove(cls);
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w((Class) it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f7702a.keySet()));
        this.f7702a.clear();
    }
}
