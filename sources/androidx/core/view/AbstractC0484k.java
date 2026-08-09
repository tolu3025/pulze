package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.n;
import c.AbstractC0527b;
import i.AbstractC0900a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k.AbstractC0986a;

/* JADX INFO: renamed from: androidx.core.view.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0484k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f3920a = {AbstractC0900a.f7492a, AbstractC0900a.f7493b, AbstractC0900a.f7504m, AbstractC0900a.f7515x, AbstractC0900a.f7481A, AbstractC0900a.f7482B, AbstractC0900a.f7483C, AbstractC0900a.f7484D, AbstractC0900a.f7485E, AbstractC0900a.f7486F, AbstractC0900a.f7494c, AbstractC0900a.f7495d, AbstractC0900a.f7496e, AbstractC0900a.f7497f, AbstractC0900a.f7498g, AbstractC0900a.f7499h, AbstractC0900a.f7500i, AbstractC0900a.f7501j, AbstractC0900a.f7502k, AbstractC0900a.f7503l, AbstractC0900a.f7505n, AbstractC0900a.f7506o, AbstractC0900a.f7507p, AbstractC0900a.f7508q, AbstractC0900a.f7509r, AbstractC0900a.f7510s, AbstractC0900a.f7511t, AbstractC0900a.f7512u, AbstractC0900a.f7513v, AbstractC0900a.f7514w, AbstractC0900a.f7516y, AbstractC0900a.f7517z};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC0480g f3921b = new InterfaceC0480g() { // from class: androidx.core.view.j
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f3922c = new b();

    /* JADX INFO: renamed from: androidx.core.view.k$a */
    class a extends c {
        a(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC0484k.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return f.b(view);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$b */
    static class b implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap f3923a = new WeakHashMap();

        b() {
        }

        private void a(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z2) {
                AbstractC0484k.f(view, z2 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f3923a.entrySet().iterator();
                while (it.hasNext()) {
                    a((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$c */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f3925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3927d;

        c(int i3, Class cls, int i4, int i5) {
            this.f3924a = i3;
            this.f3925b = cls;
            this.f3927d = i4;
            this.f3926c = i5;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= this.f3926c;
        }

        abstract Object b(View view);

        Object c(View view) {
            if (a()) {
                return b(view);
            }
            Object tag = view.getTag(this.f3924a);
            if (this.f3925b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$d */
    private static class d {

        /* JADX INFO: renamed from: androidx.core.view.k$d$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            n f3928a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f3929b;

            a(View view, InterfaceC0479f interfaceC0479f) {
                this.f3929b = view;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n nVarN = n.n(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    d.a(windowInsets, this.f3929b);
                    if (nVarN.equals(this.f3928a)) {
                        throw null;
                    }
                }
                this.f3928a = nVarN;
                throw null;
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC0900a.f7491K);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static n b(View view, n nVar, Rect rect) {
            WindowInsets windowInsetsL = nVar.l();
            if (windowInsetsL != null) {
                return n.n(view.computeSystemWindowInsets(windowInsetsL, rect), view);
            }
            rect.setEmpty();
            return nVar;
        }

        static boolean c(View view, float f3, float f4, boolean z2) {
            return view.dispatchNestedFling(f3, f4, z2);
        }

        static boolean d(View view, float f3, float f4) {
            return view.dispatchNestedPreFling(f3, f4);
        }

        static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
        }

        static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
            return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static n j(View view) {
            return n.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f3) {
            view.setElevation(f3);
        }

        static void t(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        static void u(View view, InterfaceC0479f interfaceC0479f) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC0900a.f7488H, interfaceC0479f);
            }
            if (interfaceC0479f == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC0900a.f7491K));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0479f));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f3) {
            view.setTranslationZ(f3);
        }

        static void x(View view, float f3) {
            view.setZ(f3);
        }

        static boolean y(View view, int i3) {
            return view.startNestedScroll(i3);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$e */
    private static class e {
        public static n a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n nVarM = n.m(rootWindowInsets);
            nVarM.j(nVarM);
            nVarM.d(view.getRootView());
            return nVarM;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i3) {
            view.setScrollIndicators(i3);
        }

        static void d(View view, int i3, int i4) {
            view.setScrollIndicators(i3, i4);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$f */
    static class f {
        static void a(View view, final g gVar) {
            androidx.collection.f fVar = (androidx.collection.f) view.getTag(AbstractC0900a.f7490J);
            if (fVar == null) {
                fVar = new androidx.collection.f();
                view.setTag(AbstractC0900a.f7490J, fVar);
            }
            Objects.requireNonNull(gVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(gVar) { // from class: androidx.core.view.l
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            fVar.put(gVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, g gVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.f fVar = (androidx.collection.f) view.getTag(AbstractC0900a.f7490J);
            if (fVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) fVar.get(gVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i3) {
            return (T) view.requireViewById(i3);
        }

        static void g(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AbstractC0986a abstractC0986a) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$g */
    public interface g {
    }

    /* JADX INFO: renamed from: androidx.core.view.k$h */
    static class h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f3930d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f3931a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f3932b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f3933c = null;

        h() {
        }

        static h a(View view) {
            h hVar = (h) view.getTag(AbstractC0900a.f7489I);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(AbstractC0900a.f7489I, hVar2);
            return hVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f3931a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f3932b == null) {
                this.f3932b = new SparseArray();
            }
            return this.f3932b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC0900a.f7490J);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC0527b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f3931a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f3930d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f3931a == null) {
                        this.f3931a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f3930d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3931a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3931a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f3933c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f3933c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).b(view, keyEvent);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).f(keyEvent);
    }

    public static CharSequence c(View view) {
        return (CharSequence) g().c(view);
    }

    public static n d(View view) {
        return e.a(view);
    }

    public static String e(View view) {
        return d.k(view);
    }

    static void f(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = c(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z2) {
                    accessibilityEventObtain.getText().add(c(view));
                    h(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i3 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i3);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(c(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e3);
                }
            }
        }
    }

    private static c g() {
        return new a(AbstractC0900a.f7487G, CharSequence.class, 8, 28);
    }

    private static void h(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void i(View view, String str) {
        d.v(view, str);
    }
}
