package y1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import y1.InterfaceC1309l;

/* JADX INFO: renamed from: y1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1312o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1312o f12019b = new C1312o(new InterfaceC1309l.a(), InterfaceC1309l.b.f11958a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f12020a = new ConcurrentHashMap();

    C1312o(InterfaceC1311n... interfaceC1311nArr) {
        for (InterfaceC1311n interfaceC1311n : interfaceC1311nArr) {
            this.f12020a.put(interfaceC1311n.a(), interfaceC1311n);
        }
    }

    public static C1312o a() {
        return f12019b;
    }

    public InterfaceC1311n b(String str) {
        return (InterfaceC1311n) this.f12020a.get(str);
    }
}
