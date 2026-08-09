package A0;

import A0.C0203c0;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C0203c0 f126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C0203c0 f127m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l0 f130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0 f131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D0.u f133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0211i f137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0211i f138k;

    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    private static class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f142a;

        b(List list) {
            boolean z2;
            Iterator it = list.iterator();
            loop0: while (true) {
                z2 = false;
                while (it.hasNext()) {
                    z2 = (z2 || ((C0203c0) it.next()).c().equals(D0.r.f1277b)) ? true : z2;
                }
            }
            if (!z2) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f142a = list;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(D0.i iVar, D0.i iVar2) {
            Iterator it = this.f142a.iterator();
            while (it.hasNext()) {
                int iA = ((C0203c0) it.next()).a(iVar, iVar2);
                if (iA != 0) {
                    return iA;
                }
            }
            return 0;
        }
    }

    static {
        C0203c0.a aVar = C0203c0.a.ASCENDING;
        D0.r rVar = D0.r.f1277b;
        f126l = C0203c0.d(aVar, rVar);
        f127m = C0203c0.d(C0203c0.a.DESCENDING, rVar);
    }

    public f0(D0.u uVar, String str) {
        this(uVar, str, Collections.emptyList(), Collections.emptyList(), -1L, a.LIMIT_TO_FIRST, null, null);
    }

    public static f0 b(D0.u uVar) {
        return new f0(uVar, null);
    }

    private boolean w(D0.i iVar) {
        C0211i c0211i = this.f137j;
        if (c0211i != null && !c0211i.f(m(), iVar)) {
            return false;
        }
        C0211i c0211i2 = this.f138k;
        return c0211i2 == null || c0211i2.e(m(), iVar);
    }

    private boolean x(D0.i iVar) {
        Iterator it = this.f132e.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0219q) it.next()).d(iVar)) {
                return false;
            }
        }
        return true;
    }

    private boolean y(D0.i iVar) {
        for (C0203c0 c0203c0 : m()) {
            if (!c0203c0.c().equals(D0.r.f1277b) && iVar.e(c0203c0.f111b) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean z(D0.i iVar) {
        D0.u uVarP = iVar.getKey().p();
        return this.f134g != null ? iVar.getKey().q(this.f134g) && this.f133f.v(uVarP) : D0.l.r(this.f133f) ? this.f133f.equals(uVarP) : this.f133f.v(uVarP) && this.f133f.w() == uVarP.w() - 1;
    }

    public f0 A(C0203c0 c0203c0) {
        AbstractC0386b.d(!r(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f128a);
        arrayList.add(c0203c0);
        return new f0(this.f133f, this.f134g, this.f132e, arrayList, this.f135h, this.f136i, this.f137j, this.f138k);
    }

    public f0 B(C0211i c0211i) {
        return new f0(this.f133f, this.f134g, this.f132e, this.f128a, this.f135h, this.f136i, c0211i, this.f138k);
    }

    public synchronized l0 C() {
        try {
            if (this.f131d == null) {
                this.f131d = E(this.f128a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f131d;
    }

    public synchronized l0 D() {
        try {
            if (this.f130c == null) {
                this.f130c = E(m());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f130c;
    }

    public synchronized l0 E(List list) {
        if (this.f136i == a.LIMIT_TO_FIRST) {
            return new l0(n(), f(), i(), list, this.f135h, o(), g());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0203c0 c0203c0 = (C0203c0) it.next();
            C0203c0.a aVarB = c0203c0.b();
            C0203c0.a aVar = C0203c0.a.DESCENDING;
            if (aVarB == aVar) {
                aVar = C0203c0.a.ASCENDING;
            }
            arrayList.add(C0203c0.d(aVar, c0203c0.c()));
        }
        C0211i c0211i = this.f138k;
        C0211i c0211i2 = c0211i != null ? new C0211i(c0211i.b(), this.f138k.c()) : null;
        C0211i c0211i3 = this.f137j;
        return new l0(n(), f(), i(), arrayList, this.f135h, c0211i2, c0211i3 != null ? new C0211i(c0211i3.b(), this.f137j.c()) : null);
    }

    public f0 a(D0.u uVar) {
        return new f0(uVar, null, this.f132e, this.f128a, this.f135h, this.f136i, this.f137j, this.f138k);
    }

    public Comparator c() {
        return new b(m());
    }

    public f0 d(C0211i c0211i) {
        return new f0(this.f133f, this.f134g, this.f132e, this.f128a, this.f135h, this.f136i, this.f137j, c0211i);
    }

    public f0 e(AbstractC0219q abstractC0219q) {
        AbstractC0386b.d(!r(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f132e);
        arrayList.add(abstractC0219q);
        return new f0(this.f133f, this.f134g, arrayList, this.f128a, this.f135h, this.f136i, this.f137j, this.f138k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f136i != f0Var.f136i) {
            return false;
        }
        return D().equals(f0Var.D());
    }

    public String f() {
        return this.f134g;
    }

    public C0211i g() {
        return this.f138k;
    }

    public List h() {
        return this.f128a;
    }

    public int hashCode() {
        return (D().hashCode() * 31) + this.f136i.hashCode();
    }

    public List i() {
        return this.f132e;
    }

    public SortedSet j() {
        TreeSet treeSet = new TreeSet();
        Iterator it = i().iterator();
        while (it.hasNext()) {
            for (C0218p c0218p : ((AbstractC0219q) it.next()).c()) {
                if (c0218p.i()) {
                    treeSet.add(c0218p.f());
                }
            }
        }
        return treeSet;
    }

    public long k() {
        return this.f135h;
    }

    public a l() {
        return this.f136i;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public synchronized java.util.List m() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r0 = r6.f129b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L9b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List r2 = r6.f128a     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            A0.c0 r3 = (A0.C0203c0) r3     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            D0.r r3 = r3.f111b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.n()     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L15
        L2e:
            r0 = move-exception
            goto L9f
        L30:
            java.util.List r2 = r6.f128a     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L4b
            java.util.List r2 = r6.f128a     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2e
            A0.c0 r2 = (A0.C0203c0) r2     // Catch: java.lang.Throwable -> L2e
            A0.c0$a r2 = r2.b()     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L4b:
            A0.c0$a r2 = A0.C0203c0.a.ASCENDING     // Catch: java.lang.Throwable -> L2e
        L4d:
            java.util.SortedSet r3 = r6.j()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2e
        L55:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2e
            D0.r r4 = (D0.r) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r4.n()     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            boolean r5 = r4.D()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            A0.c0 r4 = A0.C0203c0.d(r2, r4)     // Catch: java.lang.Throwable -> L2e
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L79:
            D0.r r3 = D0.r.f1277b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.n()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L95
            A0.c0$a r1 = A0.C0203c0.a.ASCENDING     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L90
            A0.c0 r1 = A0.f0.f126l     // Catch: java.lang.Throwable -> L2e
            goto L92
        L90:
            A0.c0 r1 = A0.f0.f127m     // Catch: java.lang.Throwable -> L2e
        L92:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
        L95:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2e
            r6.f129b = r0     // Catch: java.lang.Throwable -> L2e
        L9b:
            java.util.List r0 = r6.f129b     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return r0
        L9f:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.f0.m():java.util.List");
    }

    public D0.u n() {
        return this.f133f;
    }

    public C0211i o() {
        return this.f137j;
    }

    public boolean p() {
        return this.f135h != -1;
    }

    public boolean q() {
        return this.f134g != null;
    }

    public boolean r() {
        return D0.l.r(this.f133f) && this.f134g == null && this.f132e.isEmpty();
    }

    public f0 s(long j3) {
        return new f0(this.f133f, this.f134g, this.f132e, this.f128a, j3, a.LIMIT_TO_FIRST, this.f137j, this.f138k);
    }

    public f0 t(long j3) {
        return new f0(this.f133f, this.f134g, this.f132e, this.f128a, j3, a.LIMIT_TO_LAST, this.f137j, this.f138k);
    }

    public String toString() {
        return "Query(target=" + D().toString() + ";limitType=" + this.f136i.toString() + ")";
    }

    public boolean u(D0.i iVar) {
        return iVar.d() && z(iVar) && y(iVar) && x(iVar) && w(iVar);
    }

    public boolean v() {
        if (this.f132e.isEmpty() && this.f135h == -1 && this.f137j == null && this.f138k == null) {
            return h().isEmpty() || (h().size() == 1 && ((C0203c0) h().get(0)).f111b.D());
        }
        return false;
    }

    public f0(D0.u uVar, String str, List list, List list2, long j3, a aVar, C0211i c0211i, C0211i c0211i2) {
        this.f133f = uVar;
        this.f134g = str;
        this.f128a = list2;
        this.f132e = list;
        this.f135h = j3;
        this.f136i = aVar;
        this.f137j = c0211i;
        this.f138k = c0211i2;
    }
}
