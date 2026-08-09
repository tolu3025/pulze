package t0;

import t0.h;

/* JADX INFO: loaded from: classes.dex */
public class f extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11302e;

    f(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
        this.f11302e = -1;
    }

    @Override // t0.h
    public boolean c() {
        return false;
    }

    @Override // t0.j
    protected j k(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (hVar == null) {
            hVar = a();
        }
        if (hVar2 == null) {
            hVar2 = e();
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    @Override // t0.j
    protected h.a m() {
        return h.a.BLACK;
    }

    @Override // t0.h
    public int size() {
        if (this.f11302e == -1) {
            this.f11302e = a().size() + 1 + e().size();
        }
        return this.f11302e;
    }

    @Override // t0.j
    void t(h hVar) {
        if (this.f11302e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.t(hVar);
    }
}
