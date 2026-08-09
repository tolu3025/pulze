package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf {
    public static final Appendable zza(Appendable appendable, Iterator it, zzag zzagVar, String str) throws IOException {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzag.zzd(entry.getKey()));
            while (true) {
                appendable.append(" : ");
                appendable.append(zzag.zzd(entry.getValue()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(zzagVar.zza);
                entry = (Map.Entry) it.next();
                appendable.append(zzag.zzd(entry.getKey()));
            }
        }
        return appendable;
    }
}
