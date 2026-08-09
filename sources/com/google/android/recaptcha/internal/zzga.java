package com.google.android.recaptcha.internal;

import J1.AbstractC0406j;
import J1.AbstractC0412p;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listH;
        if (!m.a(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (listH = AbstractC0406j.c(objArr)) == null) {
            listH = AbstractC0412p.h();
        }
        zzfzVar.zzb(listH);
        return true;
    }
}
