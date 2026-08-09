package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b1.AbstractC0525b;
import b1.C0524a;
import c1.C0543a;
import g1.InterfaceC0873b;
import h1.InterfaceC0882b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import j1.AbstractC0985a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1.C1005a;
import k1.m;
import k1.n;
import k1.o;
import k1.r;
import k1.s;
import k1.t;
import k1.u;
import k1.v;
import k1.w;
import m1.C1034f;
import o1.C1045c;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public class a implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f7677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FlutterRenderer f7678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0543a f7679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f7680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1034f f7681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1005a f7682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k1.g f7683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k1.k f7684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1.l f7685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f7686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n f7687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k1.f f7688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f7689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f7690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f7691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t f7692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u f7693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v f7694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final w f7695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.flutter.plugin.platform.r f7696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f7697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f7698v;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0129a implements b {
        C0129a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            AbstractC0525b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f7697u.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f7696t.X();
            a.this.f7689m.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, e1.d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z2, boolean z3) {
        this(context, dVar, flutterJNI, rVar, strArr, z2, z3, null);
    }

    private void f() {
        AbstractC0525b.f("FlutterEngine", "Attaching to JNI.");
        this.f7677a.attachToNative();
        if (!z()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean z() {
        return this.f7677a.isAttached();
    }

    a A(Context context, C0543a.b bVar, String str, List list, io.flutter.plugin.platform.r rVar, boolean z2, boolean z3) {
        if (z()) {
            return new a(context, null, this.f7677a.spawn(bVar.f5015c, bVar.f5014b, str, list), rVar, null, z2, z3);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // x1.g.a
    public void a(float f3, float f4, float f5) {
        this.f7677a.updateDisplayMetrics(0, f3, f4, f5);
    }

    public void e(b bVar) {
        this.f7697u.add(bVar);
    }

    public void g() {
        AbstractC0525b.f("FlutterEngine", "Destroying.");
        Iterator it = this.f7697u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f7680d.l();
        this.f7696t.T();
        this.f7679c.m();
        this.f7677a.removeEngineLifecycleListener(this.f7698v);
        this.f7677a.setDeferredComponentManager(null);
        this.f7677a.detachFromNativeAndReleaseResources();
        C0524a.e().a();
    }

    public C1005a h() {
        return this.f7682f;
    }

    public InterfaceC0882b i() {
        return this.f7680d;
    }

    public k1.f j() {
        return this.f7688l;
    }

    public C0543a k() {
        return this.f7679c;
    }

    public k1.k l() {
        return this.f7684h;
    }

    public C1034f m() {
        return this.f7681e;
    }

    public m n() {
        return this.f7686j;
    }

    public n o() {
        return this.f7687k;
    }

    public o p() {
        return this.f7690n;
    }

    public io.flutter.plugin.platform.r q() {
        return this.f7696t;
    }

    public InterfaceC0873b r() {
        return this.f7680d;
    }

    public r s() {
        return this.f7691o;
    }

    public FlutterRenderer t() {
        return this.f7678b;
    }

    public s u() {
        return this.f7689m;
    }

    public t v() {
        return this.f7692p;
    }

    public u w() {
        return this.f7693q;
    }

    public v x() {
        return this.f7694r;
    }

    public w y() {
        return this.f7695s;
    }

    public a(Context context, e1.d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z2, boolean z3, d dVar2) {
        AssetManager assets;
        this.f7697u = new HashSet();
        this.f7698v = new C0129a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C0524a c0524aE = C0524a.e();
        flutterJNI = flutterJNI == null ? c0524aE.d().a() : flutterJNI;
        this.f7677a = flutterJNI;
        C0543a c0543a = new C0543a(flutterJNI, assets);
        this.f7679c = c0543a;
        c0543a.l();
        C0524a.e().a();
        this.f7682f = new C1005a(c0543a, flutterJNI);
        this.f7683g = new k1.g(c0543a);
        this.f7684h = new k1.k(c0543a);
        k1.l lVar = new k1.l(c0543a);
        this.f7685i = lVar;
        this.f7686j = new m(c0543a);
        this.f7687k = new n(c0543a);
        this.f7688l = new k1.f(c0543a);
        this.f7690n = new o(c0543a);
        this.f7691o = new r(c0543a, context.getPackageManager());
        this.f7689m = new s(c0543a, z3);
        this.f7692p = new t(c0543a);
        this.f7693q = new u(c0543a);
        this.f7694r = new v(c0543a);
        this.f7695s = new w(c0543a);
        C1034f c1034f = new C1034f(context, lVar);
        this.f7681e = c1034f;
        dVar = dVar == null ? c0524aE.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.k(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f7698v);
        flutterJNI.setPlatformViewsController(rVar);
        flutterJNI.setLocalizationPlugin(c1034f);
        c0524aE.a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f7678b = new FlutterRenderer(flutterJNI);
        this.f7696t = rVar;
        rVar.R();
        c cVar = new c(context.getApplicationContext(), this, dVar, dVar2);
        this.f7680d = cVar;
        c1034f.d(context.getResources().getConfiguration());
        if (z2 && dVar.e()) {
            AbstractC0985a.a(this);
        }
        x1.g.a(context, this);
        cVar.c(new C1045c(s()));
    }
}
