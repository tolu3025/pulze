package com.google.android.recaptcha.internal;

import I1.u;
import U1.p;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class zzgr extends n implements p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgd zzgdVar, String str, int i3) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i3;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i3 = this.zzc;
        if (i3 != -1) {
            this.zza.zzc().zze(i3, objArr);
        }
        return u.f2419a;
    }
}
