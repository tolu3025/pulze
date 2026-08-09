package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import android.content.Context;
import android.webkit.WebView;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzjc extends l implements p {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjc(zzjd zzjdVar, Context context, M1.d dVar) {
        super(2, dVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzjc(this.zza, this.zzb, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        N1.d.e();
        o.b(obj);
        WebView webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
