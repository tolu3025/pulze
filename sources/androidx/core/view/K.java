package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f3898a;

    private static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f3899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0482i f3900b;

        a(Window window, C0482i c0482i) {
            this.f3899a = window;
            this.f3900b = c0482i;
        }

        protected void c(int i3) {
            View decorView = this.f3899a.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        protected void d(int i3) {
            this.f3899a.addFlags(i3);
        }

        protected void e(int i3) {
            View decorView = this.f3899a.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        protected void f(int i3) {
            this.f3899a.clearFlags(i3);
        }
    }

    private static class b extends a {
        b(Window window, C0482i c0482i) {
            super(window, c0482i);
        }

        @Override // androidx.core.view.K.e
        public void b(boolean z2) {
            if (!z2) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, C0482i c0482i) {
            super(window, c0482i);
        }

        @Override // androidx.core.view.K.e
        public void a(boolean z2) {
            if (!z2) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f3901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f3902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C0482i f3903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.f f3904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f3905e;

        d(Window window, K k3, C0482i c0482i) {
            this(window.getInsetsController(), k3, c0482i);
            this.f3905e = window;
        }

        @Override // androidx.core.view.K.e
        public void a(boolean z2) {
            if (z2) {
                if (this.f3905e != null) {
                    c(16);
                }
                this.f3902b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3905e != null) {
                    d(16);
                }
                this.f3902b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.K.e
        public void b(boolean z2) {
            if (z2) {
                if (this.f3905e != null) {
                    c(8192);
                }
                this.f3902b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3905e != null) {
                    d(8192);
                }
                this.f3902b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i3) {
            View decorView = this.f3905e.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        protected void d(int i3) {
            View decorView = this.f3905e.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, K k3, C0482i c0482i) {
            this.f3904d = new androidx.collection.f();
            this.f3902b = windowInsetsController;
            this.f3901a = k3;
            this.f3903c = c0482i;
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z2) {
        }

        public abstract void b(boolean z2);
    }

    public K(Window window, View view) {
        C0482i c0482i = new C0482i(view);
        int i3 = Build.VERSION.SDK_INT;
        this.f3898a = i3 >= 30 ? new d(window, this, c0482i) : i3 >= 26 ? new c(window, c0482i) : new b(window, c0482i);
    }

    public void a(boolean z2) {
        this.f3898a.a(z2);
    }

    public void b(boolean z2) {
        this.f3898a.b(z2);
    }
}
