package F0;

import J1.AbstractC0412p;
import com.google.firebase.firestore.V0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(int i3, B options) {
        super("limit", options, null);
        kotlin.jvm.internal.m.e(options, "options");
        this.f1422d = i3;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.w(this.f1422d));
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + this.f1422d + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        int i3 = this.f1422d;
        return i3 > 0 ? J1.x.P(inputs, i3) : i3 < 0 ? J1.x.Q(inputs, i3) : AbstractC0412p.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        return this.f1422d == c3.f1422d && kotlin.jvm.internal.m.a(e(), c3.e());
    }

    public final int g() {
        return this.f1422d;
    }

    public int hashCode() {
        return (this.f1422d * 31) + e().hashCode();
    }

    public /* synthetic */ C(int i3, B b3, int i4, kotlin.jvm.internal.h hVar) {
        this(i3, (i4 & 2) != 0 ? B.f1420c : b3);
    }
}
