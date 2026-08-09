package androidx.window.layout;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        kotlin.jvm.internal.m.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        kotlin.jvm.internal.m.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        kotlin.jvm.internal.m.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        kotlin.jvm.internal.m.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
