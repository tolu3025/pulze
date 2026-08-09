package f0;

import e0.AbstractC0829j;
import java.util.Objects;

/* JADX INFO: renamed from: f0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0861t extends AbstractC0851j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AbstractC0851j f7220e = new C0861t(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f7221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f7222d;

    C0861t(Object[] objArr, int i3) {
        this.f7221c = objArr;
        this.f7222d = i3;
    }

    @Override // f0.AbstractC0851j, f0.AbstractC0850i
    int b(Object[] objArr, int i3) {
        System.arraycopy(this.f7221c, 0, objArr, i3, this.f7222d);
        return i3 + this.f7222d;
    }

    @Override // f0.AbstractC0850i
    Object[] d() {
        return this.f7221c;
    }

    @Override // f0.AbstractC0850i
    int f() {
        return this.f7222d;
    }

    @Override // java.util.List
    public Object get(int i3) {
        AbstractC0829j.l(i3, this.f7222d);
        Object obj = this.f7221c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // f0.AbstractC0850i
    int l() {
        return 0;
    }

    @Override // f0.AbstractC0850i
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7222d;
    }
}
