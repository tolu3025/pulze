package z0;

import A0.f0;
import A0.l0;

/* JADX INFO: loaded from: classes.dex */
public class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0.a f12099b;

    public i(l0 l0Var, f0.a aVar) {
        this.f12098a = l0Var;
        this.f12099b = aVar;
    }

    public f0.a a() {
        return this.f12099b;
    }

    public l0 b() {
        return this.f12098a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f12098a.equals(iVar.f12098a) && this.f12099b == iVar.f12099b;
    }

    public int hashCode() {
        return (this.f12098a.hashCode() * 31) + this.f12099b.hashCode();
    }
}
