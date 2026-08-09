package com.google.android.recaptcha.internal;

import I1.g;
import I1.i;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzfm {
    private final g zza;

    public zzfm() {
        int i3 = zzav.zza;
        this.zza = i.a(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
