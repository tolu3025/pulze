package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class zzcw extends zzcv {
    protected final byte[] zza;

    zzcw(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcz) || zzd() != ((zzcz) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return obj.equals(this);
        }
        zzcw zzcwVar = (zzcw) obj;
        int iZzk = zzk();
        int iZzk2 = zzcwVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzcwVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzcwVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzcwVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzcwVar.zza;
        int iZzc = zzc() + iZzd;
        int iZzc2 = zzc();
        int iZzc3 = zzcwVar.zzc();
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public byte zza(int i3) {
        return this.zza[i3];
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    byte zzb(int i3) {
        return this.zza[i3];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    protected void zze(byte[] bArr, int i3, int i4, int i5) {
        System.arraycopy(this.zza, 0, bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    protected final int zzf(int i3, int i4, int i5) {
        byte[] bArr = this.zza;
        int iZzc = zzc();
        byte[] bArr2 = zzde.zzd;
        for (int i6 = iZzc; i6 < iZzc + i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final zzcz zzg(int i3, int i4) {
        int iZzj = zzcz.zzj(i3, i4, zzd());
        return iZzj == 0 ? zzcz.zzb : new zzct(this.zza, zzc() + i3, iZzj);
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.fido.zzcz
    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}
