package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.InterfaceC0595x;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzdx extends l implements p {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzec zzecVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzdx(this.zzb, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            InterfaceC0595x interfaceC0595x = this.zzb.zzc;
            this.zza = 1;
            if (interfaceC0595x.await(this) == objE) {
                return objE;
            }
        }
        return u.f2419a;
    }
}
