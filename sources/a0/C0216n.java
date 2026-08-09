package A0;

import A0.C0215m;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: A0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0216n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f226a = new HashMap();

    public void a(C0215m c0215m) {
        D0.l key = c0215m.b().getKey();
        C0215m c0215m2 = (C0215m) this.f226a.get(key);
        if (c0215m2 == null) {
            this.f226a.put(key, c0215m);
            return;
        }
        C0215m.a aVarC = c0215m2.c();
        C0215m.a aVarC2 = c0215m.c();
        C0215m.a aVar = C0215m.a.ADDED;
        if (aVarC2 == aVar || aVarC != C0215m.a.METADATA) {
            if (aVarC2 != C0215m.a.METADATA || aVarC == C0215m.a.REMOVED) {
                C0215m.a aVar2 = C0215m.a.MODIFIED;
                if (aVarC2 == aVar2 && aVarC == aVar2) {
                    c0215m = C0215m.a(aVar2, c0215m.b());
                } else if (aVarC2 == aVar2 && aVarC == aVar) {
                    c0215m = C0215m.a(aVar, c0215m.b());
                } else {
                    C0215m.a aVar3 = C0215m.a.REMOVED;
                    if (aVarC2 == aVar3 && aVarC == aVar) {
                        this.f226a.remove(key);
                        return;
                    } else if (aVarC2 == aVar3 && aVarC == aVar2) {
                        c0215m = C0215m.a(aVar3, c0215m2.b());
                    } else {
                        if (aVarC2 != aVar || aVarC != aVar3) {
                            throw AbstractC0386b.a("Unsupported combination of changes %s after %s", aVarC2, aVarC);
                        }
                        c0215m = C0215m.a(aVar2, c0215m.b());
                    }
                }
            } else {
                c0215m = C0215m.a(aVarC, c0215m.b());
            }
        }
        this.f226a.put(key, c0215m);
    }

    List b() {
        return new ArrayList(this.f226a.values());
    }
}
