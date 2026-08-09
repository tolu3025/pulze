package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzams<T> implements zzanb<T> {
    private final zzamm zza;
    private final zzanu<?, ?> zzb;
    private final boolean zzc;
    private final zzakw<?> zzd;

    private zzams(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        this.zzb = zzanuVar;
        this.zzc = zzakwVar.zza(zzammVar);
        this.zzd = zzakwVar;
        this.zza = zzammVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t2) {
        zzanu<?, ?> zzanuVar = this.zzb;
        int iZzb = zzanuVar.zzb(zzanuVar.zzd(t2));
        return this.zzc ? iZzb + this.zzd.zza(t2).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t2) {
        int iHashCode = this.zzb.zzd(t2).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t2).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t2) {
        this.zzb.zzf(t2);
        this.zzd.zzc(t2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t2) {
        return this.zzd.zza(t2).zzg();
    }

    static <T> zzams<T> zza(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        return new zzams<>(zzanuVar, zzakwVar, zzammVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zzb(T t2, T t3) {
        if (!this.zzb.zzd(t2).equals(this.zzb.zzd(t3))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t2).equals(this.zzd.zza(t3));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        zzamm zzammVar = this.zza;
        return zzammVar instanceof zzalf ? (T) ((zzalf) zzammVar).zzo() : (T) zzammVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t2, zzanc zzancVar, zzaku zzakuVar) {
        boolean zZzt;
        zzanu<?, ?> zzanuVar = this.zzb;
        zzakw<?> zzakwVar = this.zzd;
        Object objZzc = zzanuVar.zzc(t2);
        zzakx<T> zzakxVarZzb = zzakwVar.zzb(t2);
        while (zzancVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzancVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzakwVar.zza(zzakuVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzakwVar.zza(zzancVar, objZza, zzakuVar, zzakxVarZzb);
                        } else {
                            zZzt = zzanuVar.zza(objZzc, zzancVar, 0);
                        }
                    } else {
                        zZzt = zzancVar.zzt();
                    }
                    if (!zZzt) {
                        zzanuVar.zzb(t2, objZzc);
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    zzajv zzajvVarZzp = null;
                    while (zzancVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzancVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzancVar.zzj();
                            objZza2 = zzakwVar.zza(zzakuVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzakwVar.zza(zzancVar, objZza2, zzakuVar, zzakxVarZzb);
                            } else {
                                zzajvVarZzp = zzancVar.zzp();
                            }
                        } else if (iZzd2 == 12 || !zzancVar.zzt()) {
                            break;
                        }
                    }
                    if (zzancVar.zzd() != 12) {
                        throw zzall.zzb();
                    }
                    if (zzajvVarZzp != null) {
                        if (objZza2 != null) {
                            zzakwVar.zza(zzajvVarZzp, objZza2, zzakuVar, zzakxVarZzb);
                        } else {
                            zzanuVar.zza(objZzc, iZzj, zzajvVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzanuVar.zzb(t2, objZzc);
                throw th;
            }
        }
        zzanuVar.zzb(t2, objZzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t2, zzaol zzaolVar) {
        Iterator itZzd = this.zzd.zza(t2).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzakz zzakzVar = (zzakz) entry.getKey();
            if (zzakzVar.zzc() != zzaoj.MESSAGE || zzakzVar.zze() || zzakzVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzaolVar.zza(zzakzVar.zza(), entry instanceof zzalp ? ((zzalp) entry).zza().zzb() : entry.getValue());
        }
        zzanu<?, ?> zzanuVar = this.zzb;
        zzanuVar.zza(zzanuVar.zzd(t2), zzaolVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t2, T t3) {
        zzand.zza(this.zzb, t2, t3);
        if (this.zzc) {
            zzand.zza(this.zzd, t2, t3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzaju r14) throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzalf) r0
            com.google.android.gms.internal.firebase-auth-api.zzanx r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzanx r2 = com.google.android.gms.internal.p002firebaseauthapi.zzanx.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzanx r1 = com.google.android.gms.internal.p002firebaseauthapi.zzanx.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzd r10 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaku r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamm r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzajv r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzajv) r2
            goto L53
        L72:
            com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaku r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzamm r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzalf$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzalf.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzall r10 = com.google.android.gms.internal.p002firebaseauthapi.zzall.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzams.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):void");
    }
}
