package E0;

import D0.z;
import V0.C0423b;
import V0.I;
import java.util.Collections;
import java.util.List;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1380a;

    /* JADX INFO: renamed from: E0.a$a, reason: collision with other inner class name */
    public static class C0010a extends a {
        public C0010a(List list) {
            super(list);
        }

        @Override // E0.a
        protected I d(I i3) {
            C0423b.C0068b c0068bE = a.e(i3);
            for (I i4 : f()) {
                int i5 = 0;
                while (i5 < c0068bE.z()) {
                    if (c0068bE.y(i5).equals(i4)) {
                        c0068bE.A(i5);
                    } else {
                        i5++;
                    }
                }
            }
            return (I) I.J0().x(c0068bE).n();
        }
    }

    public static class b extends a {
        public b(List list) {
            super(list);
        }

        @Override // E0.a
        protected I d(I i3) {
            C0423b.C0068b c0068bE = a.e(i3);
            for (I i4 : f()) {
                if (!z.s(c0068bE, i4)) {
                    c0068bE.x(i4);
                }
            }
            return (I) I.J0().x(c0068bE).n();
        }
    }

    a(List list) {
        this.f1380a = Collections.unmodifiableList(list);
    }

    static C0423b.C0068b e(I i3) {
        return z.Q(i3) ? (C0423b.C0068b) i3.o0().Y() : C0423b.j0();
    }

    @Override // E0.p
    public I a(I i3) {
        return null;
    }

    @Override // E0.p
    public I b(I i3, I i4) {
        return d(i3);
    }

    @Override // E0.p
    public I c(I i3, C1004r c1004r) {
        return d(i3);
    }

    protected abstract I d(I i3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1380a.equals(((a) obj).f1380a);
    }

    public List f() {
        return this.f1380a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f1380a.hashCode();
    }
}
