package com.google.android.gms.internal.p002firebaseauthapi;

import V0.F;
import V0.I;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i3, int i4, zzamm zzammVar, boolean z2, int[] iArr2, int i5, int i6, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i3;
        this.zzf = i4;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i5;
        this.zzm = i6;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t2, long j3) {
        return ((Double) zzanz.zze(t2, j3)).doubleValue();
    }

    private static <T> float zzb(T t2, long j3) {
        return ((Float) zzanz.zze(t2, j3)).floatValue();
    }

    private final int zzc(int i3) {
        return this.zzc[i3 + 1];
    }

    private static <T> long zzd(T t2, long j3) {
        return ((Long) zzanz.zze(t2, j3)).longValue();
    }

    private final zzanb zze(int i3) {
        int i4 = (i3 / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i4];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = zzamx.zza().zza((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzanbVarZza;
        return zzanbVarZza;
    }

    private final Object zzf(int i3) {
        return this.zzd[(i3 / 3) << 1];
    }

    private static boolean zzg(int i3) {
        return (i3 & 536870912) != 0;
    }

    private final int zza(int i3) {
        if (i3 < this.zze || i3 > this.zzf) {
            return -1;
        }
        return zza(i3, 0);
    }

    private final int zzb(int i3) {
        return this.zzc[i3 + 2];
    }

    private static <T> int zzc(T t2, long j3) {
        return ((Integer) zzanz.zze(t2, j3)).intValue();
    }

    private final zzalj zzd(int i3) {
        return (zzalj) this.zzd[((i3 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zze(java.lang.Object):boolean");
    }

    private final int zza(int i3, int i4) {
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

    static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        zzalfVar.zzb = zzanxVarZzd;
        return zzanxVarZzd;
    }

    private static <T> boolean zze(T t2, long j3) {
        return ((Boolean) zzanz.zze(t2, j3)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4 A[PHI: r3
      0x00f4: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:74:0x0110, B:68:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
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
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzd(java.lang.Object):void");
    }

    private final void zzb(T t2, int i3) {
        int iZzb = zzb(i3);
        long j3 = 1048575 & iZzb;
        if (j3 == 1048575) {
            return;
        }
        zzanz.zza((Object) t2, j3, (1 << (iZzb >>> 20)) | zzanz.zzc(t2, j3));
    }

    private final boolean zzc(T t2, int i3) {
        int iZzb = zzb(i3);
        long j3 = iZzb & 1048575;
        if (j3 != 1048575) {
            return (zzanz.zzc(t2, j3) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i3);
        long j4 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t2, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t2, j4)) != 0;
            case 2:
                return zzanz.zzd(t2, j4) != 0;
            case 3:
                return zzanz.zzd(t2, j4) != 0;
            case 4:
                return zzanz.zzc(t2, j4) != 0;
            case 5:
                return zzanz.zzd(t2, j4) != 0;
            case 6:
                return zzanz.zzc(t2, j4) != 0;
            case 7:
                return zzanz.zzh(t2, j4);
            case 8:
                Object objZze = zzanz.zze(t2, j4);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajv) {
                    return !zzajv.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return zzanz.zze(t2, j4) != null;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !zzajv.zza.equals(zzanz.zze(t2, j4));
            case 11:
                return zzanz.zzc(t2, j4) != 0;
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return zzanz.zzc(t2, j4) != 0;
            case 13:
                return zzanz.zzc(t2, j4) != 0;
            case 14:
                return zzanz.zzd(t2, j4) != 0;
            case 15:
                return zzanz.zzc(t2, j4) != 0;
            case 16:
                return zzanz.zzd(t2, j4) != 0;
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzanz.zze(t2, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f4, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0201, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020e, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0245, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0253, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0356, code lost:
    
        if (zza(r18, r11, r14, r16, r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0366, code lost:
    
        if (zza(r18, r11, r14, r16, r5) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e3, code lost:
    
        if (zza(r18, r11, r14, r16, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (zzc(r18, r13, r11) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzc(r13, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (zzc(r18, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzd(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (zzc(r18, r13, r11) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakn.zza(r13, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzh(r13) + com.google.android.gms.internal.p002firebaseauthapi.zzakn.zzi(r0)) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[PHI: r0
      0x00d2: PHI (r0v190 java.lang.Object) = (r0v43 java.lang.Object), (r0v49 java.lang.Object), (r0v185 java.lang.Object), (r0v194 java.lang.Object) binds: [B:176:0x03d3, B:169:0x03a3, B:60:0x00f8, B:51:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb A[PHI: r0
      0x00fb: PHI (r0v181 java.lang.Object) = (r0v43 java.lang.Object), (r0v185 java.lang.Object) binds: [B:176:0x03d3, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r18) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object):int");
    }

    private final void zzb(T t2, int i3, int i4) {
        zzanz.zza((Object) t2, zzb(i4) & 1048575, i3);
    }

    private final boolean zzc(T t2, int i3, int i4) {
        return zzanz.zzc(t2, (long) (zzb(i4) & 1048575)) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x06f8, code lost:
    
        if (r15.zzb != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06fa, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06fc, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06fe, code lost:
    
        r5.zza(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0701, code lost:
    
        if (r1 >= r13) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0703, code lost:
    
        r2 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzc(r14, r1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0709, code lost:
    
        if (r12 != r15.zza) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x070b, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzajr.zzd(r14, r2, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0713, code lost:
    
        if (r15.zzb == 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a50, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzall.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x06fe, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0920 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0cfc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0c7f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x05ab -> B:186:0x0585). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x063f -> B:218:0x061e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x068c -> B:238:0x0663). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0713 -> B:278:0x06fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.p002firebaseauthapi.zzaju r38) throws com.google.android.gms.internal.p002firebaseauthapi.zzall {
        /*
            Method dump skipped, instruction units count: 3578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private static int zza(byte[] bArr, int i3, int i4, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) {
        int iZzd;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int iZza;
        long jZza;
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                iZzd = zzajr.zzd(bArr, i3, zzajuVar);
                objValueOf = Boolean.valueOf(zzajuVar.zzb != 0);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 2:
                return zzajr.zza(bArr, i3, zzajuVar);
            case 3:
                objValueOf2 = Double.valueOf(zzajr.zza(bArr, i3));
                zzajuVar.zzc = objValueOf2;
                return i3 + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(zzajr.zzc(bArr, i3));
                zzajuVar.zzc = objValueOf3;
                return i3 + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(zzajr.zzd(bArr, i3));
                zzajuVar.zzc = objValueOf2;
                return i3 + 8;
            case 8:
                objValueOf3 = Float.valueOf(zzajr.zzb(bArr, i3));
                zzajuVar.zzc = objValueOf3;
                return i3 + 4;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                iZzd = zzajr.zzc(bArr, i3, zzajuVar);
                iZza = zzajuVar.zza;
                objValueOf = Integer.valueOf(iZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                iZzd = zzajr.zzd(bArr, i3, zzajuVar);
                jZza = zzajuVar.zzb;
                objValueOf = Long.valueOf(jZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i3, i4, zzajuVar);
            case 15:
                iZzd = zzajr.zzc(bArr, i3, zzajuVar);
                iZza = zzakh.zza(zzajuVar.zza);
                objValueOf = Integer.valueOf(iZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case 16:
                iZzd = zzajr.zzd(bArr, i3, zzajuVar);
                jZza = zzakh.zza(zzajuVar.zzb);
                objValueOf = Long.valueOf(jZza);
                zzajuVar.zzc = objValueOf;
                return iZzd;
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return zzajr.zzb(bArr, i3, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t2, T t3, int i3) {
        int i4 = this.zzc[i3];
        if (zzc(t3, i4, i3)) {
            long jZzc = zzc(i3) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i3] + " is present but null: " + String.valueOf(t3));
            }
            zzanb zzanbVarZze = zze(i3);
            if (!zzc(t2, i4, i3)) {
                if (zzg(object)) {
                    Object objZza = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza, object);
                    unsafe.putObject(t2, jZzc, objZza);
                } else {
                    unsafe.putObject(t2, jZzc, object);
                }
                zzb(t2, i4, i3);
                return;
            }
            Object object2 = unsafe.getObject(t2, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzanbVarZze.zza();
                zzanbVarZze.zza(objZza2, object2);
                unsafe.putObject(t2, jZzc, objZza2);
                object2 = objZza2;
            }
            zzanbVarZze.zza(object2, object);
        }
    }

    private final boolean zzc(T t2, T t3, int i3) {
        return zzc((Object) t2, i3) == zzc((Object) t3, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.p002firebaseauthapi.zzamq<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzamk r33, com.google.android.gms.internal.p002firebaseauthapi.zzamu r34, com.google.android.gms.internal.p002firebaseauthapi.zzalw r35, com.google.android.gms.internal.p002firebaseauthapi.zzanu<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzakw<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzamf r38) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzamk, com.google.android.gms.internal.firebase-auth-api.zzamu, com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzanu, com.google.android.gms.internal.firebase-auth-api.zzakw, com.google.android.gms.internal.firebase-auth-api.zzamf):com.google.android.gms.internal.firebase-auth-api.zzamq");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zzb(T t2, T t3) {
        int length = this.zzc.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzc = zzc(i3);
            long j3 = iZzc & 1048575;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (!zzc(t2, t3, i3) || Double.doubleToLongBits(zzanz.zza(t2, j3)) != Double.doubleToLongBits(zzanz.zza(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzc(t2, t3, i3) || Float.floatToIntBits(zzanz.zzb(t2, j3)) != Float.floatToIntBits(zzanz.zzb(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzc(t2, t3, i3) || zzanz.zzd(t2, j3) != zzanz.zzd(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzc(t2, t3, i3) || zzanz.zzd(t2, j3) != zzanz.zzd(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzc(t2, t3, i3) || zzanz.zzd(t2, j3) != zzanz.zzd(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzc(t2, t3, i3) || zzanz.zzh(t2, j3) != zzanz.zzh(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzc(t2, t3, i3) || !zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!zzc(t2, t3, i3) || !zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!zzc(t2, t3, i3) || !zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzc(t2, t3, i3) || zzanz.zzd(t2, j3) != zzanz.zzd(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzc(t2, t3, i3) || zzanz.zzc(t2, j3) != zzanz.zzc(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzc(t2, t3, i3) || zzanz.zzd(t2, j3) != zzanz.zzd(t3, j3)) {
                        return false;
                    }
                    break;
                    break;
                case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!zzc(t2, t3, i3) || !zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
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
                    if (!zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
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
                    long jZzb = zzb(i3) & 1048575;
                    if (zzanz.zzc(t2, jZzb) != zzanz.zzc(t3, jZzb) || !zzand.zza(zzanz.zze(t2, j3), zzanz.zze(t3, j3))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzp.zzd(t2).equals(this.zzp.zzd(t3))) {
            return false;
        }
        if (this.zzh) {
            return this.zzq.zza(t2).equals(this.zzq.zza(t3));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private final <K, V, UT, UB> UB zza(int i3, int i4, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zzamdVarZza = this.zzr.zza(zzf(i3));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzakeVarZzc = zzajv.zzc(zzame.zza(zzamdVarZza, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzakeVarZzc.zzb(), zzamdVarZza, next.getKey(), next.getValue());
                    zzanuVar.zza(ub, i4, zzakeVarZzc.zza());
                    it.remove();
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t2, int i3) {
        zzanb zzanbVarZze = zze(i3);
        long jZzc = zzc(i3) & 1048575;
        if (!zzc((Object) t2, i3)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t2, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t2, int i3, int i4) {
        zzanb zzanbVarZze = zze(i4);
        if (!zzc(t2, i3, i4)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t2, zzc(i4) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    private final <UT, UB> UB zza(Object obj, int i3, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzaljVarZzd;
        int i4 = this.zzc[i3];
        Object objZze = zzanz.zze(obj, zzc(i3) & 1048575);
        return (objZze == null || (zzaljVarZzd = zzd(i3)) == null) ? ub : (UB) zza(i3, i4, this.zzr.zze(objZze), zzaljVarZzd, ub, zzanuVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e3) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e3);
        }
    }

    private static void zza(int i3, Object obj, zzaol zzaolVar) {
        if (obj instanceof String) {
            zzaolVar.zza(i3, (String) obj);
        } else {
            zzaolVar.zza(i3, (zzajv) obj);
        }
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t2, zzaol zzaolVar) {
        zzanuVar.zzb(zzanuVar.zzd(t2), zzaolVar);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i3, Object obj, int i4) {
        if (obj != null) {
            zzaolVar.zza(i3, this.zzr.zza(zzf(i4)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t2, int i3, int i4, Object obj) {
        zzb.putObject(t2, zzc(i4) & 1048575, obj);
        zzb(t2, i3, i4);
    }

    private final void zza(Object obj, int i3, zzanc zzancVar) {
        long j3;
        Object objZzp;
        if (zzg(i3)) {
            j3 = i3 & 1048575;
            objZzp = zzancVar.zzr();
        } else {
            int i4 = i3 & 1048575;
            if (this.zzi) {
                j3 = i4;
                objZzp = zzancVar.zzq();
            } else {
                j3 = i4;
                objZzp = zzancVar.zzp();
            }
        }
        zzanz.zza(obj, j3, objZzp);
    }

    private final void zza(T t2, int i3, Object obj) {
        zzb.putObject(t2, zzc(i3) & 1048575, obj);
        zzb((Object) t2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b4 A[Catch: all -> 0x00cb, TryCatch #3 {all -> 0x00cb, blocks: (B:49:0x00c5, B:54:0x00d3, B:180:0x05af, B:182:0x05b4, B:183:0x05b9, B:65:0x00ff, B:66:0x010c, B:68:0x0114, B:69:0x0121, B:70:0x0125, B:71:0x0133, B:72:0x0141, B:73:0x014f, B:75:0x0159, B:78:0x0160, B:79:0x0165, B:80:0x016f, B:81:0x017d, B:82:0x0187, B:83:0x0196, B:84:0x019a, B:85:0x01a9, B:86:0x01b8, B:87:0x01c7, B:88:0x01d6, B:89:0x01e5, B:90:0x01f4, B:91:0x0203, B:92:0x0212, B:94:0x0222, B:98:0x0243, B:95:0x022c, B:97:0x0234, B:99:0x0254, B:100:0x0266, B:101:0x0274, B:102:0x0282, B:103:0x0290), top: B:208:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e9 A[LOOP:3: B:195:0x05e5->B:197:0x05e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bf A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzanc r19, com.google.android.gms.internal.p002firebaseauthapi.zzaku r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzaol r25) {
        /*
            Method dump skipped, instruction units count: 3186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaol):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t2, T t3, int i3) {
        if (zzc((Object) t3, i3)) {
            long jZzc = zzc(i3) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i3] + " is present but null: " + String.valueOf(t3));
            }
            zzanb zzanbVarZze = zze(i3);
            if (!zzc((Object) t2, i3)) {
                if (zzg(object)) {
                    Object objZza = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza, object);
                    unsafe.putObject(t2, jZzc, objZza);
                } else {
                    unsafe.putObject(t2, jZzc, object);
                }
                zzb((Object) t2, i3);
                return;
            }
            Object object2 = unsafe.getObject(t2, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzanbVarZze.zza();
                zzanbVarZze.zza(objZza2, object2);
                unsafe.putObject(t2, jZzc, objZza2);
                object2 = objZza2;
            }
            zzanbVarZze.zza(object2, object);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t2, byte[] bArr, int i3, int i4, zzaju zzajuVar) throws zzall {
        zza(t2, bArr, i3, i4, 0, zzajuVar);
    }

    private final boolean zza(T t2, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? zzc((Object) t2, i3) : (i5 & i6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i3, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i3 & 1048575));
    }
}
