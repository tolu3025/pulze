package z0;

import D0.l;
import D0.s;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f12072a;

    public b(s sVar) {
        this.f12072a = sVar;
    }

    public s a() {
        return this.f12072a;
    }

    public l b() {
        return this.f12072a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f12072a.equals(((b) obj).f12072a);
    }

    public int hashCode() {
        return this.f12072a.hashCode();
    }
}
