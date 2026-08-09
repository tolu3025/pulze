package C0;

import D0.q;
import J0.C0391g;
import e0.InterfaceC0833n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: C0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0261l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f1010f = TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f1011g = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0262l0 f1013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0833n f1014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0833n f1015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1016e;

    /* JADX INFO: renamed from: C0.l$a */
    public class a implements P1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C0391g.b f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0391g f1018b;

        public a(C0391g c0391g) {
            this.f1018b = c0391g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            J0.A.a("IndexBackfiller", "Documents written: %s", Integer.valueOf(C0261l.this.d()));
            d(C0261l.f1011g);
        }

        private void d(long j3) {
            this.f1017a = this.f1018b.k(C0391g.d.INDEX_BACKFILL, j3, new Runnable() { // from class: C0.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1004a.c();
                }
            });
        }

        @Override // C0.P1
        public void a() {
            C0391g.b bVar = this.f1017a;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // C0.P1
        public void start() {
            d(C0261l.f1010f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0261l(AbstractC0262l0 abstractC0262l0, C0391g c0391g, final M m3) {
        this(abstractC0262l0, c0391g, new InterfaceC0833n() { // from class: C0.h
            @Override // e0.InterfaceC0833n
            public final Object get() {
                return m3.E();
            }
        }, new InterfaceC0833n() { // from class: C0.i
            @Override // e0.InterfaceC0833n
            public final Object get() {
                return m3.I();
            }
        });
        Objects.requireNonNull(m3);
    }

    private q.a e(q.a aVar, C0267n c0267n) {
        Iterator it = c0267n.c().iterator();
        q.a aVar2 = aVar;
        while (it.hasNext()) {
            q.a aVarI = q.a.i((D0.i) ((Map.Entry) it.next()).getValue());
            if (aVarI.compareTo(aVar2) > 0) {
                aVar2 = aVarI;
            }
        }
        return q.a.g(aVar2.l(), aVar2.j(), Math.max(c0267n.b(), aVar.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer g() {
        return Integer.valueOf(i());
    }

    private int h(String str, int i3) {
        InterfaceC0264m interfaceC0264m = (InterfaceC0264m) this.f1014c.get();
        C0276q c0276q = (C0276q) this.f1015d.get();
        q.a aVarH = interfaceC0264m.h(str);
        C0267n c0267nL = c0276q.l(str, aVarH, i3);
        interfaceC0264m.j(c0267nL.c());
        q.a aVarE = e(aVarH, c0267nL);
        J0.A.a("IndexBackfiller", "Updating offset: %s", aVarE);
        interfaceC0264m.e(str, aVarE);
        return c0267nL.c().size();
    }

    private int i() {
        InterfaceC0264m interfaceC0264m = (InterfaceC0264m) this.f1014c.get();
        HashSet hashSet = new HashSet();
        int iH = this.f1016e;
        while (iH > 0) {
            String strM = interfaceC0264m.m();
            if (strM == null || hashSet.contains(strM)) {
                break;
            }
            J0.A.a("IndexBackfiller", "Processing collection: %s", strM);
            iH -= h(strM, iH);
            hashSet.add(strM);
        }
        return this.f1016e - iH;
    }

    public int d() {
        return ((Integer) this.f1013b.k("Backfill Indexes", new J0.E() { // from class: C0.j
            @Override // J0.E
            public final Object get() {
                return this.f1002a.g();
            }
        })).intValue();
    }

    public a f() {
        return this.f1012a;
    }

    public C0261l(AbstractC0262l0 abstractC0262l0, C0391g c0391g, InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        this.f1016e = 50;
        this.f1013b = abstractC0262l0;
        this.f1012a = new a(c0391g);
        this.f1014c = interfaceC0833n;
        this.f1015d = interfaceC0833n2;
    }
}
