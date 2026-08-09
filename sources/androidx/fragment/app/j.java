package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0481h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import c.AbstractC0527b;
import j.AbstractC0981b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static boolean f4517M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final Interpolator f4518N = new DecelerateInterpolator(2.5f);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final Interpolator f4519O = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f4520A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f4521B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f4522C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f4523D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ArrayList f4524E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    ArrayList f4525F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ArrayList f4526G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    ArrayList f4529J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private androidx.fragment.app.l f4530K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f4532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f4533d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f4537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f4538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private OnBackPressedDispatcher f4539o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f4541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f4542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f4543s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.fragment.app.h f4546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    androidx.fragment.app.e f4547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Fragment f4548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Fragment f4549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f4550z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4534e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ArrayList f4535f = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final HashMap f4536l = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.activity.p f4540p = new a(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList f4544t = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f4545u = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    Bundle f4527H = null;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    SparseArray f4528I = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    Runnable f4531L = new b();

    class a extends androidx.activity.p {
        a(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.p
        public void d() {
            j.this.B0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.l0();
        }
    }

    class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4554b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f4554b.o() != null) {
                    c.this.f4554b.f1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f4554b;
                    jVar.R0(fragment, fragment.J(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f4553a = viewGroup;
            this.f4554b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4553a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f4559c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4557a = viewGroup;
            this.f4558b = view;
            this.f4559c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4557a.endViewTransition(this.f4558b);
            Animator animatorP = this.f4559c.p();
            this.f4559c.g1(null);
            if (animatorP == null || this.f4557a.indexOfChild(this.f4558b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f4559c;
            jVar.R0(fragment, fragment.J(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f4563c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4561a = viewGroup;
            this.f4562b = view;
            this.f4563c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4561a.endViewTransition(this.f4562b);
            animator.removeListener(this);
            Fragment fragment = this.f4563c;
            View view = fragment.f4408L;
            if (view == null || !fragment.f4400D) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.f4546v;
            return hVar.b(hVar.g(), str, null);
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f4566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f4567b;

        g(Animator animator) {
            this.f4566a = null;
            this.f4567b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f4566a = animation;
            this.f4567b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f4568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f4569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4572e;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4572e = true;
            this.f4568a = viewGroup;
            this.f4569b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation) {
            this.f4572e = true;
            if (this.f4570c) {
                return !this.f4571d;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f4570c = true;
                ViewTreeObserverOnPreDrawListenerC0481h.a(this.f4568a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4570c || !this.f4572e) {
                this.f4568a.endViewTransition(this.f4569b);
                this.f4571d = true;
            } else {
                this.f4572e = false;
                this.f4568a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation, float f3) {
            this.f4572e = true;
            if (this.f4570c) {
                return !this.f4571d;
            }
            if (!super.getTransformation(j3, transformation, f3)) {
                this.f4570c = true;
                ViewTreeObserverOnPreDrawListenerC0481h.a(this.f4568a, this);
            }
            return true;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f4573a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    interface InterfaceC0090j {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class k implements InterfaceC0090j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f4574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4576c;

        k(String str, int i3, int i4) {
            this.f4574a = str;
            this.f4575b = i3;
            this.f4576c = i4;
        }

        @Override // androidx.fragment.app.j.InterfaceC0090j
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = j.this.f4549y;
            if (fragment == null || this.f4575b >= 0 || this.f4574a != null || !fragment.q().h()) {
                return j.this.V0(arrayList, arrayList2, this.f4574a, this.f4575b, this.f4576c);
            }
            return false;
        }
    }

    static class l implements Fragment.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f4578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f4579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4580c;

        l(androidx.fragment.app.a aVar, boolean z2) {
            this.f4578a = z2;
            this.f4579b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i3 = this.f4580c - 1;
            this.f4580c = i3;
            if (i3 != 0) {
                return;
            }
            this.f4579b.f4467s.h1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f4580c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f4579b;
            aVar.f4467s.v(aVar, this.f4578a, false, false);
        }

        public void d() {
            boolean z2 = this.f4580c > 0;
            j jVar = this.f4579b.f4467s;
            int size = jVar.f4535f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = (Fragment) jVar.f4535f.get(i3);
                fragment.l1(null);
                if (z2 && fragment.R()) {
                    fragment.o1();
                }
            }
            androidx.fragment.app.a aVar = this.f4579b;
            aVar.f4467s.v(aVar, this.f4578a, !z2, true);
        }

        public boolean e() {
            return this.f4580c == 0;
        }
    }

    j() {
    }

    private boolean E0(Fragment fragment) {
        return (fragment.f4404H && fragment.f4405I) || fragment.f4444y.s();
    }

    static g K0(float f3, float f4) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f4519O);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g M0(float f3, float f4, float f5, float f6) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f3, f4, f3, f4, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f4518N);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f5, f6);
        alphaAnimation.setInterpolator(f4519O);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void N0(androidx.collection.b bVar) {
        int size = bVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = (Fragment) bVar.o(i3);
            if (!fragment.f4435p) {
                View viewC1 = fragment.c1();
                fragment.f4416T = viewC1.getAlpha();
                viewC1.setAlpha(0.0f);
            }
        }
    }

    private boolean U0(String str, int i3, int i4) {
        l0();
        j0(true);
        Fragment fragment = this.f4549y;
        if (fragment != null && i3 < 0 && str == null && fragment.q().h()) {
            return true;
        }
        boolean zV0 = V0(this.f4524E, this.f4525F, str, i3, i4);
        if (zV0) {
            this.f4533d = true;
            try {
                Z0(this.f4524E, this.f4525F);
            } finally {
                u();
            }
        }
        p1();
        g0();
        r();
        return zV0;
    }

    private int W0(ArrayList arrayList, ArrayList arrayList2, int i3, int i4, androidx.collection.b bVar) {
        int i5 = i4;
        for (int i6 = i4 - 1; i6 >= i3; i6--) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i6 + 1, i4)) {
                if (this.f4529J == null) {
                    this.f4529J = new ArrayList();
                }
                l lVar = new l(aVar, zBooleanValue);
                this.f4529J.add(lVar);
                aVar.u(lVar);
                if (zBooleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i5--;
                if (i6 != i5) {
                    arrayList.remove(i6);
                    arrayList.add(i5, aVar);
                }
                j(bVar);
            }
        }
        return i5;
    }

    private void X(Fragment fragment) {
        if (fragment == null || this.f4536l.get(fragment.f4429e) != fragment) {
            return;
        }
        fragment.U0();
    }

    private void Z0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        o0(arrayList, arrayList2);
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i3)).f4623q) {
                if (i4 != i3) {
                    n0(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i4)).f4623q) {
                        i4++;
                    }
                }
                n0(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            n0(arrayList, arrayList2, i4, size);
        }
    }

    public static int d1(int i3) {
        if (i3 == 4097) {
            return 8194;
        }
        if (i3 != 4099) {
            return i3 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void e0(int i3) {
        try {
            this.f4533d = true;
            P0(i3, false);
            this.f4533d = false;
            l0();
        } catch (Throwable th) {
            this.f4533d = false;
            throw th;
        }
    }

    private void h0() {
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null) {
                if (fragment.o() != null) {
                    int iJ = fragment.J();
                    View viewO = fragment.o();
                    Animation animation = viewO.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewO.clearAnimation();
                    }
                    fragment.f1(null);
                    R0(fragment, iJ, 0, 0, false);
                } else if (fragment.p() != null) {
                    fragment.p().end();
                }
            }
        }
    }

    private void j(androidx.collection.b bVar) {
        int i3 = this.f4545u;
        if (i3 < 1) {
            return;
        }
        int iMin = Math.min(i3, 3);
        int size = this.f4535f.size();
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = (Fragment) this.f4535f.get(i4);
            if (fragment.f4423a < iMin) {
                R0(fragment, iMin, fragment.z(), fragment.A(), false);
                if (fragment.f4408L != null && !fragment.f4400D && fragment.f4414R) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void j0(boolean z2) {
        if (this.f4533d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4546v == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f4546v.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            t();
        }
        if (this.f4524E == null) {
            this.f4524E = new ArrayList();
            this.f4525F = new ArrayList();
        }
        this.f4533d = true;
        try {
            o0(null, null);
        } finally {
            this.f4533d = false;
        }
    }

    private static void m0(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        while (i3 < i4) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                aVar.h(-1);
                aVar.m(i3 == i4 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            i3++;
        }
    }

    private void n0(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3;
        boolean z2 = ((androidx.fragment.app.a) arrayList.get(i7)).f4623q;
        ArrayList arrayList3 = this.f4526G;
        if (arrayList3 == null) {
            this.f4526G = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f4526G.addAll(this.f4535f);
        Fragment fragmentZ0 = z0();
        boolean z3 = false;
        for (int i8 = i7; i8 < i4; i8++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i8);
            fragmentZ0 = !((Boolean) arrayList2.get(i8)).booleanValue() ? aVar.n(this.f4526G, fragmentZ0) : aVar.v(this.f4526G, fragmentZ0);
            z3 = z3 || aVar.f4614h;
        }
        this.f4526G.clear();
        if (!z2) {
            o.B(this, arrayList, arrayList2, i3, i4, false);
        }
        m0(arrayList, arrayList2, i3, i4);
        if (z2) {
            androidx.collection.b bVar = new androidx.collection.b();
            j(bVar);
            int iW0 = W0(arrayList, arrayList2, i3, i4, bVar);
            N0(bVar);
            i5 = iW0;
        } else {
            i5 = i4;
        }
        if (i5 != i7 && z2) {
            o.B(this, arrayList, arrayList2, i3, i5, true);
            P0(this.f4545u, true);
        }
        while (i7 < i4) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue() && (i6 = aVar2.f4469u) >= 0) {
                t0(i6);
                aVar2.f4469u = -1;
            }
            aVar2.t();
            i7++;
        }
        if (z3) {
            b1();
        }
    }

    private void n1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
        androidx.fragment.app.h hVar = this.f4546v;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private void o(Fragment fragment, g gVar, int i3) {
        View view = fragment.f4408L;
        ViewGroup viewGroup = fragment.f4407K;
        viewGroup.startViewTransition(view);
        fragment.m1(i3);
        if (gVar.f4566a != null) {
            h hVar = new h(gVar.f4566a, viewGroup, view);
            fragment.f1(fragment.f4408L);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.f4408L.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f4567b;
        fragment.g1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.f4408L);
        animator.start();
    }

    private void o0(ArrayList arrayList, ArrayList arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList3 = this.f4529J;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            l lVar = (l) this.f4529J.get(i3);
            if (arrayList == null || lVar.f4578a || (iIndexOf2 = arrayList.indexOf(lVar.f4579b)) == -1 || !((Boolean) arrayList2.get(iIndexOf2)).booleanValue()) {
                if (lVar.e() || (arrayList != null && lVar.f4579b.q(arrayList, 0, arrayList.size()))) {
                    this.f4529J.remove(i3);
                    i3--;
                    size--;
                    if (arrayList == null || lVar.f4578a || (iIndexOf = arrayList.indexOf(lVar.f4579b)) == -1 || !((Boolean) arrayList2.get(iIndexOf)).booleanValue()) {
                        lVar.d();
                    }
                }
                i3++;
            } else {
                this.f4529J.remove(i3);
                i3--;
                size--;
            }
            lVar.c();
            i3++;
        }
    }

    public static int o1(int i3, boolean z2) {
        if (i3 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i3 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i3 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void p1() {
        ArrayList arrayList = this.f4532c;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f4540p.j(v0() > 0 && F0(this.f4548x));
        } else {
            this.f4540p.j(true);
        }
    }

    private void r() {
        this.f4536l.values().removeAll(Collections.singleton(null));
    }

    private Fragment r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f4407K;
        View view = fragment.f4408L;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.f4535f.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = (Fragment) this.f4535f.get(iIndexOf);
                if (fragment2.f4407K == viewGroup && fragment2.f4408L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void s0() {
        if (this.f4529J != null) {
            while (!this.f4529J.isEmpty()) {
                ((l) this.f4529J.remove(0)).d();
            }
        }
    }

    private void t() {
        if (H0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void u() {
        this.f4533d = false;
        this.f4525F.clear();
        this.f4524E.clear();
    }

    private boolean u0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this) {
            try {
                ArrayList arrayList3 = this.f4532c;
                if (arrayList3 != null && arrayList3.size() != 0) {
                    int size = this.f4532c.size();
                    boolean zA = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        zA |= ((InterfaceC0090j) this.f4532c.get(i3)).a(arrayList, arrayList2);
                    }
                    this.f4532c.clear();
                    this.f4546v.h().removeCallbacks(this.f4531L);
                    return zA;
                }
                return false;
            } finally {
            }
        }
    }

    public boolean A(MenuItem menuItem) {
        if (this.f4545u < 1) {
            return false;
        }
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null && fragment.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    C A0(Fragment fragment) {
        return this.f4530K.k(fragment);
    }

    public void B() {
        this.f4520A = false;
        this.f4521B = false;
        e0(1);
    }

    void B0() {
        l0();
        if (this.f4540p.g()) {
            h();
        } else {
            this.f4539o.k();
        }
    }

    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f4545u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null && fragment.H0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f4538n != null) {
            for (int i4 = 0; i4 < this.f4538n.size(); i4++) {
                Fragment fragment2 = (Fragment) this.f4538n.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.h0();
                }
            }
        }
        this.f4538n = arrayList;
        return z2;
    }

    public void C0(Fragment fragment) {
        if (f4517M) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f4400D) {
            return;
        }
        fragment.f4400D = true;
        fragment.f4415S = true ^ fragment.f4415S;
    }

    public void D() {
        this.f4522C = true;
        l0();
        e0(0);
        this.f4546v = null;
        this.f4547w = null;
        this.f4548x = null;
        if (this.f4539o != null) {
            this.f4540p.h();
            this.f4539o = null;
        }
    }

    public boolean D0() {
        return this.f4522C;
    }

    public void E() {
        e0(1);
    }

    public void F() {
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null) {
                fragment.N0();
            }
        }
    }

    boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.f4442w;
        return fragment == jVar.z0() && F0(jVar.f4548x);
    }

    public void G(boolean z2) {
        for (int size = this.f4535f.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4535f.get(size);
            if (fragment != null) {
                fragment.O0(z2);
            }
        }
    }

    boolean G0(int i3) {
        return this.f4545u >= i3;
    }

    void H(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).H(fragment, bundle, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public boolean H0() {
        return this.f4520A || this.f4521B;
    }

    void I(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).I(fragment, context, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: RuntimeException -> 0x006a, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x006a, blocks: (B:24:0x0058, B:26:0x0064), top: B:60:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.j.g I0(androidx.fragment.app.Fragment r5, int r6, boolean r7, int r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.I0(androidx.fragment.app.Fragment, int, boolean, int):androidx.fragment.app.j$g");
    }

    void J(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).J(fragment, bundle, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void J0(Fragment fragment) {
        if (this.f4536l.get(fragment.f4429e) != null) {
            return;
        }
        this.f4536l.put(fragment.f4429e, fragment);
        if (fragment.f4403G) {
            if (fragment.f4402F) {
                m(fragment);
            } else {
                a1(fragment);
            }
            fragment.f4403G = false;
        }
        if (f4517M) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void K(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).K(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void L(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).L(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void L0(Fragment fragment) {
        if (this.f4536l.get(fragment.f4429e) == null) {
            return;
        }
        if (f4517M) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f4536l.values()) {
            if (fragment2 != null && fragment.f4429e.equals(fragment2.f4432m)) {
                fragment2.f4431l = fragment;
                fragment2.f4432m = null;
            }
        }
        this.f4536l.put(fragment.f4429e, null);
        a1(fragment);
        String str = fragment.f4432m;
        if (str != null) {
            fragment.f4431l = (Fragment) this.f4536l.get(str);
        }
        fragment.N();
    }

    void M(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).M(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void N(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).N(fragment, context, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void O(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).O(fragment, bundle, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void O0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f4536l.containsKey(fragment.f4429e)) {
            if (f4517M) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f4545u + "since it is not added to " + this);
                return;
            }
            return;
        }
        int iMin = this.f4545u;
        if (fragment.f4436q) {
            iMin = fragment.Q() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        R0(fragment, iMin, fragment.A(), fragment.B(), false);
        if (fragment.f4408L != null) {
            Fragment fragmentR0 = r0(fragment);
            if (fragmentR0 != null) {
                View view = fragmentR0.f4408L;
                ViewGroup viewGroup = fragment.f4407K;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.f4408L);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.f4408L, iIndexOfChild);
                }
            }
            if (fragment.f4414R && fragment.f4407K != null) {
                float f3 = fragment.f4416T;
                if (f3 > 0.0f) {
                    fragment.f4408L.setAlpha(f3);
                }
                fragment.f4416T = 0.0f;
                fragment.f4414R = false;
                g gVarI0 = I0(fragment, fragment.A(), true, fragment.B());
                if (gVarI0 != null) {
                    Animation animation = gVarI0.f4566a;
                    if (animation != null) {
                        fragment.f4408L.startAnimation(animation);
                    } else {
                        gVarI0.f4567b.setTarget(fragment.f4408L);
                        gVarI0.f4567b.start();
                    }
                }
            }
        }
        if (fragment.f4415S) {
            w(fragment);
        }
    }

    void P(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).P(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void P0(int i3, boolean z2) {
        androidx.fragment.app.h hVar;
        if (this.f4546v == null && i3 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i3 != this.f4545u) {
            this.f4545u = i3;
            int size = this.f4535f.size();
            for (int i4 = 0; i4 < size; i4++) {
                O0((Fragment) this.f4535f.get(i4));
            }
            for (Fragment fragment : this.f4536l.values()) {
                if (fragment != null && (fragment.f4436q || fragment.f4401E)) {
                    if (!fragment.f4414R) {
                        O0(fragment);
                    }
                }
            }
            m1();
            if (this.f4550z && (hVar = this.f4546v) != null && this.f4545u == 4) {
                hVar.s();
                this.f4550z = false;
            }
        }
    }

    void Q(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).Q(fragment, bundle, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    void Q0(Fragment fragment) {
        R0(fragment, this.f4545u, 0, 0, false);
    }

    void R(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).R(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void R0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.R0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void S(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).S(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public void S0() {
        this.f4520A = false;
        this.f4521B = false;
        int size = this.f4535f.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null) {
                fragment.U();
            }
        }
    }

    void T(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).T(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public void T0(Fragment fragment) {
        if (fragment.f4410N) {
            if (this.f4533d) {
                this.f4523D = true;
            } else {
                fragment.f4410N = false;
                R0(fragment, this.f4545u, 0, 0, false);
            }
        }
    }

    void U(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f4548x;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).U(fragment, true);
            }
        }
        Iterator it = this.f4544t.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public boolean V(MenuItem menuItem) {
        if (this.f4545u < 1) {
            return false;
        }
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean V0(ArrayList arrayList, ArrayList arrayList2, String str, int i3, int i4) {
        int i5;
        ArrayList arrayList3 = this.f4537m;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i3 < 0 && (i4 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4537m.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i3 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f4537m.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i3 >= 0 && i3 == aVar.f4469u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i4 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f4537m.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (i3 < 0 || i3 != aVar2.f4469u) {
                                break;
                            }
                        }
                    }
                }
                i5 = size2;
            } else {
                i5 = -1;
            }
            if (i5 == this.f4537m.size() - 1) {
                return false;
            }
            for (int size3 = this.f4537m.size() - 1; size3 > i5; size3--) {
                arrayList.add(this.f4537m.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W(Menu menu) {
        if (this.f4545u < 1) {
            return;
        }
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null) {
                fragment.Q0(menu);
            }
        }
    }

    public void X0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f4442w != this) {
            n1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f4429e);
    }

    public void Y() {
        e0(3);
    }

    public void Y0(Fragment fragment) {
        if (f4517M) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f4441v);
        }
        boolean z2 = !fragment.Q();
        if (!fragment.f4401E || z2) {
            synchronized (this.f4535f) {
                this.f4535f.remove(fragment);
            }
            if (E0(fragment)) {
                this.f4550z = true;
            }
            fragment.f4435p = false;
            fragment.f4436q = true;
        }
    }

    public void Z(boolean z2) {
        for (int size = this.f4535f.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4535f.get(size);
            if (fragment != null) {
                fragment.S0(z2);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public boolean a0(Menu menu) {
        if (this.f4545u < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null && fragment.T0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    void a1(Fragment fragment) {
        if (H0()) {
            if (f4517M) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f4530K.m(fragment) && f4517M) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f4536l.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f4536l.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.g(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f4535f.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size5; i3++) {
                Fragment fragment2 = (Fragment) this.f4535f.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList = this.f4538n;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                Fragment fragment3 = (Fragment) this.f4538n.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList2 = this.f4537m;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f4537m.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            try {
                ArrayList arrayList3 = this.f4541q;
                if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i6 = 0; i6 < size2; i6++) {
                        Object obj = (androidx.fragment.app.a) this.f4541q.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
                ArrayList arrayList4 = this.f4542r;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    printWriter.print(str);
                    printWriter.print("mAvailBackStackIndices: ");
                    printWriter.println(Arrays.toString(this.f4542r.toArray()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList5 = this.f4532c;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (InterfaceC0090j) this.f4532c.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4546v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4547w);
        if (this.f4548x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4548x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4545u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4520A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4521B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4522C);
        if (this.f4550z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4550z);
        }
    }

    void b0() {
        p1();
        X(this.f4549y);
    }

    void b1() {
        ArrayList arrayList = this.f4543s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        AbstractC0527b.a(this.f4543s.get(0));
        throw null;
    }

    @Override // androidx.fragment.app.i
    public boolean c() {
        boolean zL0 = l0();
        s0();
        return zL0;
    }

    public void c0() {
        this.f4520A = false;
        this.f4521B = false;
        e0(4);
    }

    void c1(Parcelable parcelable) {
        m mVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f4581a == null) {
            return;
        }
        for (Fragment fragment : this.f4530K.j()) {
            if (f4517M) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator it = kVar.f4581a.iterator();
            while (true) {
                if (it.hasNext()) {
                    mVar = (m) it.next();
                    if (mVar.f4594b.equals(fragment.f4429e)) {
                        break;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar == null) {
                if (f4517M) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f4581a);
                }
                R0(fragment, 1, 0, 0, false);
                fragment.f4436q = true;
                R0(fragment, 0, 0, 0, false);
            } else {
                mVar.f4606s = fragment;
                fragment.f4427c = null;
                fragment.f4441v = 0;
                fragment.f4438s = false;
                fragment.f4435p = false;
                Fragment fragment2 = fragment.f4431l;
                fragment.f4432m = fragment2 != null ? fragment2.f4429e : null;
                fragment.f4431l = null;
                Bundle bundle = mVar.f4605r;
                if (bundle != null) {
                    bundle.setClassLoader(this.f4546v.g().getClassLoader());
                    fragment.f4427c = mVar.f4605r.getSparseParcelableArray("android:view_state");
                    fragment.f4425b = mVar.f4605r;
                }
            }
        }
        this.f4536l.clear();
        for (m mVar2 : kVar.f4581a) {
            if (mVar2 != null) {
                Fragment fragmentA = mVar2.a(this.f4546v.g().getClassLoader(), e());
                fragmentA.f4442w = this;
                if (f4517M) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentA.f4429e + "): " + fragmentA);
                }
                this.f4536l.put(fragmentA.f4429e, fragmentA);
                mVar2.f4606s = null;
            }
        }
        this.f4535f.clear();
        ArrayList<String> arrayList = kVar.f4582b;
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragment3 = (Fragment) this.f4536l.get(str);
                if (fragment3 == null) {
                    n1(new IllegalStateException("No instantiated fragment for (" + str + ")"));
                }
                fragment3.f4435p = true;
                if (f4517M) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragment3);
                }
                if (this.f4535f.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f4535f) {
                    this.f4535f.add(fragment3);
                }
            }
        }
        if (kVar.f4583c != null) {
            this.f4537m = new ArrayList(kVar.f4583c.length);
            int i3 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f4583c;
                if (i3 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i3].a(this);
                if (f4517M) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + aVarA.f4469u + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
                    aVarA.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4537m.add(aVarA);
                int i4 = aVarA.f4469u;
                if (i4 >= 0) {
                    i1(i4, aVarA);
                }
                i3++;
            }
        } else {
            this.f4537m = null;
        }
        String str2 = kVar.f4584d;
        if (str2 != null) {
            Fragment fragment4 = (Fragment) this.f4536l.get(str2);
            this.f4549y = fragment4;
            X(fragment4);
        }
        this.f4534e = kVar.f4585e;
    }

    @Override // androidx.fragment.app.i
    public Fragment d(String str) {
        if (str != null) {
            for (int size = this.f4535f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f4535f.get(size);
                if (fragment != null && str.equals(fragment.f4399C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f4536l.values()) {
            if (fragment2 != null && str.equals(fragment2.f4399C)) {
                return fragment2;
            }
        }
        return null;
    }

    public void d0() {
        this.f4520A = false;
        this.f4521B = false;
        e0(3);
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g e() {
        if (super.e() == androidx.fragment.app.i.f4515b) {
            Fragment fragment = this.f4548x;
            if (fragment != null) {
                return fragment.f4442w.e();
            }
            i(new f());
        }
        return super.e();
    }

    Parcelable e1() {
        ArrayList arrayList;
        int size;
        s0();
        h0();
        l0();
        this.f4520A = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f4536l.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(this.f4536l.size());
        boolean z2 = false;
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null) {
                if (fragment.f4442w != this) {
                    n1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                m mVar = new m(fragment);
                arrayList2.add(mVar);
                if (fragment.f4423a <= 0 || mVar.f4605r != null) {
                    mVar.f4605r = fragment.f4425b;
                } else {
                    mVar.f4605r = f1(fragment);
                    String str = fragment.f4432m;
                    if (str != null) {
                        Fragment fragment2 = (Fragment) this.f4536l.get(str);
                        if (fragment2 == null) {
                            n1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f4432m));
                        }
                        if (mVar.f4605r == null) {
                            mVar.f4605r = new Bundle();
                        }
                        X0(mVar.f4605r, "android:target_state", fragment2);
                        int i3 = fragment.f4433n;
                        if (i3 != 0) {
                            mVar.f4605r.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (f4517M) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f4605r);
                }
                z2 = true;
            }
        }
        if (!z2) {
            if (f4517M) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f4535f.size();
        if (size2 > 0) {
            arrayList = new ArrayList(size2);
            for (Fragment fragment3 : this.f4535f) {
                arrayList.add(fragment3.f4429e);
                if (fragment3.f4442w != this) {
                    n1(new IllegalStateException("Failure saving state: active " + fragment3 + " was removed from the FragmentManager"));
                }
                if (f4517M) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment3.f4429e + "): " + fragment3);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = this.f4537m;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f4537m.get(i4));
                if (f4517M) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f4537m.get(i4));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f4581a = arrayList2;
        kVar.f4582b = arrayList;
        kVar.f4583c = bVarArr;
        Fragment fragment4 = this.f4549y;
        if (fragment4 != null) {
            kVar.f4584d = fragment4.f4429e;
        }
        kVar.f4585e = this.f4534e;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public List f() {
        List list;
        if (this.f4535f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4535f) {
            list = (List) this.f4535f.clone();
        }
        return list;
    }

    public void f0() {
        this.f4521B = true;
        e0(2);
    }

    Bundle f1(Fragment fragment) {
        if (this.f4527H == null) {
            this.f4527H = new Bundle();
        }
        fragment.W0(this.f4527H);
        Q(fragment, this.f4527H, false);
        Bundle bundle = null;
        if (!this.f4527H.isEmpty()) {
            Bundle bundle2 = this.f4527H;
            this.f4527H = null;
            bundle = bundle2;
        }
        if (fragment.f4408L != null) {
            g1(fragment);
        }
        if (fragment.f4427c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f4427c);
        }
        if (!fragment.f4411O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f4411O);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public void g(int i3, int i4) {
        if (i3 >= 0) {
            i0(new k(null, i3, i4), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    void g0() {
        if (this.f4523D) {
            this.f4523D = false;
            m1();
        }
    }

    void g1(Fragment fragment) {
        if (fragment.f4409M == null) {
            return;
        }
        SparseArray sparseArray = this.f4528I;
        if (sparseArray == null) {
            this.f4528I = new SparseArray();
        } else {
            sparseArray.clear();
        }
        fragment.f4409M.saveHierarchyState(this.f4528I);
        if (this.f4528I.size() > 0) {
            fragment.f4427c = this.f4528I;
            this.f4528I = null;
        }
    }

    @Override // androidx.fragment.app.i
    public boolean h() {
        t();
        return U0(null, -1, 0);
    }

    void h1() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f4529J;
                boolean z2 = false;
                boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                ArrayList arrayList2 = this.f4532c;
                if (arrayList2 != null && arrayList2.size() == 1) {
                    z2 = true;
                }
                if (z3 || z2) {
                    this.f4546v.h().removeCallbacks(this.f4531L);
                    this.f4546v.h().post(this.f4531L);
                    p1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i0(InterfaceC0090j interfaceC0090j, boolean z2) {
        if (!z2) {
            t();
        }
        synchronized (this) {
            try {
                if (!this.f4522C && this.f4546v != null) {
                    if (this.f4532c == null) {
                        this.f4532c = new ArrayList();
                    }
                    this.f4532c.add(interfaceC0090j);
                    h1();
                    return;
                }
                if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } finally {
            }
        }
    }

    public void i1(int i3, androidx.fragment.app.a aVar) {
        synchronized (this) {
            try {
                if (this.f4541q == null) {
                    this.f4541q = new ArrayList();
                }
                int size = this.f4541q.size();
                if (i3 < size) {
                    if (f4517M) {
                        Log.v("FragmentManager", "Setting back stack index " + i3 + " to " + aVar);
                    }
                    this.f4541q.set(i3, aVar);
                } else {
                    while (size < i3) {
                        this.f4541q.add(null);
                        if (this.f4542r == null) {
                            this.f4542r = new ArrayList();
                        }
                        if (f4517M) {
                            Log.v("FragmentManager", "Adding available back stack index " + size);
                        }
                        this.f4542r.add(Integer.valueOf(size));
                        size++;
                    }
                    if (f4517M) {
                        Log.v("FragmentManager", "Adding back stack index " + i3 + " with " + aVar);
                    }
                    this.f4541q.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j1(Fragment fragment, AbstractC0516e.b bVar) {
        if (this.f4536l.get(fragment.f4429e) == fragment && (fragment.f4443x == null || fragment.w() == this)) {
            fragment.f4419W = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void k(androidx.fragment.app.a aVar) {
        if (this.f4537m == null) {
            this.f4537m = new ArrayList();
        }
        this.f4537m.add(aVar);
    }

    void k0(Fragment fragment) {
        if (!fragment.f4437r || fragment.f4440u) {
            return;
        }
        fragment.I0(fragment.M0(fragment.f4425b), null, fragment.f4425b);
        View view = fragment.f4408L;
        if (view == null) {
            fragment.f4409M = null;
            return;
        }
        fragment.f4409M = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.f4400D) {
            fragment.f4408L.setVisibility(8);
        }
        fragment.A0(fragment.f4408L, fragment.f4425b);
        T(fragment, fragment.f4408L, fragment.f4425b, false);
    }

    public void k1(Fragment fragment) {
        if (fragment == null || (this.f4536l.get(fragment.f4429e) == fragment && (fragment.f4443x == null || fragment.w() == this))) {
            Fragment fragment2 = this.f4549y;
            this.f4549y = fragment;
            X(fragment2);
            X(this.f4549y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void l(Fragment fragment, boolean z2) {
        if (f4517M) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        J0(fragment);
        if (fragment.f4401E) {
            return;
        }
        if (this.f4535f.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4535f) {
            this.f4535f.add(fragment);
        }
        fragment.f4435p = true;
        fragment.f4436q = false;
        if (fragment.f4408L == null) {
            fragment.f4415S = false;
        }
        if (E0(fragment)) {
            this.f4550z = true;
        }
        if (z2) {
            Q0(fragment);
        }
    }

    public boolean l0() {
        j0(true);
        boolean z2 = false;
        while (u0(this.f4524E, this.f4525F)) {
            this.f4533d = true;
            try {
                Z0(this.f4524E, this.f4525F);
                u();
                z2 = true;
            } catch (Throwable th) {
                u();
                throw th;
            }
        }
        p1();
        g0();
        r();
        return z2;
    }

    public void l1(Fragment fragment) {
        if (f4517M) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f4400D) {
            fragment.f4400D = false;
            fragment.f4415S = !fragment.f4415S;
        }
    }

    void m(Fragment fragment) {
        if (H0()) {
            if (f4517M) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4530K.f(fragment) && f4517M) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    void m1() {
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null) {
                T0(fragment);
            }
        }
    }

    public int n(androidx.fragment.app.a aVar) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f4542r;
                if (arrayList != null && arrayList.size() > 0) {
                    int iIntValue = ((Integer) this.f4542r.remove(r0.size() - 1)).intValue();
                    if (f4517M) {
                        Log.v("FragmentManager", "Adding back stack index " + iIntValue + " with " + aVar);
                    }
                    this.f4541q.set(iIntValue, aVar);
                    return iIntValue;
                }
                if (this.f4541q == null) {
                    this.f4541q = new ArrayList();
                }
                int size = this.f4541q.size();
                if (f4517M) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
                }
                this.f4541q.add(aVar);
                return size;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f4573a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentP0 = resourceId != -1 ? p0(resourceId) : null;
        if (fragmentP0 == null && string != null) {
            fragmentP0 = d(string);
        }
        if (fragmentP0 == null && id != -1) {
            fragmentP0 = p0(id);
        }
        if (f4517M) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentP0);
        }
        if (fragmentP0 == null) {
            fragmentP0 = e().a(context.getClassLoader(), str2);
            fragmentP0.f4437r = true;
            fragmentP0.f4397A = resourceId != 0 ? resourceId : id;
            fragmentP0.f4398B = id;
            fragmentP0.f4399C = string;
            fragmentP0.f4438s = true;
            fragmentP0.f4442w = this;
            androidx.fragment.app.h hVar = this.f4546v;
            fragmentP0.f4443x = hVar;
            fragmentP0.n0(hVar.g(), attributeSet, fragmentP0.f4425b);
            l(fragmentP0, true);
        } else {
            if (fragmentP0.f4438s) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentP0.f4438s = true;
            androidx.fragment.app.h hVar2 = this.f4546v;
            fragmentP0.f4443x = hVar2;
            fragmentP0.n0(hVar2.g(), attributeSet, fragmentP0.f4425b);
        }
        Fragment fragment = fragmentP0;
        if (this.f4545u >= 1 || !fragment.f4437r) {
            Q0(fragment);
        } else {
            R0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.f4408L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f4408L.getTag() == null) {
                fragment.f4408L.setTag(string);
            }
            return fragment.f4408L;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.f4546v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4546v = hVar;
        this.f4547w = eVar;
        this.f4548x = fragment;
        if (fragment != null) {
            p1();
        }
        if (hVar instanceof androidx.activity.r) {
            androidx.activity.r rVar = (androidx.activity.r) hVar;
            OnBackPressedDispatcher onBackPressedDispatcherJ = rVar.j();
            this.f4539o = onBackPressedDispatcherJ;
            androidx.lifecycle.i iVar = rVar;
            if (fragment != null) {
                iVar = fragment;
            }
            onBackPressedDispatcherJ.h(iVar, this.f4540p);
        }
        this.f4530K = fragment != null ? fragment.f4442w.w0(fragment) : hVar instanceof D ? androidx.fragment.app.l.i(((D) hVar).e()) : new androidx.fragment.app.l(false);
    }

    public Fragment p0(int i3) {
        for (int size = this.f4535f.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4535f.get(size);
            if (fragment != null && fragment.f4397A == i3) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f4536l.values()) {
            if (fragment2 != null && fragment2.f4397A == i3) {
                return fragment2;
            }
        }
        return null;
    }

    public void q(Fragment fragment) {
        if (f4517M) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f4401E) {
            fragment.f4401E = false;
            if (fragment.f4435p) {
                return;
            }
            if (this.f4535f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (f4517M) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f4535f) {
                this.f4535f.add(fragment);
            }
            fragment.f4435p = true;
            if (E0(fragment)) {
                this.f4550z = true;
            }
        }
    }

    public Fragment q0(String str) {
        Fragment fragmentI;
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null && (fragmentI = fragment.i(str)) != null) {
                return fragmentI;
            }
        }
        return null;
    }

    boolean s() {
        boolean zE0 = false;
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null) {
                zE0 = E0(fragment);
            }
            if (zE0) {
                return true;
            }
        }
        return false;
    }

    public void t0(int i3) {
        synchronized (this) {
            try {
                this.f4541q.set(i3, null);
                if (this.f4542r == null) {
                    this.f4542r = new ArrayList();
                }
                if (f4517M) {
                    Log.v("FragmentManager", "Freeing back stack index " + i3);
                }
                this.f4542r.add(Integer.valueOf(i3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f4548x;
        if (obj == null) {
            obj = this.f4546v;
        }
        AbstractC0981b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    void v(androidx.fragment.app.a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.m(z4);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            P0(this.f4545u, true);
        }
        for (Fragment fragment : this.f4536l.values()) {
            if (fragment != null && fragment.f4408L != null && fragment.f4414R && aVar.p(fragment.f4398B)) {
                float f3 = fragment.f4416T;
                if (f3 > 0.0f) {
                    fragment.f4408L.setAlpha(f3);
                }
                if (z4) {
                    fragment.f4416T = 0.0f;
                } else {
                    fragment.f4416T = -1.0f;
                    fragment.f4414R = false;
                }
            }
        }
    }

    public int v0() {
        ArrayList arrayList = this.f4537m;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void w(Fragment fragment) {
        Animator animator;
        if (fragment.f4408L != null) {
            g gVarI0 = I0(fragment, fragment.A(), !fragment.f4400D, fragment.B());
            if (gVarI0 == null || (animator = gVarI0.f4567b) == null) {
                if (gVarI0 != null) {
                    fragment.f4408L.startAnimation(gVarI0.f4566a);
                    gVarI0.f4566a.start();
                }
                fragment.f4408L.setVisibility((!fragment.f4400D || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.i1(false);
                }
            } else {
                animator.setTarget(fragment.f4408L);
                if (!fragment.f4400D) {
                    fragment.f4408L.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.i1(false);
                } else {
                    ViewGroup viewGroup = fragment.f4407K;
                    View view = fragment.f4408L;
                    viewGroup.startViewTransition(view);
                    gVarI0.f4567b.addListener(new e(viewGroup, view, fragment));
                }
                gVarI0.f4567b.start();
            }
        }
        if (fragment.f4435p && E0(fragment)) {
            this.f4550z = true;
        }
        fragment.f4415S = false;
        fragment.l0(fragment.f4400D);
    }

    androidx.fragment.app.l w0(Fragment fragment) {
        return this.f4530K.h(fragment);
    }

    public void x(Fragment fragment) {
        if (f4517M) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f4401E) {
            return;
        }
        fragment.f4401E = true;
        if (fragment.f4435p) {
            if (f4517M) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f4535f) {
                this.f4535f.remove(fragment);
            }
            if (E0(fragment)) {
                this.f4550z = true;
            }
            fragment.f4435p = false;
        }
    }

    public Fragment x0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f4536l.get(string);
        if (fragment == null) {
            n1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void y() {
        this.f4520A = false;
        this.f4521B = false;
        e0(2);
    }

    LayoutInflater.Factory2 y0() {
        return this;
    }

    public void z(Configuration configuration) {
        for (int i3 = 0; i3 < this.f4535f.size(); i3++) {
            Fragment fragment = (Fragment) this.f4535f.get(i3);
            if (fragment != null) {
                fragment.E0(configuration);
            }
        }
    }

    public Fragment z0() {
        return this.f4549y;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
