package I0;

import C0.R1;
import J0.AbstractC0386b;
import J0.C0391g;
import V0.v;
import com.google.protobuf.AbstractC0791i;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends AbstractC0362c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC0791i f2296t = AbstractC0791i.f6770b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final P f2297s;

    interface a extends W {
        void d(D0.w wVar, a0 a0Var);
    }

    c0(C0384z c0384z, C0391g c0391g, P p2, a aVar) {
        super(c0384z, V0.t.d(), c0391g, C0391g.d.LISTEN_STREAM_CONNECTION_BACKOFF, C0391g.d.LISTEN_STREAM_IDLE, C0391g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f2297s = p2;
    }

    @Override // I0.AbstractC0362c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void s(V0.w wVar) {
        this.f2288l.f();
        a0 a0VarG = this.f2297s.G(wVar);
        ((a) this.f2289m).d(this.f2297s.F(wVar), a0VarG);
    }

    public void B(int i3) {
        AbstractC0386b.d(m(), "Unwatching targets requires an open stream", new Object[0]);
        y((V0.v) V0.v.h0().y(this.f2297s.b()).z(i3).n());
    }

    public void C(R1 r12) {
        AbstractC0386b.d(m(), "Watching queries requires an open stream", new Object[0]);
        v.b bVarX = V0.v.h0().y(this.f2297s.b()).x(this.f2297s.b0(r12));
        Map mapT = this.f2297s.T(r12);
        if (mapT != null) {
            bVarX.w(mapT);
        }
        y((V0.v) bVarX.n());
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
    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    @Override // I0.AbstractC0362c
    public /* bridge */ /* synthetic */ void w() {
        super.w();
    }

    @Override // I0.AbstractC0362c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void r(V0.w wVar) {
        s(wVar);
    }
}
