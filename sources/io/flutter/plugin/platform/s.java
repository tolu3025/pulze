package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class s extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f7922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f7923b;

    public s(Context context) {
        super(context);
        this.f7922a = new Rect();
        this.f7923b = new Rect();
    }

    private static int a(int i3) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f7922a.set(i3, i4, i5, i6);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f7922a, layoutParams.x, layoutParams.y, this.f7923b);
            Rect rect = this.f7923b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).measure(a(i3), a(i4));
        }
        super.onMeasure(i3, i4);
    }
}
