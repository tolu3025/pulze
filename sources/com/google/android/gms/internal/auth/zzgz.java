package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzgz zza() {
        return zza;
    }

    static zzgz zzb(zzgz zzgzVar, zzgz zzgzVar2) {
        int i3 = zzgzVar.zzb + zzgzVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgzVar.zzc, i3);
        System.arraycopy(zzgzVar2.zzc, 0, iArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgzVar.zzd, i3);
        System.arraycopy(zzgzVar2.zzd, 0, objArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i3, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i3 = this.zzb;
        if (i3 == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
                    int i5 = this.zzb;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.zzb;
        int i4 = (i3 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i4 + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return i7 + iHashCode;
    }

    public final void zzd() {
        this.zze = false;
    }

    final void zze(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzfy.zzb(sb, i3, String.valueOf(this.zzc[i4] >>> 3), this.zzd[i4]);
        }
    }

    final void zzf(int i3, Object obj) {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
        int i4 = this.zzb;
        int[] iArr = this.zzc;
        if (i4 == iArr.length) {
            int i5 = i4 + (i4 < 4 ? 8 : i4 >> 1);
            this.zzc = Arrays.copyOf(iArr, i5);
            this.zzd = Arrays.copyOf(this.zzd, i5);
        }
        int[] iArr2 = this.zzc;
        int i6 = this.zzb;
        iArr2[i6] = i3;
        this.zzd[i6] = obj;
        this.zzb = i6 + 1;
    }

    private zzgz(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.zzb = i3;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z2;
    }
}
