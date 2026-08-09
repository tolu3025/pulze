package O0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f2734b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f2735a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f2734b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f2734b;
                    if (dVar == null) {
                        dVar = new d();
                        f2734b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f2735a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f2735a);
        }
        return setUnmodifiableSet;
    }
}
