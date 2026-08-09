package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    private final zzp zza;
    private final boolean zzb;
    private final zzu zzc;

    private zzw(zzu zzuVar, boolean z2, zzp zzpVar, int i3) {
        this.zzc = zzuVar;
        this.zzb = z2;
        this.zza = zzpVar;
    }

    public static zzw zza(zzp zzpVar) {
        return new zzw(new zzu(zzpVar), false, zzo.zza, a.e.API_PRIORITY_OTHER);
    }

    public final zzw zzb() {
        return new zzw(this.zzc, true, this.zza, a.e.API_PRIORITY_OTHER);
    }

    public final Iterable zzc(CharSequence charSequence) {
        return new zzt(this, charSequence);
    }

    public final List zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add((String) itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    final /* synthetic */ Iterator zze(CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    final /* synthetic */ zzp zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }
}
