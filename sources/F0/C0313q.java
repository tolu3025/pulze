package F0;

import com.google.firebase.firestore.V0;
import java.util.Arrays;

/* JADX INFO: renamed from: F0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0313q extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K[] f1486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313q(K[] groups, B options) {
        super("distinct", options, null);
        kotlin.jvm.internal.m.e(groups, "groups");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1486d = groups;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.I(Q.d(this.f1486d, userDataReader)));
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0313q)) {
            return false;
        }
        C0313q c0313q = (C0313q) obj;
        return Arrays.equals(this.f1486d, c0313q.f1486d) && kotlin.jvm.internal.m.a(e(), c0313q.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1486d) * 31) + e().hashCode();
    }

    public /* synthetic */ C0313q(K[] kArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(kArr, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
