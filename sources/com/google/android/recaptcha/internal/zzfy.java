package com.google.android.recaptcha.internal;

import J1.AbstractC0412p;
import U1.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzfy extends zzfx {
    private final p zza;
    private final String zzb;

    public zzfy(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionH;
        if (!m.a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            collectionH = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                collectionH.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            collectionH = AbstractC0412p.h();
        }
        zztfVarZzf.zze(collectionH);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        p pVar = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        pVar.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
