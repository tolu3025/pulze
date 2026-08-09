package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzage implements OnFailureListener {
    zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzagc.zza.c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
