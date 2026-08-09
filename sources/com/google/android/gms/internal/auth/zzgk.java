package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzgk extends zzgu {
    zzgk(int i3) {
        super(i3, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgu
    public final void zza() {
        if (!zzj()) {
            for (int i3 = 0; i3 < zzb(); i3++) {
                Map.Entry entryZzg = zzg(i3);
                if (((zzeo) entryZzg.getKey()).zzc()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzeo) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
