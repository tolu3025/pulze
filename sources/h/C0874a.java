package h;

import android.os.Bundle;

/* JADX INFO: renamed from: h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f7388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7390d;

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public static final class C0128a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f7391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f7392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f7393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f7394d;

        public C0874a a() {
            return new C0874a(this.f7391a, this.f7392b, this.f7393c, this.f7394d);
        }
    }

    C0874a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f7387a = num;
        this.f7388b = num2;
        this.f7389c = num3;
        this.f7390d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f7387a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f7388b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f7389c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f7390d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
