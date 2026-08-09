package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e3) {
            throw e3;
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e4.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i3, h hVar) {
        this.zza = new zzfm();
    }
}
