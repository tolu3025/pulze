package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzdt {
    static int zza(byte[] bArr, int i3, zzds zzdsVar) {
        int iZzj = zzj(bArr, i3, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i4 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i4);
        return iZzj + i4;
    }

    static int zzb(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    static int zzc(zzgh zzghVar, byte[] bArr, int i3, int i4, int i5, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i3, i4, i5, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    static int zzd(zzgh zzghVar, byte[] bArr, int i3, int i4, zzds zzdsVar) {
        int iZzk = i3 + 1;
        int i5 = bArr[i3];
        if (i5 < 0) {
            iZzk = zzk(i5, bArr, iZzk, zzdsVar);
            i5 = zzdsVar.zza;
        }
        int i6 = iZzk;
        if (i5 < 0 || i5 > i4 - i6) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i7 = i5 + i6;
        zzghVar.zzg(objZzd, bArr, i6, i7, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i7;
    }

    static int zze(zzgh zzghVar, int i3, byte[] bArr, int i4, int i5, zzey zzeyVar, zzds zzdsVar) {
        int iZzd = zzd(zzghVar, bArr, i4, i5, zzdsVar);
        while (true) {
            zzeyVar.add(zzdsVar.zzc);
            if (iZzd >= i5) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i3 != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i5, zzdsVar);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i3, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i3, zzdsVar);
        int i4 = zzdsVar.zza + iZzj;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i4) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    static int zzg(byte[] bArr, int i3, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i3, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i4, zzez.zzb);
        return iZzj + i4;
    }

    static int zzh(byte[] bArr, int i3, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i3, zzdsVar);
        int i4 = zzdsVar.zza;
        if (i4 < 0) {
            throw zzfa.zzc();
        }
        if (i4 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i4);
        return iZzj + i4;
    }

    static int zzi(int i3, byte[] bArr, int i4, int i5, zzgz zzgzVar, zzds zzdsVar) {
        if ((i3 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            int iZzm = zzm(bArr, i4, zzdsVar);
            zzgzVar.zzf(i3, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i6 == 1) {
            zzgzVar.zzf(i3, Long.valueOf(zzn(bArr, i4)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int iZzj = zzj(bArr, i4, zzdsVar);
            int i7 = zzdsVar.zza;
            if (i7 < 0) {
                throw zzfa.zzc();
            }
            if (i7 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            zzgzVar.zzf(i3, i7 == 0 ? zzee.zzb : zzee.zzk(bArr, iZzj, i7));
            return iZzj + i7;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i3, Integer.valueOf(zzb(bArr, i4)));
            return i4 + 4;
        }
        int i8 = (i3 & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i9 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int iZzj2 = zzj(bArr, i4, zzdsVar);
            int i10 = zzdsVar.zza;
            i9 = i10;
            if (i10 == i8) {
                i4 = iZzj2;
                break;
            }
            int iZzi = zzi(i9, bArr, iZzj2, i5, zzgzVarZzc, zzdsVar);
            i9 = i10;
            i4 = iZzi;
        }
        if (i4 > i5 || i9 != i8) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i3, zzgzVarZzc);
        return i4;
    }

    static int zzj(byte[] bArr, int i3, zzds zzdsVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return zzk(b3, bArr, i4, zzdsVar);
        }
        zzdsVar.zza = b3;
        return i4;
    }

    static int zzk(int i3, byte[] bArr, int i4, zzds zzdsVar) {
        int i5;
        int i6 = i3 & 127;
        int i7 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            i5 = b3 << 7;
        } else {
            int i8 = i6 | ((b3 & 127) << 7);
            int i9 = i4 + 2;
            byte b4 = bArr[i7];
            if (b4 >= 0) {
                zzdsVar.zza = i8 | (b4 << 14);
                return i9;
            }
            i6 = i8 | ((b4 & 127) << 14);
            i7 = i4 + 3;
            byte b5 = bArr[i9];
            if (b5 >= 0) {
                i5 = b5 << 21;
            } else {
                int i10 = i6 | ((b5 & 127) << 21);
                int i11 = i4 + 4;
                byte b6 = bArr[i7];
                if (b6 >= 0) {
                    zzdsVar.zza = i10 | (b6 << 28);
                    return i11;
                }
                int i12 = i10 | ((b6 & 127) << 28);
                while (true) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        zzdsVar.zza = i12;
                        return i13;
                    }
                    i11 = i13;
                }
            }
        }
        zzdsVar.zza = i6 | i5;
        return i7;
    }

    static int zzl(int i3, byte[] bArr, int i4, int i5, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i4, zzdsVar);
        while (true) {
            zzevVar.zze(zzdsVar.zza);
            if (iZzj >= i5) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i3 != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i3, zzds zzdsVar) {
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        if (j3 >= 0) {
            zzdsVar.zzb = j3;
            return i4;
        }
        int i5 = i3 + 2;
        byte b3 = bArr[i4];
        long j4 = (j3 & 127) | (((long) (b3 & 127)) << 7);
        int i6 = 7;
        while (b3 < 0) {
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            i6 += 7;
            j4 |= ((long) (b4 & 127)) << i6;
            b3 = b4;
            i5 = i7;
        }
        zzdsVar.zzb = j4;
        return i5;
    }

    static long zzn(byte[] bArr, int i3) {
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }
}
