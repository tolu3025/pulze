package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.AbstractC0516e;
import b1.AbstractC0525b;
import b1.C0524a;
import c1.C0543a;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: io.flutter.embedding.android.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0913j implements InterfaceC0907d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f7635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f7636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    D f7637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.h f7638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f7639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f7644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.embedding.engine.d f7645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.j f7646l;

    /* JADX INFO: renamed from: io.flutter.embedding.android.j$a */
    class a implements io.flutter.embedding.engine.renderer.j {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void c() {
            C0913j.this.f7635a.c();
            C0913j.this.f7641g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            C0913j.this.f7635a.f();
            C0913j.this.f7641g = true;
            C0913j.this.f7642h = true;
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.android.j$b */
    class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f7648a;

        b(D d3) {
            this.f7648a = d3;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C0913j.this.f7641g && C0913j.this.f7639e != null) {
                this.f7648a.getViewTreeObserver().removeOnPreDrawListener(this);
                C0913j.this.f7639e = null;
            }
            return C0913j.this.f7641g;
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.android.j$c */
    interface c extends h.d {
        boolean A();

        io.flutter.embedding.engine.a B(Context context);

        P C();

        void D(t tVar);

        void E(io.flutter.embedding.engine.a aVar);

        AbstractC0516e a();

        void c();

        Activity d();

        void e();

        void f();

        Context getContext();

        String h();

        String i();

        List l();

        boolean m();

        boolean n();

        boolean o();

        String p();

        boolean q();

        String r();

        void s(io.flutter.embedding.engine.a aVar);

        String t();

        io.flutter.plugin.platform.h u(Activity activity, io.flutter.embedding.engine.a aVar);

        void v(s sVar);

        String w();

        boolean x();

        io.flutter.embedding.engine.l y();

        O z();
    }

    C0913j(c cVar) {
        this(cVar, null);
    }

    private d.b g(d.b bVar) {
        String strW = this.f7635a.w();
        if (strW == null || strW.isEmpty()) {
            strW = C0524a.e().c().g();
        }
        C0543a.b bVar2 = new C0543a.b(strW, this.f7635a.r());
        String strI = this.f7635a.i();
        if (strI == null && (strI = q(this.f7635a.d().getIntent())) == null) {
            strI = "/";
        }
        return bVar.i(bVar2).k(strI).j(this.f7635a.l());
    }

    private void j(D d3) {
        if (this.f7635a.z() != O.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f7639e != null) {
            d3.getViewTreeObserver().removeOnPreDrawListener(this.f7639e);
        }
        this.f7639e = new b(d3);
        d3.getViewTreeObserver().addOnPreDrawListener(this.f7639e);
    }

    private void k() {
        String str;
        if (this.f7635a.p() == null && !this.f7636b.k().j()) {
            String strI = this.f7635a.i();
            if (strI == null && (strI = q(this.f7635a.d().getIntent())) == null) {
                strI = "/";
            }
            String strT = this.f7635a.t();
            if (("Executing Dart entrypoint: " + this.f7635a.r() + ", library uri: " + strT) == null) {
                str = "\"\"";
            } else {
                str = strT + ", and sending initial route: " + strI;
            }
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", str);
            this.f7636b.o().c(strI);
            String strW = this.f7635a.w();
            if (strW == null || strW.isEmpty()) {
                strW = C0524a.e().c().g();
            }
            this.f7636b.k().i(strT == null ? new C0543a.b(strW, this.f7635a.r()) : new C0543a.b(strW, strT, this.f7635a.r()), this.f7635a.l());
        }
    }

    private void l() {
        if (this.f7635a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String q(Intent intent) {
        Uri data;
        if (!this.f7635a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    void A(int i3, String[] strArr, int[] iArr) {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i3 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f7636b.i().b(i3, strArr, iArr);
    }

    void B(Bundle bundle) {
        Bundle bundle2;
        byte[] byteArray;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            byteArray = null;
        }
        if (this.f7635a.q()) {
            this.f7636b.u().j(byteArray);
        }
        if (this.f7635a.m()) {
            this.f7636b.i().g(bundle2);
        }
    }

    void C() {
        io.flutter.embedding.engine.a aVar;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        if (!this.f7635a.o() || (aVar = this.f7636b) == null) {
            return;
        }
        aVar.l().e();
    }

    void D(Bundle bundle) {
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.f7635a.q()) {
            bundle.putByteArray("framework", this.f7636b.u().h());
        }
        if (this.f7635a.m()) {
            Bundle bundle2 = new Bundle();
            this.f7636b.i().i(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void E() {
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.f7644j;
        if (num != null) {
            this.f7637c.setVisibility(num.intValue());
        }
    }

    void F() {
        io.flutter.embedding.engine.a aVar;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.f7635a.o() && (aVar = this.f7636b) != null) {
            aVar.l().d();
        }
        this.f7644j = Integer.valueOf(this.f7637c.getVisibility());
        this.f7637c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f7636b;
        if (aVar2 != null) {
            aVar2.t().j(40);
        }
    }

    void G(int i3) {
        l();
        io.flutter.embedding.engine.a aVar = this.f7636b;
        if (aVar != null) {
            if (this.f7642h && i3 >= 10) {
                aVar.k().k();
                this.f7636b.x().a();
            }
            this.f7636b.t().j(i3);
            this.f7636b.q().Z(i3);
        }
    }

    void H() {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f7636b.i().j();
        }
    }

    void I(boolean z2) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z2 ? "true" : "false");
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f7635a.o() || (aVar = this.f7636b) == null) {
            return;
        }
        if (z2) {
            aVar.l().a();
        } else {
            aVar.l().f();
        }
    }

    void J() {
        this.f7635a = null;
        this.f7636b = null;
        this.f7637c = null;
        this.f7638d = null;
    }

    void K() {
        io.flutter.embedding.engine.a aVarA;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String strP = this.f7635a.p();
        if (strP != null) {
            io.flutter.embedding.engine.a aVarA2 = io.flutter.embedding.engine.b.b().a(strP);
            this.f7636b = aVarA2;
            this.f7640f = true;
            if (aVarA2 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strP + "'");
        }
        c cVar = this.f7635a;
        io.flutter.embedding.engine.a aVarB = cVar.B(cVar.getContext());
        this.f7636b = aVarB;
        if (aVarB != null) {
            this.f7640f = true;
            return;
        }
        String strH = this.f7635a.h();
        if (strH != null) {
            io.flutter.embedding.engine.d dVarA = io.flutter.embedding.engine.e.b().a(strH);
            if (dVarA == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + strH + "'");
            }
            aVarA = dVarA.a(g(new d.b(this.f7635a.getContext())));
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.d dVar = this.f7645k;
            if (dVar == null) {
                dVar = new io.flutter.embedding.engine.d(this.f7635a.getContext(), this.f7635a.y().b());
            }
            aVarA = dVar.a(g(new d.b(this.f7635a.getContext()).h(false).l(this.f7635a.q())));
        }
        this.f7636b = aVarA;
        this.f7640f = false;
    }

    void L(BackEvent backEvent) {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f7636b.j().d(backEvent);
        }
    }

    void M(BackEvent backEvent) {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f7636b.j().e(backEvent);
        }
    }

    void N() {
        io.flutter.plugin.platform.h hVar = this.f7638d;
        if (hVar != null) {
            hVar.E();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0907d
    public void e() {
        if (!this.f7635a.n()) {
            this.f7635a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f7635a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    void h() {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f7636b.j().b();
        }
    }

    void i() {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f7636b.j().c();
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC0907d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity activityD = this.f7635a.d();
        if (activityD != null) {
            return activityD;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a n() {
        return this.f7636b;
    }

    boolean o() {
        return this.f7643i;
    }

    boolean p() {
        return this.f7640f;
    }

    void r(int i3, int i4, Intent intent) {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i3 + "\nresultCode: " + i4 + "\ndata: " + intent);
        this.f7636b.i().a(i3, i4, intent);
    }

    void s(Context context) {
        l();
        if (this.f7636b == null) {
            K();
        }
        if (this.f7635a.m()) {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f7636b.i().d(this, this.f7635a.a());
        }
        c cVar = this.f7635a;
        this.f7638d = cVar.u(cVar.d(), this.f7636b);
        this.f7635a.E(this.f7636b);
        this.f7643i = true;
    }

    void t() {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f7636b.o().a();
        }
    }

    View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i3, boolean z2) {
        D d3;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        if (this.f7635a.z() == O.surface) {
            s sVar = new s(this.f7635a.getContext(), this.f7635a.C() == P.transparent);
            this.f7635a.v(sVar);
            d3 = new D(this.f7635a.getContext(), sVar);
        } else {
            t tVar = new t(this.f7635a.getContext());
            tVar.setOpaque(this.f7635a.C() == P.opaque);
            this.f7635a.D(tVar);
            d3 = new D(this.f7635a.getContext(), tVar);
        }
        this.f7637c = d3;
        this.f7637c.l(this.f7646l);
        if (this.f7635a.A()) {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f7637c.n(this.f7636b);
        }
        this.f7637c.setId(i3);
        if (z2) {
            j(this.f7637c);
        }
        return this.f7637c;
    }

    void v() {
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.f7639e != null) {
            this.f7637c.getViewTreeObserver().removeOnPreDrawListener(this.f7639e);
            this.f7639e = null;
        }
        D d3 = this.f7637c;
        if (d3 != null) {
            d3.s();
            this.f7637c.y(this.f7646l);
        }
    }

    void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.f7643i) {
            AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.f7635a.s(this.f7636b);
            if (this.f7635a.m()) {
                AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f7635a.d().isChangingConfigurations()) {
                    this.f7636b.i().e();
                } else {
                    this.f7636b.i().h();
                }
            }
            io.flutter.plugin.platform.h hVar = this.f7638d;
            if (hVar != null) {
                hVar.q();
                this.f7638d = null;
            }
            if (this.f7635a.o() && (aVar = this.f7636b) != null) {
                aVar.l().b();
            }
            if (this.f7635a.n()) {
                this.f7636b.g();
                if (this.f7635a.p() != null) {
                    io.flutter.embedding.engine.b.b().d(this.f7635a.p());
                }
                this.f7636b = null;
            }
            this.f7643i = false;
        }
    }

    void x(Intent intent) {
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f7636b.i().f(intent);
        String strQ = q(intent);
        if (strQ == null || strQ.isEmpty()) {
            return;
        }
        this.f7636b.o().b(strQ);
    }

    void y() {
        io.flutter.embedding.engine.a aVar;
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (!this.f7635a.o() || (aVar = this.f7636b) == null) {
            return;
        }
        aVar.l().c();
    }

    void z() {
        AbstractC0525b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.f7636b == null) {
            AbstractC0525b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            N();
            this.f7636b.q().Y();
        }
    }

    C0913j(c cVar, io.flutter.embedding.engine.d dVar) {
        this.f7646l = new a();
        this.f7635a = cVar;
        this.f7642h = false;
        this.f7645k = dVar;
    }
}
