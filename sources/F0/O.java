package F0;

import V0.y;
import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1007a;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1457c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f1459b;

    public static final class a {

        /* JADX INFO: renamed from: F0.O$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0012a extends AbstractC1007a implements U1.p {
            C0012a(Object obj) {
                super(2, obj, y.c.a.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/Pipeline$Stage$Builder;", 8);
            }

            public final void b(String str, V0.I i3) {
                ((y.c.a) this.f9727a).x(str, i3);
            }

            @Override // U1.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (V0.I) obj2);
                return I1.u.f2419a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final y.c a(String name, a2.c args, B options, V0 userDataReader) {
            kotlin.jvm.internal.m.e(name, "name");
            kotlin.jvm.internal.m.e(args, "args");
            kotlin.jvm.internal.m.e(options, "options");
            kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
            y.c.a aVarJ0 = y.c.j0();
            aVarJ0.y(name);
            Iterator it = args.iterator();
            while (it.hasNext()) {
                aVarJ0.w((V0.I) it.next());
            }
            options.a(new C0012a(aVarJ0));
            AbstractC0806y abstractC0806yN = aVarJ0.n();
            kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
            return (y.c) abstractC0806yN;
        }
    }

    private O(String str, B b3) {
        this.f1458a = str;
        this.f1459b = b3;
    }

    public abstract a2.c a(V0 v02);

    public abstract String b();

    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        throw new I1.l("Stage " + this.f1458a + " does not support offline evaluation");
    }

    public final String d() {
        return this.f1458a;
    }

    public final B e() {
        return this.f1459b;
    }

    public y.c f(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return f1457c.a(this.f1458a, a(userDataReader), this.f1459b, userDataReader);
    }

    public /* synthetic */ O(String str, B b3, kotlin.jvm.internal.h hVar) {
        this(str, b3);
    }
}
