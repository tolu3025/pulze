package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import J1.x;
import U1.p;
import android.content.ContentValues;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzer extends l implements p {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzer(zzes zzesVar, zztx zztxVar, M1.d dVar) {
        super(2, dVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzer(this.zza, this.zzb, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        N1.d.e();
        o.b(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzesVar.zze != null) {
                    byte[] bArrZzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzei zzeiVar = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzesVar.zze.zzb() - 500;
                    if (iZzb > 0) {
                        zzesVar.zze.zza(x.P(zzesVar.zze.zzd(), iZzb));
                    }
                    if (zzesVar.zze.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u.f2419a;
    }
}
