package androidx.window.layout;

import J1.x;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(List<? extends DisplayFeature> displayFeatures) {
        kotlin.jvm.internal.m.e(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.m.a(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return x.G(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
