package g2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f7344a;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f7344a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
