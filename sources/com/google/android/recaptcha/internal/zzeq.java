package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import java.util.Timer;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzeq extends l implements p {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeq(zzes zzesVar, M1.d dVar) {
        super(2, dVar);
        this.zza = zzesVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzeq(this.zza, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        N1.d.e();
        o.b(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    Timer timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return u.f2419a;
    }
}
