package t0;

import t0.h;

/* JADX INFO: loaded from: classes.dex */
public class i extends j {
    i(Object obj, Object obj2) {
        super(obj, obj2, g.i(), g.i());
    }

    @Override // t0.h
    public boolean c() {
        return true;
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
        return new i(obj, obj2, hVar, hVar2);
    }

    @Override // t0.j
    protected h.a m() {
        return h.a.RED;
    }

    @Override // t0.h
    public int size() {
        return a().size() + 1 + e().size();
    }

    i(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
    }
}
