package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1463e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K f1464d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(K selectable, B options) {
        super("unnest", options, null);
        kotlin.jvm.internal.m.e(selectable, "selectable");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1464d = selectable;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(this.f1464d.w0(userDataReader), AbstractC0315t.f1490a.O(this.f1464d.B0()).H0());
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u2 = (U) obj;
        return kotlin.jvm.internal.m.a(this.f1464d, u2.f1464d) && kotlin.jvm.internal.m.a(e(), u2.e());
    }

    public int hashCode() {
        return (this.f1464d.hashCode() * 31) + e().hashCode();
    }
}
