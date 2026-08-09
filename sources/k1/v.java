package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.HashMap;
import l1.C1015a;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1015a f9654a;

    public v(C0543a c0543a) {
        this.f9654a = new C1015a(c0543a, "flutter/system", l1.f.f9776a);
    }

    public void a() {
        AbstractC0525b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.f9654a.c(map);
    }
}
