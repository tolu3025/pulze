package T;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f2818b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f2819a = null;

    public static d a(Context context) {
        return f2818b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f2819a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f2819a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2819a;
    }
}
