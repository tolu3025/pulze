package A0;

import J0.AbstractC0386b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: A0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0218p extends AbstractC0219q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V0.I f255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0.r f256c;

    /* JADX INFO: renamed from: A0.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f257a;

        static {
            int[] iArr = new int[b.values().length];
            f257a = iArr;
            try {
                iArr[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f257a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f257a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f257a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f257a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f257a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f257a[b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f257a[b.ARRAY_CONTAINS_ANY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f257a[b.IN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f257a[b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: A0.p$b */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f269a;

        b(String str) {
            this.f269a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f269a;
        }
    }

    protected C0218p(D0.r rVar, b bVar, V0.I i3) {
        this.f256c = rVar;
        this.f254a = bVar;
        this.f255b = i3;
    }

    public static C0218p e(D0.r rVar, b bVar, V0.I i3) {
        if (!rVar.D()) {
            return bVar == b.ARRAY_CONTAINS ? new C0208f(rVar, i3) : bVar == b.IN ? new T(rVar, i3) : bVar == b.ARRAY_CONTAINS_ANY ? new C0206e(rVar, i3) : bVar == b.NOT_IN ? new C0199a0(rVar, i3) : new C0218p(rVar, bVar, i3);
        }
        if (bVar == b.IN) {
            return new V(rVar, i3);
        }
        if (bVar == b.NOT_IN) {
            return new W(rVar, i3);
        }
        AbstractC0386b.d((bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
        return new U(rVar, bVar, i3);
    }

    @Override // A0.AbstractC0219q
    public String a() {
        return f().n() + g().toString() + D0.z.c(h());
    }

    @Override // A0.AbstractC0219q
    public List b() {
        return Collections.singletonList(this);
    }

    @Override // A0.AbstractC0219q
    public List c() {
        return Collections.singletonList(this);
    }

    @Override // A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        V0.I iE = iVar.e(this.f256c);
        return this.f254a == b.NOT_EQUAL ? (iE == null || iE.G0() || !j(D0.z.j(iE, this.f255b))) ? false : true : iE != null && D0.z.f0(iE) == D0.z.f0(this.f255b) && j(D0.z.j(iE, this.f255b));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0218p)) {
            return false;
        }
        C0218p c0218p = (C0218p) obj;
        return this.f254a == c0218p.f254a && this.f256c.equals(c0218p.f256c) && this.f255b.equals(c0218p.f255b);
    }

    public D0.r f() {
        return this.f256c;
    }

    public b g() {
        return this.f254a;
    }

    public V0.I h() {
        return this.f255b;
    }

    public int hashCode() {
        return ((((1147 + this.f254a.hashCode()) * 31) + this.f256c.hashCode()) * 31) + this.f255b.hashCode();
    }

    public boolean i() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.f254a);
    }

    protected boolean j(int i3) {
        switch (a.f257a[this.f254a.ordinal()]) {
            case 1:
                return i3 < 0;
            case 2:
                return i3 <= 0;
            case 3:
                return i3 == 0;
            case 4:
                return i3 != 0;
            case 5:
                return i3 > 0;
            case 6:
                return i3 >= 0;
            default:
                throw AbstractC0386b.a("Unknown FieldFilter operator: %s", this.f254a);
        }
    }

    public String toString() {
        return a();
    }
}
