package A0;

import A0.C0203c0;
import A0.C0218p;
import D0.q;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.u f211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0211i f214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0211i f215h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f216a;

        static {
            int[] iArr = new int[C0218p.b.values().length];
            f216a = iArr;
            try {
                iArr[C0218p.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f216a[C0218p.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f216a[C0218p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f216a[C0218p.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f216a[C0218p.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f216a[C0218p.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f216a[C0218p.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f216a[C0218p.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f216a[C0218p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f216a[C0218p.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public l0(D0.u uVar, String str, List list, List list2, long j3, C0211i c0211i, C0211i c0211i2) {
        this.f211d = uVar;
        this.f212e = str;
        this.f209b = list2;
        this.f210c = list;
        this.f213f = j3;
        this.f214g = c0211i;
        this.f215h = c0211i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair b(q.c cVar, C0211i c0211i) {
        V0.I i3 = D0.z.f1311d;
        Iterator it = g(cVar.g()).iterator();
        boolean zC = true;
        while (true) {
            int i4 = 0;
            boolean z2 = false;
            if (!it.hasNext()) {
                if (c0211i != null) {
                    while (true) {
                        if (i4 < this.f209b.size()) {
                            if (((C0203c0) this.f209b.get(i4)).c().equals(cVar.g())) {
                                V0.I i5 = (V0.I) c0211i.b().get(i4);
                                if (D0.z.a0(i3, zC, i5, c0211i.c()) < 0) {
                                    zC = c0211i.c();
                                    i3 = i5;
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return new Pair(i3, Boolean.valueOf(zC));
            }
            C0218p c0218p = (C0218p) it.next();
            V0.I iH = D0.z.f1311d;
            switch (a.f216a[c0218p.g().ordinal()]) {
                case 3:
                case 4:
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    iH = c0218p.h();
                    z2 = true;
                    break;
                case 5:
                case 6:
                default:
                    z2 = true;
                    break;
                case 7:
                case 8:
                    iH = D0.z.O(c0218p.h());
                    z2 = true;
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    iH = c0218p.h();
                    break;
            }
            if (D0.z.a0(i3, zC, iH, z2) < 0) {
                zC = z2;
                i3 = iH;
            }
        }
    }

    private Pair e(q.c cVar, C0211i c0211i) {
        V0.I i3 = D0.z.f1313f;
        Iterator it = g(cVar.g()).iterator();
        boolean zC = true;
        while (true) {
            int i4 = 0;
            z = false;
            boolean z2 = false;
            if (!it.hasNext()) {
                if (c0211i != null) {
                    while (true) {
                        if (i4 < this.f209b.size()) {
                            if (((C0203c0) this.f209b.get(i4)).c().equals(cVar.g())) {
                                V0.I i5 = (V0.I) c0211i.b().get(i4);
                                if (D0.z.g0(i3, zC, i5, c0211i.c()) > 0) {
                                    zC = c0211i.c();
                                    i3 = i5;
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return new Pair(i3, Boolean.valueOf(zC));
            }
            C0218p c0218p = (C0218p) it.next();
            V0.I iH = D0.z.f1313f;
            switch (a.f216a[c0218p.g().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    iH = c0218p.h();
                case 5:
                case 6:
                default:
                    z2 = true;
                    break;
                case 7:
                    iH = c0218p.h();
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    iH = D0.z.P(c0218p.h());
                    break;
            }
            if (D0.z.g0(i3, zC, iH, z2) > 0) {
                zC = z2;
                i3 = iH;
            }
        }
    }

    private List g(D0.r rVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0219q abstractC0219q : this.f210c) {
            if (abstractC0219q instanceof C0218p) {
                C0218p c0218p = (C0218p) abstractC0219q;
                if (c0218p.f().equals(rVar)) {
                    arrayList.add(c0218p);
                }
            }
        }
        return arrayList;
    }

    public List a(D0.q qVar) {
        q.c cVarC = qVar.c();
        if (cVarC == null) {
            return null;
        }
        for (C0218p c0218p : g(cVarC.g())) {
            int i3 = a.f216a[c0218p.g().ordinal()];
            if (i3 == 1) {
                return c0218p.h().o0().g();
            }
            if (i3 == 2) {
                return Collections.singletonList(c0218p.h());
            }
        }
        return null;
    }

    public String c() {
        String str = this.f208a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n().n());
        if (this.f212e != null) {
            sb.append("|cg:");
            sb.append(this.f212e);
        }
        sb.append("|f:");
        Iterator it = h().iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0219q) it.next()).a());
        }
        sb.append("|ob:");
        for (C0203c0 c0203c0 : m()) {
            sb.append(c0203c0.c().n());
            sb.append(c0203c0.b().equals(C0203c0.a.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb.append("|l:");
            sb.append(j());
        }
        if (this.f214g != null) {
            sb.append("|lb:");
            sb.append(this.f214g.c() ? "b:" : "a:");
            sb.append(this.f214g.d());
        }
        if (this.f215h != null) {
            sb.append("|ub:");
            sb.append(this.f215h.c() ? "a:" : "b:");
            sb.append(this.f215h.d());
        }
        String string = sb.toString();
        this.f208a = string;
        return string;
    }

    public String d() {
        return this.f212e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        String str = this.f212e;
        if (str == null ? l0Var.f212e != null : !str.equals(l0Var.f212e)) {
            return false;
        }
        if (this.f213f != l0Var.f213f || !this.f209b.equals(l0Var.f209b) || !this.f210c.equals(l0Var.f210c) || !this.f211d.equals(l0Var.f211d)) {
            return false;
        }
        C0211i c0211i = this.f214g;
        if (c0211i == null ? l0Var.f214g != null : !c0211i.equals(l0Var.f214g)) {
            return false;
        }
        C0211i c0211i2 = this.f215h;
        C0211i c0211i3 = l0Var.f215h;
        return c0211i2 != null ? c0211i2.equals(c0211i3) : c0211i3 == null;
    }

    public C0211i f() {
        return this.f215h;
    }

    public List h() {
        return this.f210c;
    }

    public int hashCode() {
        int iHashCode = this.f209b.hashCode() * 31;
        String str = this.f212e;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f210c.hashCode()) * 31) + this.f211d.hashCode()) * 31;
        long j3 = this.f213f;
        int i3 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        C0211i c0211i = this.f214g;
        int iHashCode3 = (i3 + (c0211i != null ? c0211i.hashCode() : 0)) * 31;
        C0211i c0211i2 = this.f215h;
        return iHashCode3 + (c0211i2 != null ? c0211i2.hashCode() : 0);
    }

    public C0203c0.a i() {
        return ((C0203c0) this.f209b.get(r0.size() - 1)).b();
    }

    public long j() {
        return this.f213f;
    }

    public C0211i k(D0.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (q.c cVar : qVar.e()) {
            Pair pairB = cVar.h().equals(q.c.a.ASCENDING) ? b(cVar, this.f214g) : e(cVar, this.f214g);
            arrayList.add((V0.I) pairB.first);
            zBooleanValue &= ((Boolean) pairB.second).booleanValue();
        }
        return new C0211i(arrayList, zBooleanValue);
    }

    public Collection l(D0.q qVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q.c cVar : qVar.e()) {
            for (C0218p c0218p : g(cVar.g())) {
                int i3 = a.f216a[c0218p.g().ordinal()];
                if (i3 == 3 || i3 == 4) {
                    linkedHashMap.put(cVar.g(), c0218p.h());
                } else if (i3 == 5 || i3 == 6) {
                    linkedHashMap.put(cVar.g(), c0218p.h());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List m() {
        return this.f209b;
    }

    public D0.u n() {
        return this.f211d;
    }

    public int o() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f210c.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            for (C0218p c0218p : ((AbstractC0219q) it.next()).c()) {
                if (!c0218p.f().D()) {
                    if (c0218p.g().equals(C0218p.b.ARRAY_CONTAINS) || c0218p.g().equals(C0218p.b.ARRAY_CONTAINS_ANY)) {
                        i3 = 1;
                    } else {
                        hashSet.add(c0218p.f());
                    }
                }
            }
        }
        for (C0203c0 c0203c0 : this.f209b) {
            if (!c0203c0.c().D()) {
                hashSet.add(c0203c0.c());
            }
        }
        return hashSet.size() + i3;
    }

    public C0211i p() {
        return this.f214g;
    }

    public C0211i q(D0.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (q.c cVar : qVar.e()) {
            Pair pairE = cVar.h().equals(q.c.a.ASCENDING) ? e(cVar, this.f215h) : b(cVar, this.f215h);
            arrayList.add((V0.I) pairE.first);
            zBooleanValue &= ((Boolean) pairE.second).booleanValue();
        }
        return new C0211i(arrayList, zBooleanValue);
    }

    public boolean r() {
        return this.f213f != -1;
    }

    public boolean s() {
        return D0.l.r(this.f211d) && this.f212e == null && this.f210c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f211d.n());
        if (this.f212e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f212e);
        }
        if (!this.f210c.isEmpty()) {
            sb.append(" where ");
            for (int i3 = 0; i3 < this.f210c.size(); i3++) {
                if (i3 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f210c.get(i3));
            }
        }
        if (!this.f209b.isEmpty()) {
            sb.append(" order by ");
            for (int i4 = 0; i4 < this.f209b.size(); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f209b.get(i4));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
