package q1;

/* JADX INFO: renamed from: q1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1193z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f11077a;

    private C1193z() {
        this.f11077a = null;
    }

    public static C1193z a() {
        return new C1193z();
    }

    public static C1193z b(Exception exc) {
        return new C1193z(exc);
    }

    private C1193z(Exception exc) {
        this.f11077a = exc;
    }
}
