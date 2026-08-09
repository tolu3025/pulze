package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import b1.AbstractC0525b;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
abstract class x implements WindowManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WindowManager f7924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    s f7925b;

    x(WindowManager windowManager, s sVar) {
        this.f7924a = windowManager;
        this.f7925b = sVar;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f7924a.addCrossWindowBlurEnabledListener(executor, consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f7925b;
        if (sVar == null) {
            AbstractC0525b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            sVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        return this.f7924a.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.f7924a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        return this.f7924a.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f7924a.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f7924a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        s sVar = this.f7925b;
        if (sVar == null) {
            AbstractC0525b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            sVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.f7925b == null) {
            AbstractC0525b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f7925b.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f7925b;
        if (sVar == null) {
            AbstractC0525b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            sVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f7924a.addCrossWindowBlurEnabledListener(consumer);
    }
}
