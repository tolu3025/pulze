package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[PHI: r0
      0x0085: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:23:0x0082, B:17:0x005e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(U1.l r19, long r20, long r22, double r24, U1.l r26, M1.d r27) throws java.lang.Exception {
        /*
            r18 = this;
            r0 = r27
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbp
            if (r1 == 0) goto L17
            r1 = r0
            com.google.android.recaptcha.internal.zzbp r1 = (com.google.android.recaptcha.internal.zzbp) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.zzh = r2
            r2 = r18
            goto L1e
        L17:
            com.google.android.recaptcha.internal.zzbp r1 = new com.google.android.recaptcha.internal.zzbp
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.zzf
            java.lang.Object r3 = N1.b.e()
            int r4 = r1.zzh
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L64
            if (r4 == r6) goto L50
            if (r4 != r5) goto L48
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            U1.l r4 = (U1.l) r4
            java.lang.Object r13 = r1.zza
            U1.l r13 = (U1.l) r13
            I1.o.b(r0)
        L3f:
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
            goto L72
        L48:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L50:
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            U1.l r4 = (U1.l) r4
            java.lang.Object r13 = r1.zza
            U1.l r13 = (U1.l) r13
            I1.o.b(r0)     // Catch: java.lang.Exception -> L62
            goto L85
        L62:
            r0 = move-exception
            goto L8f
        L64:
            I1.o.b(r0)
            r7 = r20
            r9 = r22
            r11 = r24
            r4 = r26
            r13 = r1
            r1 = r19
        L72:
            r13.zza = r1     // Catch: java.lang.Exception -> L86
            r13.zzb = r4     // Catch: java.lang.Exception -> L86
            r13.zzc = r9     // Catch: java.lang.Exception -> L86
            r13.zze = r11     // Catch: java.lang.Exception -> L86
            r13.zzd = r7     // Catch: java.lang.Exception -> L86
            r13.zzh = r6     // Catch: java.lang.Exception -> L86
            java.lang.Object r0 = r4.invoke(r13)     // Catch: java.lang.Exception -> L86
            if (r0 != r3) goto L85
            return r3
        L85:
            return r0
        L86:
            r0 = move-exception
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
        L8f:
            java.lang.Object r14 = r13.invoke(r0)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lb6
            double r7 = (double) r7
            double r7 = r7 * r9
            long r7 = (long) r7
            long r7 = Y1.g.d(r7, r11)
            r1.zza = r13
            r1.zzb = r4
            r1.zzc = r11
            r1.zze = r9
            r1.zzd = r7
            r1.zzh = r5
            java.lang.Object r0 = c2.Y.a(r7, r1)
            if (r0 == r3) goto Lb5
            goto L3f
        Lb5:
            return r3
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zza(U1.l, long, long, double, U1.l, M1.d):java.lang.Object");
    }
}
