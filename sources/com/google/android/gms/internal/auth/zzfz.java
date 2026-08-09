package com.google.android.gms.internal.auth;

import V0.F;
import V0.I;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i3, int i4, zzfw zzfwVar, boolean z2, boolean z3, int[] iArr2, int i5, int i6, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i3;
        this.zzf = i4;
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i5;
        this.zzk = i6;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzB(Object obj, Object obj2, int i3) {
        long jZzv = zzv(i3) & 1048575;
        if (zzG(obj2, i3)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, jZzv, objZzf2);
            zzD(obj, i3);
        }
    }

    private final void zzC(Object obj, Object obj2, int i3) {
        int iZzv = zzv(i3);
        int i4 = this.zzc[i3];
        long j3 = iZzv & 1048575;
        if (zzJ(obj2, i4, i3)) {
            Object objZzf = zzJ(obj, i4, i3) ? zzhi.zzf(obj, j3) : null;
            Object objZzf2 = zzhi.zzf(obj2, j3);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, j3, objZzf2);
            zzE(obj, i4, i3);
        }
    }

    private final void zzD(Object obj, int i3) {
        int iZzs = zzs(i3);
        long j3 = 1048575 & iZzs;
        if (j3 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j3, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j3));
    }

    private final void zzE(Object obj, int i3, int i4) {
        zzhi.zzn(obj, zzs(i4) & 1048575, i3);
    }

    private final boolean zzF(Object obj, Object obj2, int i3) {
        return zzG(obj, i3) == zzG(obj2, i3);
    }

    private final boolean zzG(Object obj, int i3) {
        int iZzs = zzs(i3);
        long j3 = iZzs & 1048575;
        if (j3 != 1048575) {
            return (zzhi.zzc(obj, j3) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i3);
        long j4 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j4)) != 0;
            case 2:
                return zzhi.zzd(obj, j4) != 0;
            case 3:
                return zzhi.zzd(obj, j4) != 0;
            case 4:
                return zzhi.zzc(obj, j4) != 0;
            case 5:
                return zzhi.zzd(obj, j4) != 0;
            case 6:
                return zzhi.zzc(obj, j4) != 0;
            case 7:
                return zzhi.zzt(obj, j4);
            case 8:
                Object objZzf = zzhi.zzf(obj, j4);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzhi.zzf(obj, j4) != null;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzee.zzb.equals(zzhi.zzf(obj, j4));
            case 11:
                return zzhi.zzc(obj, j4) != 0;
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzhi.zzc(obj, j4) != 0;
            case 13:
                return zzhi.zzc(obj, j4) != 0;
            case 14:
                return zzhi.zzd(obj, j4) != 0;
            case 15:
                return zzhi.zzc(obj, j4) != 0;
            case 16:
                return zzhi.zzd(obj, j4) != 0;
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzhi.zzf(obj, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? zzG(obj, i3) : (i5 & i6) != 0;
    }

    private static boolean zzI(Object obj, int i3, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i3 & 1048575));
    }

    private final boolean zzJ(Object obj, int i3, int i4) {
        return zzhi.zzc(obj, (long) (zzs(i4) & 1048575)) == i3;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j3) {
        return ((Integer) zzhi.zzf(obj, j3)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i3, int i4, int i5, long j3, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i5);
        Object object = unsafe.getObject(obj, j3);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j3, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, zzds zzdsVar) throws zzfa {
        int iZzm;
        long jZzc;
        int iZzb;
        Object objValueOf;
        int iZzj;
        Object objZzg;
        Unsafe unsafe = zzb;
        long j4 = this.zzc[i10 + 2] & 1048575;
        switch (i9) {
            case 51:
                if (i7 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i3))));
                unsafe.putInt(obj, j4, i6);
                return i3 + 8;
            case 52:
                if (i7 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i3))));
                unsafe.putInt(obj, j4, i6);
                return i3 + 4;
            case 53:
            case 54:
                if (i7 != 0) {
                    return i3;
                }
                iZzm = zzdt.zzm(bArr, i3, zzdsVar);
                jZzc = zzdsVar.zzb;
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 55:
            case 62:
                if (i7 != 0) {
                    return i3;
                }
                iZzm = zzdt.zzj(bArr, i3, zzdsVar);
                iZzb = zzdsVar.zza;
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 56:
            case 65:
                if (i7 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Long.valueOf(zzdt.zzn(bArr, i3)));
                unsafe.putInt(obj, j4, i6);
                return i3 + 8;
            case 57:
            case 64:
                if (i7 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(zzdt.zzb(bArr, i3)));
                unsafe.putInt(obj, j4, i6);
                return i3 + 4;
            case 58:
                if (i7 != 0) {
                    return i3;
                }
                iZzm = zzdt.zzm(bArr, i3, zzdsVar);
                objValueOf = Boolean.valueOf(zzdsVar.zzb != 0);
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 59:
                if (i7 != 2) {
                    return i3;
                }
                iZzj = zzdt.zzj(bArr, i3, zzdsVar);
                int i11 = zzdsVar.zza;
                if (i11 == 0) {
                    objZzg = "";
                    unsafe.putObject(obj, j3, objZzg);
                    unsafe.putInt(obj, j4, i6);
                    return iZzj;
                }
                if ((i8 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj, iZzj + i11)) {
                    throw zzfa.zzb();
                }
                unsafe.putObject(obj, j3, new String(bArr, iZzj, i11, zzez.zzb));
                iZzj += i11;
                unsafe.putInt(obj, j4, i6);
                return iZzj;
            case 60:
                if (i7 != 2) {
                    return i3;
                }
                iZzj = zzdt.zzd(zzy(i10), bArr, i3, i4, zzdsVar);
                Object object = unsafe.getInt(obj, j4) == i6 ? unsafe.getObject(obj, j3) : null;
                objZzg = zzdsVar.zzc;
                if (object != null) {
                    objZzg = zzez.zzg(object, objZzg);
                }
                unsafe.putObject(obj, j3, objZzg);
                unsafe.putInt(obj, j4, i6);
                return iZzj;
            case 61:
                if (i7 != 2) {
                    return i3;
                }
                iZzm = zzdt.zza(bArr, i3, zzdsVar);
                objValueOf = zzdsVar.zzc;
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 63:
                if (i7 != 0) {
                    return i3;
                }
                int iZzj2 = zzdt.zzj(bArr, i3, zzdsVar);
                int i12 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i10);
                if (zzexVarZzx == null || zzexVarZzx.zza()) {
                    unsafe.putObject(obj, j3, Integer.valueOf(i12));
                    unsafe.putInt(obj, j4, i6);
                } else {
                    zzc(obj).zzf(i5, Long.valueOf(i12));
                }
                return iZzj2;
            case 66:
                if (i7 != 0) {
                    return i3;
                }
                iZzm = zzdt.zzj(bArr, i3, zzdsVar);
                iZzb = zzei.zzb(zzdsVar.zza);
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 67:
                if (i7 != 0) {
                    return i3;
                }
                iZzm = zzdt.zzm(bArr, i3, zzdsVar);
                jZzc = zzei.zzc(zzdsVar.zzb);
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j3, objValueOf);
                unsafe.putInt(obj, j4, i6);
                return iZzm;
            case 68:
                if (i7 != 3) {
                    return i3;
                }
                iZzj = zzdt.zzc(zzy(i10), bArr, i3, i4, (i5 & (-8)) | 4, zzdsVar);
                Object object2 = unsafe.getInt(obj, j4) == i6 ? unsafe.getObject(obj, j3) : null;
                objZzg = zzdsVar.zzc;
                if (object2 != null) {
                    objZzg = zzez.zzg(object2, objZzg);
                }
                unsafe.putObject(obj, j3, objZzg);
                unsafe.putInt(obj, j4, i6);
                return iZzj;
            default:
                return i3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i3, int i4, zzds zzdsVar) throws zzfa {
        int i5;
        int iZzk;
        int i6;
        int i7;
        int i8;
        Unsafe unsafe;
        int i9;
        int i10;
        int i11;
        int i12;
        int iZzm;
        Unsafe unsafe2;
        Object obj2;
        long jZzc;
        long j3;
        long j4;
        int iZzd;
        Object objZzg;
        long j5;
        int iZzb;
        int i13;
        int i14;
        int i15;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i16 = i4;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe3 = zzb;
        int i17 = 1048575;
        int i18 = -1;
        int iZzi = i3;
        int i19 = -1;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (iZzi < i16) {
            int i23 = iZzi + 1;
            byte b3 = bArr2[iZzi];
            if (b3 < 0) {
                iZzk = zzdt.zzk(b3, bArr2, i23, zzdsVar2);
                i5 = zzdsVar2.zza;
            } else {
                i5 = b3;
                iZzk = i23;
            }
            int i24 = i5 >>> 3;
            int i25 = i5 & 7;
            int iZzr = i24 > i19 ? zzfzVar.zzr(i24, i21 / 3) : zzfzVar.zzq(i24);
            if (iZzr == i18) {
                i6 = iZzk;
                i7 = i24;
                i8 = i18;
                unsafe = unsafe3;
                i9 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i26 = iArr[iZzr + 1];
                int iZzu = zzu(i26);
                long j6 = i26 & i17;
                if (iZzu <= 17) {
                    int i27 = iArr[iZzr + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i20) {
                        if (i20 != 1048575) {
                            unsafe3.putInt(obj3, i20, i22);
                        }
                        if (i29 != 1048575) {
                            i22 = unsafe3.getInt(obj3, i29);
                        }
                        i20 = i29;
                    }
                    switch (iZzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 1) {
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                zzhi.zzl(obj3, j6, Double.longBitsToDouble(zzdt.zzn(bArr2, i11)));
                                iZzi = i11 + 8;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 5) {
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                zzhi.zzm(obj3, j6, Float.intBitsToFloat(zzdt.zzb(bArr2, i11)));
                                iZzi = i11 + 4;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i11, zzdsVar2);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                jZzc = zzdsVar2.zzb;
                                j3 = j6;
                                unsafe2.putLong(obj2, j3, jZzc);
                                i22 |= i28;
                                iZzi = iZzm;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i11 = iZzk;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzi = zzdt.zzj(bArr2, i11, zzdsVar2);
                                unsafe3.putInt(obj3, j6, zzdsVar2.zza);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 1) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                i11 = iZzk;
                                unsafe3.putLong(obj, j6, zzdt.zzn(bArr2, iZzk));
                                iZzi = i11 + 8;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 5) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                unsafe3.putInt(obj3, j6, zzdt.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzi = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                zzhi.zzk(obj3, j6, zzdsVar2.zzb != 0);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzi = (536870912 & i26) == 0 ? zzdt.zzg(bArr2, iZzk, zzdsVar2) : zzdt.zzh(bArr2, iZzk, zzdsVar2);
                                unsafe3.putObject(obj3, j6, zzdsVar2.zzc);
                                i22 |= i28;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            j4 = j6;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzd = zzdt.zzd(zzfzVar.zzy(i10), bArr2, iZzk, i16, zzdsVar2);
                                Object object = unsafe3.getObject(obj3, j4);
                                objZzg = object == null ? zzdsVar2.zzc : zzez.zzg(object, zzdsVar2.zzc);
                                unsafe3.putObject(obj3, j4, objZzg);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            j4 = j6;
                            i7 = i24;
                            if (i25 != 2) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzd = zzdt.zza(bArr2, iZzk, zzdsVar2);
                                objZzg = zzdsVar2.zzc;
                                unsafe3.putObject(obj3, j4, objZzg);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            j5 = j6;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                iZzb = zzdsVar2.zza;
                                unsafe3.putInt(obj3, j5, iZzb);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i10 = iZzr;
                            i12 = 1048575;
                            j5 = j6;
                            i7 = i24;
                            if (i25 != 0) {
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar2);
                                iZzb = zzei.zzb(zzdsVar2.zza);
                                unsafe3.putInt(obj3, j5, iZzb);
                                i22 |= i28;
                                iZzi = iZzd;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        case 16:
                            if (i25 != 0) {
                                i7 = i24;
                                i10 = iZzr;
                                i11 = iZzk;
                                i6 = i11;
                                unsafe = unsafe3;
                                i9 = i10;
                                i8 = -1;
                            } else {
                                zzdsVar2 = zzdsVar;
                                iZzm = zzdt.zzm(bArr2, iZzk, zzdsVar2);
                                jZzc = zzei.zzc(zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj;
                                i10 = iZzr;
                                j3 = j6;
                                i7 = i24;
                                i12 = 1048575;
                                unsafe2.putLong(obj2, j3, jZzc);
                                i22 |= i28;
                                iZzi = iZzm;
                                i21 = i10;
                                i19 = i7;
                                i17 = i12;
                                i18 = -1;
                            }
                            break;
                        default:
                            i7 = i24;
                            i10 = iZzr;
                            i11 = iZzk;
                            i6 = i11;
                            unsafe = unsafe3;
                            i9 = i10;
                            i8 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i10 = iZzr;
                    int i30 = iZzk;
                    i12 = 1048575;
                    i7 = i24;
                    if (iZzu == 27) {
                        if (i25 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe3.getObject(obj3, j6);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe3.putObject(obj3, j6, zzeyVarZzd);
                            }
                            iZzi = zzdt.zze(zzfzVar.zzy(i10), i5, bArr, i30, i4, zzeyVarZzd, zzdsVar);
                            i22 = i22;
                            i21 = i10;
                            i19 = i7;
                            i17 = i12;
                            i18 = -1;
                        } else {
                            i13 = i30;
                            i14 = i22;
                            i15 = i20;
                            unsafe = unsafe3;
                            i9 = i10;
                            i8 = -1;
                        }
                    } else if (iZzu <= 49) {
                        i14 = i22;
                        i15 = i20;
                        i8 = -1;
                        unsafe = unsafe3;
                        i9 = i10;
                        iZzi = zzp(obj, bArr, i30, i4, i5, i7, i25, i10, i26, iZzu, j6, zzdsVar);
                        if (iZzi != i30) {
                            obj3 = obj;
                            bArr2 = bArr;
                            i16 = i4;
                            zzdsVar2 = zzdsVar;
                            i20 = i15;
                            i18 = i8;
                            i19 = i7;
                            i22 = i14;
                            i21 = i9;
                            unsafe3 = unsafe;
                            i17 = 1048575;
                            zzfzVar = this;
                        } else {
                            i6 = iZzi;
                            i20 = i15;
                            i22 = i14;
                        }
                    } else {
                        i13 = i30;
                        i14 = i22;
                        i15 = i20;
                        unsafe = unsafe3;
                        i9 = i10;
                        i8 = -1;
                        if (iZzu != 50) {
                            iZzi = zzn(obj, bArr, i13, i4, i5, i7, i25, i26, iZzu, j6, i9, zzdsVar);
                            if (iZzi != i13) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i16 = i4;
                                zzdsVar2 = zzdsVar;
                                i20 = i15;
                                i18 = i8;
                                i19 = i7;
                                i22 = i14;
                                i21 = i9;
                                unsafe3 = unsafe;
                                i17 = 1048575;
                                zzfzVar = this;
                            } else {
                                i6 = iZzi;
                                i20 = i15;
                                i22 = i14;
                            }
                        } else if (i25 == 2) {
                            iZzi = zzm(obj, bArr, i13, i4, i9, j6, zzdsVar);
                            if (iZzi != i13) {
                                obj3 = obj;
                                bArr2 = bArr;
                                i16 = i4;
                                zzdsVar2 = zzdsVar;
                                i20 = i15;
                                i18 = i8;
                                i19 = i7;
                                i22 = i14;
                                i21 = i9;
                                unsafe3 = unsafe;
                                i17 = 1048575;
                                zzfzVar = this;
                            } else {
                                i6 = iZzi;
                                i20 = i15;
                                i22 = i14;
                            }
                        }
                    }
                    i6 = i13;
                    i20 = i15;
                    i22 = i14;
                }
            }
            iZzi = zzdt.zzi(i5, bArr, i6, i4, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj3 = obj;
            bArr2 = bArr;
            i16 = i4;
            zzdsVar2 = zzdsVar;
            i18 = i8;
            i19 = i7;
            i21 = i9;
            unsafe3 = unsafe;
            i17 = 1048575;
        }
        int i31 = i22;
        int i32 = i20;
        Unsafe unsafe4 = unsafe3;
        if (i32 != i17) {
            unsafe4.putInt(obj, i32, i31);
        }
        if (iZzi == i4) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0273, code lost:
    
        if (r29.zzb != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0275, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0277, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0278, code lost:
    
        r12.zze(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x027b, code lost:
    
        if (r4 >= r19) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x027d, code lost:
    
        r6 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0283, code lost:
    
        if (r20 == r29.zza) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0286, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzm(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028e, code lost:
    
        if (r29.zzb == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0291, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x014e, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0278, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        if (r4 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzee.zzk(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r1 >= r19) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        r4 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        if (r20 == r29.zza) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        r1 = com.google.android.gms.internal.auth.zzdt.zzj(r17, r4, r29);
        r4 = r29.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        if (r4 < 0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0163, code lost:
    
        if (r4 > (r17.length - r1)) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0165, code lost:
    
        if (r4 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
    
        throw com.google.android.gms.internal.auth.zzfa.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01d0 -> B:100:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0218 -> B:118:0x01ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x028e -> B:157:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0165 -> B:69:0x0140). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i3) {
        if (i3 < this.zze || i3 > this.zzf) {
            return -1;
        }
        return zzt(i3, 0);
    }

    private final int zzr(int i3, int i4) {
        if (i3 < this.zze || i3 > this.zzf) {
            return -1;
        }
        return zzt(i3, i4);
    }

    private final int zzs(int i3) {
        return this.zzc[i3 + 2];
    }

    private final int zzt(int i3, int i4) {
        int length = (this.zzc.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = this.zzc[i6];
            if (i3 == i7) {
                return i6;
            }
            if (i3 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i3) {
        return (i3 >>> 20) & 255;
    }

    private final int zzv(int i3) {
        return this.zzc[i3 + 1];
    }

    private static long zzw(Object obj, long j3) {
        return ((Long) zzhi.zzf(obj, j3)).longValue();
    }

    private final zzex zzx(int i3) {
        int i4 = i3 / 3;
        return (zzex) this.zzd[i4 + i4 + 1];
    }

    private final zzgh zzy(int i3) {
        int i4 = i3 / 3;
        int i5 = i4 + i4;
        zzgh zzghVar = (zzgh) this.zzd[i5];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i5 + 1]);
        this.zzd[i5] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i3) {
        int i4 = i3 / 3;
        return this.zzd[i4 + i4];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[PHI: r3
      0x00ff: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:73:0x011b, B:67:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ae, code lost:
    
        if (r0 != r19) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03b0, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ca, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03f0, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0413, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.auth.zzds r37) throws com.google.android.gms.internal.auth.zzfa {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i3;
        int i4 = this.zzj;
        while (true) {
            i3 = this.zzk;
            if (i4 >= i3) {
                break;
            }
            long jZzv = zzv(this.zzi[i4]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i4++;
        }
        int length = this.zzi.length;
        while (i3 < length) {
            this.zzl.zza(obj, this.zzi[i3]);
            i3++;
        }
        this.zzm.zze(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzf(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i3, int i4, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i3, i4, zzdsVar);
        } else {
            zzb(obj, bArr, i3, i4, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzv = zzv(i3);
            long j3 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i3) || Double.doubleToLongBits(zzhi.zza(obj, j3)) != Double.doubleToLongBits(zzhi.zza(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i3) || Float.floatToIntBits(zzhi.zzb(obj, j3)) != Float.floatToIntBits(zzhi.zzb(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i3) || zzhi.zzd(obj, j3) != zzhi.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i3) || zzhi.zzd(obj, j3) != zzhi.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i3) || zzhi.zzd(obj, j3) != zzhi.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i3) || zzhi.zzt(obj, j3) != zzhi.zzt(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i3) || !zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!zzF(obj, obj2, i3) || !zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!zzF(obj, obj2, i3) || !zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i3) || zzhi.zzd(obj, j3) != zzhi.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i3) || zzhi.zzc(obj, j3) != zzhi.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i3) || zzhi.zzd(obj, j3) != zzhi.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzF(obj, obj2, i3) || !zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
                case I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
                case I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
                case I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i3) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j3), zzhi.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
