package C0;

import java.util.Map;

/* JADX INFO: renamed from: C0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.c f1038b;

    C0267n(int i3, t0.c cVar) {
        this.f1037a = i3;
        this.f1038b = cVar;
    }

    public static C0267n a(int i3, Map map) {
        t0.c cVarA = D0.j.a();
        for (Map.Entry entry : map.entrySet()) {
            cVarA = cVarA.m((D0.l) entry.getKey(), ((C0259k0) entry.getValue()).a());
        }
        return new C0267n(i3, cVarA);
    }

    public int b() {
        return this.f1037a;
    }

    public t0.c c() {
        return this.f1038b;
    }
}
