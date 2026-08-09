package y1;

import e0.AbstractC0829j;
import java.util.concurrent.TimeoutException;
import y1.l0;

/* JADX INFO: renamed from: y1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315s {
    public static l0 a(r rVar) {
        AbstractC0829j.o(rVar, "context must not be null");
        if (!rVar.h()) {
            return null;
        }
        Throwable thC = rVar.c();
        if (thC == null) {
            return l0.f11961f.q("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return l0.f11964i.q(thC.getMessage()).p(thC);
        }
        l0 l0VarK = l0.k(thC);
        return (l0.b.UNKNOWN.equals(l0VarK.m()) && l0VarK.l() == thC) ? l0.f11961f.q("Context cancelled").p(thC) : l0VarK.p(thC);
    }
}
