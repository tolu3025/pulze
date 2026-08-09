package A0;

import A0.C0203c0;
import J0.AbstractC0386b;
import java.util.List;

/* JADX INFO: renamed from: A0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f158b;

    public C0211i(List list, boolean z2) {
        this.f158b = list;
        this.f157a = z2;
    }

    private int a(List list, D0.i iVar) {
        int iJ;
        AbstractC0386b.d(this.f158b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f158b.size(); i4++) {
            C0203c0 c0203c0 = (C0203c0) list.get(i4);
            V0.I i5 = (V0.I) this.f158b.get(i4);
            if (c0203c0.f111b.equals(D0.r.f1277b)) {
                AbstractC0386b.d(D0.z.Y(i5), "Bound has a non-key value where the key path is being used %s", i5);
                iJ = D0.l.i(i5.y0()).compareTo(iVar.getKey());
            } else {
                V0.I iE = iVar.e(c0203c0.c());
                AbstractC0386b.d(iE != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iJ = D0.z.j(i5, iE);
            }
            if (c0203c0.b().equals(C0203c0.a.DESCENDING)) {
                iJ *= -1;
            }
            i3 = iJ;
            if (i3 != 0) {
                break;
            }
        }
        return i3;
    }

    public List b() {
        return this.f158b;
    }

    public boolean c() {
        return this.f157a;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (V0.I i3 : this.f158b) {
            if (!z2) {
                sb.append(",");
            }
            sb.append(D0.z.c(i3));
            z2 = false;
        }
        return sb.toString();
    }

    public boolean e(List list, D0.i iVar) {
        int iA = a(list, iVar);
        if (this.f157a) {
            if (iA < 0) {
                return false;
            }
        } else if (iA <= 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0211i.class != obj.getClass()) {
            return false;
        }
        C0211i c0211i = (C0211i) obj;
        return this.f157a == c0211i.f157a && this.f158b.equals(c0211i.f158b);
    }

    public boolean f(List list, D0.i iVar) {
        int iA = a(list, iVar);
        if (this.f157a) {
            if (iA > 0) {
                return false;
            }
        } else if (iA >= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f157a ? 1 : 0) * 31) + this.f158b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f157a);
        sb.append(", position=");
        for (int i3 = 0; i3 < this.f158b.size(); i3++) {
            if (i3 > 0) {
                sb.append(" and ");
            }
            sb.append(D0.z.c((V0.I) this.f158b.get(i3)));
        }
        sb.append(")");
        return sb.toString();
    }
}
