package f0;

import e0.AbstractC0826g;
import e0.AbstractC0829j;
import e0.InterfaceC0823d;
import java.io.Serializable;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0843b extends AbstractC0859r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0823d f7190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AbstractC0859r f7191b;

    C0843b(InterfaceC0823d interfaceC0823d, AbstractC0859r abstractC0859r) {
        this.f7190a = (InterfaceC0823d) AbstractC0829j.n(interfaceC0823d);
        this.f7191b = (AbstractC0859r) AbstractC0829j.n(abstractC0859r);
    }

    @Override // f0.AbstractC0859r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7191b.compare(this.f7190a.c(obj), this.f7190a.c(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0843b)) {
            return false;
        }
        C0843b c0843b = (C0843b) obj;
        return this.f7190a.equals(c0843b.f7190a) && this.f7191b.equals(c0843b.f7191b);
    }

    public int hashCode() {
        return AbstractC0826g.b(this.f7190a, this.f7191b);
    }

    public String toString() {
        return this.f7191b + ".onResultOf(" + this.f7190a + ")";
    }
}
