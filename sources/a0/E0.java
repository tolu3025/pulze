package A0;

import A0.C0215m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.n f43b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0.n f44c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f45d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f46e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t0.e f47f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50i;

    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public E0(h0 h0Var, D0.n nVar, D0.n nVar2, List list, boolean z2, t0.e eVar, boolean z3, boolean z4, boolean z5) {
        this.f42a = h0Var;
        this.f43b = nVar;
        this.f44c = nVar2;
        this.f45d = list;
        this.f46e = z2;
        this.f47f = eVar;
        this.f48g = z3;
        this.f49h = z4;
        this.f50i = z5;
    }

    public static E0 c(h0 h0Var, D0.n nVar, t0.e eVar, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(C0215m.a(C0215m.a.ADDED, (D0.i) it.next()));
        }
        return new E0(h0Var, nVar, D0.n.f(h0Var.a()), arrayList, z2, eVar, true, z3, z4);
    }

    public boolean a() {
        return this.f48g;
    }

    public boolean b() {
        return this.f49h;
    }

    public List d() {
        return this.f45d;
    }

    public D0.n e() {
        return this.f43b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f46e == e02.f46e && this.f48g == e02.f48g && this.f49h == e02.f49h && this.f42a.equals(e02.f42a) && this.f47f.equals(e02.f47f) && this.f43b.equals(e02.f43b) && this.f44c.equals(e02.f44c) && this.f50i == e02.f50i) {
            return this.f45d.equals(e02.f45d);
        }
        return false;
    }

    public t0.e f() {
        return this.f47f;
    }

    public D0.n g() {
        return this.f44c;
    }

    public h0 h() {
        return this.f42a;
    }

    public int hashCode() {
        return (((((((((((((((this.f42a.hashCode() * 31) + this.f43b.hashCode()) * 31) + this.f44c.hashCode()) * 31) + this.f45d.hashCode()) * 31) + this.f47f.hashCode()) * 31) + (this.f46e ? 1 : 0)) * 31) + (this.f48g ? 1 : 0)) * 31) + (this.f49h ? 1 : 0)) * 31) + (this.f50i ? 1 : 0);
    }

    public boolean i() {
        return this.f50i;
    }

    public boolean j() {
        return !this.f47f.isEmpty();
    }

    public boolean k() {
        return this.f46e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f42a + ", " + this.f43b + ", " + this.f44c + ", " + this.f45d + ", isFromCache=" + this.f46e + ", mutatedKeys=" + this.f47f.size() + ", didSyncStateChange=" + this.f48g + ", excludesMetadataChanges=" + this.f49h + ", hasCachedResults=" + this.f50i + ")";
    }
}
