package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import b1.AbstractC0525b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes.dex */
public class t extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlutterRenderer f7673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f7674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f7675e;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
            AbstractC0525b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            t.this.f7671a = true;
            if (t.this.q()) {
                t.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            AbstractC0525b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            t.this.f7671a = false;
            if (t.this.q()) {
                t.this.n();
            }
            if (t.this.f7674d == null) {
                return true;
            }
            t.this.f7674d.release();
            t.this.f7674d = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
            AbstractC0525b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (t.this.q()) {
                t.this.l(i3, i4);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public t(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i3, int i4) {
        if (this.f7673c == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC0525b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
        this.f7673c.q(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f7673c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f7674d;
        if (surface != null) {
            surface.release();
            this.f7674d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f7674d = surface2;
        this.f7673c.o(surface2, this.f7672b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f7673c;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.p();
        Surface surface = this.f7674d;
        if (surface != null) {
            surface.release();
            this.f7674d = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f7675e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return (this.f7673c == null || this.f7672b) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f7673c == null) {
            AbstractC0525b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC0525b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        this.f7673c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        if (this.f7673c == null) {
            AbstractC0525b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            AbstractC0525b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f7672b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC0525b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f7673c != null) {
            AbstractC0525b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f7673c.p();
        }
        this.f7673c = flutterRenderer;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
        if (this.f7673c == null) {
            AbstractC0525b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f7672b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f7673c;
    }

    boolean p() {
        return this.f7671a;
    }

    public void setRenderSurface(Surface surface) {
        this.f7674d = surface;
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7671a = false;
        this.f7672b = false;
        this.f7675e = new a();
        o();
    }
}
