package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.C;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v.AbstractC1252a;

/* JADX INFO: loaded from: classes.dex */
class l extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final z.b f4586j = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4590g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f4587d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f4588e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f4589f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4591h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4592i = false;

    static class a implements z.b {
        a() {
        }

        @Override // androidx.lifecycle.z.b
        public y a(Class cls) {
            return new l(true);
        }

        @Override // androidx.lifecycle.z.b
        public /* synthetic */ y b(Class cls, AbstractC1252a abstractC1252a) {
            return A.b(this, cls, abstractC1252a);
        }
    }

    l(boolean z2) {
        this.f4590g = z2;
    }

    static l i(C c3) {
        return (l) new z(c3, f4586j).a(l.class);
    }

    @Override // androidx.lifecycle.y
    protected void d() {
        if (j.f4517M) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4591h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4587d.equals(lVar.f4587d) && this.f4588e.equals(lVar.f4588e) && this.f4589f.equals(lVar.f4589f);
    }

    boolean f(Fragment fragment) {
        return this.f4587d.add(fragment);
    }

    void g(Fragment fragment) {
        if (j.f4517M) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = (l) this.f4588e.get(fragment.f4429e);
        if (lVar != null) {
            lVar.d();
            this.f4588e.remove(fragment.f4429e);
        }
        C c3 = (C) this.f4589f.get(fragment.f4429e);
        if (c3 != null) {
            c3.a();
            this.f4589f.remove(fragment.f4429e);
        }
    }

    l h(Fragment fragment) {
        l lVar = (l) this.f4588e.get(fragment.f4429e);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f4590g);
        this.f4588e.put(fragment.f4429e, lVar2);
        return lVar2;
    }

    public int hashCode() {
        return (((this.f4587d.hashCode() * 31) + this.f4588e.hashCode()) * 31) + this.f4589f.hashCode();
    }

    Collection j() {
        return this.f4587d;
    }

    C k(Fragment fragment) {
        C c3 = (C) this.f4589f.get(fragment.f4429e);
        if (c3 != null) {
            return c3;
        }
        C c4 = new C();
        this.f4589f.put(fragment.f4429e, c4);
        return c4;
    }

    boolean l() {
        return this.f4591h;
    }

    boolean m(Fragment fragment) {
        return this.f4587d.remove(fragment);
    }

    boolean n(Fragment fragment) {
        if (this.f4587d.contains(fragment)) {
            return this.f4590g ? this.f4591h : !this.f4592i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4587d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4588e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4589f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
