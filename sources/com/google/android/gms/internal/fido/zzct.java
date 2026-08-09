package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    zzct(byte[] bArr, int i3, int i4) {
        super(bArr);
        zzcz.zzj(i3, i3 + i4, bArr.length);
        this.zzc = i3;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i3) {
        int i4 = this.zzd;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.zza[this.zzc + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    final byte zzb(int i3) {
        return this.zza[this.zzc + i3];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    protected final void zze(byte[] bArr, int i3, int i4, int i5) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i5);
    }
}
