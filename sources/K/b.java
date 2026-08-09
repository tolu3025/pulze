package K;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2558a = 1;

    public b a(Object obj) {
        this.f2558a = (this.f2558a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f2558a;
    }

    public final b c(boolean z2) {
        this.f2558a = (this.f2558a * 31) + (z2 ? 1 : 0);
        return this;
    }
}
