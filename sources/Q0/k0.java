package q0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k0 f10748c = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f10749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1123A f10750b;

    private k0() {
        this(O.j(), C1123A.b());
    }

    public static k0 f() {
        return f10748c;
    }

    public final void a(Context context) {
        this.f10749a.a(context);
    }

    public final void b(FirebaseAuth firebaseAuth) {
        this.f10749a.h(firebaseAuth);
    }

    public final boolean c(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f10750b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.A a3) {
        return this.f10750b.j(activity, taskCompletionSource, firebaseAuth, a3);
    }

    public final Task e() {
        return this.f10749a.i();
    }

    private k0(O o2, C1123A c1123a) {
        this.f10749a = o2;
        this.f10750b = c1123a;
    }
}
