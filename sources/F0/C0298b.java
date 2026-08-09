package F0;

import com.google.firebase.firestore.V0;
import java.util.Arrays;

/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298b extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K[] f1467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298b(K[] fields, B options) {
        super("add_fields", options, null);
        kotlin.jvm.internal.m.e(fields, "fields");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1467d = fields;
        for (K k3 : fields) {
            String strB0 = k3.B0();
            w wVar = w.f1497h;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar.B0() + " is reserved").toString());
            }
            w wVar2 = w.f1499j;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar2.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar2.B0() + " is reserved").toString());
            }
            w wVar3 = w.f1498i;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar3.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar3.B0() + " is reserved").toString());
            }
        }
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.I(Q.d(this.f1467d, userDataReader)));
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0298b)) {
            return false;
        }
        C0298b c0298b = (C0298b) obj;
        return Arrays.equals(this.f1467d, c0298b.f1467d) && kotlin.jvm.internal.m.a(e(), c0298b.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1467d) * 31) + e().hashCode();
    }

    public /* synthetic */ C0298b(K[] kArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(kArr, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
