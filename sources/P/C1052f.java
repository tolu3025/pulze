package p;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1052f extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10009c;

    public C1052f(Object obj, int i3, int i4) {
        super(i4, null);
        this.f10008b = obj;
        this.f10009c = i3;
    }

    public final void b() {
        Object obj = this.f10008b;
        if ((obj != null ? obj.hashCode() : 0) != this.f10009c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final Object c() {
        return this.f10008b;
    }
}
