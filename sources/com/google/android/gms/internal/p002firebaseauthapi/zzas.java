package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i3) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzas.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    static <K, V> zzas<K, V> zza(int i3, Object[] objArr, zzao<K, V> zzaoVar) {
        int iHighestOneBit;
        short[] sArr;
        char c3;
        char c4;
        ?? r7;
        Object[] objArr2;
        int i4 = i3;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzas) zza;
        }
        zzan zzanVar = null;
        ?? r72 = 0;
        zzan zzanVar2 = null;
        if (i4 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzae.zza(obj, obj2);
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i4, objArrCopyOf.length >> 1);
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit <<= 1;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i4 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            c3 = 0;
            c4 = 2;
        } else {
            int i5 = iHighestOneBit - 1;
            byte b3 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = i7 * 2;
                    int i9 = i6 * 2;
                    Object obj5 = objArrCopyOf[i8];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i8 ^ 1];
                    Objects.requireNonNull(obj6);
                    zzae.zza(obj5, obj6);
                    int iZza = zzad.zza(obj5.hashCode());
                    while (true) {
                        int i10 = iZza & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i9;
                            if (i6 < i7) {
                                objArrCopyOf[i9] = obj5;
                                objArrCopyOf[i9 ^ 1] = obj6;
                            }
                            i6++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                                int i12 = ~i11;
                                Object obj7 = objArrCopyOf[i12 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                zzan zzanVar3 = new zzan(obj5, obj6, obj7);
                                objArrCopyOf[i12 == true ? 1 : 0] = obj6;
                                zzanVar2 = zzanVar3;
                                break;
                            }
                            iZza = i10 + 1;
                        }
                    }
                }
                if (i6 == i4) {
                    r7 = bArr;
                    c3 = 0;
                    c4 = 2;
                    r72 = r7;
                } else {
                    c4 = 2;
                    objArr2 = new Object[]{bArr, Integer.valueOf(i6), zzanVar2};
                    r72 = objArr2;
                    c3 = 0;
                }
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i13 = 0;
                    for (int i14 = 0; i14 < i4; i14++) {
                        int i15 = i14 * 2;
                        int i16 = i13 * 2;
                        Object obj8 = objArrCopyOf[i15];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i15 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzae.zza(obj8, obj9);
                        int iZza2 = zzad.zza(obj8.hashCode());
                        while (true) {
                            int i17 = iZza2 & i5;
                            int i18 = sArr[i17] & 65535;
                            if (i18 == 65535) {
                                sArr[i17] = (short) i16;
                                if (i13 < i14) {
                                    objArrCopyOf[i16] = obj8;
                                    objArrCopyOf[i16 ^ 1] = obj9;
                                }
                                i13++;
                            } else {
                                if (obj8.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                                    int i19 = ~i18;
                                    Object obj10 = objArrCopyOf[i19 == true ? 1 : 0];
                                    Objects.requireNonNull(obj10);
                                    zzanVar = new zzan(obj8, obj9, obj10);
                                    objArrCopyOf[i19 == true ? 1 : 0] = obj9;
                                    break;
                                }
                                iZza2 = i17 + 1;
                            }
                        }
                    }
                    if (i13 != i4) {
                        c4 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i13), zzanVar};
                        r72 = objArr2;
                        c3 = 0;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    zzan zzanVar4 = null;
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i20 * 2;
                        int i23 = i21 * 2;
                        Object obj11 = objArrCopyOf[i22];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i22 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzae.zza(obj11, obj12);
                        int iZza3 = zzad.zza(obj11.hashCode());
                        while (true) {
                            int i24 = iZza3 & i5;
                            ?? r15 = sArr[i24];
                            if (r15 == b3) {
                                sArr[i24] = i23;
                                if (i21 < i20) {
                                    objArrCopyOf[i23] = obj11;
                                    objArrCopyOf[i23 ^ 1] = obj12;
                                }
                                i21++;
                            } else {
                                if (obj11.equals(objArrCopyOf[r15])) {
                                    int i25 = r15 ^ 1;
                                    Object obj13 = objArrCopyOf[i25 == true ? 1 : 0];
                                    Objects.requireNonNull(obj13);
                                    zzanVar4 = new zzan(obj11, obj12, obj13);
                                    objArrCopyOf[i25 == true ? 1 : 0] = obj12;
                                    break;
                                }
                                iZza3 = i24 + 1;
                                b3 = -1;
                            }
                        }
                        i20++;
                        b3 = -1;
                    }
                    if (i21 != i4) {
                        c3 = 0;
                        c4 = 2;
                        r72 = new Object[]{sArr, Integer.valueOf(i21), zzanVar4};
                    }
                }
                r7 = sArr;
                c3 = 0;
                c4 = 2;
                r72 = r7;
            }
        }
        boolean z2 = r72 instanceof Object[];
        ?? r73 = r72;
        if (z2) {
            Object[] objArr3 = (Object[]) r72;
            zzan zzanVar5 = (zzan) objArr3[c4];
            if (zzaoVar == null) {
                throw zzanVar5.zza();
            }
            zzaoVar.zza = zzanVar5;
            Object obj14 = objArr3[c3];
            int iIntValue = ((Integer) objArr3[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            r73 = obj14;
            i4 = iIntValue;
        }
        return new zzas<>(r73, objArrCopyOf, i4);
    }
}
