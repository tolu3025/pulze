package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes.dex */
public final class zzafp<ResultT, CallbackT> implements zzafg<ResultT> {
    private final zzaff<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzafp(zzaff<ResultT, CallbackT> zzaffVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaffVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafg
    public final void zza(ResultT resultt, Status status) {
        AbstractC0643s.l(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzaff<ResultT, CallbackT> zzaffVar = this.zza;
        if (zzaffVar.zzq != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaffVar.zzc);
            zzaff<ResultT, CallbackT> zzaffVar2 = this.zza;
            taskCompletionSource.setException(zzaen.zza(firebaseAuth, zzaffVar2.zzq, ("reauthenticateWithCredential".equals(zzaffVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC0679h abstractC0679h = zzaffVar.zzn;
        if (abstractC0679h != null) {
            this.zzb.setException(zzaen.zza(status, abstractC0679h, zzaffVar.zzo, zzaffVar.zzp));
        } else {
            this.zzb.setException(zzaen.zza(status));
        }
    }
}
