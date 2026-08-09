package q0;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class o0 implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10769a;

    o0(C1126D c1126d, TaskCompletionSource taskCompletionSource) {
        this.f10769a = taskCompletionSource;
        Objects.requireNonNull(c1126d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f10769a.setResult(new u0().d((String) obj).b());
    }
}
