package com.google.android.recaptcha.internal;

import J1.AbstractC0412p;
import J1.u;
import c2.O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        u.s(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j3, M1.d dVar) {
        return O.c(new zzh(this, str, j3, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r13, com.google.android.recaptcha.internal.zzsc r15, com.google.android.recaptcha.internal.zzek r16, M1.d r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r9 = r12
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r9 = r12
            r1.<init>(r12, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            java.lang.Object r10 = N1.b.e()
            int r2 = r1.zzc
            r11 = 1
            if (r2 == 0) goto L35
            if (r2 != r11) goto L2d
            I1.o.b(r0)
            goto L4d
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            I1.o.b(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r16
            r5 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r11
            java.lang.Object r0 = c2.O.c(r0, r1)
            if (r0 != r10) goto L4d
            return r10
        L4d:
            I1.n r0 = (I1.n) r0
            java.lang.Object r0 = r0.i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, M1.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i3, h hVar) {
        List listH = AbstractC0412p.h();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) listH.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
