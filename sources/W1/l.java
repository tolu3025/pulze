package w1;

import J1.AbstractC0412p;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(Throwable th) {
        return AbstractC0412p.j(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
