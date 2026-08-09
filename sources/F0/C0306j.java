package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: renamed from: F0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306j extends AbstractC0305i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f1481d;

    public C0306j(w field) {
        kotlin.jvm.internal.m.e(field, "field");
        this.f1481d = field;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return this.f1481d.S(context);
    }

    public boolean equals(Object obj) {
        w wVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0306j) {
            wVar = this.f1481d;
            obj = ((C0306j) obj).f1481d;
        } else {
            if (!(obj instanceof w)) {
                return false;
            }
            wVar = this.f1481d;
        }
        return kotlin.jvm.internal.m.a(wVar, obj);
    }

    public int hashCode() {
        return this.f1481d.hashCode();
    }

    public String toString() {
        return this.f1481d.toString();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return this.f1481d.w0(userDataReader);
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return this.f1481d.x();
    }
}
