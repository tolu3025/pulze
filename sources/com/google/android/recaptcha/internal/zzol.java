package com.google.android.recaptcha.internal;

import V0.F;
import V0.I;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i3, int i4, zzoi zzoiVar, boolean z2, int[] iArr2, int i5, int i6, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i3;
        this.zzf = i4;
        this.zzi = zzoiVar instanceof zznd;
        boolean z3 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i5;
        this.zzl = i6;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i3) {
        zzow zzowVarZzx = zzx(i3);
        int iZzu = zzu(i3) & 1048575;
        if (!zzN(obj, i3)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i3, int i4) {
        zzow zzowVarZzx = zzx(i4);
        if (!zzR(obj, i3, i4)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i4) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i3) {
        if (zzN(obj2, i3)) {
            int iZzu = zzu(i3) & 1048575;
            Unsafe unsafe = zzb;
            long j3 = iZzu;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i3] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i3);
            if (!zzN(obj, i3)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j3, objZze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                zzH(obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j3, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i3) {
        int i4 = this.zzc[i3];
        if (zzR(obj2, i4, i3)) {
            int iZzu = zzu(i3) & 1048575;
            Unsafe unsafe = zzb;
            long j3 = iZzu;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i3] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i3);
            if (!zzR(obj, i4, i3)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j3, objZze);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                zzI(obj, i4, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j3, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i3, zzov zzovVar) {
        zzps.zzs(obj, i3 & 1048575, zzM(i3) ? zzovVar.zzs() : this.zzi ? zzovVar.zzr() : zzovVar.zzp());
    }

    private final void zzH(Object obj, int i3) {
        int iZzr = zzr(i3);
        long j3 = 1048575 & iZzr;
        if (j3 == 1048575) {
            return;
        }
        zzps.zzq(obj, j3, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j3));
    }

    private final void zzI(Object obj, int i3, int i4) {
        zzps.zzq(obj, zzr(i4) & 1048575, i3);
    }

    private final void zzJ(Object obj, int i3, Object obj2) {
        zzb.putObject(obj, zzu(i3) & 1048575, obj2);
        zzH(obj, i3);
    }

    private final void zzK(Object obj, int i3, int i4, Object obj2) {
        zzb.putObject(obj, zzu(i4) & 1048575, obj2);
        zzI(obj, i3, i4);
    }

    private final boolean zzL(Object obj, Object obj2, int i3) {
        return zzN(obj, i3) == zzN(obj2, i3);
    }

    private static boolean zzM(int i3) {
        return (i3 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i3) {
        int iZzr = zzr(i3);
        long j3 = iZzr & 1048575;
        if (j3 != 1048575) {
            return (zzps.zzc(obj, j3) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i3);
        long j4 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j4)) != 0;
            case 2:
                return zzps.zzd(obj, j4) != 0;
            case 3:
                return zzps.zzd(obj, j4) != 0;
            case 4:
                return zzps.zzc(obj, j4) != 0;
            case 5:
                return zzps.zzd(obj, j4) != 0;
            case 6:
                return zzps.zzc(obj, j4) != 0;
            case 7:
                return zzps.zzw(obj, j4);
            case 8:
                Object objZzf = zzps.zzf(obj, j4);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzps.zzf(obj, j4) != null;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzle.zzb.equals(zzps.zzf(obj, j4));
            case 11:
                return zzps.zzc(obj, j4) != 0;
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzps.zzc(obj, j4) != 0;
            case 13:
                return zzps.zzc(obj, j4) != 0;
            case 14:
                return zzps.zzd(obj, j4) != 0;
            case 15:
                return zzps.zzc(obj, j4) != 0;
            case 16:
                return zzps.zzd(obj, j4) != 0;
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzps.zzf(obj, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? zzN(obj, i3) : (i5 & i6) != 0;
    }

    private static boolean zzP(Object obj, int i3, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i3 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i3, int i4) {
        return zzps.zzc(obj, (long) (zzr(i4) & 1048575)) == i3;
    }

    private static boolean zzS(Object obj, long j3) {
        return ((Boolean) zzps.zzf(obj, j3)).booleanValue();
    }

    private static final void zzT(int i3, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i3, (String) obj);
        } else {
            zzpyVar.zzd(i3, (zzle) obj);
        }
    }

    static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r34, com.google.android.recaptcha.internal.zzof r35, com.google.android.recaptcha.internal.zzoo r36, com.google.android.recaptcha.internal.zznv r37, com.google.android.recaptcha.internal.zzpl r38, com.google.android.recaptcha.internal.zzmp r39, com.google.android.recaptcha.internal.zzod r40) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j3) {
        return ((Double) zzps.zzf(obj, j3)).doubleValue();
    }

    private static float zzo(Object obj, long j3) {
        return ((Float) zzps.zzf(obj, j3)).floatValue();
    }

    private static int zzp(Object obj, long j3) {
        return ((Integer) zzps.zzf(obj, j3)).intValue();
    }

    private final int zzq(int i3) {
        if (i3 < this.zze || i3 > this.zzf) {
            return -1;
        }
        return zzs(i3, 0);
    }

    private final int zzr(int i3) {
        return this.zzc[i3 + 2];
    }

    private final int zzs(int i3, int i4) {
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

    private static int zzt(int i3) {
        return (i3 >>> 20) & 255;
    }

    private final int zzu(int i3) {
        return this.zzc[i3 + 1];
    }

    private static long zzv(Object obj, long j3) {
        return ((Long) zzps.zzf(obj, j3)).longValue();
    }

    private final zznh zzw(int i3) {
        int i4 = i3 / 3;
        return (zznh) this.zzd[i4 + i4 + 1];
    }

    private final zzow zzx(int i3) {
        Object[] objArr = this.zzd;
        int i4 = i3 / 3;
        int i5 = i4 + i4;
        zzow zzowVar = (zzow) objArr[i5];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i5 + 1]);
        this.zzd[i5] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i3, Object obj2, zzpl zzplVar, Object obj3) {
        int i4 = this.zzc[i3];
        Object objZzf = zzps.zzf(obj, zzu(i3) & 1048575);
        if (objZzf == null || zzw(i3) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i3) {
        int i4 = i3 / 3;
        return this.zzd[i4 + i4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0535, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzle) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0128, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzle) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzln.zzA(r0);
        r1 = com.google.android.recaptcha.internal.zzln.zzz((java.lang.String) r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039f  */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v207, types: [int] */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v222 */
    /* JADX WARN: Type inference failed for: r0v223 */
    /* JADX WARN: Type inference failed for: r0v224 */
    /* JADX WARN: Type inference failed for: r0v225 */
    /* JADX WARN: Type inference failed for: r0v226 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v55, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v69, types: [int] */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [int] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3 A[PHI: r1 r2
      0x00f3: PHI (r1v14 int) = (r1v9 int), (r1v15 int) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r2v10 java.lang.Object) = (r2v7 java.lang.Object), (r2v11 java.lang.Object) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x051d, code lost:
    
        if (r2 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x051f, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0525, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzk(r35, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x052d, code lost:
    
        if (r1 >= r7) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x052f, code lost:
    
        r2 = com.google.android.recaptcha.internal.zzku.zzi(r35, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0535, code lost:
    
        if (r22 != r14.zza) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0537, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzku.zzi(r35, r2, r14);
        r2 = r14.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x053d, code lost:
    
        if (r2 < 0) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0541, code lost:
    
        if (r2 > (r35.length - r1)) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0543, code lost:
    
        if (r2 != 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x054b, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0553, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x069d, code lost:
    
        if (r14.zzb != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x069f, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06a1, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06a3, code lost:
    
        r13.zze(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06a6, code lost:
    
        if (r0 >= r7) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06a8, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzku.zzi(r35, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06ae, code lost:
    
        if (r11 != r14.zza) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06b0, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzku.zzl(r35, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06b8, code lost:
    
        if (r14.zzb == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0caf, code lost:
    
        if (r14 == r8) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0cb1, code lost:
    
        r31.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0cb7, code lost:
    
        r8 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0cbc, code lost:
    
        if (r8 >= r6.zzl) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0cbe, code lost:
    
        zzy(r34, r6.zzj[r8], null, r6.zzm, r34);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0cd5, code lost:
    
        if (r9 != 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0cd7, code lost:
    
        if (r10 != r37) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0cdf, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0ce0, code lost:
    
        if (r10 > r37) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0ce2, code lost:
    
        if (r11 != r9) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0ce4, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0cea, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x052d, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzk(r35, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x06a3, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08d7 A[PHI: r7 r8 r9 r10 r11 r12
      0x08d7: PHI (r7v26 int) = (r7v6 int), (r7v7 int), (r7v9 int), (r7v13 int), (r7v15 int), (r7v27 int) binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x08d7: PHI (r8v81 int) = (r8v52 int), (r8v53 int), (r8v55 int), (r8v65 int), (r8v67 int), (r8v82 int) binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x08d7: PHI (r9v60 int) = (r9v35 int), (r9v36 int), (r9v38 int), (r9v40 int), (r9v49 int), (r9v61 int) binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x08d7: PHI (r10v60 boolean) = (r10v45 boolean), (r10v46 boolean), (r10v48 boolean), (r10v50 boolean), (r10v51 boolean), (r10v61 boolean) binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x08d7: PHI (r11v68 int) = (r11v46 int), (r11v47 int), (r11v49 int), (r11v53 int), (r11v55 int), (r11v69 int) binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x08d7: PHI (r12v53 sun.misc.Unsafe) = 
      (r12v37 sun.misc.Unsafe)
      (r12v38 sun.misc.Unsafe)
      (r12v40 sun.misc.Unsafe)
      (r12v44 sun.misc.Unsafe)
      (r12v46 sun.misc.Unsafe)
      (r12v54 sun.misc.Unsafe)
     binds: [B:387:0x08ac, B:368:0x083c, B:347:0x07d9, B:292:0x06bb, B:266:0x0658, B:143:0x043f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x08da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x08ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0b8b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:199:0x0543 -> B:190:0x051f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x05ca -> B:220:0x05a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x061d -> B:240:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x06b8 -> B:283:0x069f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instruction units count: 3492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzg(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:3:0x000b, B:12:0x0030, B:18:0x0040, B:19:0x0048, B:21:0x0050, B:22:0x0054, B:57:0x012c, B:65:0x0157, B:62:0x013d, B:64:0x0145, B:24:0x005a, B:25:0x005e, B:26:0x0064, B:27:0x0068, B:28:0x006e, B:29:0x0073, B:30:0x0078, B:31:0x007f, B:32:0x0080, B:33:0x0085, B:34:0x008b, B:36:0x0095, B:38:0x00aa, B:39:0x00b7, B:40:0x00bc, B:41:0x00bd, B:43:0x00c7, B:45:0x00dc, B:46:0x00e9, B:47:0x00ee, B:48:0x00ef, B:49:0x00f4, B:50:0x00fd, B:51:0x0103, B:52:0x0109, B:53:0x010f, B:54:0x0115, B:55:0x011b, B:56:0x0124, B:66:0x015e, B:67:0x0161, B:69:0x0164, B:70:0x0169, B:15:0x0036, B:78:0x0187, B:79:0x018b, B:80:0x0192, B:82:0x0197, B:83:0x019c, B:89:0x01b7, B:90:0x01c4, B:91:0x01c9, B:92:0x01d6, B:93:0x01db, B:94:0x01e9, B:95:0x01f7, B:96:0x0205, B:98:0x020f, B:101:0x0216, B:102:0x021c, B:103:0x0226, B:104:0x0234, B:105:0x023e, B:106:0x024d, B:107:0x0251, B:108:0x0260, B:109:0x026f, B:110:0x027e, B:111:0x028d, B:112:0x029c, B:113:0x02ab, B:114:0x02ba, B:115:0x02c9, B:117:0x02d9, B:119:0x02df, B:121:0x02fa, B:122:0x02fe, B:120:0x02ef, B:123:0x02ff, B:124:0x030f, B:125:0x0316, B:126:0x031b, B:127:0x0322, B:128:0x0327, B:129:0x032e, B:130:0x0333, B:131:0x033a, B:132:0x033f, B:133:0x034c, B:134:0x0355, B:135:0x035c, B:136:0x0361, B:137:0x0368, B:138:0x036d, B:139:0x0374, B:140:0x0379, B:141:0x0380, B:142:0x0385, B:143:0x038c, B:144:0x0391, B:145:0x0398, B:146:0x039d, B:147:0x03a4, B:148:0x03a9, B:149:0x03b0, B:150:0x03b5, B:151:0x03bc, B:152:0x03c1, B:153:0x03ca, B:154:0x03d3, B:155:0x03dc, B:156:0x03e5, B:157:0x03f4, B:158:0x03fd, B:159:0x0409, B:160:0x0419, B:162:0x041f, B:163:0x042f, B:164:0x043e, B:165:0x0447, B:166:0x0450, B:167:0x0459, B:168:0x0462, B:169:0x046b, B:170:0x0474, B:171:0x047d, B:172:0x0486, B:173:0x0493, B:174:0x0498, B:175:0x04a2, B:176:0x04a7, B:177:0x04b2, B:178:0x04bd, B:179:0x04c8, B:181:0x04d2, B:183:0x04d8, B:184:0x04df, B:185:0x04ea, B:186:0x04f5, B:187:0x0503, B:188:0x0507, B:189:0x0512, B:190:0x051d, B:191:0x0529, B:192:0x0535, B:193:0x0541, B:194:0x054d, B:195:0x0559, B:198:0x0567, B:199:0x056c), top: B:215:0x000b, inners: #1 }] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r12, com.google.android.recaptcha.internal.zzov r13, com.google.android.recaptcha.internal.zzmo r14) {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzov, com.google.android.recaptcha.internal.zzmo):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i3, int i4, zzkt zzktVar) {
        zzc(obj, bArr, i3, i4, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzpy r25) {
        /*
            Method dump skipped, instruction units count: 1908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzu = zzu(i3);
            long j3 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i3) || Double.doubleToLongBits(zzps.zza(obj, j3)) != Double.doubleToLongBits(zzps.zza(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i3) || Float.floatToIntBits(zzps.zzb(obj, j3)) != Float.floatToIntBits(zzps.zzb(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i3) || zzps.zzd(obj, j3) != zzps.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i3) || zzps.zzd(obj, j3) != zzps.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i3) || zzps.zzd(obj, j3) != zzps.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i3) || zzps.zzw(obj, j3) != zzps.zzw(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i3) || !zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!zzL(obj, obj2, i3) || !zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!zzL(obj, obj2, i3) || !zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i3) || zzps.zzd(obj, j3) != zzps.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i3) || zzps.zzc(obj, j3) != zzps.zzc(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i3) || zzps.zzd(obj, j3) != zzps.zzd(obj2, j3)) {
                        return false;
                    }
                    break;
                    break;
                case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzL(obj, obj2, i3) || !zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
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
                    if (!zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
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
                    long jZzr = zzr(i3) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j3), zzps.zzf(obj2, j3))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzl(java.lang.Object):boolean");
    }
}
