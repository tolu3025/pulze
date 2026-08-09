package androidx.core.view;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3917a;

    /* JADX INFO: renamed from: androidx.core.view.i$a */
    private static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3918a;

        a(View view) {
            this.f3918a = view;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.i$b */
    private static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f3919b;

        b(View view) {
            super(view);
            this.f3919b = view;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.i$c */
    private static class c {
        c() {
        }
    }

    public C0482i(View view) {
        this.f3917a = Build.VERSION.SDK_INT >= 30 ? new b(view) : new a(view);
    }
}
