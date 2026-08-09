package com.google.android.recaptcha.internal;

import J1.AbstractC0407k;
import J1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC0407k.U((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return AbstractC0407k.a0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return AbstractC0407k.X((int[]) obj);
        }
        if (obj instanceof long[]) {
            return AbstractC0407k.Y((long[]) obj);
        }
        if (obj instanceof float[]) {
            return AbstractC0407k.W((float[]) obj);
        }
        if (obj instanceof double[]) {
            return AbstractC0407k.V((double[]) obj);
        }
        return null;
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
        zzgdVar.zzc().zze(i3, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(q.n(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(q.n(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i3 = 0; i3 < size; i3++) {
            dArr[i3] = Double.valueOf(Math.pow(((Number) listZzc.get(i3)).doubleValue(), ((Number) listZzc2.get(i3)).doubleValue()));
        }
        return dArr;
    }
}
