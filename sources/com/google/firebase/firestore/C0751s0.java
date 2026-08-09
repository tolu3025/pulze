package com.google.firebase.firestore;

import F0.AbstractC0297a;
import F0.AbstractC0305i;
import F0.AbstractC0315t;
import F0.C0298b;
import F0.C0300d;
import F0.C0301e;
import F0.C0302f;
import F0.C0313q;
import F0.H;
import F0.K;
import F0.y;
import J1.AbstractC0411o;
import V0.D;
import V0.q;
import V0.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C0754u;
import com.google.protobuf.AbstractC0806y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;
import kotlin.jvm.internal.AbstractC1007a;

/* JADX INFO: renamed from: com.google.firebase.firestore.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0751s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V0 f6385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6386c;

    /* JADX INFO: renamed from: com.google.firebase.firestore.s0$a */
    public static final class a extends AbstractC0297a {

        /* JADX INFO: renamed from: com.google.firebase.firestore.s0$a$a, reason: collision with other inner class name */
        public static final class C0113a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0114a f6387b = new C0114a(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0113a f6388c = new C0113a("recommended");

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f6389a;

            /* JADX INFO: renamed from: com.google.firebase.firestore.s0$a$a$a, reason: collision with other inner class name */
            public static final class C0114a {
                private C0114a() {
                }

                public /* synthetic */ C0114a(kotlin.jvm.internal.h hVar) {
                    this();
                }
            }

            private C0113a(String str) {
                this.f6389a = str;
            }

            public final String a() {
                return this.f6389a;
            }
        }

        public a() {
            this(F0.B.f1420c);
        }

        @Override // F0.AbstractC0297a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(F0.B options) {
            kotlin.jvm.internal.m.e(options, "options");
            return new a(options);
        }

        public final a g(C0113a indexMode) {
            kotlin.jvm.internal.m.e(indexMode, "indexMode");
            return (a) e("index_mode", indexMode.a());
        }

        private a(F0.B b3) {
            super(b3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.firebase.firestore.s0$b */
    final class b implements InterfaceC0755u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final W0 f6390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource f6391b = new TaskCompletionSource();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6392c = new ArrayList();

        public b() {
            this.f6390a = new W0(C0751s0.this.f6384a, C0754u.a.f6410d);
        }

        @Override // com.google.firebase.firestore.InterfaceC0755u0
        public void a(T exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            this.f6391b.setException(exception);
        }

        @Override // com.google.firebase.firestore.InterfaceC0755u0
        public void b(C1004r executionTime) {
            kotlin.jvm.internal.m.e(executionTime, "executionTime");
            this.f6391b.setResult(new c(executionTime, this.f6392c));
        }

        @Override // com.google.firebase.firestore.InterfaceC0755u0
        public void c(D0.l lVar, Map data, C1004r c1004r, C1004r c1004r2) {
            kotlin.jvm.internal.m.e(data, "data");
            this.f6392c.add(new C0753t0(this.f6390a, lVar == null ? null : new C0752t(lVar, C0751s0.this.f6384a), data, c1004r, c1004r2));
        }

        public final Task d() {
            Task task = this.f6391b.getTask();
            kotlin.jvm.internal.m.d(task, "getTask(...)");
            return task;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.s0$c */
    public static final class c implements Iterable, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1004r f6394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f6395b;

        public c(C1004r executionTime, List results) {
            kotlin.jvm.internal.m.e(executionTime, "executionTime");
            kotlin.jvm.internal.m.e(results, "results");
            this.f6394a = executionTime;
            this.f6395b = results;
        }

        public final C1004r a() {
            return this.f6394a;
        }

        public final List b() {
            return this.f6395b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!kotlin.jvm.internal.m.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type com.google.firebase.firestore.Pipeline.Snapshot");
            return kotlin.jvm.internal.m.a(this.f6395b, ((c) obj).f6395b);
        }

        public int hashCode() {
            return this.f6395b.hashCode();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f6395b.iterator();
        }

        public String toString() {
            return "Snapshot{executionTime=" + this.f6394a + ", results=" + this.f6395b + '}';
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.s0$d */
    /* synthetic */ class d extends AbstractC1007a implements U1.p {
        d(Object obj) {
            super(2, obj, D.b.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/StructuredPipeline$Builder;", 8);
        }

        public final void b(String str, V0.I i3) {
            ((D.b) this.f9727a).w(str, i3);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (V0.I) obj2);
            return I1.u.f2419a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0751s0(FirebaseFirestore firebaseFirestore, V0 v02, F0.O stage) {
        this(firebaseFirestore, v02, AbstractC0411o.d(stage));
        kotlin.jvm.internal.m.e(stage, "stage");
    }

    private final C0751s0 g(F0.O o2) {
        return new C0751s0(this.f6384a, this.f6385b, J1.x.K(this.f6386c, o2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I1.u l(V0.q qVar, b bVar, A0.S s2) {
        kotlin.jvm.internal.m.b(s2);
        s2.F(qVar, bVar);
        return I1.u.f2419a;
    }

    public final C0751s0 A(F0.K arrayWithAlias, F0.T options) {
        kotlin.jvm.internal.m.e(arrayWithAlias, "arrayWithAlias");
        kotlin.jvm.internal.m.e(options, "options");
        return g(new F0.U(arrayWithAlias, options.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 B(AbstractC0305i condition) {
        kotlin.jvm.internal.m.e(condition, "condition");
        return g(new F0.V(condition, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 c(F0.K field, F0.K... additionalFields) {
        kotlin.jvm.internal.m.e(field, "field");
        kotlin.jvm.internal.m.e(additionalFields, "additionalFields");
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
        b3.a(field);
        b3.b(additionalFields);
        return g(new C0298b((F0.K[]) b3.d(new F0.K[b3.c()]), null, 2, 0 == true ? 1 : 0));
    }

    public final C0751s0 d(C0301e aggregateStage) {
        kotlin.jvm.internal.m.e(aggregateStage, "aggregateStage");
        return e(aggregateStage, new C0300d());
    }

    public final C0751s0 e(C0301e aggregateStage, C0300d options) {
        kotlin.jvm.internal.m.e(aggregateStage, "aggregateStage");
        kotlin.jvm.internal.m.e(options, "options");
        return g(aggregateStage.i(options));
    }

    public final C0751s0 f(C0302f accumulator, C0302f... additionalAccumulators) {
        kotlin.jvm.internal.m.e(accumulator, "accumulator");
        kotlin.jvm.internal.m.e(additionalAccumulators, "additionalAccumulators");
        return g(C0301e.f1472f.a(accumulator, (C0302f[]) Arrays.copyOf(additionalAccumulators, additionalAccumulators.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 h(F0.K group, Object... additionalGroups) {
        kotlin.jvm.internal.m.e(group, "group");
        kotlin.jvm.internal.m.e(additionalGroups, "additionalGroups");
        int i3 = 2;
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
        b3.a(group);
        K.a aVar = F0.K.f1452c;
        ArrayList arrayList = new ArrayList(additionalGroups.length);
        for (Object obj : additionalGroups) {
            arrayList.add(aVar.a(obj));
        }
        b3.b(arrayList.toArray(new F0.K[0]));
        return g(new C0313q((F0.K[]) b3.d(new F0.K[b3.c()]), null, i3, 0 == true ? 1 : 0));
    }

    public final Task i() {
        return k(null);
    }

    public final Task j(a options) {
        kotlin.jvm.internal.m.e(options, "options");
        return k(options.a());
    }

    public final Task k(F0.B b3) {
        final V0.q qVarV = v(b3);
        final b bVar = new b();
        J0.A.a("Pipeline", "Executing pipeline: " + qVarV, new Object[0]);
        FirebaseFirestore firebaseFirestore = this.f6384a;
        if (firebaseFirestore != null) {
        }
        return bVar.d();
    }

    public final C0751s0 m(F0.w vectorField, double[] vectorValue, y.b distanceMeasure) {
        kotlin.jvm.internal.m.e(vectorField, "vectorField");
        kotlin.jvm.internal.m.e(vectorValue, "vectorValue");
        kotlin.jvm.internal.m.e(distanceMeasure, "distanceMeasure");
        return g(y.a.c(F0.y.f1504g, vectorField, vectorValue, distanceMeasure, null, 8, null));
    }

    public final C0751s0 n(String vectorField, AbstractC0315t vectorValue, y.b distanceMeasure, F0.x options) {
        kotlin.jvm.internal.m.e(vectorField, "vectorField");
        kotlin.jvm.internal.m.e(vectorValue, "vectorValue");
        kotlin.jvm.internal.m.e(distanceMeasure, "distanceMeasure");
        kotlin.jvm.internal.m.e(options, "options");
        return g(F0.y.f1504g.b(vectorField, vectorValue, distanceMeasure, options));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 o(int i3) {
        return g(new F0.C(i3, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 p(int i3) {
        return g(new F0.D(i3, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 q(F0.w field, F0.w... additionalFields) {
        kotlin.jvm.internal.m.e(field, "field");
        kotlin.jvm.internal.m.e(additionalFields, "additionalFields");
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
        b3.a(field);
        b3.b(additionalFields);
        return g(new F0.G((F0.w[]) b3.d(new F0.w[b3.c()]), null, 2, 0 == true ? 1 : 0));
    }

    public final C0751s0 r(AbstractC0315t mapValue) {
        kotlin.jvm.internal.m.e(mapValue, "mapValue");
        return g(new F0.H(mapValue, H.a.f1438b.a(), null, 4, null));
    }

    public final C0751s0 s(F0.I sample) {
        kotlin.jvm.internal.m.e(sample, "sample");
        return g(sample);
    }

    public final C0751s0 t(F0.K selection, Object... additionalSelections) {
        kotlin.jvm.internal.m.e(selection, "selection");
        kotlin.jvm.internal.m.e(additionalSelections, "additionalSelections");
        return g(F0.J.f1450e.a(selection, Arrays.copyOf(additionalSelections, additionalSelections.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 u(F0.E order, F0.E... additionalOrders) {
        kotlin.jvm.internal.m.e(order, "order");
        kotlin.jvm.internal.m.e(additionalOrders, "additionalOrders");
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
        b3.a(order);
        b3.b(additionalOrders);
        return g(new F0.N((F0.E[]) b3.d(new F0.E[b3.c()]), null, 2, 0 == true ? 1 : 0));
    }

    public final V0.q v(F0.B b3) {
        FirebaseFirestore firebaseFirestore = this.f6384a;
        if (firebaseFirestore == null) {
            throw new IllegalStateException("This pipeline was created without a database (e.g., as a subcollection pipeline) and cannot be executed directly. It can only be used as part of another pipeline.".toString());
        }
        D0.f fVarB = firebaseFirestore.B();
        kotlin.jvm.internal.m.d(fVarB, "getDatabaseId(...)");
        q.b bVarD0 = V0.q.d0();
        bVarD0.w("projects/" + fVarB.i() + "/databases/" + fVarB.h());
        V0 v0F = this.f6384a.F();
        kotlin.jvm.internal.m.d(v0F, "getUserDataReader(...)");
        bVarD0.x(x(b3, v0F));
        AbstractC0806y abstractC0806yN = bVarD0.n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.q) abstractC0806yN;
    }

    public final V0.y w(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        y.b bVarF0 = V0.y.f0();
        List list = this.f6386c;
        ArrayList arrayList = new ArrayList(J1.q.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((F0.O) it.next()).f(userDataReader));
        }
        AbstractC0806y abstractC0806yN = bVarF0.w(arrayList).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.y) abstractC0806yN;
    }

    public final V0.D x(F0.B b3, V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        D.b bVarG0 = V0.D.g0();
        bVarG0.x(w(userDataReader));
        if (b3 != null) {
            b3.a(new d(bVarG0));
        }
        AbstractC0806y abstractC0806yN = bVarG0.n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.D) abstractC0806yN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 y(C0751s0 other) {
        kotlin.jvm.internal.m.e(other, "other");
        return g(new F0.S(other, null, 2, 0 == true ? 1 : 0));
    }

    public final C0751s0 z(F0.K arrayWithAlias) {
        kotlin.jvm.internal.m.e(arrayWithAlias, "arrayWithAlias");
        return A(arrayWithAlias, new F0.T());
    }

    public C0751s0(FirebaseFirestore firebaseFirestore, V0 v02, List stages) {
        kotlin.jvm.internal.m.e(stages, "stages");
        this.f6384a = firebaseFirestore;
        this.f6385b = v02;
        this.f6386c = stages;
    }
}
