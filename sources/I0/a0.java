package I0;

import J0.AbstractC0386b;
import com.google.protobuf.AbstractC0791i;
import java.util.List;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    public static final class b extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f2245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D0.l f2246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final D0.s f2247d;

        public b(List list, List list2, D0.l lVar, D0.s sVar) {
            super();
            this.f2244a = list;
            this.f2245b = list2;
            this.f2246c = lVar;
            this.f2247d = sVar;
        }

        public D0.l a() {
            return this.f2246c;
        }

        public D0.s b() {
            return this.f2247d;
        }

        public List c() {
            return this.f2245b;
        }

        public List d() {
            return this.f2244a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f2244a.equals(bVar.f2244a) || !this.f2245b.equals(bVar.f2245b) || !this.f2246c.equals(bVar.f2246c)) {
                return false;
            }
            D0.s sVar = this.f2247d;
            D0.s sVar2 = bVar.f2247d;
            return sVar != null ? sVar.equals(sVar2) : sVar2 == null;
        }

        public int hashCode() {
            int iHashCode = ((((this.f2244a.hashCode() * 31) + this.f2245b.hashCode()) * 31) + this.f2246c.hashCode()) * 31;
            D0.s sVar = this.f2247d;
            return iHashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f2244a + ", removedTargetIds=" + this.f2245b + ", key=" + this.f2246c + ", newDocument=" + this.f2247d + '}';
        }
    }

    public static final class c extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0377s f2249b;

        public c(int i3, C0377s c0377s) {
            super();
            this.f2248a = i3;
            this.f2249b = c0377s;
        }

        public C0377s a() {
            return this.f2249b;
        }

        public int b() {
            return this.f2248a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f2248a + ", existenceFilter=" + this.f2249b + '}';
        }
    }

    public static final class d extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f2250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f2251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC0791i f2252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l0 f2253d;

        public d(e eVar, List list, AbstractC0791i abstractC0791i, l0 l0Var) {
            super();
            AbstractC0386b.d(l0Var == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f2250a = eVar;
            this.f2251b = list;
            this.f2252c = abstractC0791i;
            if (l0Var == null || l0Var.o()) {
                this.f2253d = null;
            } else {
                this.f2253d = l0Var;
            }
        }

        public l0 a() {
            return this.f2253d;
        }

        public e b() {
            return this.f2250a;
        }

        public AbstractC0791i c() {
            return this.f2252c;
        }

        public List d() {
            return this.f2251b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f2250a != dVar.f2250a || !this.f2251b.equals(dVar.f2251b) || !this.f2252c.equals(dVar.f2252c)) {
                return false;
            }
            l0 l0Var = this.f2253d;
            return l0Var != null ? dVar.f2253d != null && l0Var.m().equals(dVar.f2253d.m()) : dVar.f2253d == null;
        }

        public int hashCode() {
            int iHashCode = ((((this.f2250a.hashCode() * 31) + this.f2251b.hashCode()) * 31) + this.f2252c.hashCode()) * 31;
            l0 l0Var = this.f2253d;
            return iHashCode + (l0Var != null ? l0Var.m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f2250a + ", targetIds=" + this.f2251b + '}';
        }
    }

    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private a0() {
    }
}
