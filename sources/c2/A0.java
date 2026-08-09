package c2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0600z0 f5049a;

    public A0(String str, Throwable th, InterfaceC0600z0 interfaceC0600z0) {
        super(str);
        this.f5049a = interfaceC0600z0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof A0) {
                A0 a02 = (A0) obj;
                if (!kotlin.jvm.internal.m.a(a02.getMessage(), getMessage()) || !kotlin.jvm.internal.m.a(a02.f5049a, this.f5049a) || !kotlin.jvm.internal.m.a(a02.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.m.b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f5049a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f5049a;
    }
}
