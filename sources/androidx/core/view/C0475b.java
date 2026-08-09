package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0475b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f3906a;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0475b(DisplayCutout displayCutout) {
        this.f3906a = displayCutout;
    }

    static C0475b e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0475b(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f3906a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f3906a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f3906a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f3906a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0475b.class != obj.getClass()) {
            return false;
        }
        return j.d.a(this.f3906a, ((C0475b) obj).f3906a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3906a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3906a + "}";
    }
}
