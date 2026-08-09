package com.google.android.recaptcha.internal;

import J1.AbstractC0407k;
import J1.AbstractC0412p;
import J1.x;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzhy {
    private List zza = AbstractC0412p.h();

    public final long zza(long[] jArr) {
        Iterator it = x.J(this.zza, AbstractC0407k.Y(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC0407k.Y(jArr);
    }
}
