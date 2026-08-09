package com.google.android.recaptcha.internal;

import J1.C;
import J1.q;
import J1.x;
import Y1.i;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) throws zzce {
        boolean z2;
        boolean z3;
        boolean z4 = obj instanceof Byte;
        if ((z4 && (obj2 instanceof Byte)) || ((((z2 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z3 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z5 = obj instanceof Long;
        if (z5 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z6 = obj instanceof Float;
        if (z6 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z7 = obj instanceof Double;
        if (z7 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i3 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(b2.c.f4952b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i3 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i3] % ((Number) obj2).intValue())));
                    i3++;
                }
                return new String(x.R(arrayList), b2.c.f4952b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i3 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i3] % ((Number) obj2).intValue()));
                    i3++;
                }
                return x.U(arrayList2);
            }
        }
        if (z4 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b3 : bArr) {
                arrayList3.add(Integer.valueOf(b3 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s2 : sArr) {
                arrayList4.add(Integer.valueOf(s2 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i4 : iArr) {
                arrayList5.add(Integer.valueOf(i4 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z5 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j3 : jArr) {
                arrayList6.add(Long.valueOf(j3 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z6 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f3 : fArr) {
                arrayList7.add(Float.valueOf(f3 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z7 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d3 : dArr) {
                arrayList8.add(Double.valueOf(d3 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z8 = obj instanceof byte[];
        if (z8 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b4 : bArr2) {
                arrayList9.add(Integer.valueOf(b4 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z9 = obj instanceof short[];
        if (z9 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s3 : sArr2) {
                arrayList10.add(Integer.valueOf(s3 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z10 = obj instanceof int[];
        if (z10 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i3 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i3] % ((Number) obj2).intValue()));
                i3++;
            }
            return x.U(arrayList11);
        }
        boolean z11 = obj instanceof long[];
        if (z11 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j4 : jArr2) {
                arrayList12.add(Long.valueOf(j4 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z12 = obj instanceof float[];
        if (z12 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f4 : fArr2) {
                arrayList13.add(Float.valueOf(f4 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z13 = obj instanceof double[];
        if (z13 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d4 : dArr2) {
                arrayList14.add(Double.valueOf(d4 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z8 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            Y1.f fVarG = i.g(0, length4);
            ArrayList arrayList15 = new ArrayList(q.n(fVarG, 10));
            Iterator it = fVarG.iterator();
            while (it.hasNext()) {
                int iB = ((C) it).b();
                arrayList15.add(Integer.valueOf(bArr3[iB] % bArr4[iB]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            Y1.f fVarG2 = i.g(0, length5);
            ArrayList arrayList16 = new ArrayList(q.n(fVarG2, 10));
            Iterator it2 = fVarG2.iterator();
            while (it2.hasNext()) {
                int iB2 = ((C) it2).b();
                arrayList16.add(Integer.valueOf(sArr3[iB2] % sArr4[iB2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            Y1.f fVarG3 = i.g(0, length6);
            ArrayList arrayList17 = new ArrayList(q.n(fVarG3, 10));
            Iterator it3 = fVarG3.iterator();
            while (it3.hasNext()) {
                int iB3 = ((C) it3).b();
                arrayList17.add(Integer.valueOf(iArr3[iB3] % iArr4[iB3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            Y1.f fVarG4 = i.g(0, length7);
            ArrayList arrayList18 = new ArrayList(q.n(fVarG4, 10));
            Iterator it4 = fVarG4.iterator();
            while (it4.hasNext()) {
                int iB4 = ((C) it4).b();
                arrayList18.add(Long.valueOf(jArr3[iB4] % jArr4[iB4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z12 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            Y1.f fVarG5 = i.g(0, length8);
            ArrayList arrayList19 = new ArrayList(q.n(fVarG5, 10));
            Iterator it5 = fVarG5.iterator();
            while (it5.hasNext()) {
                int iB5 = ((C) it5).b();
                arrayList19.add(Float.valueOf(fArr3[iB5] % fArr4[iB5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z13 || !(obj2 instanceof double[])) {
            throw new zzce(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        Y1.f fVarG6 = i.g(0, length9);
        ArrayList arrayList20 = new ArrayList(q.n(fVarG6, 10));
        Iterator it6 = fVarG6.iterator();
        while (it6.hasNext()) {
            int iB6 = ((C) it6).b();
            arrayList20.add(Double.valueOf(dArr3[iB6] % dArr4[iB6]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i3, zzb(objZza, objZza2));
        } catch (ArithmeticException e3) {
            throw new zzce(4, 6, e3);
        }
    }
}
