package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: androidx.core.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0481h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f3914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f3915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f3916c;

    private ViewTreeObserverOnPreDrawListenerC0481h(View view, Runnable runnable) {
        this.f3914a = view;
        this.f3915b = view.getViewTreeObserver();
        this.f3916c = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC0481h a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0481h viewTreeObserverOnPreDrawListenerC0481h = new ViewTreeObserverOnPreDrawListenerC0481h(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0481h);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0481h);
        return viewTreeObserverOnPreDrawListenerC0481h;
    }

    public void b() {
        (this.f3915b.isAlive() ? this.f3915b : this.f3914a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3914a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3916c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3915b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
