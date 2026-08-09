package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(int i3, B options) {
        super("offset", options, null);
        kotlin.jvm.internal.m.e(options, "options");
        this.f1423d = i3;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.w(this.f1423d));
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return this.f1423d == d3.f1423d && kotlin.jvm.internal.m.a(e(), d3.e());
    }

    public int hashCode() {
        return (this.f1423d * 31) + e().hashCode();
    }

    public /* synthetic */ D(int i3, B b3, int i4, kotlin.jvm.internal.h hVar) {
        this(i3, (i4 & 2) != 0 ? B.f1420c : b3);
    }
}
