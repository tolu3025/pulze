package q0;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

/* JADX INFO: loaded from: classes.dex */
final class Y implements V {
    Y() {
    }

    @Override // q0.V
    public final Task a(Application application, String str) {
        return Recaptcha.fetchTaskClient(application, str);
    }
}
