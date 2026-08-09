package F0;

import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class S extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0751s0 f1462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C0751s0 other, B options) {
        super("union", options, null);
        kotlin.jvm.internal.m.e(other, "other");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1462d = other;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(V0.I.J0().J(this.f1462d.w(userDataReader)).n());
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s2 = (S) obj;
        return kotlin.jvm.internal.m.a(this.f1462d, s2.f1462d) && kotlin.jvm.internal.m.a(e(), s2.e());
    }

    public int hashCode() {
        return (this.f1462d.hashCode() * 31) + e().hashCode();
    }

    public /* synthetic */ S(C0751s0 c0751s0, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(c0751s0, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
