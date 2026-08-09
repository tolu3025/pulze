package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.O;
import com.google.firebase.auth.Q;
import k0.C0999m;

/* JADX INFO: loaded from: classes.dex */
final class zzaga extends Q.b {
    private final /* synthetic */ Q.b zza;
    private final /* synthetic */ String zzb;

    zzaga(Q.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzagb.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeSent(String str, Q.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationCompleted(O o2) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(o2);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationFailed(C0999m c0999m) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c0999m);
    }
}
