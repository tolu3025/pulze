package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzt implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzw zzb;

    zzt(zzw zzwVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzwVar);
        this.zzb = zzwVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zze(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceZza = zzq.zza(it.next(), ", ");
                while (true) {
                    sb.append(charSequenceZza);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    charSequenceZza = zzq.zza(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
