package q0;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;
import k0.C1000n;

/* JADX INFO: renamed from: q0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1162v implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RunnableC1163w f10788a;

    C1162v(RunnableC1163w runnableC1163w) {
        Objects.requireNonNull(runnableC1163w);
        this.f10788a = runnableC1163w;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof C1000n) {
            C1160t.f10776h.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f10788a.f10793b.d();
        }
    }
}
