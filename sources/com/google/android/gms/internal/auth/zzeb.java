package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class zzeb extends zzea {
    protected final byte[] zza;

    zzeb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return obj.equals(this);
        }
        zzeb zzebVar = (zzeb) obj;
        int iZzj = zzj();
        int iZzj2 = zzebVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzebVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzebVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzebVar.zza;
        zzebVar.zzc();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iZzd) {
            if (bArr[i3] != bArr2[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zza(int i3) {
        return this.zza[i3];
    }

    @Override // com.google.android.gms.internal.auth.zzee
    byte zzb(int i3) {
        return this.zza[i3];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    protected final int zze(int i3, int i4, int i5) {
        return zzez.zzd(i3, this.zza, 0, i5);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final zzee zzf(int i3, int i4) {
        int iZzi = zzee.zzi(0, i4, zzd());
        return iZzi == 0 ? zzee.zzb : new zzdy(this.zza, 0, iZzi);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}
