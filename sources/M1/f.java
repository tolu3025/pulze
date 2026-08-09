package M1;

import I1.n;
import I1.u;
import U1.p;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(p pVar, Object obj, d completion) {
        m.e(pVar, "<this>");
        m.e(completion, "completion");
        d dVarC = N1.c.c(N1.c.a(pVar, obj, completion));
        n.a aVar = n.f2411b;
        dVarC.resumeWith(n.b(u.f2419a));
    }
}
