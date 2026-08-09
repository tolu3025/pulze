package C0;

import com.google.protobuf.AbstractC0791i;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class R1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0.n0 f880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC0271o0 f883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D0.w f884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D0.w f885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0791i f886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f887h;

    /* JADX WARN: Illegal instructions before constructor call */
    public R1(A0.n0 n0Var, int i3, long j3, EnumC0271o0 enumC0271o0) {
        D0.w wVar = D0.w.f1302b;
        this(n0Var, i3, j3, enumC0271o0, wVar, wVar, I0.c0.f2296t, null);
    }

    public Integer a() {
        return this.f887h;
    }

    public D0.w b() {
        return this.f885f;
    }

    public EnumC0271o0 c() {
        return this.f883d;
    }

    public AbstractC0791i d() {
        return this.f886g;
    }

    public long e() {
        return this.f882c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R1.class != obj.getClass()) {
            return false;
        }
        R1 r12 = (R1) obj;
        return this.f880a.equals(r12.f880a) && this.f881b == r12.f881b && this.f882c == r12.f882c && this.f883d.equals(r12.f883d) && this.f884e.equals(r12.f884e) && this.f885f.equals(r12.f885f) && this.f886g.equals(r12.f886g) && Objects.equals(this.f887h, r12.f887h);
    }

    public D0.w f() {
        return this.f884e;
    }

    public A0.n0 g() {
        return this.f880a;
    }

    public int h() {
        return this.f881b;
    }

    public int hashCode() {
        return (((((((((((((this.f880a.hashCode() * 31) + this.f881b) * 31) + ((int) this.f882c)) * 31) + this.f883d.hashCode()) * 31) + this.f884e.hashCode()) * 31) + this.f885f.hashCode()) * 31) + this.f886g.hashCode()) * 31) + Objects.hashCode(this.f887h);
    }

    public R1 i(Integer num) {
        return new R1(this.f880a, this.f881b, this.f882c, this.f883d, this.f884e, this.f885f, this.f886g, num);
    }

    public R1 j(D0.w wVar) {
        return new R1(this.f880a, this.f881b, this.f882c, this.f883d, this.f884e, wVar, this.f886g, this.f887h);
    }

    public R1 k(AbstractC0791i abstractC0791i, D0.w wVar) {
        return new R1(this.f880a, this.f881b, this.f882c, this.f883d, wVar, this.f885f, abstractC0791i, null);
    }

    public R1 l(long j3) {
        return new R1(this.f880a, this.f881b, j3, this.f883d, this.f884e, this.f885f, this.f886g, this.f887h);
    }

    R1 m(A0.n0 n0Var) {
        return new R1(n0Var, this.f881b, this.f882c, this.f883d, this.f884e, this.f885f, this.f886g, this.f887h);
    }

    public String toString() {
        return "TargetData{target=" + this.f880a + ", targetId=" + this.f881b + ", sequenceNumber=" + this.f882c + ", purpose=" + this.f883d + ", snapshotVersion=" + this.f884e + ", lastLimboFreeSnapshotVersion=" + this.f885f + ", resumeToken=" + this.f886g + ", expectedCount=" + this.f887h + '}';
    }

    public R1(A0.n0 n0Var, int i3, long j3, EnumC0271o0 enumC0271o0, D0.w wVar, D0.w wVar2, AbstractC0791i abstractC0791i, Integer num) {
        this.f880a = (A0.n0) J0.C.b(n0Var);
        this.f881b = i3;
        this.f882c = j3;
        this.f885f = wVar2;
        this.f883d = enumC0271o0;
        this.f884e = (D0.w) J0.C.b(wVar);
        this.f886g = (AbstractC0791i) J0.C.b(abstractC0791i);
        this.f887h = num;
    }
}
