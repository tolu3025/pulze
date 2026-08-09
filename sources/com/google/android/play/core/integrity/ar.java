package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f5766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f5766a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        int i4;
        if (i3 == 1) {
            taskCompletionSource = this.f5766a.f5767a;
            i4 = 3;
        } else if (i3 == 2) {
            taskCompletionSource = this.f5766a.f5767a;
            i4 = 2;
        } else {
            if (i3 != 3) {
                return;
            }
            taskCompletionSource = this.f5766a.f5767a;
            i4 = 1;
        }
        taskCompletionSource.trySetResult(i4);
    }
}
