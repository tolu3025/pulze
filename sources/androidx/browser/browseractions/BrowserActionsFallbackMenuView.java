package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import g.AbstractC0869a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3700b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3699a = getResources().getDimensionPixelOffset(AbstractC0869a.f7318b);
        this.f3700b = getResources().getDimensionPixelOffset(AbstractC0869a.f7317a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3699a * 2), this.f3700b), 1073741824), i4);
    }
}
