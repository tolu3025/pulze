package e2;

import c2.AbstractC0579o0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class o {
    public static final void a(v vVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC0579o0.a("Channel was consumed, consumer had failed", th);
            }
        }
        vVar.cancel(cancellationExceptionA);
    }
}
