package t0;

import java.util.Comparator;
import t0.h;

/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f11303a = new g();

    private g() {
    }

    public static g i() {
        return f11303a;
    }

    @Override // t0.h
    public h b(Object obj, Object obj2, Comparator comparator) {
        return new i(obj, obj2);
    }

    @Override // t0.h
    public boolean c() {
        return false;
    }

    @Override // t0.h
    public Object getKey() {
        return null;
    }

    @Override // t0.h
    public Object getValue() {
        return null;
    }

    @Override // t0.h
    public boolean isEmpty() {
        return true;
    }

    @Override // t0.h
    public int size() {
        return 0;
    }

    @Override // t0.h
    public h a() {
        return this;
    }

    @Override // t0.h
    public h e() {
        return this;
    }

    @Override // t0.h
    public h g() {
        return this;
    }

    @Override // t0.h
    public h h() {
        return this;
    }

    @Override // t0.h
    public h f(Object obj, Comparator comparator) {
        return this;
    }

    @Override // t0.h
    public h d(Object obj, Object obj2, h.a aVar, h hVar, h hVar2) {
        return this;
    }
}
