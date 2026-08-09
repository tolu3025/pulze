package e0;

/* JADX INFO: renamed from: e0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0835p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0835p f7091a = new a();

    /* JADX INFO: renamed from: e0.p$a */
    class a extends AbstractC0835p {
        a() {
        }

        @Override // e0.AbstractC0835p
        public long a() {
            return System.nanoTime();
        }
    }

    protected AbstractC0835p() {
    }

    public static AbstractC0835p b() {
        return f7091a;
    }

    public abstract long a();
}
