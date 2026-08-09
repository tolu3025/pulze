package q0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

/* JADX INFO: renamed from: q0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1153l implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1154m f10751a;

    C1153l(C1154m c1154m) {
        Objects.requireNonNull(c1154m);
        this.f10751a = c1154m;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return !task.isSuccessful() ? Tasks.forException((Exception) AbstractC0643s.k(task.getException())) : Tasks.forResult(C1157p.t(((com.google.firebase.auth.C) task.getResult()).g(), this.f10751a.f10757a));
    }
}
