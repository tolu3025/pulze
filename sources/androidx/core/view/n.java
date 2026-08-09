package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f3934b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f3935a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f3936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f3937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f3938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f3939d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3936a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3937b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3938c = declaredField3;
                declaredField3.setAccessible(true);
                f3939d = true;
            } catch (ReflectiveOperationException e3) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
            }
        }

        public static n a(View view) {
            if (f3939d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3936a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3937b.get(obj);
                        Rect rect2 = (Rect) f3938c.get(obj);
                        if (rect != null && rect2 != null) {
                            n nVarA = new b().b(androidx.core.graphics.e.c(rect)).c(androidx.core.graphics.e.c(rect2)).a();
                            nVarA.j(nVarA);
                            nVarA.d(view.getRootView());
                            return nVarA;
                        }
                    }
                } catch (IllegalAccessException e3) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f3940a;

        public b() {
            int i3 = Build.VERSION.SDK_INT;
            this.f3940a = i3 >= 30 ? new e() : i3 >= 29 ? new d() : new c();
        }

        public n a() {
            return this.f3940a.b();
        }

        public b b(androidx.core.graphics.e eVar) {
            this.f3940a.d(eVar);
            return this;
        }

        public b c(androidx.core.graphics.e eVar) {
            this.f3940a.f(eVar);
            return this;
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f3941e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f3942f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor f3943g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3944h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f3945c = h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e f3946d;

        c() {
        }

        private static WindowInsets h() {
            if (!f3942f) {
                try {
                    f3941e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
                }
                f3942f = true;
            }
            Field field = f3941e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
                }
            }
            if (!f3944h) {
                try {
                    f3943g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
                }
                f3944h = true;
            }
            Constructor constructor = f3943g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
                }
            }
            return null;
        }

        @Override // androidx.core.view.n.f
        n b() {
            a();
            n nVarM = n.m(this.f3945c);
            nVarM.h(this.f3949b);
            nVarM.k(this.f3946d);
            return nVarM;
        }

        @Override // androidx.core.view.n.f
        void d(androidx.core.graphics.e eVar) {
            this.f3946d = eVar;
        }

        @Override // androidx.core.view.n.f
        void f(androidx.core.graphics.e eVar) {
            WindowInsets windowInsets = this.f3945c;
            if (windowInsets != null) {
                this.f3945c = windowInsets.replaceSystemWindowInsets(eVar.f3883a, eVar.f3884b, eVar.f3885c, eVar.f3886d);
            }
        }
    }

    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f3947c = u.a();

        d() {
        }

        @Override // androidx.core.view.n.f
        n b() {
            a();
            n nVarM = n.m(this.f3947c.build());
            nVarM.h(this.f3949b);
            return nVarM;
        }

        @Override // androidx.core.view.n.f
        void c(androidx.core.graphics.e eVar) {
            this.f3947c.setMandatorySystemGestureInsets(eVar.e());
        }

        @Override // androidx.core.view.n.f
        void d(androidx.core.graphics.e eVar) {
            this.f3947c.setStableInsets(eVar.e());
        }

        @Override // androidx.core.view.n.f
        void e(androidx.core.graphics.e eVar) {
            this.f3947c.setSystemGestureInsets(eVar.e());
        }

        @Override // androidx.core.view.n.f
        void f(androidx.core.graphics.e eVar) {
            this.f3947c.setSystemWindowInsets(eVar.e());
        }

        @Override // androidx.core.view.n.f
        void g(androidx.core.graphics.e eVar) {
            this.f3947c.setTappableElementInsets(eVar.e());
        }
    }

    private static class e extends d {
        e() {
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f3948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.e[] f3949b;

        f() {
            this(new n((n) null));
        }

        protected final void a() {
            androidx.core.graphics.e[] eVarArr = this.f3949b;
            if (eVarArr != null) {
                androidx.core.graphics.e eVarF = eVarArr[m.a(1)];
                androidx.core.graphics.e eVarF2 = this.f3949b[m.a(2)];
                if (eVarF2 == null) {
                    eVarF2 = this.f3948a.f(2);
                }
                if (eVarF == null) {
                    eVarF = this.f3948a.f(1);
                }
                f(androidx.core.graphics.e.a(eVarF, eVarF2));
                androidx.core.graphics.e eVar = this.f3949b[m.a(16)];
                if (eVar != null) {
                    e(eVar);
                }
                androidx.core.graphics.e eVar2 = this.f3949b[m.a(32)];
                if (eVar2 != null) {
                    c(eVar2);
                }
                androidx.core.graphics.e eVar3 = this.f3949b[m.a(64)];
                if (eVar3 != null) {
                    g(eVar3);
                }
            }
        }

        abstract n b();

        void c(androidx.core.graphics.e eVar) {
        }

        abstract void d(androidx.core.graphics.e eVar);

        void e(androidx.core.graphics.e eVar) {
        }

        abstract void f(androidx.core.graphics.e eVar);

        void g(androidx.core.graphics.e eVar) {
        }

        f(n nVar) {
            this.f3948a = nVar;
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3950h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f3951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class f3952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f3953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f3954l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f3955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e[] f3956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.e f3957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private n f3958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.e f3959g;

        g(n nVar, WindowInsets windowInsets) {
            super(nVar);
            this.f3957e = null;
            this.f3955c = windowInsets;
        }

        private androidx.core.graphics.e s(int i3, boolean z2) {
            androidx.core.graphics.e eVarA = androidx.core.graphics.e.f3882e;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    eVarA = androidx.core.graphics.e.a(eVarA, t(i4, z2));
                }
            }
            return eVarA;
        }

        private androidx.core.graphics.e u() {
            n nVar = this.f3958f;
            return nVar != null ? nVar.g() : androidx.core.graphics.e.f3882e;
        }

        private androidx.core.graphics.e v(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3950h) {
                w();
            }
            Method method = f3951i;
            if (method != null && f3952j != null && f3953k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3953k.get(f3954l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.e.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
                }
            }
            return null;
        }

        private static void w() {
            try {
                f3951i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3952j = cls;
                f3953k = cls.getDeclaredField("mVisibleInsets");
                f3954l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3953k.setAccessible(true);
                f3954l.setAccessible(true);
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
            f3950h = true;
        }

        @Override // androidx.core.view.n.l
        void d(View view) {
            androidx.core.graphics.e eVarV = v(view);
            if (eVarV == null) {
                eVarV = androidx.core.graphics.e.f3882e;
            }
            p(eVarV);
        }

        @Override // androidx.core.view.n.l
        void e(n nVar) {
            nVar.j(this.f3958f);
            nVar.i(this.f3959g);
        }

        @Override // androidx.core.view.n.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3959g, ((g) obj).f3959g);
            }
            return false;
        }

        @Override // androidx.core.view.n.l
        public androidx.core.graphics.e g(int i3) {
            return s(i3, false);
        }

        @Override // androidx.core.view.n.l
        final androidx.core.graphics.e k() {
            if (this.f3957e == null) {
                this.f3957e = androidx.core.graphics.e.b(this.f3955c.getSystemWindowInsetLeft(), this.f3955c.getSystemWindowInsetTop(), this.f3955c.getSystemWindowInsetRight(), this.f3955c.getSystemWindowInsetBottom());
            }
            return this.f3957e;
        }

        @Override // androidx.core.view.n.l
        boolean n() {
            return this.f3955c.isRound();
        }

        @Override // androidx.core.view.n.l
        public void o(androidx.core.graphics.e[] eVarArr) {
            this.f3956d = eVarArr;
        }

        @Override // androidx.core.view.n.l
        void p(androidx.core.graphics.e eVar) {
            this.f3959g = eVar;
        }

        @Override // androidx.core.view.n.l
        void q(n nVar) {
            this.f3958f = nVar;
        }

        protected androidx.core.graphics.e t(int i3, boolean z2) {
            androidx.core.graphics.e eVarG;
            int i4;
            if (i3 == 1) {
                return z2 ? androidx.core.graphics.e.b(0, Math.max(u().f3884b, k().f3884b), 0, 0) : androidx.core.graphics.e.b(0, k().f3884b, 0, 0);
            }
            if (i3 == 2) {
                if (z2) {
                    androidx.core.graphics.e eVarU = u();
                    androidx.core.graphics.e eVarI = i();
                    return androidx.core.graphics.e.b(Math.max(eVarU.f3883a, eVarI.f3883a), 0, Math.max(eVarU.f3885c, eVarI.f3885c), Math.max(eVarU.f3886d, eVarI.f3886d));
                }
                androidx.core.graphics.e eVarK = k();
                n nVar = this.f3958f;
                eVarG = nVar != null ? nVar.g() : null;
                int iMin = eVarK.f3886d;
                if (eVarG != null) {
                    iMin = Math.min(iMin, eVarG.f3886d);
                }
                return androidx.core.graphics.e.b(eVarK.f3883a, 0, eVarK.f3885c, iMin);
            }
            if (i3 != 8) {
                if (i3 == 16) {
                    return j();
                }
                if (i3 == 32) {
                    return h();
                }
                if (i3 == 64) {
                    return l();
                }
                if (i3 != 128) {
                    return androidx.core.graphics.e.f3882e;
                }
                n nVar2 = this.f3958f;
                C0475b c0475bE = nVar2 != null ? nVar2.e() : f();
                return c0475bE != null ? androidx.core.graphics.e.b(c0475bE.b(), c0475bE.d(), c0475bE.c(), c0475bE.a()) : androidx.core.graphics.e.f3882e;
            }
            androidx.core.graphics.e[] eVarArr = this.f3956d;
            eVarG = eVarArr != null ? eVarArr[m.a(8)] : null;
            if (eVarG != null) {
                return eVarG;
            }
            androidx.core.graphics.e eVarK2 = k();
            androidx.core.graphics.e eVarU2 = u();
            int i5 = eVarK2.f3886d;
            if (i5 > eVarU2.f3886d) {
                return androidx.core.graphics.e.b(0, 0, 0, i5);
            }
            androidx.core.graphics.e eVar = this.f3959g;
            return (eVar == null || eVar.equals(androidx.core.graphics.e.f3882e) || (i4 = this.f3959g.f3886d) <= eVarU2.f3886d) ? androidx.core.graphics.e.f3882e : androidx.core.graphics.e.b(0, 0, 0, i4);
        }

        g(n nVar, g gVar) {
            this(nVar, new WindowInsets(gVar.f3955c));
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.e f3960m;

        h(n nVar, WindowInsets windowInsets) {
            super(nVar, windowInsets);
            this.f3960m = null;
        }

        @Override // androidx.core.view.n.l
        n b() {
            return n.m(this.f3955c.consumeStableInsets());
        }

        @Override // androidx.core.view.n.l
        n c() {
            return n.m(this.f3955c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.n.l
        final androidx.core.graphics.e i() {
            if (this.f3960m == null) {
                this.f3960m = androidx.core.graphics.e.b(this.f3955c.getStableInsetLeft(), this.f3955c.getStableInsetTop(), this.f3955c.getStableInsetRight(), this.f3955c.getStableInsetBottom());
            }
            return this.f3960m;
        }

        @Override // androidx.core.view.n.l
        boolean m() {
            return this.f3955c.isConsumed();
        }

        @Override // androidx.core.view.n.l
        public void r(androidx.core.graphics.e eVar) {
            this.f3960m = eVar;
        }

        h(n nVar, h hVar) {
            super(nVar, hVar);
            this.f3960m = null;
            this.f3960m = hVar.f3960m;
        }
    }

    private static class i extends h {
        i(n nVar, WindowInsets windowInsets) {
            super(nVar, windowInsets);
        }

        @Override // androidx.core.view.n.l
        n a() {
            return n.m(this.f3955c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.n.g, androidx.core.view.n.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f3955c, iVar.f3955c) && Objects.equals(this.f3959g, iVar.f3959g);
        }

        @Override // androidx.core.view.n.l
        C0475b f() {
            return C0475b.e(this.f3955c.getDisplayCutout());
        }

        @Override // androidx.core.view.n.l
        public int hashCode() {
            return this.f3955c.hashCode();
        }

        i(n nVar, i iVar) {
            super(nVar, iVar);
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.e f3961n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.e f3962o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.e f3963p;

        j(n nVar, WindowInsets windowInsets) {
            super(nVar, windowInsets);
            this.f3961n = null;
            this.f3962o = null;
            this.f3963p = null;
        }

        @Override // androidx.core.view.n.l
        androidx.core.graphics.e h() {
            if (this.f3962o == null) {
                this.f3962o = androidx.core.graphics.e.d(this.f3955c.getMandatorySystemGestureInsets());
            }
            return this.f3962o;
        }

        @Override // androidx.core.view.n.l
        androidx.core.graphics.e j() {
            if (this.f3961n == null) {
                this.f3961n = androidx.core.graphics.e.d(this.f3955c.getSystemGestureInsets());
            }
            return this.f3961n;
        }

        @Override // androidx.core.view.n.l
        androidx.core.graphics.e l() {
            if (this.f3963p == null) {
                this.f3963p = androidx.core.graphics.e.d(this.f3955c.getTappableElementInsets());
            }
            return this.f3963p;
        }

        @Override // androidx.core.view.n.h, androidx.core.view.n.l
        public void r(androidx.core.graphics.e eVar) {
        }

        j(n nVar, j jVar) {
            super(nVar, jVar);
            this.f3961n = null;
            this.f3962o = null;
            this.f3963p = null;
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final n f3964q = n.m(WindowInsets.CONSUMED);

        k(n nVar, WindowInsets windowInsets) {
            super(nVar, windowInsets);
        }

        @Override // androidx.core.view.n.g, androidx.core.view.n.l
        final void d(View view) {
        }

        @Override // androidx.core.view.n.g, androidx.core.view.n.l
        public androidx.core.graphics.e g(int i3) {
            return androidx.core.graphics.e.d(this.f3955c.getInsets(C0084n.a(i3)));
        }

        k(n nVar, k kVar) {
            super(nVar, kVar);
        }
    }

    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final n f3965b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n f3966a;

        l(n nVar) {
            this.f3966a = nVar;
        }

        n a() {
            return this.f3966a;
        }

        n b() {
            return this.f3966a;
        }

        n c() {
            return this.f3966a;
        }

        void d(View view) {
        }

        void e(n nVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return n() == lVar.n() && m() == lVar.m() && j.d.a(k(), lVar.k()) && j.d.a(i(), lVar.i()) && j.d.a(f(), lVar.f());
        }

        C0475b f() {
            return null;
        }

        androidx.core.graphics.e g(int i3) {
            return androidx.core.graphics.e.f3882e;
        }

        androidx.core.graphics.e h() {
            return k();
        }

        public int hashCode() {
            return j.d.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        androidx.core.graphics.e i() {
            return androidx.core.graphics.e.f3882e;
        }

        androidx.core.graphics.e j() {
            return k();
        }

        androidx.core.graphics.e k() {
            return androidx.core.graphics.e.f3882e;
        }

        androidx.core.graphics.e l() {
            return k();
        }

        boolean m() {
            return false;
        }

        boolean n() {
            return false;
        }

        public void o(androidx.core.graphics.e[] eVarArr) {
        }

        void p(androidx.core.graphics.e eVar) {
        }

        void q(n nVar) {
        }

        public void r(androidx.core.graphics.e eVar) {
        }
    }

    public static final class m {
        static int a(int i3) {
            if (i3 == 1) {
                return 0;
            }
            if (i3 == 2) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            if (i3 == 8) {
                return 3;
            }
            if (i3 == 16) {
                return 4;
            }
            if (i3 == 32) {
                return 5;
            }
            if (i3 == 64) {
                return 6;
            }
            if (i3 == 128) {
                return 7;
            }
            if (i3 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.n$n, reason: collision with other inner class name */
    private static final class C0084n {
        static int a(int i3) {
            int iStatusBars;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i3 & i5) != 0) {
                    if (i5 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i4 |= iStatusBars;
                }
            }
            return i4;
        }
    }

    static {
        f3934b = Build.VERSION.SDK_INT >= 30 ? k.f3964q : l.f3965b;
    }

    private n(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        this.f3935a = i3 >= 30 ? new k(this, windowInsets) : i3 >= 29 ? new j(this, windowInsets) : i3 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public static n m(WindowInsets windowInsets) {
        return n(windowInsets, null);
    }

    public static n n(WindowInsets windowInsets, View view) {
        n nVar = new n((WindowInsets) j.e.b(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            nVar.j(AbstractC0484k.d(view));
            nVar.d(view.getRootView());
        }
        return nVar;
    }

    public n a() {
        return this.f3935a.a();
    }

    public n b() {
        return this.f3935a.b();
    }

    public n c() {
        return this.f3935a.c();
    }

    void d(View view) {
        this.f3935a.d(view);
    }

    public C0475b e() {
        return this.f3935a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return j.d.a(this.f3935a, ((n) obj).f3935a);
        }
        return false;
    }

    public androidx.core.graphics.e f(int i3) {
        return this.f3935a.g(i3);
    }

    public androidx.core.graphics.e g() {
        return this.f3935a.i();
    }

    void h(androidx.core.graphics.e[] eVarArr) {
        this.f3935a.o(eVarArr);
    }

    public int hashCode() {
        l lVar = this.f3935a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    void i(androidx.core.graphics.e eVar) {
        this.f3935a.p(eVar);
    }

    void j(n nVar) {
        this.f3935a.q(nVar);
    }

    void k(androidx.core.graphics.e eVar) {
        this.f3935a.r(eVar);
    }

    public WindowInsets l() {
        l lVar = this.f3935a;
        if (lVar instanceof g) {
            return ((g) lVar).f3955c;
        }
        return null;
    }

    public n(n nVar) {
        if (nVar == null) {
            this.f3935a = new l(this);
            return;
        }
        l lVar = nVar.f3935a;
        int i3 = Build.VERSION.SDK_INT;
        this.f3935a = (i3 < 30 || !(lVar instanceof k)) ? (i3 < 29 || !(lVar instanceof j)) ? (i3 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }
}
