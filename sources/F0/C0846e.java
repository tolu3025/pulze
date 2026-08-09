package f0;

import e0.AbstractC0829j;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: f0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0846e extends AbstractC0859r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f7192a;

    C0846e(Comparator comparator) {
        this.f7192a = (Comparator) AbstractC0829j.n(comparator);
    }

    @Override // f0.AbstractC0859r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7192a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0846e) {
            return this.f7192a.equals(((C0846e) obj).f7192a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7192a.hashCode();
    }

    public String toString() {
        return this.f7192a.toString();
    }
}
