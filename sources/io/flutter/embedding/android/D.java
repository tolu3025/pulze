package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import b1.AbstractC0525b;
import c.AbstractC0527b;
import io.flutter.embedding.android.L;
import io.flutter.embedding.android.r;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.j;
import j.InterfaceC0980a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l1.InterfaceC1017c;
import m1.C1034f;
import n1.C1038b;

/* JADX INFO: loaded from: classes.dex */
public class D extends FrameLayout implements C1038b.c, L.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.j f7518A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final InterfaceC0980a f7519B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f7520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f7521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f7522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.flutter.embedding.engine.renderer.k f7523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.k f7524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f7525f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.flutter.embedding.engine.a f7527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f7528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C1038b f7529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.flutter.plugin.editing.F f7530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.flutter.plugin.editing.o f7531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1034f f7532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private L f7533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C0906c f7534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.flutter.view.j f7535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextServicesManager f7536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Q f7537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final FlutterRenderer.f f7538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final j.k f7539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ContentObserver f7540z;

    class a implements j.k {
        a() {
        }

        @Override // io.flutter.view.j.k
        public void a(boolean z2, boolean z3) {
            D.this.z(z2, z3);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            if (D.this.f7527m == null) {
                return;
            }
            AbstractC0525b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            D.this.B();
        }
    }

    class c implements io.flutter.embedding.engine.renderer.j {
        c() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void c() {
            D.this.f7526l = false;
            Iterator it = D.this.f7525f.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            D.this.f7526l = true;
            Iterator it = D.this.f7525f.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).f();
            }
        }
    }

    class d implements InterfaceC0980a {
        d() {
        }

        @Override // j.InterfaceC0980a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            D.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements io.flutter.embedding.engine.renderer.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlutterRenderer f7545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f7546b;

        e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f7545a = flutterRenderer;
            this.f7546b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            this.f7545a.k(this);
            this.f7546b.run();
            D d3 = D.this;
            if ((d3.f7523d instanceof r) || d3.f7522c == null) {
                return;
            }
            D.this.f7522c.a();
            D.this.x();
        }
    }

    private enum f {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private D(Context context, AttributeSet attributeSet, s sVar) {
        super(context, attributeSet);
        this.f7525f = new HashSet();
        this.f7528n = new HashSet();
        this.f7538x = new FlutterRenderer.f();
        this.f7539y = new a();
        this.f7540z = new b(new Handler(Looper.getMainLooper()));
        this.f7518A = new c();
        this.f7519B = new d();
        this.f7520a = sVar;
        this.f7523d = sVar;
        u();
    }

    private void C() {
        if (!v()) {
            AbstractC0525b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f7538x.f7781a = getResources().getDisplayMetrics().density;
        this.f7538x.f7796p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f7527m.t().n(this.f7538x);
    }

    private f o() {
        Context context = getContext();
        int i3 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i3 == 2) {
            if (rotation == 1) {
                return f.RIGHT;
            }
            if (rotation == 3) {
                return f.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return f.BOTH;
            }
        }
        return f.NONE;
    }

    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void u() {
        View view;
        AbstractC0525b.f("FlutterView", "Initializing FlutterView");
        if (this.f7520a != null) {
            AbstractC0525b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f7520a;
        } else if (this.f7521b != null) {
            AbstractC0525b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f7521b;
        } else {
            AbstractC0525b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f7522c;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        r rVar = this.f7522c;
        if (rVar != null) {
            rVar.g();
            removeView(this.f7522c);
            this.f7522c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z2, boolean z3) {
        boolean z4 = false;
        if (!this.f7527m.t().i() && !z2 && !z3) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    public void A(Runnable runnable) {
        if (this.f7522c == null) {
            AbstractC0525b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.k kVar = this.f7524e;
        if (kVar == null) {
            AbstractC0525b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f7523d = kVar;
        this.f7524e = null;
        FlutterRenderer flutterRendererT = this.f7527m.t();
        if (this.f7527m != null && flutterRendererT != null) {
            this.f7523d.b();
            flutterRendererT.f(new e(flutterRendererT, runnable));
        } else {
            this.f7522c.a();
            x();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            k1.t$c r0 = k1.t.c.dark
            goto L15
        L13:
            k1.t$c r0 = k1.t.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.f7536v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3c
            java.util.List r1 = io.flutter.embedding.android.v.a(r1)
            java.util.stream.Stream r1 = io.flutter.embedding.android.w.a(r1)
            io.flutter.embedding.android.C r4 = new io.flutter.embedding.android.C
            r4.<init>()
            boolean r1 = io.flutter.embedding.android.x.a(r1, r4)
            android.view.textservice.TextServicesManager r4 = r6.f7536v
            boolean r4 = io.flutter.embedding.android.y.a(r4)
            if (r4 == 0) goto L3e
            if (r1 == 0) goto L3e
        L3c:
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            io.flutter.embedding.engine.a r4 = r6.f7527m
            k1.t r4 = r4.v()
            k1.t$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            k1.t$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            k1.t$b r4 = r4.c(r5)
            k1.t$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L78
            r2 = r3
        L78:
            k1.t$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            k1.t$b r1 = r1.g(r2)
            k1.t$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.D.B():void");
    }

    @Override // io.flutter.embedding.android.L.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.f7530p.j(sparseArray);
    }

    @Override // n1.C1038b.c
    public PointerIcon b(int i3) {
        return PointerIcon.getSystemIcon(getContext(), i3);
    }

    @Override // io.flutter.embedding.android.L.e
    public boolean c(KeyEvent keyEvent) {
        return this.f7530p.p(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f7527m;
        return aVar != null ? aVar.q().y(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f7533s.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.j jVar = this.f7535u;
        if (jVar == null || !jVar.B()) {
            return null;
        }
        return this.f7535u;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f7527m;
    }

    @Override // io.flutter.embedding.android.L.e
    public InterfaceC1017c getBinaryMessenger() {
        return this.f7527m.k();
    }

    public r getCurrentImageSurface() {
        return this.f7522c;
    }

    public boolean k() {
        r rVar = this.f7522c;
        if (rVar != null) {
            return rVar.e();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.j jVar) {
        this.f7525f.add(jVar);
    }

    public void m(r rVar) {
        io.flutter.embedding.engine.a aVar = this.f7527m;
        if (aVar != null) {
            rVar.c(aVar.t());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        AbstractC0525b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f7527m) {
                AbstractC0525b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                AbstractC0525b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f7527m = aVar;
        FlutterRenderer flutterRendererT = aVar.t();
        this.f7526l = flutterRendererT.h();
        this.f7523d.c(flutterRendererT);
        flutterRendererT.f(this.f7518A);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7529o = new C1038b(this, this.f7527m.n());
        }
        this.f7530p = new io.flutter.plugin.editing.F(this, this.f7527m.y(), this.f7527m.q());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f7536v = textServicesManager;
            this.f7531q = new io.flutter.plugin.editing.o(textServicesManager, this.f7527m.w());
        } catch (Exception unused) {
            AbstractC0525b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f7532r = this.f7527m.m();
        this.f7533s = new L(this);
        this.f7534t = new C0906c(this.f7527m.t(), false);
        io.flutter.view.j jVar = new io.flutter.view.j(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f7527m.q());
        this.f7535u = jVar;
        jVar.Z(this.f7539y);
        z(this.f7535u.B(), this.f7535u.D());
        this.f7527m.q().a(this.f7535u);
        this.f7527m.q().w(this.f7527m.t());
        this.f7530p.o().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f7540z);
        C();
        aVar.q().x(this);
        Iterator it = this.f7528n.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
        if (this.f7526l) {
            this.f7518A.f();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.f7538x.f7792l = systemGestureInsets.top;
            this.f7538x.f7793m = systemGestureInsets.right;
            this.f7538x.f7794n = systemGestureInsets.bottom;
            this.f7538x.f7795o = systemGestureInsets.left;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i3 >= 30) {
            int iNavigationBars = z3 ? WindowInsets.Type.navigationBars() : 0;
            if (z2) {
                iNavigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(iNavigationBars);
            this.f7538x.f7784d = insets.top;
            this.f7538x.f7785e = insets.right;
            this.f7538x.f7786f = insets.bottom;
            this.f7538x.f7787g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.f7538x.f7788h = insets2.top;
            this.f7538x.f7789i = insets2.right;
            this.f7538x.f7790j = insets2.bottom;
            this.f7538x.f7791k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.f7538x.f7792l = insets3.top;
            this.f7538x.f7793m = insets3.right;
            this.f7538x.f7794n = insets3.bottom;
            this.f7538x.f7795o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.f fVar = this.f7538x;
                fVar.f7784d = Math.max(Math.max(fVar.f7784d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.f fVar2 = this.f7538x;
                fVar2.f7785e = Math.max(Math.max(fVar2.f7785e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.f fVar3 = this.f7538x;
                fVar3.f7786f = Math.max(Math.max(fVar3.f7786f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.f fVar4 = this.f7538x;
                fVar4.f7787g = Math.max(Math.max(fVar4.f7787g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            f fVarO = f.NONE;
            if (!z3) {
                fVarO = o();
            }
            this.f7538x.f7784d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f7538x.f7785e = (fVarO == f.RIGHT || fVarO == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f7538x.f7786f = (z3 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f7538x.f7787g = (fVarO == f.LEFT || fVarO == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.f fVar5 = this.f7538x;
            fVar5.f7788h = 0;
            fVar5.f7789i = 0;
            fVar5.f7790j = t(windowInsets);
            this.f7538x.f7791k = 0;
        }
        AbstractC0525b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f7538x.f7784d + ", Left: " + this.f7538x.f7787g + ", Right: " + this.f7538x.f7785e + "\nKeyboard insets: Bottom: " + this.f7538x.f7790j + ", Left: " + this.f7538x.f7791k + ", Right: " + this.f7538x.f7789i + "System Gesture Insets - Left: " + this.f7538x.f7795o + ", Top: " + this.f7538x.f7792l + ", Right: " + this.f7538x.f7793m + ", Bottom: " + this.f7538x.f7790j);
        C();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7537w = r();
        Activity activityB = x1.g.b(getContext());
        Q q2 = this.f7537w;
        if (q2 == null || activityB == null) {
            return;
        }
        q2.a(activityB, androidx.core.content.a.f(getContext()), this.f7519B);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f7527m != null) {
            AbstractC0525b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f7532r.d(configuration);
            B();
            x1.g.a(getContext(), this.f7527m);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f7530p.m(this, this.f7533s, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Q q2 = this.f7537w;
        if (q2 != null) {
            q2.b(this.f7519B);
        }
        this.f7537w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f7534t.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f7535u.K(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        this.f7530p.x(viewStructure, i3);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        AbstractC0525b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i5 + " x " + i6 + ", it is now " + i3 + " x " + i4);
        FlutterRenderer.f fVar = this.f7538x;
        fVar.f7782b = i3;
        fVar.f7783c = i4;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f7534t.k(motionEvent);
    }

    public void p() {
        this.f7523d.d();
        r rVar = this.f7522c;
        if (rVar == null) {
            r rVarQ = q();
            this.f7522c = rVarQ;
            addView(rVarQ);
        } else {
            rVar.k(getWidth(), getHeight());
        }
        this.f7524e = this.f7523d;
        r rVar2 = this.f7522c;
        this.f7523d = rVar2;
        io.flutter.embedding.engine.a aVar = this.f7527m;
        if (aVar != null) {
            rVar2.c(aVar.t());
        }
    }

    public r q() {
        return new r(getContext(), getWidth(), getHeight(), r.b.background);
    }

    protected Q r() {
        try {
            return new Q(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        AbstractC0525b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f7527m);
        if (!v()) {
            AbstractC0525b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f7528n.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.f7540z);
        this.f7527m.q().F();
        this.f7527m.q().d();
        this.f7535u.R();
        this.f7535u = null;
        this.f7530p.o().restartInput(this);
        this.f7530p.n();
        this.f7533s.d();
        io.flutter.plugin.editing.o oVar = this.f7531q;
        if (oVar != null) {
            oVar.b();
        }
        C1038b c1038b = this.f7529o;
        if (c1038b != null) {
            c1038b.c();
        }
        FlutterRenderer flutterRendererT = this.f7527m.t();
        this.f7526l = false;
        flutterRendererT.k(this.f7518A);
        flutterRendererT.p();
        flutterRendererT.m(false);
        io.flutter.embedding.engine.renderer.k kVar = this.f7524e;
        if (kVar != null && this.f7523d == this.f7522c) {
            this.f7523d = kVar;
        }
        this.f7523d.a();
        x();
        this.f7524e = null;
        this.f7527m = null;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        io.flutter.embedding.engine.renderer.k kVar = this.f7523d;
        if (kVar instanceof s) {
            ((s) kVar).setVisibility(i3);
        }
    }

    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            AbstractC0525b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.d.HINGE : FlutterRenderer.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.c.POSTURE_HALF_OPENED : FlutterRenderer.c.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), FlutterRenderer.d.UNKNOWN, FlutterRenderer.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                AbstractC0525b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.b(rect, FlutterRenderer.d.CUTOUT));
            }
        }
        this.f7538x.f7797q = arrayList;
        C();
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f7527m;
        return aVar != null && aVar.t() == this.f7523d.getAttachedRenderer();
    }

    public void y(io.flutter.embedding.engine.renderer.j jVar) {
        this.f7525f.remove(jVar);
    }

    private D(Context context, AttributeSet attributeSet, t tVar) {
        super(context, attributeSet);
        this.f7525f = new HashSet();
        this.f7528n = new HashSet();
        this.f7538x = new FlutterRenderer.f();
        this.f7539y = new a();
        this.f7540z = new b(new Handler(Looper.getMainLooper()));
        this.f7518A = new c();
        this.f7519B = new d();
        this.f7521b = tVar;
        this.f7523d = tVar;
        u();
    }

    public D(Context context, s sVar) {
        this(context, (AttributeSet) null, sVar);
    }

    public D(Context context, t tVar) {
        this(context, (AttributeSet) null, tVar);
    }
}
