package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: renamed from: F0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312p extends O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312p(B options) {
        super("database", options, null);
        kotlin.jvm.internal.m.e(options, "options");
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.e();
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0312p) {
            return kotlin.jvm.internal.m.a(e(), ((C0312p) obj).e());
        }
        return false;
    }

    public int hashCode() {
        return e().hashCode();
    }

    public /* synthetic */ C0312p(B b3, int i3, kotlin.jvm.internal.h hVar) {
        this((i3 & 1) != 0 ? B.f1420c : b3);
    }
}
