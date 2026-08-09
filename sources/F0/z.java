package F0;

import G0.F0;
import V0.u;
import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC1007a;

/* JADX INFO: loaded from: classes.dex */
public class z extends AbstractC0315t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U1.l f1514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0315t[] f1515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B f1516f;

    /* synthetic */ class a extends AbstractC1007a implements U1.p {
        a(Object obj) {
            super(2, obj, u.b.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/Function$Builder;", 8);
        }

        public final void b(String str, V0.I i3) {
            ((u.b) this.f9727a).x(str, i3);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (V0.I) obj2);
            return I1.u.f2419a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, U1.l function) {
        this(name, function, new AbstractC0315t[0], null, 8, null);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
    }

    public final String B0() {
        return this.f1513c;
    }

    public final AbstractC0315t[] C0() {
        return this.f1515e;
    }

    @Override // F0.AbstractC0315t
    public final U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        U1.l lVar = this.f1514d;
        AbstractC0315t[] abstractC0315tArr = this.f1515e;
        ArrayList arrayList = new ArrayList(abstractC0315tArr.length);
        for (AbstractC0315t abstractC0315t : abstractC0315tArr) {
            arrayList.add(abstractC0315t.S(context));
        }
        return (U1.l) lVar.invoke(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f1513c, zVar.f1513c) && Arrays.equals(this.f1515e, zVar.f1515e) && kotlin.jvm.internal.m.a(this.f1516f, zVar.f1516f);
    }

    public int hashCode() {
        return (((this.f1513c.hashCode() * 31) + Arrays.hashCode(this.f1515e)) * 31) + this.f1516f.hashCode();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        u.b bVarK0 = V0.u.k0();
        bVarK0.y(this.f1513c);
        for (AbstractC0315t abstractC0315t : this.f1515e) {
            bVarK0.w(abstractC0315t.w0(userDataReader));
        }
        this.f1516f.a(new a(bVarK0));
        AbstractC0806y abstractC0806yN = V0.I.J0().D(bVarK0).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.I) abstractC0806yN;
    }

    @Override // F0.AbstractC0315t
    public String x() {
        AbstractC0315t[] abstractC0315tArr = this.f1515e;
        ArrayList arrayList = new ArrayList(abstractC0315tArr.length);
        for (AbstractC0315t abstractC0315t : abstractC0315tArr) {
            arrayList.add(abstractC0315t.x());
        }
        return "fn(" + this.f1513c + '[' + J1.x.G(arrayList, ",", null, null, 0, null, null, 62, null) + "])";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, U1.l function, AbstractC0315t param) {
        this(name, function, new AbstractC0315t[]{param}, null, 8, null);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param, "param");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, U1.l function, AbstractC0315t param1, AbstractC0315t param2) {
        this(name, function, new AbstractC0315t[]{param1, param2}, null, 8, null);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param1, "param1");
        kotlin.jvm.internal.m.e(param2, "param2");
    }

    public z(String name, U1.l function, AbstractC0315t param1, AbstractC0315t param2, Object... params) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param1, "param1");
        kotlin.jvm.internal.m.e(param2, "param2");
        kotlin.jvm.internal.m.e(params, "params");
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(3);
        b3.a(param1);
        b3.a(param2);
        b3.b(AbstractC0315t.f1490a.r0(params));
        this(name, function, (AbstractC0315t[]) b3.d(new AbstractC0315t[b3.c()]), null, 8, null);
    }

    public z(String name, U1.l function, AbstractC0315t[] params, B options) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(params, "params");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1513c = name;
        this.f1514d = function;
        this.f1515e = params;
        this.f1516f = options;
    }

    public /* synthetic */ z(String str, U1.l lVar, AbstractC0315t[] abstractC0315tArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(str, lVar, abstractC0315tArr, (i3 & 8) != 0 ? B.f1420c : b3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String name, List params, B options) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(params, "params");
        kotlin.jvm.internal.m.e(options, "options");
        U1.l lVar = (U1.l) A.f1417a.a().get(name);
        this(name, lVar == null ? F0.a() : lVar, (AbstractC0315t[]) params.toArray(new AbstractC0315t[0]), options);
    }
}
