package com.google.android.recaptcha.internal;

import I1.u;
import U1.l;
import c2.V;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class zzar extends n implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ V zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(TaskCompletionSource taskCompletionSource, V v2) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = v2;
    }

    @Override // U1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return u.f2419a;
    }
}
