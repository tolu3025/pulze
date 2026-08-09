package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzda extends l implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j3, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzf;
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 != 0) {
            objZzf = ((n) obj).i();
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j3 = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j3, this);
            if (objZzf == objE) {
                return objE;
            }
        }
        o.b(objZzf);
        return objZzf;
    }
}
