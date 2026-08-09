package com.google.android.recaptcha.internal;

import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzfs extends l implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzgd zzgdVar, zzft zzftVar, String str, M1.d dVar) {
        super(2, dVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = N1.b.e()
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L10
            I1.o.b(r7)
            goto L82
        L10:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r1 = (com.google.android.recaptcha.internal.zzjh) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzub r2 = (com.google.android.recaptcha.internal.zzub) r2
            I1.o.b(r7)     // Catch: java.lang.Exception -> L1c
            goto L5f
        L1c:
            r7 = move-exception
            goto L6f
        L1e:
            I1.o.b(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r1 = new com.google.android.recaptcha.internal.zzbn
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzkh r1 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch: java.lang.Exception -> L1c
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch: java.lang.Exception -> L1c
            r7.zzf()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzft r1 = r6.zze     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzhx r1 = com.google.android.recaptcha.internal.zzft.zzb(r1)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zztz r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch: java.lang.Exception -> L1c
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch: java.lang.Exception -> L1c
            r6.zza = r7     // Catch: java.lang.Exception -> L1c
            r6.zzb = r3     // Catch: java.lang.Exception -> L1c
            r6.zzc = r2     // Catch: java.lang.Exception -> L1c
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzft.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L1c
            if (r1 == r0) goto L81
            r2 = r7
            r1 = r3
        L5f:
            r1.zzf()     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L1c
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L1c
            kotlin.coroutines.jvm.internal.b.d(r3)     // Catch: java.lang.Exception -> L1c
            r2.zzf()     // Catch: java.lang.Exception -> L1c
            goto L82
        L6f:
            com.google.android.recaptcha.internal.zzft r1 = r6.zze
            com.google.android.recaptcha.internal.zzgd r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzft.zzd(r1, r7, r2, r6)
            if (r7 != r0) goto L82
        L81:
            return r0
        L82:
            I1.u r7 = I1.u.f2419a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
