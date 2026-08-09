package com.google.android.recaptcha.internal;

import I1.u;
import android.content.Context;
import c2.InterfaceC0595x;
import c2.N;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import l2.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzan {
    public InterfaceC0595x zza;
    private final N zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final l2.a zzg = g.b(false, 1, null);

    public zzan(Context context, N n3, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j3) {
        this.zzb = n3;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(M1.d r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            I1.o.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            I1.o.b(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            c2.V r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, M1.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            I1.o.b(r7)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.zzd
            I1.o.b(r7)
            goto L4b
        L3a:
            I1.o.b(r7)
            c2.x r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            c2.V r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, M1.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r7, M1.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            I1.o.b(r8)
            goto L76
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            I1.o.b(r8)
            goto L69
        L3f:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            I1.o.b(r8)     // Catch: java.lang.Exception -> L5c
            goto L58
        L47:
            I1.o.b(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L5b
            r0.zze = r7     // Catch: java.lang.Exception -> L5b
            r0.zzc = r5     // Catch: java.lang.Exception -> L5b
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L5b
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r6
        L58:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5c
            goto L78
        L5b:
            r2 = r6
        L5c:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L79
        L76:
            java.lang.String r8 = (java.lang.String) r8
        L78:
            return r8
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, M1.d):java.lang.Object");
    }

    public final Object zzd(long j3, M1.d dVar) {
        this.zzf = j3;
        return u.f2419a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (I1.u.f2419a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(M1.d r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            I1.o.b(r14)
            goto Lb5
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            java.lang.Object r2 = r0.zza
            l2.a r2 = (l2.a) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            I1.o.b(r14)
            goto L52
        L40:
            I1.o.b(r14)
            l2.a r2 = r13.zzg
            r0.zze = r13
            r0.zza = r2
            r0.zzd = r4
            java.lang.Object r14 = r2.c(r5, r0)
            if (r14 == r1) goto Lbc
            r6 = r13
        L52:
            com.google.android.recaptcha.internal.zzao r14 = r6.zze     // Catch: java.lang.Throwable -> L62
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> L62
            boolean r14 = kotlin.jvm.internal.m.a(r14, r7)     // Catch: java.lang.Throwable -> L62
            if (r14 != 0) goto L64
            I1.u r14 = I1.u.f2419a     // Catch: java.lang.Throwable -> L62
            r2.a(r5)
            return r14
        L62:
            r14 = move-exception
            goto Lb8
        L64:
            com.google.android.recaptcha.internal.zzao r14 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> L62
            r6.zze = r14     // Catch: java.lang.Throwable -> L62
            I1.u r14 = I1.u.f2419a     // Catch: java.lang.Throwable -> L62
            r2.a(r5)
            com.google.android.recaptcha.internal.zzek r14 = r6.zzc
            java.lang.String r2 = r14.zzd()
            r14.zzc(r2)
            r14.zzb(r3)
            r2 = 38
            com.google.android.recaptcha.internal.zzen r14 = r14.zzf(r2)
            c2.x r2 = c2.AbstractC0599z.b(r5, r4, r5)
            r6.zza = r2
            c2.N r7 = r6.zzb
            com.google.android.recaptcha.internal.zzam r10 = new com.google.android.recaptcha.internal.zzam
            r10.<init>(r6, r14, r5)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            c2.AbstractC0566i.d(r7, r8, r9, r10, r11, r12)
            r0.zze = r5
            r0.zza = r5
            r0.zzd = r3
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lb0
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r4
        Lb0:
            I1.u r14 = I1.u.f2419a
            if (r14 != r1) goto Lb5
            goto Lbc
        Lb5:
            I1.u r14 = I1.u.f2419a
            return r14
        Lb8:
            r2.a(r5)
            throw r14
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(M1.d):java.lang.Object");
    }

    public final InterfaceC0595x zzf() {
        InterfaceC0595x interfaceC0595x = this.zza;
        if (interfaceC0595x != null) {
            return interfaceC0595x;
        }
        return null;
    }
}
