package F0;

import J1.AbstractC0406j;
import J1.AbstractC0407k;
import com.google.firebase.firestore.V0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N extends O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1454e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final N f1455f = new N(new E[]{w.f1497h.q()}, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E[] f1456d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final N a() {
            return N.f1455f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(E[] orders, B options) {
        super("sort", options, null);
        kotlin.jvm.internal.m.e(orders, "orders");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1456d = orders;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V0.I j(V0 v02, E it) {
        kotlin.jvm.internal.m.e(it, "it");
        return it.d(v02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(E it) {
        kotlin.jvm.internal.m.e(it, "it");
        return it.a();
    }

    @Override // F0.O
    public a2.c a(final V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.k.h(AbstractC0407k.n(this.f1456d), new U1.l() { // from class: F0.L
            @Override // U1.l
            public final Object invoke(Object obj) {
                return N.j(userDataReader, (E) obj);
            }
        });
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + AbstractC0407k.N(this.f1456d, ",", null, null, 0, null, new U1.l() { // from class: F0.M
            @Override // U1.l
            public final Object invoke(Object obj) {
                return N.k((E) obj);
            }
        }, 30, null) + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        return J1.x.O(inputs, l(context));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return Arrays.equals(this.f1456d, n3.f1456d) && kotlin.jvm.internal.m.a(e(), n3.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1456d) * 31) + e().hashCode();
    }

    public final Comparator l(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return Q.e(context, this.f1456d);
    }

    public final N m() {
        E[] eArr = this.f1456d;
        int length = eArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            AbstractC0315t abstractC0315tC = eArr[i3].c();
            w wVar = abstractC0315tC instanceof w ? (w) abstractC0315tC : null;
            if (!kotlin.jvm.internal.m.a(wVar != null ? wVar.B0() : null, "__name__")) {
                i3++;
            } else if (i3 >= 0) {
                return this;
            }
        }
        return new N((E[]) J1.x.K(AbstractC0406j.c(this.f1456d), w.f1497h.q()).toArray(new E[0]), e());
    }

    public /* synthetic */ N(E[] eArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(eArr, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
