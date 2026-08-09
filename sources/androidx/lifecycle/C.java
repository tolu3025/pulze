package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4697a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f4697a.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
        this.f4697a.clear();
    }

    public final y b(String key) {
        kotlin.jvm.internal.m.e(key, "key");
        return (y) this.f4697a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f4697a.keySet());
    }

    public final void d(String key, y viewModel) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(viewModel, "viewModel");
        y yVar = (y) this.f4697a.put(key, viewModel);
        if (yVar != null) {
            yVar.d();
        }
    }
}
