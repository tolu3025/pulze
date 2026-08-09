package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzajz extends zzakg {
    private final int zzc;
    private final int zzd;

    zzajz(byte[] bArr, int i3, int i4) {
        super(bArr);
        zzajv.zza(i3, i3 + i4, bArr.length);
        this.zzc = i3;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg, com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final byte zza(int i3) {
        int iZzb = zzb();
        if (((iZzb - (i3 + 1)) | i3) >= 0) {
            return this.zzb[this.zzc + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + iZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg, com.google.android.gms.internal.p002firebaseauthapi.zzajv
    final byte zzb(int i3) {
        return this.zzb[this.zzc + i3];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    protected final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg, com.google.android.gms.internal.p002firebaseauthapi.zzajv
    protected final void zza(byte[] bArr, int i3, int i4, int i5) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg, com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final int zzb() {
        return this.zzd;
    }
}
