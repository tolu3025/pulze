package io.flutter.plugin.platform;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import b1.AbstractC0525b;
import c.AbstractC0527b;
import c1.C0543a;
import f1.AbstractC0868a;
import io.flutter.embedding.android.C0906c;
import io.flutter.embedding.android.D;
import io.flutter.embedding.android.N;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.F;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k1.q;

/* JADX INFO: loaded from: classes.dex */
public class r implements o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Class[] f7896w = {SurfaceView.class};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f7897x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f7898y = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0906c f7900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D f7902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextureRegistry f7903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f7904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k1.q f7905g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7913o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7914p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7915q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7919u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final q.g f7920v = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7899a = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final HashMap f7907i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f7906h = new io.flutter.plugin.platform.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HashMap f7908j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SparseArray f7911m = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashSet f7916r = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashSet f7917s = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SparseArray f7912n = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseArray f7909k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray f7910l = new SparseArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final N f7918t = N.a();

    class a implements q.g {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(y yVar, float f3, q.b bVar) {
            r.this.k0(yVar);
            if (r.this.f7901c != null) {
                f3 = r.this.L();
            }
            bVar.a(new q.c(r.this.g0(yVar.d(), f3), r.this.g0(yVar.c(), f3)));
        }

        @Override // k1.q.g
        public void a(boolean z2) {
            r.this.f7915q = z2;
        }

        @Override // k1.q.g
        public void b(int i3, double d3, double d4) {
            if (r.this.b(i3)) {
                return;
            }
            AbstractC0525b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
        }

        @Override // k1.q.g
        public void c(int i3, int i4) {
            StringBuilder sb;
            String str;
            if (!r.l0(i4)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
            }
            if (r.this.b(i3)) {
                View viewE = ((y) r.this.f7907i.get(Integer.valueOf(i3))).e();
                if (viewE != null) {
                    viewE.setLayoutDirection(i4);
                    return;
                } else {
                    sb = new StringBuilder();
                    str = "Setting direction to a null view with id: ";
                }
            } else {
                AbstractC0527b.a(r.this.f7909k.get(i3));
                sb = new StringBuilder();
                str = "Setting direction to an unknown view with id: ";
            }
            sb.append(str);
            sb.append(i3);
            AbstractC0525b.b("PlatformViewsController", sb.toString());
        }

        @Override // k1.q.g
        public long d(q.d dVar) {
            r.this.J(dVar);
            int i3 = dVar.f9586a;
            if (r.this.f7912n.get(i3) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i3);
            }
            if (r.this.f7903e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i3);
            }
            if (r.this.f7902d != null) {
                r.this.C(dVar, true);
                throw null;
            }
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i3);
        }

        @Override // k1.q.g
        public void e(q.f fVar) {
            int i3 = fVar.f9602a;
            float f3 = r.this.f7901c.getResources().getDisplayMetrics().density;
            if (r.this.b(i3)) {
                ((y) r.this.f7907i.get(Integer.valueOf(i3))).b(r.this.h0(f3, fVar, true));
                return;
            }
            AbstractC0527b.a(r.this.f7909k.get(i3));
            AbstractC0525b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
        }

        @Override // k1.q.g
        public void f(int i3) {
            StringBuilder sb;
            String str;
            if (r.this.b(i3)) {
                View viewE = ((y) r.this.f7907i.get(Integer.valueOf(i3))).e();
                if (viewE != null) {
                    viewE.clearFocus();
                    return;
                } else {
                    sb = new StringBuilder();
                    str = "Clearing focus on a null view with id: ";
                }
            } else {
                AbstractC0527b.a(r.this.f7909k.get(i3));
                sb = new StringBuilder();
                str = "Clearing focus on an unknown view with id: ";
            }
            sb.append(str);
            sb.append(i3);
            AbstractC0525b.b("PlatformViewsController", sb.toString());
        }

        @Override // k1.q.g
        public void g(q.d dVar) {
            r.this.I(19);
            r.this.J(dVar);
            r.this.C(dVar, false);
            r.this.z(null, dVar);
        }

        @Override // k1.q.g
        public void h(int i3) {
            AbstractC0527b.a(r.this.f7909k.get(i3));
            AbstractC0525b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
        }

        @Override // k1.q.g
        public void i(q.e eVar, final q.b bVar) {
            int iI0 = r.this.i0(eVar.f9600b);
            int iI02 = r.this.i0(eVar.f9601c);
            int i3 = eVar.f9599a;
            if (r.this.b(i3)) {
                final float fL = r.this.L();
                final y yVar = (y) r.this.f7907i.get(Integer.valueOf(i3));
                r.this.Q(yVar);
                yVar.i(iI0, iI02, new Runnable(yVar, fL, bVar) { // from class: io.flutter.plugin.platform.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ y f7893b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f7894c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ q.b f7895d;

                    {
                        this.f7894c = fL;
                        this.f7895d = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7892a.k(this.f7893b, this.f7894c, this.f7895d);
                    }
                });
                return;
            }
            AbstractC0527b.a(r.this.f7909k.get(i3));
            AbstractC0525b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
        }
    }

    private void H() {
        while (this.f7909k.size() > 0) {
            this.f7920v.h(this.f7909k.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= i3) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i4 + ", required API level is: " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(q.d dVar) {
        if (l0(dVar.f9592g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f9592g + "(view id: " + dVar.f9586a + ")");
    }

    private void K(boolean z2) {
        for (int i3 = 0; i3 < this.f7911m.size(); i3++) {
            int iKeyAt = this.f7911m.keyAt(i3);
            b bVar = (b) this.f7911m.valueAt(i3);
            if (this.f7916r.contains(Integer.valueOf(iKeyAt))) {
                this.f7902d.m(bVar);
                z2 &= bVar.e();
            } else {
                if (!this.f7914p) {
                    bVar.a();
                }
                bVar.setVisibility(8);
                this.f7902d.removeView(bVar);
            }
        }
        for (int i4 = 0; i4 < this.f7910l.size(); i4++) {
            int iKeyAt2 = this.f7910l.keyAt(i4);
            View view = (View) this.f7910l.get(iKeyAt2);
            if (!this.f7917s.contains(Integer.valueOf(iKeyAt2)) || (!z2 && this.f7915q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float L() {
        return this.f7901c.getResources().getDisplayMetrics().density;
    }

    private void O() {
        if (!this.f7915q || this.f7914p) {
            return;
        }
        this.f7902d.p();
        this.f7914p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        K(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(y yVar) {
        F f3 = this.f7904f;
        if (f3 == null) {
            return;
        }
        f3.s();
        yVar.f();
    }

    private static MotionEvent.PointerCoords a0(Object obj, float f3) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d3 = f3;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d3);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d3);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d3);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d3);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d3);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d3);
        return pointerCoords;
    }

    private static List b0(Object obj, float f3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(a0(it.next(), f3));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0(it.next()));
        }
        return arrayList;
    }

    private void e0() {
        if (this.f7902d == null) {
            AbstractC0525b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i3 = 0; i3 < this.f7911m.size(); i3++) {
            this.f7902d.removeView((View) this.f7911m.valueAt(i3));
        }
        this.f7911m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g0(double d3, float f3) {
        return (int) Math.round(d3 / ((double) f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(double d3) {
        return (int) Math.round(d3 * ((double) L()));
    }

    private static void j0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(y yVar) {
        F f3 = this.f7904f;
        if (f3 == null) {
            return;
        }
        f3.E();
        yVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l0(int i3) {
        return i3 == 0 || i3 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(j jVar, q.d dVar) {
        I(19);
        AbstractC0525b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f9586a);
    }

    public FlutterOverlaySurface A() {
        return B(new b(this.f7902d.getContext(), this.f7902d.getWidth(), this.f7902d.getHeight(), this.f7906h));
    }

    public FlutterOverlaySurface B(b bVar) {
        int i3 = this.f7913o;
        this.f7913o = i3 + 1;
        this.f7911m.put(i3, bVar);
        return new FlutterOverlaySurface(i3, bVar.getSurface());
    }

    public j C(q.d dVar, boolean z2) {
        this.f7899a.a(dVar.f9587b);
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f9587b);
    }

    public void D() {
        for (int i3 = 0; i3 < this.f7911m.size(); i3++) {
            b bVar = (b) this.f7911m.valueAt(i3);
            bVar.a();
            bVar.g();
        }
    }

    public void E() {
        k1.q qVar = this.f7905g;
        if (qVar != null) {
            qVar.d(null);
        }
        D();
        this.f7905g = null;
        this.f7901c = null;
        this.f7903e = null;
    }

    public void F() {
        for (int i3 = 0; i3 < this.f7912n.size(); i3++) {
            this.f7902d.removeView((n) this.f7912n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f7910l.size(); i4++) {
            this.f7902d.removeView((AbstractC0868a) this.f7910l.valueAt(i4));
        }
        D();
        e0();
        this.f7902d = null;
        this.f7914p = false;
        if (this.f7909k.size() <= 0) {
            return;
        }
        AbstractC0527b.a(this.f7909k.valueAt(0));
        throw null;
    }

    public void G() {
        this.f7904f = null;
    }

    public l M() {
        return this.f7899a;
    }

    void N(int i3) {
        AbstractC0527b.a(this.f7909k.get(i3));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public void R() {
    }

    public void S() {
        this.f7916r.clear();
        this.f7917s.clear();
    }

    public void T() {
        H();
    }

    public void U(int i3, int i4, int i5, int i6, int i7) {
        if (this.f7911m.get(i3) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
        }
        O();
        View view = (b) this.f7911m.get(i3);
        if (view.getParent() == null) {
            this.f7902d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.f7916r.add(Integer.valueOf(i3));
    }

    public void V(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        O();
        N(i3);
        AbstractC0868a abstractC0868a = (AbstractC0868a) this.f7910l.get(i3);
        abstractC0868a.a(flutterMutatorsStack, i4, i5, i6, i7);
        abstractC0868a.setVisibility(0);
        abstractC0868a.bringToFront();
        new FrameLayout.LayoutParams(i8, i9);
        AbstractC0527b.a(this.f7909k.get(i3));
        throw null;
    }

    public void W() {
        boolean z2 = false;
        if (this.f7914p && this.f7917s.isEmpty()) {
            this.f7914p = false;
            this.f7902d.A(new Runnable() { // from class: io.flutter.plugin.platform.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7891a.P();
                }
            });
        } else {
            if (this.f7914p && this.f7902d.k()) {
                z2 = true;
            }
            K(z2);
        }
    }

    public void X() {
        H();
    }

    public void Y() {
        Iterator it = this.f7907i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).h();
        }
    }

    public void Z(int i3) {
        if (i3 < 40) {
            return;
        }
        Iterator it = this.f7907i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void a(io.flutter.view.j jVar) {
        this.f7906h.b(jVar);
    }

    @Override // io.flutter.plugin.platform.o
    public boolean b(int i3) {
        return this.f7907i.containsKey(Integer.valueOf(i3));
    }

    @Override // io.flutter.plugin.platform.o
    public View c(int i3) {
        if (b(i3)) {
            return ((y) this.f7907i.get(Integer.valueOf(i3))).e();
        }
        AbstractC0527b.a(this.f7909k.get(i3));
        return null;
    }

    @Override // io.flutter.plugin.platform.o
    public void d() {
        this.f7906h.b(null);
    }

    public void f0(boolean z2) {
        this.f7919u = z2;
    }

    public MotionEvent h0(float f3, q.f fVar, boolean z2) {
        MotionEvent motionEventB = this.f7918t.b(N.a.c(fVar.f9617p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar.f9608g, f3).toArray(new MotionEvent.PointerCoords[fVar.f9606e]);
        if (z2 || motionEventB == null) {
            return MotionEvent.obtain(fVar.f9603b.longValue(), fVar.f9604c.longValue(), fVar.f9605d, fVar.f9606e, (MotionEvent.PointerProperties[]) d0(fVar.f9607f).toArray(new MotionEvent.PointerProperties[fVar.f9606e]), pointerCoordsArr, fVar.f9609h, fVar.f9610i, fVar.f9611j, fVar.f9612k, fVar.f9613l, fVar.f9614m, fVar.f9615n, fVar.f9616o);
        }
        j0(motionEventB, pointerCoordsArr);
        return motionEventB;
    }

    public void u(Context context, TextureRegistry textureRegistry, C0543a c0543a) {
        if (this.f7901c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f7901c = context;
        this.f7903e = textureRegistry;
        k1.q qVar = new k1.q(c0543a);
        this.f7905g = qVar;
        qVar.d(this.f7920v);
    }

    public void v(F f3) {
        this.f7904f = f3;
    }

    public void w(FlutterRenderer flutterRenderer) {
        this.f7900b = new C0906c(flutterRenderer, true);
    }

    public void x(D d3) {
        this.f7902d = d3;
        for (int i3 = 0; i3 < this.f7912n.size(); i3++) {
            this.f7902d.addView((n) this.f7912n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f7910l.size(); i4++) {
            this.f7902d.addView((AbstractC0868a) this.f7910l.valueAt(i4));
        }
        if (this.f7909k.size() <= 0) {
            return;
        }
        AbstractC0527b.a(this.f7909k.valueAt(0));
        throw null;
    }

    public boolean y(View view) {
        if (view == null || !this.f7908j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f7908j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }
}
