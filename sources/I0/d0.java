package I0;

import J0.AbstractC0386b;
import J0.C0391g;
import V0.K;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends AbstractC0362c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC0791i f2299v = AbstractC0791i.f6770b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final P f2300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f2301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC0791i f2302u;

    public interface a extends W {
        void c();

        void e(D0.w wVar, List list);
    }

    d0(C0384z c0384z, C0391g c0391g, P p2, a aVar) {
        super(c0384z, V0.t.f(), c0391g, C0391g.d.WRITE_STREAM_CONNECTION_BACKOFF, C0391g.d.WRITE_STREAM_IDLE, C0391g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f2301t = false;
        this.f2302u = f2299v;
        this.f2300s = p2;
    }

    boolean A() {
        return this.f2301t;
    }

    @Override // I0.AbstractC0362c
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void r(V0.L l3) {
        this.f2302u = l3.c0();
        this.f2301t = true;
        ((a) this.f2289m).c();
    }

    @Override // I0.AbstractC0362c
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void s(V0.L l3) {
        this.f2302u = l3.c0();
        this.f2288l.f();
        D0.w wVarE = this.f2300s.E(l3.a0());
        int iE0 = l3.e0();
        ArrayList arrayList = new ArrayList(iE0);
        for (int i3 = 0; i3 < iE0; i3++) {
            arrayList.add(this.f2300s.s(l3.d0(i3), wVarE));
        }
        ((a) this.f2289m).e(wVarE, arrayList);
    }

    void D(AbstractC0791i abstractC0791i) {
        this.f2302u = (AbstractC0791i) J0.C.b(abstractC0791i);
    }

    void E() {
        AbstractC0386b.d(m(), "Writing handshake requires an opened stream", new Object[0]);
        AbstractC0386b.d(!this.f2301t, "Handshake already completed", new Object[0]);
        y((V0.K) V0.K.g0().x(this.f2300s.b()).n());
    }

    void F(List list) {
        AbstractC0386b.d(m(), "Writing mutations requires an opened stream", new Object[0]);
        AbstractC0386b.d(this.f2301t, "Handshake must be complete before writing mutations", new Object[0]);
        K.b bVarG0 = V0.K.g0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVarG0.w(this.f2300s.U((E0.f) it.next()));
        }
        bVarG0.y(this.f2302u);
        y((V0.K) bVarG0.n());
    }

    @Override // I0.AbstractC0362c
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // I0.AbstractC0362c
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // I0.AbstractC0362c
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // I0.AbstractC0362c
    public void v() {
        this.f2301t = false;
        super.v();
    }

    @Override // I0.AbstractC0362c
    public /* bridge */ /* synthetic */ void w() {
        super.w();
    }

    @Override // I0.AbstractC0362c
    protected void x() {
        if (this.f2301t) {
            F(Collections.emptyList());
        }
    }

    AbstractC0791i z() {
        return this.f2302u;
    }
}
