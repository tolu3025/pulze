package q0;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C0710x;
import com.google.firebase.auth.InterfaceC0681i;
import java.util.Objects;

/* JADX INFO: renamed from: q0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1155n implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1156o f10761a;

    C1155n(C1156o c1156o) {
        Objects.requireNonNull(c1156o);
        this.f10761a = c1156o;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (this.f10761a.f10766d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            InterfaceC0681i interfaceC0681i = (InterfaceC0681i) task.getResult();
            return Tasks.forResult(new H0((C1150i) interfaceC0681i.k(), (F0) interfaceC0681i.r(), this.f10761a.f10766d));
        }
        Exception exception = task.getException();
        if (exception instanceof C0710x) {
            ((C0710x) exception).d(this.f10761a.f10766d);
        }
        return Tasks.forException(exception);
    }
}
