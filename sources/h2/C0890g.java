package h2;

/* JADX INFO: renamed from: h2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0890g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient M1.g f7443a;

    public C0890g(M1.g gVar) {
        this.f7443a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f7443a.toString();
    }
}
