package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends l implements p {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzy zzyVar, String str, List list, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == objE) {
                return objE;
            }
        }
        this.zzd.add((zzaa) obj);
        return u.f2419a;
    }
}
