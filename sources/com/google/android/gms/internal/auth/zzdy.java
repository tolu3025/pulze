package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzdy extends zzeb {
    private final int zzc;

    zzdy(byte[] bArr, int i3, int i4) {
        super(bArr);
        zzee.zzi(0, i4, bArr.length);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i3) {
        int i4 = this.zzc;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.zza[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    final byte zzb(int i3) {
        return this.zza[i3];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
