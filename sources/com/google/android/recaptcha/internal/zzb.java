package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzb(zze zzeVar, String str, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzb(this.zzb, this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
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
            zze zzeVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            objZzf = zzeVar.zzf(str, this);
            if (objZzf == objE) {
                return objE;
            }
        }
        return n.a(objZzf);
    }
}
