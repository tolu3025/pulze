package q0;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: renamed from: q0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1127E implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f10632b;

    C1127E(C1123A c1123a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f10631a = taskCompletionSource;
        this.f10632b = context;
        Objects.requireNonNull(c1123a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f10631a.setException(exc);
        C1123A.d(this.f10632b);
    }
}
