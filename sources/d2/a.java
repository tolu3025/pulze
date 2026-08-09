package d2;

import android.os.Looper;
import c2.J0;
import h2.r;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {
    @Override // h2.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // h2.r
    public J0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // h2.r
    public int c() {
        return 1073741823;
    }
}
