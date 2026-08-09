package F0;

import A0.C0217o;
import G0.M;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.t0;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class w extends K {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1496g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f1497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f1498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w f1499j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.r f1500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0315t f1502f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1503a;

        static {
            int[] iArr = new int[C0754u.a.values().length];
            try {
                iArr[C0754u.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0754u.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C0754u.a.PREVIOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1503a = iArr;
        }
    }

    static {
        D0.r KEY_PATH = D0.r.f1277b;
        kotlin.jvm.internal.m.d(KEY_PATH, "KEY_PATH");
        f1497h = new w(KEY_PATH);
        D0.r UPDATE_TIME_PATH = D0.r.f1278c;
        kotlin.jvm.internal.m.d(UPDATE_TIME_PATH, "UPDATE_TIME_PATH");
        f1498i = new w(UPDATE_TIME_PATH);
        D0.r CREATE_TIME_PATH = D0.r.f1279d;
        kotlin.jvm.internal.m.d(CREATE_TIME_PATH, "CREATE_TIME_PATH");
        f1499j = new w(CREATE_TIME_PATH);
    }

    public w(D0.r fieldPath) {
        kotlin.jvm.internal.m.e(fieldPath, "fieldPath");
        this.f1500d = fieldPath;
        String strN = fieldPath.n();
        kotlin.jvm.internal.m.d(strN, "canonicalString(...)");
        this.f1501e = strN;
        this.f1502f = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0.M E0(w wVar, G0.Q q2, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        D0.r rVar = wVar.f1500d;
        if (kotlin.jvm.internal.m.a(rVar, D0.r.f1277b)) {
            FirebaseFirestore firebaseFirestoreH = q2.a().h();
            C0752t c0752tY = firebaseFirestoreH != null ? firebaseFirestoreH.y(input.getKey().p().n()) : null;
            kotlin.jvm.internal.m.b(c0752tY);
            return new G0.P(D0.z.A(c0752tY));
        }
        if (kotlin.jvm.internal.m.a(rVar, D0.r.f1279d)) {
            C1004r c1004rE = input.o().e();
            kotlin.jvm.internal.m.d(c1004rE, "getTimestamp(...)");
            return new G0.P(D0.z.J(c1004rE));
        }
        if (kotlin.jvm.internal.m.a(rVar, D0.r.f1278c)) {
            C1004r c1004rE2 = input.l().e();
            kotlin.jvm.internal.m.d(c1004rE2, "getTimestamp(...)");
            return new G0.P(D0.z.J(c1004rE2));
        }
        V0.I iE = input.e(wVar.f1500d);
        if (iE != null) {
            G0.M mG0 = D0.v.c(iE) ? wVar.G0(iE, q2) : new G0.P(iE);
            if (mG0 != null) {
                return mG0;
            }
        }
        return G0.O.f1694g;
    }

    private final G0.M G0(V0.I i3, G0.Q q2) {
        C0754u.a aVar;
        C0217o.b bVarI = q2.a().i();
        if (bVarI == null || (aVar = bVarI.f239e) == null) {
            aVar = C0754u.a.NONE;
        }
        int i4 = b.f1503a[aVar.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                M.a aVar2 = G0.M.f1683a;
                t0 t0VarA = D0.v.a(i3);
                kotlin.jvm.internal.m.d(t0VarA, "getLocalWriteTime(...)");
                return aVar2.n(t0VarA);
            }
            if (i4 != 3) {
                throw new I1.k();
            }
            V0.I iB = D0.v.b(i3);
            if (iB != null) {
                return new G0.P(iB);
            }
        }
        return G0.M.f1683a.g();
    }

    @Override // F0.K
    public String B0() {
        return this.f1501e;
    }

    @Override // F0.K
    public AbstractC0315t C0() {
        return this.f1502f;
    }

    public final D0.r F0() {
        return this.f1500d;
    }

    public final V0.I H0() {
        AbstractC0806y abstractC0806yN = V0.I.J0().C(this.f1500d.n()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.I) abstractC0806yN;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(final G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return new U1.l() { // from class: F0.v
            @Override // U1.l
            public final Object invoke(Object obj) {
                return w.E0(this.f1494a, context, (D0.s) obj);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return kotlin.jvm.internal.m.a(this.f1500d, ((w) obj).f1500d);
        }
        return false;
    }

    public int hashCode() {
        return this.f1500d.hashCode();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return H0();
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return "fld(" + this.f1500d.n() + ')';
    }
}
