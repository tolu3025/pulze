package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC0477d;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import j.AbstractC0981b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import y.C1276c;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, D, InterfaceC1277d {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final Object f4396c0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f4397A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f4398B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    String f4399C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f4400D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f4401E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f4402F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f4403G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f4404H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f4406J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    ViewGroup f4407K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    View f4408L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    View f4409M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f4410N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    d f4412P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    boolean f4414R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    boolean f4415S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    float f4416T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    LayoutInflater f4417U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f4418V;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    androidx.lifecycle.j f4420X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    r f4421Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    C1276c f4424a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bundle f4425b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f4426b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SparseArray f4427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Boolean f4428d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f4430f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Fragment f4431l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f4433n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f4435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f4436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f4437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f4438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f4439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f4440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f4441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    j f4442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    h f4443x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Fragment f4445z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f4423a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f4429e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f4432m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f4434o = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    j f4444y = new j();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f4405I = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f4411O = true;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    Runnable f4413Q = new a();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    AbstractC0516e.b f4419W = AbstractC0516e.b.RESUMED;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    androidx.lifecycle.m f4422Z = new androidx.lifecycle.m();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.o1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.f();
        }
    }

    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View c(int i3) {
            View view = Fragment.this.f4408L;
            if (view != null) {
                return view.findViewById(i3);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.f4408L != null;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f4450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Animator f4451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f4456g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f4457h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f4458i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f4459j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f4460k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f4461l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Boolean f4462m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Boolean f4463n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f4464o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        f f4465p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f4466q;

        d() {
            Object obj = Fragment.f4396c0;
            this.f4457h = obj;
            this.f4458i = null;
            this.f4459j = obj;
            this.f4460k = null;
            this.f4461l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        M();
    }

    private void M() {
        this.f4420X = new androidx.lifecycle.j(this);
        this.f4424a0 = C1276c.a(this);
        this.f4420X.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.lifecycle.g
            public void d(androidx.lifecycle.i iVar, AbstractC0516e.a aVar) {
                View view;
                if (aVar != AbstractC0516e.a.ON_STOP || (view = Fragment.this.f4408L) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    public static Fragment O(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    private d h() {
        if (this.f4412P == null) {
            this.f4412P = new d();
        }
        return this.f4412P;
    }

    int A() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f4454e;
    }

    public void A0(View view, Bundle bundle) {
    }

    int B() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f4455f;
    }

    public void B0(Bundle bundle) {
        this.f4406J = true;
    }

    public final Fragment C() {
        return this.f4445z;
    }

    void C0(Bundle bundle) {
        this.f4444y.S0();
        this.f4423a = 2;
        this.f4406J = false;
        V(bundle);
        if (this.f4406J) {
            this.f4444y.y();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object D() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f4459j;
        return obj == f4396c0 ? u() : obj;
    }

    void D0() {
        this.f4444y.p(this.f4443x, new c(), this);
        this.f4406J = false;
        Y(this.f4443x.g());
        if (this.f4406J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Resources E() {
        return a1().getResources();
    }

    void E0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f4444y.z(configuration);
    }

    public final boolean F() {
        return this.f4402F;
    }

    boolean F0(MenuItem menuItem) {
        if (this.f4400D) {
            return false;
        }
        return a0(menuItem) || this.f4444y.A(menuItem);
    }

    public Object G() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f4457h;
        return obj == f4396c0 ? s() : obj;
    }

    void G0(Bundle bundle) {
        this.f4444y.S0();
        this.f4423a = 1;
        this.f4406J = false;
        this.f4424a0.d(bundle);
        b0(bundle);
        this.f4418V = true;
        if (this.f4406J) {
            this.f4420X.h(AbstractC0516e.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object H() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        return dVar.f4460k;
    }

    boolean H0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.f4400D) {
            return false;
        }
        if (this.f4404H && this.f4405I) {
            e0(menu, menuInflater);
            z2 = true;
        }
        return z2 | this.f4444y.C(menu, menuInflater);
    }

    public Object I() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f4461l;
        return obj == f4396c0 ? H() : obj;
    }

    void I0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4444y.S0();
        this.f4440u = true;
        this.f4421Y = new r();
        View viewF0 = f0(layoutInflater, viewGroup, bundle);
        this.f4408L = viewF0;
        if (viewF0 != null) {
            this.f4421Y.c();
            this.f4422Z.m(this.f4421Y);
        } else {
            if (this.f4421Y.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f4421Y = null;
        }
    }

    int J() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f4452c;
    }

    void J0() {
        this.f4444y.D();
        this.f4420X.h(AbstractC0516e.a.ON_DESTROY);
        this.f4423a = 0;
        this.f4406J = false;
        this.f4418V = false;
        g0();
        if (this.f4406J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final Fragment K() {
        String str;
        Fragment fragment = this.f4431l;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.f4442w;
        if (jVar == null || (str = this.f4432m) == null) {
            return null;
        }
        return (Fragment) jVar.f4536l.get(str);
    }

    void K0() {
        this.f4444y.E();
        if (this.f4408L != null) {
            this.f4421Y.b(AbstractC0516e.a.ON_DESTROY);
        }
        this.f4423a = 1;
        this.f4406J = false;
        i0();
        if (this.f4406J) {
            androidx.loader.app.a.b(this).d();
            this.f4440u = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public View L() {
        return this.f4408L;
    }

    void L0() {
        this.f4406J = false;
        j0();
        this.f4417U = null;
        if (this.f4406J) {
            if (this.f4444y.D0()) {
                return;
            }
            this.f4444y.D();
            this.f4444y = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater M0(Bundle bundle) {
        LayoutInflater layoutInflaterK0 = k0(bundle);
        this.f4417U = layoutInflaterK0;
        return layoutInflaterK0;
    }

    void N() {
        M();
        this.f4429e = UUID.randomUUID().toString();
        this.f4435p = false;
        this.f4436q = false;
        this.f4437r = false;
        this.f4438s = false;
        this.f4439t = false;
        this.f4441v = 0;
        this.f4442w = null;
        this.f4444y = new j();
        this.f4443x = null;
        this.f4397A = 0;
        this.f4398B = 0;
        this.f4399C = null;
        this.f4400D = false;
        this.f4401E = false;
    }

    void N0() {
        onLowMemory();
        this.f4444y.F();
    }

    void O0(boolean z2) {
        o0(z2);
        this.f4444y.G(z2);
    }

    boolean P() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return false;
        }
        return dVar.f4466q;
    }

    boolean P0(MenuItem menuItem) {
        if (this.f4400D) {
            return false;
        }
        return (this.f4404H && this.f4405I && p0(menuItem)) || this.f4444y.V(menuItem);
    }

    final boolean Q() {
        return this.f4441v > 0;
    }

    void Q0(Menu menu) {
        if (this.f4400D) {
            return;
        }
        if (this.f4404H && this.f4405I) {
            q0(menu);
        }
        this.f4444y.W(menu);
    }

    boolean R() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return false;
        }
        return dVar.f4464o;
    }

    void R0() {
        this.f4444y.Y();
        if (this.f4408L != null) {
            this.f4421Y.b(AbstractC0516e.a.ON_PAUSE);
        }
        this.f4420X.h(AbstractC0516e.a.ON_PAUSE);
        this.f4423a = 3;
        this.f4406J = false;
        r0();
        if (this.f4406J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean S() {
        return this.f4436q;
    }

    void S0(boolean z2) {
        s0(z2);
        this.f4444y.Z(z2);
    }

    public final boolean T() {
        j jVar = this.f4442w;
        if (jVar == null) {
            return false;
        }
        return jVar.H0();
    }

    boolean T0(Menu menu) {
        boolean z2 = false;
        if (this.f4400D) {
            return false;
        }
        if (this.f4404H && this.f4405I) {
            t0(menu);
            z2 = true;
        }
        return z2 | this.f4444y.a0(menu);
    }

    void U() {
        this.f4444y.S0();
    }

    void U0() {
        boolean zF0 = this.f4442w.F0(this);
        Boolean bool = this.f4434o;
        if (bool == null || bool.booleanValue() != zF0) {
            this.f4434o = Boolean.valueOf(zF0);
            u0(zF0);
            this.f4444y.b0();
        }
    }

    public void V(Bundle bundle) {
        this.f4406J = true;
    }

    void V0() {
        this.f4444y.S0();
        this.f4444y.l0();
        this.f4423a = 4;
        this.f4406J = false;
        w0();
        if (!this.f4406J) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.f4420X;
        AbstractC0516e.a aVar = AbstractC0516e.a.ON_RESUME;
        jVar.h(aVar);
        if (this.f4408L != null) {
            this.f4421Y.b(aVar);
        }
        this.f4444y.c0();
        this.f4444y.l0();
    }

    public void W(int i3, int i4, Intent intent) {
    }

    void W0(Bundle bundle) {
        x0(bundle);
        this.f4424a0.e(bundle);
        Parcelable parcelableE1 = this.f4444y.e1();
        if (parcelableE1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableE1);
        }
    }

    public void X(Activity activity) {
        this.f4406J = true;
    }

    void X0() {
        this.f4444y.S0();
        this.f4444y.l0();
        this.f4423a = 3;
        this.f4406J = false;
        y0();
        if (!this.f4406J) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.f4420X;
        AbstractC0516e.a aVar = AbstractC0516e.a.ON_START;
        jVar.h(aVar);
        if (this.f4408L != null) {
            this.f4421Y.b(aVar);
        }
        this.f4444y.d0();
    }

    public void Y(Context context) {
        this.f4406J = true;
        h hVar = this.f4443x;
        Activity activityF = hVar == null ? null : hVar.f();
        if (activityF != null) {
            this.f4406J = false;
            X(activityF);
        }
    }

    void Y0() {
        this.f4444y.f0();
        if (this.f4408L != null) {
            this.f4421Y.b(AbstractC0516e.a.ON_STOP);
        }
        this.f4420X.h(AbstractC0516e.a.ON_STOP);
        this.f4423a = 2;
        this.f4406J = false;
        z0();
        if (this.f4406J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Z(Fragment fragment) {
    }

    public final androidx.fragment.app.d Z0() {
        androidx.fragment.app.d dVarL = l();
        if (dVarL != null) {
            return dVarL;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // androidx.lifecycle.i
    public AbstractC0516e a() {
        return this.f4420X;
    }

    public boolean a0(MenuItem menuItem) {
        return false;
    }

    public final Context a1() {
        Context contextR = r();
        if (contextR != null) {
            return contextR;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void b0(Bundle bundle) {
        this.f4406J = true;
        d1(bundle);
        if (this.f4444y.G0(1)) {
            return;
        }
        this.f4444y.B();
    }

    public final i b1() {
        i iVarW = w();
        if (iVarW != null) {
            return iVarW;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation c0(int i3, boolean z2, int i4) {
        return null;
    }

    public final View c1() {
        View viewL = L();
        if (viewL != null) {
            return viewL;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator d0(int i3, boolean z2, int i4) {
        return null;
    }

    void d1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f4444y.c1(parcelable);
        this.f4444y.B();
    }

    @Override // androidx.lifecycle.D
    public C e() {
        j jVar = this.f4442w;
        if (jVar != null) {
            return jVar.A0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e0(Menu menu, MenuInflater menuInflater) {
    }

    final void e1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f4427c;
        if (sparseArray != null) {
            this.f4409M.restoreHierarchyState(sparseArray);
            this.f4427c = null;
        }
        this.f4406J = false;
        B0(bundle);
        if (this.f4406J) {
            if (this.f4408L != null) {
                this.f4421Y.b(AbstractC0516e.a.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f() {
        d dVar = this.f4412P;
        f fVar = null;
        if (dVar != null) {
            dVar.f4464o = false;
            f fVar2 = dVar.f4465p;
            dVar.f4465p = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3 = this.f4426b0;
        if (i3 != 0) {
            return layoutInflater.inflate(i3, viewGroup, false);
        }
        return null;
    }

    void f1(View view) {
        h().f4450a = view;
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f4397A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f4398B));
        printWriter.print(" mTag=");
        printWriter.println(this.f4399C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f4423a);
        printWriter.print(" mWho=");
        printWriter.print(this.f4429e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f4441v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f4435p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f4436q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f4437r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f4438s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f4400D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f4401E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f4405I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f4404H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f4402F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f4411O);
        if (this.f4442w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f4442w);
        }
        if (this.f4443x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f4443x);
        }
        if (this.f4445z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f4445z);
        }
        if (this.f4430f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f4430f);
        }
        if (this.f4425b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f4425b);
        }
        if (this.f4427c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f4427c);
        }
        Fragment fragmentK = K();
        if (fragmentK != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentK);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f4433n);
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(z());
        }
        if (this.f4407K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f4407K);
        }
        if (this.f4408L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f4408L);
        }
        if (this.f4409M != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f4408L);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(J());
        }
        if (r() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f4444y + ":");
        this.f4444y.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void g0() {
        this.f4406J = true;
    }

    void g1(Animator animator) {
        h().f4451b = animator;
    }

    public void h0() {
    }

    public void h1(Bundle bundle) {
        if (this.f4442w != null && T()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f4430f = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    Fragment i(String str) {
        return str.equals(this.f4429e) ? this : this.f4444y.q0(str);
    }

    public void i0() {
        this.f4406J = true;
    }

    void i1(boolean z2) {
        h().f4466q = z2;
    }

    public void j0() {
        this.f4406J = true;
    }

    void j1(int i3) {
        if (this.f4412P == null && i3 == 0) {
            return;
        }
        h().f4453d = i3;
    }

    @Override // y.InterfaceC1277d
    public final androidx.savedstate.a k() {
        return this.f4424a0.b();
    }

    public LayoutInflater k0(Bundle bundle) {
        return y(bundle);
    }

    void k1(int i3, int i4) {
        if (this.f4412P == null && i3 == 0 && i4 == 0) {
            return;
        }
        h();
        d dVar = this.f4412P;
        dVar.f4454e = i3;
        dVar.f4455f = i4;
    }

    public final androidx.fragment.app.d l() {
        h hVar = this.f4443x;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.f();
    }

    public void l0(boolean z2) {
    }

    void l1(f fVar) {
        h();
        d dVar = this.f4412P;
        f fVar2 = dVar.f4465p;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f4464o) {
            dVar.f4465p = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean m() {
        Boolean bool;
        d dVar = this.f4412P;
        if (dVar == null || (bool = dVar.f4463n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void m0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f4406J = true;
    }

    void m1(int i3) {
        h().f4452c = i3;
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.f4412P;
        if (dVar == null || (bool = dVar.f4462m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f4406J = true;
        h hVar = this.f4443x;
        Activity activityF = hVar == null ? null : hVar.f();
        if (activityF != null) {
            this.f4406J = false;
            m0(activityF, attributeSet, bundle);
        }
    }

    public void n1(Intent intent, int i3, Bundle bundle) {
        h hVar = this.f4443x;
        if (hVar != null) {
            hVar.r(this, intent, i3, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    View o() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        return dVar.f4450a;
    }

    public void o0(boolean z2) {
    }

    public void o1() {
        j jVar = this.f4442w;
        if (jVar == null || jVar.f4546v == null) {
            h().f4464o = false;
        } else if (Looper.myLooper() != this.f4442w.f4546v.h().getLooper()) {
            this.f4442w.f4546v.h().postAtFrontOfQueue(new b());
        } else {
            f();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f4406J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f4406J = true;
    }

    Animator p() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        return dVar.f4451b;
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public final i q() {
        if (this.f4443x != null) {
            return this.f4444y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void q0(Menu menu) {
    }

    public Context r() {
        h hVar = this.f4443x;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void r0() {
        this.f4406J = true;
    }

    public Object s() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        return dVar.f4456g;
    }

    public void s0(boolean z2) {
    }

    public void startActivityForResult(Intent intent, int i3) {
        n1(intent, i3, null);
    }

    androidx.core.app.n t() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AbstractC0981b.a(this, sb);
        sb.append(" (");
        sb.append(this.f4429e);
        sb.append(")");
        if (this.f4397A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4397A));
        }
        if (this.f4399C != null) {
            sb.append(" ");
            sb.append(this.f4399C);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        return dVar.f4458i;
    }

    public void u0(boolean z2) {
    }

    androidx.core.app.n v() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void v0(int i3, String[] strArr, int[] iArr) {
    }

    public final i w() {
        return this.f4442w;
    }

    public void w0() {
        this.f4406J = true;
    }

    public final Object x() {
        h hVar = this.f4443x;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void x0(Bundle bundle) {
    }

    public LayoutInflater y(Bundle bundle) {
        h hVar = this.f4443x;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = hVar.n();
        AbstractC0477d.a(layoutInflaterN, this.f4444y.y0());
        return layoutInflaterN;
    }

    public void y0() {
        this.f4406J = true;
    }

    int z() {
        d dVar = this.f4412P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f4453d;
    }

    public void z0() {
        this.f4406J = true;
    }
}
