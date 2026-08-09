package S1;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                I1.b.a(th, th2);
            }
        }
    }
}
