package com.google.android.recaptcha.internal;

import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzil extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzil(zzja zzjaVar, M1.d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzil(this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[PHI: r7
      0x0057: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0055, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = N1.b.e()
            int r1 = r6.zzb
            java.lang.String r2 = "RN"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L17
            I1.o.b(r7)
            if (r1 == r3) goto L57
            goto L6e
        L17:
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzja r1 = (com.google.android.recaptcha.internal.zzja) r1
            I1.o.b(r7)
            goto L41
        L1f:
            I1.o.b(r7)
            goto L30
        L23:
            I1.o.b(r7)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zzb = r5
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L30:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r4
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L41:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r5)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 0
            r6.zza = r1
            r6.zzb = r3
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L7d
        L57:
            com.google.android.recaptcha.internal.zzja r1 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzij r1 = r1.zzq()
            r7.addJavascriptInterface(r1, r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 4
            r6.zzb = r1
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 != r0) goto L6e
            goto L7d
        L6e:
            com.google.android.recaptcha.internal.zzja r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzik r1 = new com.google.android.recaptcha.internal.zzik
            r1.<init>(r0)
            r7.setWebViewClient(r1)
            I1.u r7 = I1.u.f2419a
            return r7
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
