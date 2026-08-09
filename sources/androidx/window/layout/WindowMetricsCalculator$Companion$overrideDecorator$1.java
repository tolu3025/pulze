package androidx.window.layout;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends kotlin.jvm.internal.k implements U1.l {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // U1.l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator p02) {
        kotlin.jvm.internal.m.e(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
