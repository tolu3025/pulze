package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import android.webkit.WebView;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zziq extends l implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziq(zzja zzjaVar, String str, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zziq(this.zzb, this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziq) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            zzja zzjaVar = this.zzb;
            this.zza = 1;
            obj = zzjaVar.zzw(this);
            if (obj == objE) {
                return objE;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return u.f2419a;
    }
}
