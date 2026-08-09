package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    private final f zza;

    zzci(f fVar) {
        this.zza = fVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        f fVar = (f) this.zza.get(uri.toString());
        if (fVar == null) {
            return null;
        }
        return (String) fVar.get("".concat(String.valueOf(str3)));
    }
}
