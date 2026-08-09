package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final Rect getBounds(WindowMetrics windowMetrics) {
            m.e(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            m.d(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean checkParentMetrics(WindowMetrics parentMetrics) {
        m.e(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(parentMetrics);
        return (this.minWidth == 0 || bounds.width() >= this.minWidth) && (this.minSmallestWidth == 0 || Math.min(bounds.width(), bounds.height()) >= this.minSmallestWidth);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        return this.minWidth == splitRule.minWidth && this.minSmallestWidth == splitRule.minSmallestWidth && this.splitRatio == splitRule.splitRatio && this.layoutDirection == splitRule.layoutDirection;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public SplitRule(int i3, int i4, float f3, int i5) {
        this.minWidth = i3;
        this.minSmallestWidth = i4;
        this.splitRatio = f3;
        this.layoutDirection = i5;
    }

    public /* synthetic */ SplitRule(int i3, int i4, float f3, int i5, int i6, kotlin.jvm.internal.h hVar) {
        this((i6 & 1) != 0 ? 0 : i3, (i6 & 2) != 0 ? 0 : i4, (i6 & 4) != 0 ? 0.5f : f3, (i6 & 8) != 0 ? 3 : i5);
    }
}
