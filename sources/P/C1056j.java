package p;

import J1.AbstractC0411o;
import c2.N;
import java.util.List;
import q.C1121a;
import q.C1122b;

/* JADX INFO: renamed from: p.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1056j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1056j f10028a = new C1056j();

    private C1056j() {
    }

    public final InterfaceC1055i a(E storage, C1122b c1122b, List migrations, N scope) {
        kotlin.jvm.internal.m.e(storage, "storage");
        kotlin.jvm.internal.m.e(migrations, "migrations");
        kotlin.jvm.internal.m.e(scope, "scope");
        InterfaceC1051e c1121a = c1122b;
        if (c1122b == null) {
            c1121a = new C1121a();
        }
        return new C1057k(storage, AbstractC0411o.d(AbstractC1054h.f10010a.b(migrations)), c1121a, scope);
    }
}
