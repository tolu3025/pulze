package t1;

import J1.AbstractC0411o;
import J1.AbstractC0412p;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(Throwable th) {
        if (th instanceof C1247v) {
            return AbstractC0412p.j(((C1247v) th).a(), th.getMessage(), ((C1247v) th).b());
        }
        return AbstractC0412p.j(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Object obj) {
        return AbstractC0411o.d(obj);
    }
}
