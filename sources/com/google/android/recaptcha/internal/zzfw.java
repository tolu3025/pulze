package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import c2.AbstractC0570k;
import c2.N;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final N zzb;

    public zzfw(WebView webView, N n3) {
        this.zza = webView;
        this.zzb = n3;
    }

    public final void zzb(String str, String... strArr) {
        AbstractC0570k.d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
