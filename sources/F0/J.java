package F0;

import F0.K;
import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J extends O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1450e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K[] f1451d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final J a(K selection, Object... additionalSelections) {
            kotlin.jvm.internal.m.e(selection, "selection");
            kotlin.jvm.internal.m.e(additionalSelections, "additionalSelections");
            kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
            b3.a(selection);
            K.a aVar = K.f1452c;
            ArrayList arrayList = new ArrayList(additionalSelections.length);
            for (Object obj : additionalSelections) {
                arrayList.add(aVar.a(obj));
            }
            b3.b(arrayList.toArray(new K[0]));
            return new J((K[]) b3.d(new K[b3.c()]), B.f1420c, null);
        }
    }

    private J(K[] kArr, B b3) {
        super("select", b3, null);
        this.f1451d = kArr;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.I(Q.d(this.f1451d, userDataReader)));
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j3 = (J) obj;
        return Arrays.equals(this.f1451d, j3.f1451d) && kotlin.jvm.internal.m.a(e(), j3.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1451d) * 31) + e().hashCode();
    }

    public /* synthetic */ J(K[] kArr, B b3, kotlin.jvm.internal.h hVar) {
        this(kArr, b3);
    }
}
