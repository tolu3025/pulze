package c2;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0574m f5051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U1.q f5052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f5054e;

    public B(Object obj, InterfaceC0574m interfaceC0574m, U1.q qVar, Object obj2, Throwable th) {
        this.f5050a = obj;
        this.f5051b = interfaceC0574m;
        this.f5052c = qVar;
        this.f5053d = obj2;
        this.f5054e = th;
    }

    public static /* synthetic */ B b(B b3, Object obj, InterfaceC0574m interfaceC0574m, U1.q qVar, Object obj2, Throwable th, int i3, Object obj3) {
        if ((i3 & 1) != 0) {
            obj = b3.f5050a;
        }
        if ((i3 & 2) != 0) {
            interfaceC0574m = b3.f5051b;
        }
        InterfaceC0574m interfaceC0574m2 = interfaceC0574m;
        if ((i3 & 4) != 0) {
            qVar = b3.f5052c;
        }
        U1.q qVar2 = qVar;
        if ((i3 & 8) != 0) {
            obj2 = b3.f5053d;
        }
        Object obj4 = obj2;
        if ((i3 & 16) != 0) {
            th = b3.f5054e;
        }
        return b3.a(obj, interfaceC0574m2, qVar2, obj4, th);
    }

    public final B a(Object obj, InterfaceC0574m interfaceC0574m, U1.q qVar, Object obj2, Throwable th) {
        return new B(obj, interfaceC0574m, qVar, obj2, th);
    }

    public final boolean c() {
        return this.f5054e != null;
    }

    public final void d(C0580p c0580p, Throwable th) {
        InterfaceC0574m interfaceC0574m = this.f5051b;
        if (interfaceC0574m != null) {
            c0580p.p(interfaceC0574m, th);
        }
        U1.q qVar = this.f5052c;
        if (qVar != null) {
            c0580p.q(qVar, th, this.f5050a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b3 = (B) obj;
        return kotlin.jvm.internal.m.a(this.f5050a, b3.f5050a) && kotlin.jvm.internal.m.a(this.f5051b, b3.f5051b) && kotlin.jvm.internal.m.a(this.f5052c, b3.f5052c) && kotlin.jvm.internal.m.a(this.f5053d, b3.f5053d) && kotlin.jvm.internal.m.a(this.f5054e, b3.f5054e);
    }

    public int hashCode() {
        Object obj = this.f5050a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0574m interfaceC0574m = this.f5051b;
        int iHashCode2 = (iHashCode + (interfaceC0574m == null ? 0 : interfaceC0574m.hashCode())) * 31;
        U1.q qVar = this.f5052c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f5053d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5054e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f5050a + ", cancelHandler=" + this.f5051b + ", onCancellation=" + this.f5052c + ", idempotentResume=" + this.f5053d + ", cancelCause=" + this.f5054e + ')';
    }

    public /* synthetic */ B(Object obj, InterfaceC0574m interfaceC0574m, U1.q qVar, Object obj2, Throwable th, int i3, kotlin.jvm.internal.h hVar) {
        this(obj, (i3 & 2) != 0 ? null : interfaceC0574m, (i3 & 4) != 0 ? null : qVar, (i3 & 8) != 0 ? null : obj2, (i3 & 16) != 0 ? null : th);
    }
}
