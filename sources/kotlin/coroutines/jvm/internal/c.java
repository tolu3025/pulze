package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public final class c implements M1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9717a = new c();

    private c() {
    }

    @Override // M1.d
    public M1.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // M1.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
