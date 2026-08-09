package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.AbstractC0516e;
import b1.AbstractC0525b;
import io.flutter.embedding.android.C0913j;
import j1.AbstractC0985a;
import java.util.List;

/* JADX INFO: renamed from: io.flutter.embedding.android.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0912i extends Activity implements C0913j.c, androidx.lifecycle.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7629e = View.generateViewId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7630a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0913j f7631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.j f7632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnBackInvokedCallback f7633d;

    /* JADX INFO: renamed from: io.flutter.embedding.android.i$a */
    class a implements OnBackAnimationCallback {
        a() {
        }

        public void onBackCancelled() {
            AbstractActivityC0912i.this.F();
        }

        public void onBackInvoked() {
            AbstractActivityC0912i.this.G();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractActivityC0912i.this.V(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractActivityC0912i.this.R(backEvent);
        }
    }

    public AbstractActivityC0912i() {
        this.f7633d = Build.VERSION.SDK_INT < 33 ? null : K();
        this.f7632c = new androidx.lifecycle.j(this);
    }

    private void H() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void I() {
        if (L() == EnumC0914k.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View J() {
        return this.f7631b.u(null, null, null, f7629e, z() == O.surface);
    }

    private OnBackInvokedCallback K() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: io.flutter.embedding.android.h
            public final void onBackInvoked() {
                this.f7628a.onBackPressed();
            }
        };
    }

    private boolean O() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean S(String str) {
        StringBuilder sb;
        String str2;
        C0913j c0913j = this.f7631b;
        if (c0913j == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (c0913j.o()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        AbstractC0525b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void T() {
        try {
            Bundle bundleN = N();
            if (bundleN != null) {
                int i3 = bundleN.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i3 != -1) {
                    setTheme(i3);
                }
            } else {
                AbstractC0525b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC0525b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean A() {
        return true;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public io.flutter.embedding.engine.a B(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public P C() {
        return L() == EnumC0914k.opaque ? P.opaque : P.transparent;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void D(t tVar) {
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void E(io.flutter.embedding.engine.a aVar) {
        if (this.f7631b.p()) {
            return;
        }
        AbstractC0985a.a(aVar);
    }

    public void F() {
        if (S("cancelBackGesture")) {
            this.f7631b.h();
        }
    }

    public void G() {
        if (S("commitBackGesture")) {
            this.f7631b.i();
        }
    }

    protected EnumC0914k L() {
        return getIntent().hasExtra("background_mode") ? EnumC0914k.valueOf(getIntent().getStringExtra("background_mode")) : EnumC0914k.opaque;
    }

    protected io.flutter.embedding.engine.a M() {
        return this.f7631b.n();
    }

    protected Bundle N() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void P() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f7633d);
            this.f7630a = true;
        }
    }

    public void Q() {
        U();
        C0913j c0913j = this.f7631b;
        if (c0913j != null) {
            c0913j.J();
            this.f7631b = null;
        }
    }

    public void R(BackEvent backEvent) {
        if (S("startBackGesture")) {
            this.f7631b.L(backEvent);
        }
    }

    public void U() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f7633d);
            this.f7630a = false;
        }
    }

    public void V(BackEvent backEvent) {
        if (S("updateBackGestureProgress")) {
            this.f7631b.M(backEvent);
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c, androidx.lifecycle.i
    public AbstractC0516e a() {
        return this.f7632c;
    }

    @Override // io.flutter.plugin.platform.h.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void e() {
        AbstractC0525b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + M() + " evicted by another attaching activity");
        C0913j c0913j = this.f7631b;
        if (c0913j != null) {
            c0913j.v();
            this.f7631b.w();
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public void g(boolean z2) {
        if (z2 && !this.f7630a) {
            P();
        } else {
            if (z2 || !this.f7630a) {
                return;
            }
            U();
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String h() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String i() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleN = N();
            if (bundleN != null) {
                return bundleN.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public List l() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean m() {
        return true;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean n() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (p() != null || this.f7631b.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean o() {
        return true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        if (S("onActivityResult")) {
            this.f7631b.r(i3, i4, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (S("onBackPressed")) {
            this.f7631b.t();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        T();
        super.onCreate(bundle);
        C0913j c0913j = new C0913j(this);
        this.f7631b = c0913j;
        c0913j.s(this);
        this.f7631b.B(bundle);
        this.f7632c.h(AbstractC0516e.a.ON_CREATE);
        I();
        setContentView(J());
        H();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (S("onDestroy")) {
            this.f7631b.v();
            this.f7631b.w();
        }
        Q();
        this.f7632c.h(AbstractC0516e.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (S("onNewIntent")) {
            this.f7631b.x(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (S("onPause")) {
            this.f7631b.y();
        }
        this.f7632c.h(AbstractC0516e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (S("onPostResume")) {
            this.f7631b.z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (S("onRequestPermissionsResult")) {
            this.f7631b.A(i3, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f7632c.h(AbstractC0516e.a.ON_RESUME);
        if (S("onResume")) {
            this.f7631b.C();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (S("onSaveInstanceState")) {
            this.f7631b.D(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7632c.h(AbstractC0516e.a.ON_START);
        if (S("onStart")) {
            this.f7631b.E();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (S("onStop")) {
            this.f7631b.F();
        }
        this.f7632c.h(AbstractC0516e.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (S("onTrimMemory")) {
            this.f7631b.G(i3);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (S("onUserLeaveHint")) {
            this.f7631b.H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (S("onWindowFocusChanged")) {
            this.f7631b.I(z2);
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String p() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean q() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : p() == null;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String r() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleN = N();
            String string = bundleN != null ? bundleN.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void s(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String t() {
        try {
            Bundle bundleN = N();
            if (bundleN != null) {
                return bundleN.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public io.flutter.plugin.platform.h u(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.h(d(), aVar.p(), this);
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public void v(s sVar) {
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public String w() {
        String dataString;
        if (O() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public boolean x() {
        try {
            Bundle bundleN = N();
            if (bundleN != null) {
                return bundleN.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public io.flutter.embedding.engine.l y() {
        return io.flutter.embedding.engine.l.a(getIntent());
    }

    @Override // io.flutter.embedding.android.C0913j.c
    public O z() {
        return L() == EnumC0914k.opaque ? O.surface : O.texture;
    }
}
