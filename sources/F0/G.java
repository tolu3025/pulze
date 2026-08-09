package F0;

import J1.AbstractC0407k;
import com.google.firebase.firestore.V0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w[] f1434d;

    /* synthetic */ class a extends kotlin.jvm.internal.k implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1435a = new a();

        a() {
            super(1, w.class, "toProto", "toProto$com_google_firebase_firebase_firestore()Lcom/google/firestore/v1/Value;", 0);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final V0.I invoke(w p02) {
            kotlin.jvm.internal.m.e(p02, "p0");
            return p02.H0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(w[] fields, B options) {
        super("remove_fields", options, null);
        kotlin.jvm.internal.m.e(fields, "fields");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1434d = fields;
        for (w wVar : fields) {
            String strB0 = wVar.B0();
            w wVar2 = w.f1497h;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar2.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar2.B0() + " is required").toString());
            }
            w wVar3 = w.f1499j;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar3.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar3.B0() + " is required").toString());
            }
            w wVar4 = w.f1498i;
            if (!(!kotlin.jvm.internal.m.a(strB0, wVar4.B0()))) {
                throw new IllegalArgumentException(("Alias " + wVar4.B0() + " is required").toString());
            }
        }
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.k.h(AbstractC0407k.n(this.f1434d), a.f1435a);
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return Arrays.equals(this.f1434d, g3.f1434d) && kotlin.jvm.internal.m.a(e(), g3.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1434d) * 31) + e().hashCode();
    }

    public /* synthetic */ G(w[] wVarArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(wVarArr, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
