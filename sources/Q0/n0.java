package q0;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class n0 implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10762a;

    n0(C1126D c1126d, TaskCompletionSource taskCompletionSource) {
        this.f10762a = taskCompletionSource;
        Objects.requireNonNull(c1126d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f10762a.setResult(new u0().c((String) obj).b());
    }
}
