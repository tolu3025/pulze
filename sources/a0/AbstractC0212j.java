package A0;

import C0.AbstractC0262l0;
import C0.C0261l;
import C0.P1;
import I0.InterfaceC0374o;
import J0.AbstractC0386b;
import J0.C0391g;
import android.content.Context;
import y0.AbstractC1279a;
import y0.C1288j;

/* JADX INFO: renamed from: A0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.firebase.firestore.U f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I0.N f163b = new I0.N();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC0262l0 f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0.M f165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k0 f166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private I0.U f167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0217o f168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0261l f169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P1 f170i;

    /* JADX INFO: renamed from: A0.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0391g f172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0214l f173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1288j f174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AbstractC1279a f176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AbstractC1279a f177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final I0.J f178h;

        public a(Context context, C0391g c0391g, C0214l c0214l, C1288j c1288j, int i3, AbstractC1279a abstractC1279a, AbstractC1279a abstractC1279a2, I0.J j3) {
            this.f171a = context;
            this.f172b = c0391g;
            this.f173c = c0214l;
            this.f174d = c1288j;
            this.f175e = i3;
            this.f176f = abstractC1279a;
            this.f177g = abstractC1279a2;
            this.f178h = j3;
        }
    }

    public AbstractC0212j(com.google.firebase.firestore.U u2) {
        this.f162a = u2;
    }

    public static AbstractC0212j h(com.google.firebase.firestore.U u2) {
        return u2.i() ? new j0(u2) : new Z(u2);
    }

    protected abstract C0217o a(a aVar);

    protected abstract P1 b(a aVar);

    protected abstract C0261l c(a aVar);

    protected abstract C0.M d(a aVar);

    protected abstract AbstractC0262l0 e(a aVar);

    protected abstract I0.U f(a aVar);

    protected abstract k0 g(a aVar);

    protected InterfaceC0374o i() {
        return this.f163b.f();
    }

    public I0.r j() {
        return this.f163b.g();
    }

    public C0217o k() {
        return (C0217o) AbstractC0386b.e(this.f168g, "eventManager not initialized yet", new Object[0]);
    }

    public P1 l() {
        return this.f170i;
    }

    public C0261l m() {
        return this.f169h;
    }

    public C0.M n() {
        return (C0.M) AbstractC0386b.e(this.f165d, "localStore not initialized yet", new Object[0]);
    }

    public AbstractC0262l0 o() {
        return (AbstractC0262l0) AbstractC0386b.e(this.f164c, "persistence not initialized yet", new Object[0]);
    }

    public I0.P p() {
        return this.f163b.j();
    }

    public I0.U q() {
        return (I0.U) AbstractC0386b.e(this.f167f, "remoteStore not initialized yet", new Object[0]);
    }

    public k0 r() {
        return (k0) AbstractC0386b.e(this.f166e, "syncEngine not initialized yet", new Object[0]);
    }

    public void s(a aVar) {
        this.f163b.k(aVar);
        AbstractC0262l0 abstractC0262l0E = e(aVar);
        this.f164c = abstractC0262l0E;
        abstractC0262l0E.n();
        this.f165d = d(aVar);
        this.f167f = f(aVar);
        this.f166e = g(aVar);
        this.f168g = a(aVar);
        this.f165d.q0();
        this.f167f.Q();
        this.f170i = b(aVar);
        this.f169h = c(aVar);
    }
}
