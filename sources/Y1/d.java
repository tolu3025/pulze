package Y1;

import J1.C;

/* JADX INFO: loaded from: classes.dex */
public class d implements Iterable, V1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3538d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3541c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final d a(int i3, int i4, int i5) {
            return new d(i3, i4, i5);
        }
    }

    public d(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3539a = i3;
        this.f3540b = P1.c.b(i3, i4, i5);
        this.f3541c = i5;
    }

    public final int a() {
        return this.f3539a;
    }

    public final int b() {
        return this.f3540b;
    }

    public final int d() {
        return this.f3541c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f3539a != dVar.f3539a || this.f3540b != dVar.f3540b || this.f3541c != dVar.f3541c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C iterator() {
        return new e(this.f3539a, this.f3540b, this.f3541c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3539a * 31) + this.f3540b) * 31) + this.f3541c;
    }

    public boolean isEmpty() {
        if (this.f3541c > 0) {
            if (this.f3539a <= this.f3540b) {
                return false;
            }
        } else if (this.f3539a >= this.f3540b) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i3;
        if (this.f3541c > 0) {
            sb = new StringBuilder();
            sb.append(this.f3539a);
            sb.append("..");
            sb.append(this.f3540b);
            sb.append(" step ");
            i3 = this.f3541c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f3539a);
            sb.append(" downTo ");
            sb.append(this.f3540b);
            sb.append(" step ");
            i3 = -this.f3541c;
        }
        sb.append(i3);
        return sb.toString();
    }
}
