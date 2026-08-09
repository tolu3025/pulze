package p;

/* JADX INFO: loaded from: classes.dex */
public final class x extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f10225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i3) {
        super(i3, null);
        kotlin.jvm.internal.m.e(readException, "readException");
        this.f10225b = readException;
    }

    public final Throwable b() {
        return this.f10225b;
    }
}
