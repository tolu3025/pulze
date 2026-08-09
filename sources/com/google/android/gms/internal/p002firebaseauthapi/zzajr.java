package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
final class zzajr {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i3) {
        return Double.longBitsToDouble(zzd(bArr, i3));
    }

    static float zzb(byte[] bArr, int i3) {
        return Float.intBitsToFloat(zzc(bArr, i3));
    }

    static int zzc(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i3, zzaju zzajuVar) {
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        if (j3 >= 0) {
            zzajuVar.zzb = j3;
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
        zzajuVar.zzb = j4;
        return i5;
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzaju zzajuVar) {
        if ((i3 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            return zzd(bArr, i4, zzajuVar);
        }
        if (i6 == 1) {
            return i4 + 8;
        }
        if (i6 == 2) {
            return zzc(bArr, i4, zzajuVar) + zzajuVar.zza;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                return i4 + 4;
            }
            throw zzall.zzc();
        }
        int i7 = (i3 & (-8)) | 4;
        int i8 = 0;
        while (i4 < i5) {
            i4 = zzc(bArr, i4, zzajuVar);
            i8 = zzajuVar.zza;
            if (i8 == i7) {
                break;
            }
            i4 = zza(i8, bArr, i4, i5, zzajuVar);
        }
        if (i4 > i5 || i8 != i7) {
            throw zzall.zzg();
        }
        return i4;
    }

    static int zzb(zzanb<?> zzanbVar, int i3, byte[] bArr, int i4, int i5, zzalm<?> zzalmVar, zzaju zzajuVar) {
        int iZza = zza(zzanbVar, bArr, i4, i5, zzajuVar);
        while (true) {
            zzalmVar.add(zzajuVar.zzc);
            if (iZza >= i5) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i3 != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i5, zzajuVar);
        }
        return iZza;
    }

    static int zzc(byte[] bArr, int i3, zzaju zzajuVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return zza(b3, bArr, i4, zzajuVar);
        }
        zzajuVar.zza = b3;
        return i4;
    }

    static long zzd(byte[] bArr, int i3) {
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i4, zzajuVar);
        while (true) {
            zzaliVar.zzc(zzajuVar.zza);
            if (iZzc >= i5) {
                break;
            }
            int iZzc2 = zzc(bArr, iZzc, zzajuVar);
            if (i3 != zzajuVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajuVar);
        }
        return iZzc;
    }

    static int zzb(byte[] bArr, int i3, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i3, zzajuVar);
        int i4 = zzajuVar.zza;
        if (i4 < 0) {
            throw zzall.zzf();
        }
        if (i4 == 0) {
            zzajuVar.zzc = "";
            return iZzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, iZzc, i4);
        return iZzc + i4;
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, zzanx zzanxVar, zzaju zzajuVar) {
        if ((i3 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            int iZzd = zzd(bArr, i4, zzajuVar);
            zzanxVar.zza(i3, Long.valueOf(zzajuVar.zzb));
            return iZzd;
        }
        if (i6 == 1) {
            zzanxVar.zza(i3, Long.valueOf(zzd(bArr, i4)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int iZzc = zzc(bArr, i4, zzajuVar);
            int i7 = zzajuVar.zza;
            if (i7 < 0) {
                throw zzall.zzf();
            }
            if (i7 > bArr.length - iZzc) {
                throw zzall.zzj();
            }
            zzanxVar.zza(i3, i7 == 0 ? zzajv.zza : zzajv.zza(bArr, iZzc, i7));
            return iZzc + i7;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw zzall.zzc();
            }
            zzanxVar.zza(i3, Integer.valueOf(zzc(bArr, i4)));
            return i4 + 4;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        int i8 = (i3 & (-8)) | 4;
        int i9 = zzajuVar.zze + 1;
        zzajuVar.zze = i9;
        zza(i9);
        int i10 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int iZzc2 = zzc(bArr, i4, zzajuVar);
            int i11 = zzajuVar.zza;
            i10 = i11;
            if (i11 == i8) {
                i4 = iZzc2;
                break;
            }
            int iZza = zza(i10, bArr, iZzc2, i5, zzanxVarZzd, zzajuVar);
            i10 = i11;
            i4 = iZza;
        }
        zzajuVar.zze--;
        if (i4 > i5 || i10 != i8) {
            throw zzall.zzg();
        }
        zzanxVar.zza(i3, zzanxVarZzd);
        return i4;
    }

    static int zza(int i3, byte[] bArr, int i4, int i5, Object obj, zzamm zzammVar, zzanu<zzanx, zzanx> zzanuVar, zzaju zzajuVar) {
        if (zzajuVar.zzd.zza(zzammVar, i3 >>> 3) == null) {
            return zza(i3, bArr, i4, i5, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx<zzalf.zzc> zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    static int zza(int i3, byte[] bArr, int i4, zzaju zzajuVar) {
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
                zzajuVar.zza = i8 | (b4 << 14);
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
                    zzajuVar.zza = i10 | (b6 << 28);
                    return i11;
                }
                int i12 = i10 | ((b6 & 127) << 28);
                while (true) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        zzajuVar.zza = i12;
                        return i13;
                    }
                    i11 = i13;
                }
            }
        }
        zzajuVar.zza = i6 | i5;
        return i7;
    }

    static int zza(zzanb<?> zzanbVar, int i3, byte[] bArr, int i4, int i5, zzalm<Object> zzalmVar, zzaju zzajuVar) {
        int i6 = (i3 & (-8)) | 4;
        int iZza = zza(zzanbVar, bArr, i4, i5, i6, zzajuVar);
        while (true) {
            zzalmVar.add(zzajuVar.zzc);
            if (iZza >= i5) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i3 != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i5, i6, zzajuVar);
        }
        return iZza;
    }

    private static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i3, int i4, int i5, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i3, i4, i5, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i3, int i4, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i3, i4, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i3, int i4, int i5, zzaju zzajuVar) {
        zzamq zzamqVar = (zzamq) zzanbVar;
        int i6 = zzajuVar.zze + 1;
        zzajuVar.zze = i6;
        zza(i6);
        int iZza = zzamqVar.zza(obj, bArr, i3, i4, i5, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return iZza;
    }

    static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i3, int i4, zzaju zzajuVar) {
        int iZza = i3 + 1;
        int i5 = bArr[i3];
        if (i5 < 0) {
            iZza = zza(i5, bArr, iZza, zzajuVar);
            i5 = zzajuVar.zza;
        }
        int i6 = iZza;
        if (i5 < 0 || i5 > i4 - i6) {
            throw zzall.zzj();
        }
        int i7 = zzajuVar.zze + 1;
        zzajuVar.zze = i7;
        zza(i7);
        int i8 = i5 + i6;
        zzanbVar.zza(obj, bArr, i6, i8, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return i8;
    }

    static int zza(byte[] bArr, int i3, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i3, zzajuVar);
        int i4 = zzajuVar.zza;
        if (i4 < 0) {
            throw zzall.zzf();
        }
        if (i4 > bArr.length - iZzc) {
            throw zzall.zzj();
        }
        if (i4 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return iZzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, iZzc, i4);
        return iZzc + i4;
    }

    static int zza(byte[] bArr, int i3, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i3, zzajuVar);
        int i4 = zzajuVar.zza + iZzc;
        while (iZzc < i4) {
            iZzc = zzc(bArr, iZzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (iZzc == i4) {
            return iZzc;
        }
        throw zzall.zzj();
    }

    private static void zza(int i3) throws zzall {
        if (i3 >= zza) {
            throw zzall.zzh();
        }
    }
}
