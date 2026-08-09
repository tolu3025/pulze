package q0;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: renamed from: q0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1166z implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f10799b;

    C1166z(C1123A c1123a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f10798a = taskCompletionSource;
        this.f10799b = context;
        Objects.requireNonNull(c1123a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f10798a.setException(exc);
        C1123A.d(this.f10799b);
    }
}
