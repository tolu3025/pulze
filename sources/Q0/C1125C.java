package q0;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC0681i;
import java.util.Objects;

/* JADX INFO: renamed from: q0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1125C implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f10622b;

    C1125C(C1123A c1123a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f10621a = taskCompletionSource;
        this.f10622b = context;
        Objects.requireNonNull(c1123a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f10621a.setResult((InterfaceC0681i) obj);
        C1123A.d(this.f10622b);
    }
}
