package q0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import k0.C0992f;

/* JADX INFO: renamed from: q0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1163w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1160t f10793b;

    RunnableC1163w(C1160t c1160t, String str) {
        Objects.requireNonNull(c1160t);
        this.f10793b = c1160t;
        this.f10792a = AbstractC0643s.e(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C0992f.p(this.f10792a));
        if (firebaseAuth.m() != null) {
            Task taskC = firebaseAuth.c(true);
            C1160t.f10776h.g("Token refreshing started", new Object[0]);
            taskC.addOnFailureListener(new C1162v(this));
        }
    }
}
