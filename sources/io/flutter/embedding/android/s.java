package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import b1.AbstractC0525b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes.dex */
public class s extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f7666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SurfaceHolder.Callback f7667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.j f7668f;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
            AbstractC0525b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (s.this.p()) {
                s.this.k(i4, i5);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            AbstractC0525b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            s.this.f7664b = true;
            if (s.this.p()) {
                s.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC0525b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            s.this.f7664b = false;
            if (s.this.p()) {
                s.this.m();
            }
        }
    }

    class b implements io.flutter.embedding.engine.renderer.j {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            AbstractC0525b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            s.this.setAlpha(1.0f);
            if (s.this.f7666d != null) {
                s.this.f7666d.k(this);
            }
        }
    }

    private s(Context context, AttributeSet attributeSet, boolean z2) {
        super(context, attributeSet);
        this.f7664b = false;
        this.f7665c = false;
        this.f7667e = new a();
        this.f7668f = new b();
        this.f7663a = z2;
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i3, int i4) {
        if (this.f7666d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC0525b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
        this.f7666d.q(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f7666d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f7666d.o(getHolder().getSurface(), this.f7665c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        FlutterRenderer flutterRenderer = this.f7666d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.p();
    }

    private void n() {
        if (this.f7663a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f7667e);
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return (this.f7666d == null || this.f7665c) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f7666d == null) {
            AbstractC0525b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC0525b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        setAlpha(0.0f);
        this.f7666d.k(this.f7668f);
        this.f7666d = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        FlutterRenderer flutterRenderer = this.f7666d;
        if (flutterRenderer == null) {
            AbstractC0525b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.f(this.f7668f);
        if (o()) {
            AbstractC0525b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f7665c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC0525b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f7666d != null) {
            AbstractC0525b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f7666d.p();
            this.f7666d.k(this.f7668f);
        }
        this.f7666d = flutterRenderer;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
        if (this.f7666d == null) {
            AbstractC0525b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f7665c = true;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f7666d;
    }

    boolean o() {
        return this.f7664b;
    }

    public s(Context context, boolean z2) {
        this(context, null, z2);
    }
}
