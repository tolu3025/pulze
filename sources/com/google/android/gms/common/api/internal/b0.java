package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.base.zao;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends zao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c0 f5397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Looper looper) {
        super(looper);
        Objects.requireNonNull(c0Var);
        this.f5397a = c0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 0) {
            if (i3 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 59);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i3);
            Log.e("TransformedResultImpl", sb.toString());
            return;
        }
        com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) message.obj;
        c0 c0Var = this.f5397a;
        synchronized (c0Var.f()) {
            try {
                c0 c0Var2 = (c0) AbstractC0643s.k(c0Var.e());
                if (gVar == null) {
                    c0Var2.d(new Status(13, "Transform returned null"));
                } else {
                    c0Var2.c(gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
