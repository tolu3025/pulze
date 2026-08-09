package r0;

/* JADX INFO: loaded from: classes.dex */
public class x implements L0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11167c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f11168a = f11167c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile L0.b f11169b;

    public x(L0.b bVar) {
        this.f11169b = bVar;
    }

    @Override // L0.b
    public Object get() {
        Object obj = this.f11168a;
        Object obj2 = f11167c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f11168a;
                    if (obj == obj2) {
                        obj = this.f11169b.get();
                        this.f11168a = obj;
                        this.f11169b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
