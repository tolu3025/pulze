package q0;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC0681i;
import java.util.Objects;

/* JADX INFO: renamed from: q0.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1130H implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f10645b;

    C1130H(C1123A c1123a, TaskCompletionSource taskCompletionSource, Context context) {
        this.f10644a = taskCompletionSource;
        this.f10645b = context;
        Objects.requireNonNull(c1123a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f10644a.setResult((InterfaceC0681i) obj);
        C1123A.d(this.f10645b);
    }
}
