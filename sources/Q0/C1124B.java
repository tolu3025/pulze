package q0;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: renamed from: q0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1124B implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f10619b;

    C1124B(C1123A c1123a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f10618a = taskCompletionSource;
        this.f10619b = context;
        Objects.requireNonNull(c1123a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f10618a.setException(exc);
        C1123A.d(this.f10619b);
    }
}
