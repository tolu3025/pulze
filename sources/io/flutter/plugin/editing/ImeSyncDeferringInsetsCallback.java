package io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private WindowInsets lastWindowInsets;
    private View view;
    private final int deferredInsetTypes = WindowInsets.Type.ime();
    private boolean animating = false;
    private boolean needsSave = false;
    private AnimationCallback animationCallback = new AnimationCallback();
    private b insetsListener = new b();

    private class AnimationCallback extends WindowInsetsAnimation$Callback {
        AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (!ImeSyncDeferringInsetsCallback.this.animating || (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) {
                return;
            }
            ImeSyncDeferringInsetsCallback.this.animating = false;
            if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null) {
                return;
            }
            ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if ((AbstractC0924d.a(it.next()).getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                int i3 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : 0;
                h.a();
                WindowInsets.Builder builderA = g.a(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                builderA.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i3, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builderA.build());
            }
            return windowInsets;
        }
    }

    private class b implements View.OnApplyWindowInsetsListener {
        private b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    ImeSyncDeferringInsetsCallback(View view) {
        this.view = view;
    }

    WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
