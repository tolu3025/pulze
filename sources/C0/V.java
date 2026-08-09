package C0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class V implements InterfaceC0228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f914a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f915b = new HashMap();

    V() {
    }

    @Override // C0.InterfaceC0228a
    public void a(z0.e eVar) {
        this.f914a.put(eVar.a(), eVar);
    }

    @Override // C0.InterfaceC0228a
    public z0.e b(String str) {
        return (z0.e) this.f914a.get(str);
    }

    @Override // C0.InterfaceC0228a
    public z0.j c(String str) {
        return (z0.j) this.f915b.get(str);
    }

    @Override // C0.InterfaceC0228a
    public void d(z0.j jVar) {
        this.f915b.put(jVar.b(), jVar);
    }
}
