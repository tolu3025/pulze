package A0;

import F0.C0309m;
import F0.C0310n;
import F0.C0312p;
import F0.C0314s;
import J0.AbstractC0386b;
import com.google.firebase.firestore.J0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: A0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207e0 {
    public static final J0 a(J0 pipeline, D0.u path) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        kotlin.jvm.internal.m.e(path, "path");
        List<Object> listM = pipeline.m();
        ArrayList arrayList = new ArrayList(J1.q.n(listM, 10));
        for (Object c0310n : listM) {
            if (c0310n instanceof C0309m) {
                c0310n = new C0310n(path, pipeline.l(), F0.B.f1420c);
            }
            arrayList.add(c0310n);
        }
        return new J0(pipeline.h(), pipeline.l(), pipeline.n(), arrayList, null, 16, null);
    }

    public static final Integer b(J0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        for (F0.O o2 : J1.v.w(pipeline.k())) {
            if (o2 instanceof F0.C) {
                return Integer.valueOf(((F0.C) o2).g());
            }
        }
        return null;
    }

    public static final String c(J0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        if (f(pipeline) != EnumC0205d0.f119a) {
            return null;
        }
        AbstractC0386b.d(!pipeline.m().isEmpty(), "Pipeline source is Collection but stages are empty.", new Object[0]);
        F0.O o2 = (F0.O) J1.x.C(pipeline.m());
        if (o2 instanceof C0310n) {
            return ((C0310n) o2).g().n();
        }
        return null;
    }

    public static final String d(J0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        if (f(pipeline) != EnumC0205d0.f120b) {
            return null;
        }
        AbstractC0386b.d(!pipeline.m().isEmpty(), "Pipeline source is CollectionGroup but stages are empty.", new Object[0]);
        F0.O o2 = (F0.O) J1.x.C(pipeline.m());
        if (o2 instanceof C0309m) {
            return ((C0309m) o2).g();
        }
        return null;
    }

    public static final String[] e(J0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        if (f(pipeline) != EnumC0205d0.f122d) {
            return null;
        }
        AbstractC0386b.d(!pipeline.m().isEmpty(), "Pipeline source is Documents but stages are empty.", new Object[0]);
        F0.O o2 = (F0.O) J1.x.C(pipeline.m());
        if (!(o2 instanceof C0314s)) {
            return null;
        }
        D0.u[] uVarArrJ = ((C0314s) o2).j();
        ArrayList arrayList = new ArrayList(uVarArrJ.length);
        for (D0.u uVar : uVarArrJ) {
            arrayList.add(uVar.n());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final EnumC0205d0 f(J0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        AbstractC0386b.d(!pipeline.m().isEmpty(), "Pipeline must have at least one stage to determine its source.", new Object[0]);
        F0.O o2 = (F0.O) J1.x.C(pipeline.m());
        return o2 instanceof C0310n ? EnumC0205d0.f119a : o2 instanceof C0309m ? EnumC0205d0.f120b : o2 instanceof C0312p ? EnumC0205d0.f121c : o2 instanceof C0314s ? EnumC0205d0.f122d : EnumC0205d0.f123e;
    }
}
