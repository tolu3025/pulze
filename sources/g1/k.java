package G1;

import G1.g;
import com.google.android.gms.common.api.a;
import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import y1.EnumC1313p;
import y1.S;

/* JADX INFO: loaded from: classes.dex */
public class k extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f2099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected S.j f2100n;

    static final class a extends S.j {
        a() {
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return S.f.g();
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    static class b extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f2102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2103c;

        public b(List list, AtomicInteger atomicInteger) {
            AbstractC0829j.e(!list.isEmpty(), "empty list");
            this.f2101a = list;
            this.f2102b = (AtomicInteger) AbstractC0829j.o(atomicInteger, "index");
            Iterator it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((S.j) it.next()).hashCode();
            }
            this.f2103c = iHashCode;
        }

        private int c() {
            return (this.f2102b.getAndIncrement() & a.e.API_PRIORITY_OTHER) % this.f2101a.size();
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return ((S.j) this.f2101a.get(c())).a(gVar);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f2103c == bVar.f2103c && this.f2102b == bVar.f2102b && this.f2101a.size() == bVar.f2101a.size() && new HashSet(this.f2101a).containsAll(bVar.f2101a);
        }

        public int hashCode() {
            return this.f2103c;
        }

        public String toString() {
            return AbstractC0825f.a(b.class).d("subchannelPickers", this.f2101a).toString();
        }
    }

    public k(S.e eVar) {
        super(eVar);
        this.f2099m = new AtomicInteger(new Random().nextInt());
        this.f2100n = new a();
    }

    private void x(EnumC1313p enumC1313p, S.j jVar) {
        if (enumC1313p == this.f2009k && jVar.equals(this.f2100n)) {
            return;
        }
        p().f(enumC1313p, jVar);
        this.f2009k = enumC1313p;
        this.f2100n = jVar;
    }

    @Override // G1.g
    protected void v() {
        List listR = r();
        if (!listR.isEmpty()) {
            x(EnumC1313p.READY, w(listR));
            return;
        }
        Iterator it = n().iterator();
        while (it.hasNext()) {
            EnumC1313p enumC1313pI = ((g.c) it.next()).i();
            EnumC1313p enumC1313p = EnumC1313p.CONNECTING;
            if (enumC1313pI == enumC1313p || enumC1313pI == EnumC1313p.IDLE) {
                x(enumC1313p, new a());
                return;
            }
        }
        x(EnumC1313p.TRANSIENT_FAILURE, w(n()));
    }

    protected S.j w(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((g.c) it.next()).h());
        }
        return new b(arrayList, this.f2099m);
    }
}
