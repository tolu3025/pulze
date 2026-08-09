package X;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class c extends zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3056a;

    c(a aVar, TaskCompletionSource taskCompletionSource) {
        this.f3056a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        AbstractC0621v.b(status, pendingIntent, this.f3056a);
    }
}
