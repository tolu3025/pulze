package G1;

import e0.AbstractC0829j;
import f0.AbstractC0851j;
import f0.AbstractC0867z;
import io.grpc.internal.C0973v0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.C1298a;
import y1.C1320x;
import y1.EnumC1313p;
import y1.S;
import y1.T;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends S {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f2004l = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S.e f2006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f2007i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected EnumC1313p f2009k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f2005g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final T f2008j = new C0973v0();

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f2010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2011b;

        public b(l0 l0Var, List list) {
            this.f2010a = l0Var;
            this.f2011b = list;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f2012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private S.h f2013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f2014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f2015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final T f2016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private EnumC1313p f2017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private S.j f2018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2019h;

        private final class a extends G1.c {
            private a() {
            }

            @Override // G1.c, y1.S.e
            public void f(EnumC1313p enumC1313p, S.j jVar) {
                if (g.this.f2005g.containsKey(c.this.f2012a)) {
                    c.this.f2017f = enumC1313p;
                    c.this.f2018g = jVar;
                    if (c.this.f2019h) {
                        return;
                    }
                    g gVar = g.this;
                    if (gVar.f2007i) {
                        return;
                    }
                    if (enumC1313p == EnumC1313p.IDLE && gVar.t()) {
                        c.this.f2015d.e();
                    }
                    g.this.v();
                }
            }

            @Override // G1.c
            protected S.e g() {
                return g.this.f2006h;
            }
        }

        public c(g gVar, Object obj, T t2, Object obj2, S.j jVar) {
            this(obj, t2, obj2, jVar, null, false);
        }

        protected void f() {
            if (this.f2019h) {
                return;
            }
            g.this.f2005g.remove(this.f2012a);
            this.f2019h = true;
            g.f2004l.log(Level.FINE, "Child balancer {0} deactivated", this.f2012a);
        }

        Object g() {
            return this.f2014c;
        }

        public S.j h() {
            return this.f2018g;
        }

        public EnumC1313p i() {
            return this.f2017f;
        }

        public T j() {
            return this.f2016e;
        }

        public boolean k() {
            return this.f2019h;
        }

        protected void l(T t2) {
            this.f2019h = false;
        }

        protected void m(S.h hVar) {
            AbstractC0829j.o(hVar, "Missing address list for child");
            this.f2013b = hVar;
        }

        protected void n() {
            this.f2015d.f();
            this.f2017f = EnumC1313p.SHUTDOWN;
            g.f2004l.log(Level.FINE, "Child balancer {0} deleted", this.f2012a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Address = ");
            sb.append(this.f2012a);
            sb.append(", state = ");
            sb.append(this.f2017f);
            sb.append(", picker type: ");
            sb.append(this.f2018g.getClass());
            sb.append(", lb: ");
            sb.append(this.f2015d.g().getClass());
            sb.append(this.f2019h ? ", deactivated" : "");
            return sb.toString();
        }

        public c(Object obj, T t2, Object obj2, S.j jVar, S.h hVar, boolean z2) {
            this.f2012a = obj;
            this.f2016e = t2;
            this.f2019h = z2;
            this.f2018g = jVar;
            this.f2014c = obj2;
            e eVar = new e(new a());
            this.f2015d = eVar;
            this.f2017f = z2 ? EnumC1313p.IDLE : EnumC1313p.CONNECTING;
            this.f2013b = hVar;
            if (z2) {
                return;
            }
            eVar.r(t2);
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f2022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2023b;

        public d(C1320x c1320x) {
            AbstractC0829j.o(c1320x, "eag");
            this.f2022a = new String[c1320x.a().size()];
            Iterator it = c1320x.a().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                this.f2022a[i3] = ((SocketAddress) it.next()).toString();
                i3++;
            }
            Arrays.sort(this.f2022a);
            this.f2023b = Arrays.hashCode(this.f2022a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.f2023b == this.f2023b) {
                String[] strArr = dVar.f2022a;
                int length = strArr.length;
                String[] strArr2 = this.f2022a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f2023b;
        }

        public String toString() {
            return Arrays.toString(this.f2022a);
        }
    }

    protected g(S.e eVar) {
        this.f2006h = (S.e) AbstractC0829j.o(eVar, "helper");
        f2004l.log(Level.FINE, "Created");
    }

    @Override // y1.S
    public l0 a(S.h hVar) {
        try {
            this.f2007i = true;
            b bVarG = g(hVar);
            if (!bVarG.f2010a.o()) {
                return bVarG.f2010a;
            }
            v();
            u(bVarG.f2011b);
            return bVarG.f2010a;
        } finally {
            this.f2007i = false;
        }
    }

    @Override // y1.S
    public void c(l0 l0Var) {
        if (this.f2009k != EnumC1313p.READY) {
            this.f2006h.f(EnumC1313p.TRANSIENT_FAILURE, o(l0Var));
        }
    }

    @Override // y1.S
    public void f() {
        f2004l.log(Level.FINE, "Shutdown");
        Iterator it = this.f2005g.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).n();
        }
        this.f2005g.clear();
    }

    protected b g(S.h hVar) {
        f2004l.log(Level.FINE, "Received resolution result: {0}", hVar);
        Map mapK = k(hVar);
        if (mapK.isEmpty()) {
            l0 l0VarQ = l0.f11975t.q("NameResolver returned no usable address. " + hVar);
            c(l0VarQ);
            return new b(l0VarQ, null);
        }
        for (Map.Entry entry : mapK.entrySet()) {
            Object key = entry.getKey();
            T tJ = ((c) entry.getValue()).j();
            Object objG = ((c) entry.getValue()).g();
            if (this.f2005g.containsKey(key)) {
                c cVar = (c) this.f2005g.get(key);
                if (cVar.k() && s()) {
                    cVar.l(tJ);
                }
            } else {
                this.f2005g.put(key, (c) entry.getValue());
            }
            c cVar2 = (c) this.f2005g.get(key);
            S.h hVarM = m(key, hVar, objG);
            ((c) this.f2005g.get(key)).m(hVarM);
            if (!cVar2.f2019h) {
                cVar2.f2015d.d(hVarM);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0867z it = AbstractC0851j.r(this.f2005g.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!mapK.containsKey(next)) {
                c cVar3 = (c) this.f2005g.get(next);
                cVar3.f();
                arrayList.add(cVar3);
            }
        }
        return new b(l0.f11960e, arrayList);
    }

    protected Map k(S.h hVar) {
        HashMap map = new HashMap();
        Iterator it = hVar.a().iterator();
        while (it.hasNext()) {
            d dVar = new d((C1320x) it.next());
            c cVarL = (c) this.f2005g.get(dVar);
            if (cVarL == null) {
                cVarL = l(dVar, null, q(), hVar);
            }
            map.put(dVar, cVarL);
        }
        return map;
    }

    protected c l(Object obj, Object obj2, S.j jVar, S.h hVar) {
        return new c(this, obj, this.f2008j, obj2, jVar);
    }

    protected S.h m(Object obj, S.h hVar, Object obj2) {
        d dVar;
        C1320x c1320x;
        if (obj instanceof C1320x) {
            dVar = new d((C1320x) obj);
        } else {
            AbstractC0829j.e(obj instanceof d, "key is wrong type");
            dVar = (d) obj;
        }
        Iterator it = hVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                c1320x = null;
                break;
            }
            c1320x = (C1320x) it.next();
            if (dVar.equals(new d(c1320x))) {
                break;
            }
        }
        AbstractC0829j.o(c1320x, obj + " no longer present in load balancer children");
        return hVar.e().b(Collections.singletonList(c1320x)).c(C1298a.c().d(S.f11806e, Boolean.TRUE).a()).d(obj2).a();
    }

    protected Collection n() {
        return this.f2005g.values();
    }

    protected S.j o(l0 l0Var) {
        return new S.d(S.f.f(l0Var));
    }

    protected S.e p() {
        return this.f2006h;
    }

    protected S.j q() {
        return new S.d(S.f.g());
    }

    protected List r() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : n()) {
            if (!cVar.k() && cVar.i() == EnumC1313p.READY) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    protected boolean s() {
        return true;
    }

    protected boolean t() {
        return true;
    }

    protected void u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).n();
        }
    }

    protected abstract void v();
}
