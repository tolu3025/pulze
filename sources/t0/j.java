package t0;

import java.util.Comparator;
import t0.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f11309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f11310d;

    j(Object obj, Object obj2, h hVar, h hVar2) {
        this.f11307a = obj;
        this.f11308b = obj2;
        this.f11309c = hVar == null ? g.i() : hVar;
        this.f11310d = hVar2 == null ? g.i() : hVar2;
    }

    private j i() {
        h hVar = this.f11309c;
        h hVarD = hVar.d(null, null, p(hVar), null, null);
        h hVar2 = this.f11310d;
        return d(null, null, p(this), hVarD, hVar2.d(null, null, p(hVar2), null, null));
    }

    private j l() {
        j jVarR = (!this.f11310d.c() || this.f11309c.c()) ? this : r();
        if (jVarR.f11309c.c() && ((j) jVarR.f11309c).f11309c.c()) {
            jVarR = jVarR.s();
        }
        return (jVarR.f11309c.c() && jVarR.f11310d.c()) ? jVarR.i() : jVarR;
    }

    private j n() {
        j jVarI = i();
        return jVarI.e().a().c() ? jVarI.k(null, null, null, ((j) jVarI.e()).s()).r().i() : jVarI;
    }

    private j o() {
        j jVarI = i();
        return jVarI.a().a().c() ? jVarI.s().i() : jVarI;
    }

    private static h.a p(h hVar) {
        return hVar.c() ? h.a.BLACK : h.a.RED;
    }

    private h q() {
        if (this.f11309c.isEmpty()) {
            return g.i();
        }
        j jVarN = (a().c() || a().a().c()) ? this : n();
        return jVarN.k(null, null, ((j) jVarN.f11309c).q(), null).l();
    }

    private j r() {
        return (j) this.f11310d.d(null, null, m(), d(null, null, h.a.RED, null, ((j) this.f11310d).f11309c), null);
    }

    private j s() {
        return (j) this.f11309c.d(null, null, m(), null, d(null, null, h.a.RED, ((j) this.f11309c).f11310d, null));
    }

    @Override // t0.h
    public h a() {
        return this.f11309c;
    }

    @Override // t0.h
    public h b(Object obj, Object obj2, Comparator comparator) {
        int iCompare = comparator.compare(obj, this.f11307a);
        return (iCompare < 0 ? k(null, null, this.f11309c.b(obj, obj2, comparator), null) : iCompare == 0 ? k(obj, obj2, null, null) : k(null, null, null, this.f11310d.b(obj, obj2, comparator))).l();
    }

    @Override // t0.h
    public h e() {
        return this.f11310d;
    }

    @Override // t0.h
    public h f(Object obj, Comparator comparator) {
        j jVarK;
        if (comparator.compare(obj, this.f11307a) < 0) {
            j jVarN = (this.f11309c.isEmpty() || this.f11309c.c() || ((j) this.f11309c).f11309c.c()) ? this : n();
            jVarK = jVarN.k(null, null, jVarN.f11309c.f(obj, comparator), null);
        } else {
            j jVarS = this.f11309c.c() ? s() : this;
            if (!jVarS.f11310d.isEmpty() && !jVarS.f11310d.c() && !((j) jVarS.f11310d).f11309c.c()) {
                jVarS = jVarS.o();
            }
            if (comparator.compare(obj, jVarS.f11307a) == 0) {
                if (jVarS.f11310d.isEmpty()) {
                    return g.i();
                }
                h hVarG = jVarS.f11310d.g();
                jVarS = jVarS.k(hVarG.getKey(), hVarG.getValue(), null, ((j) jVarS.f11310d).q());
            }
            jVarK = jVarS.k(null, null, null, jVarS.f11310d.f(obj, comparator));
        }
        return jVarK.l();
    }

    @Override // t0.h
    public h g() {
        return this.f11309c.isEmpty() ? this : this.f11309c.g();
    }

    @Override // t0.h
    public Object getKey() {
        return this.f11307a;
    }

    @Override // t0.h
    public Object getValue() {
        return this.f11308b;
    }

    @Override // t0.h
    public h h() {
        return this.f11310d.isEmpty() ? this : this.f11310d.h();
    }

    @Override // t0.h
    public boolean isEmpty() {
        return false;
    }

    @Override // t0.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public j d(Object obj, Object obj2, h.a aVar, h hVar, h hVar2) {
        if (obj == null) {
            obj = this.f11307a;
        }
        if (obj2 == null) {
            obj2 = this.f11308b;
        }
        if (hVar == null) {
            hVar = this.f11309c;
        }
        if (hVar2 == null) {
            hVar2 = this.f11310d;
        }
        return aVar == h.a.RED ? new i(obj, obj2, hVar, hVar2) : new f(obj, obj2, hVar, hVar2);
    }

    protected abstract j k(Object obj, Object obj2, h hVar, h hVar2);

    protected abstract h.a m();

    void t(h hVar) {
        this.f11309c = hVar;
    }
}
