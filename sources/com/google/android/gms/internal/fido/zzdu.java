package com.google.android.gms.internal.fido;

import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() < 24) {
            long jZza = this.zzb.zza();
            this.zzb = null;
            return jZza;
        }
        if (this.zzb.zza() == 24) {
            int i3 = this.zza.read();
            if (i3 == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return ((long) i3) & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return (((long) bArr[1]) & 255) | ((((long) bArr[0]) & 255) << 8);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            return ((((long) bArr2[1]) & 255) << 16) | ((bArr2[0] & 255) << 24) | ((((long) bArr2[2]) & 255) << 8) | (((long) bArr2[3]) & 255);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.zzb.zza()), Integer.valueOf(this.zzb.zzc())));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        return (((long) bArr3[7]) & 255) | ((((long) bArr3[1]) & 255) << 48) | ((bArr3[0] & 255) << 56) | ((((long) bArr3[2]) & 255) << 40) | ((((long) bArr3[3]) & 255) << 32) | ((((long) bArr3[4]) & 255) << 24) | ((((long) bArr3[5]) & 255) << 16) | ((((long) bArr3[6]) & 255) << 8);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.zzb.zza())));
        }
    }

    private final void zzj(byte b3) throws IOException {
        zzd();
        if (this.zzb.zzb() != b3) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b3 >> 5) & 7), Integer.valueOf(this.zzb.zzc())));
        }
    }

    private final void zzk(byte[] bArr, int i3) throws IOException {
        int i4 = 0;
        while (i4 != i3) {
            int i5 = this.zza.read(bArr, i4, i3 - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.valueOf(a.e.API_PRIORITY_OTHER)));
        }
        if (this.zza.available() < jZzh) {
            throw new EOFException();
        }
        int i3 = (int) jZzh;
        byte[] bArr = new byte[i3];
        zzk(bArr, i3);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj((byte) -128);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh);
        }
        return jZzh;
    }

    public final long zzb() throws IOException {
        boolean z2;
        zzd();
        if (this.zzb.zzb() == 0) {
            z2 = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.zzb.zzc())));
            }
            z2 = false;
        }
        long jZzh = zzh();
        if (jZzh >= 0) {
            return z2 ? jZzh : ~jZzh;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh + jZzh);
        }
        return jZzh;
    }

    public final zzdt zzd() throws IOException {
        zzdv zzdvVar;
        long j3;
        if (this.zzb == null) {
            int i3 = this.zza.read();
            if (i3 == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdtVar = new zzdt(i3);
            this.zzb = zzdtVar;
            byte bZzb = zzdtVar.zzb();
            if (bZzb == -128 || bZzb == -96 || bZzb == -64) {
                this.zzd.zzd();
                this.zzd.zzf();
            } else {
                if (bZzb != -32) {
                    if (bZzb != 0 && bZzb != 32) {
                        if (bZzb == 64) {
                            zzdvVar = this.zzd;
                            j3 = -1;
                        } else {
                            if (bZzb != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.zzb.zzc())));
                            }
                            zzdvVar = this.zzd;
                            j3 = -2;
                        }
                        zzdvVar.zze(j3);
                    }
                    this.zzd.zzf();
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
                this.zzd.zzd();
                this.zzd.zzf();
            }
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iZzh = (int) zzh();
        if (iZzh == 20) {
            return false;
        }
        if (iZzh == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }
}
