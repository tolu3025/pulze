package I0;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import k0.C0989c;
import y0.AbstractC1279a;
import y1.AbstractC1299b;
import y1.Z;
import y1.l0;

/* JADX INFO: renamed from: I0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0380v extends AbstractC1299b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Z.g f2368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Z.g f2369d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1279a f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1279a f2371b;

    static {
        Z.d dVar = y1.Z.f11842e;
        f2368c = Z.g.e("Authorization", dVar);
        f2369d = Z.g.e("x-firebase-appcheck", dVar);
    }

    C0380v(AbstractC1279a abstractC1279a, AbstractC1279a abstractC1279a2) {
        this.f2370a = abstractC1279a;
        this.f2371b = abstractC1279a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Task task, AbstractC1299b.a aVar, Task task2, Task task3) {
        Exception exception;
        y1.Z z2 = new y1.Z();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            J0.A.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                z2.p(f2368c, "Bearer " + str);
            }
        } else {
            exception = task.getException();
            if (exception instanceof C0989c) {
                J0.A.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof N0.a)) {
                    J0.A.e("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                    aVar.b(l0.f11968m.p(exception));
                    return;
                }
                J0.A.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                J0.A.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                z2.p(f2369d, str2);
            }
        } else {
            exception = task2.getException();
            if (!(exception instanceof C0989c)) {
                J0.A.e("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception);
                aVar.b(l0.f11968m.p(exception));
                return;
            }
            J0.A.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.a(z2);
    }

    @Override // y1.AbstractC1299b
    public void a(AbstractC1299b.AbstractC0192b abstractC0192b, Executor executor, final AbstractC1299b.a aVar) {
        final Task taskA = this.f2370a.a();
        final Task taskA2 = this.f2371b.a();
        Tasks.whenAll((Task<?>[]) new Task[]{taskA, taskA2}).addOnCompleteListener(J0.s.f2500b, new OnCompleteListener() { // from class: I0.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C0380v.c(taskA, aVar, taskA2, task);
            }
        });
    }
}
