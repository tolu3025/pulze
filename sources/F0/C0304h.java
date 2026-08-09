package F0;

import F0.AbstractC0315t;
import com.google.firebase.firestore.V0;

/* JADX INFO: renamed from: F0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304h extends AbstractC0305i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0315t.b f1479d;

    public C0304h(AbstractC0315t.b constant) {
        kotlin.jvm.internal.m.e(constant, "constant");
        this.f1479d = constant;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return this.f1479d.S(context);
    }

    public boolean equals(Object obj) {
        AbstractC0315t.b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0304h) {
            bVar = this.f1479d;
            obj = ((C0304h) obj).f1479d;
        } else {
            if (!(obj instanceof AbstractC0315t.b)) {
                return false;
            }
            bVar = this.f1479d;
        }
        return kotlin.jvm.internal.m.a(bVar, obj);
    }

    public int hashCode() {
        return this.f1479d.hashCode();
    }

    public String toString() {
        return this.f1479d.toString();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return this.f1479d.D0();
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return this.f1479d.x();
    }
}
