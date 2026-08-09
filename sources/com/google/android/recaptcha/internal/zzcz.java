package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzcz extends l implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcz(zzdc zzdcVar, long j3, RecaptchaAction recaptchaAction, String str, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = j3;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j3 = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j3, this);
            if (obj == objE) {
                return objE;
            }
        }
        return n.a(n.b((String) obj));
    }
}
