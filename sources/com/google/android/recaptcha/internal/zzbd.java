package com.google.android.recaptcha.internal;

import I1.m;
import I1.q;
import J1.G;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbb zzc;
    private final zzba zzd;
    private final String zze;
    private final Map zzf;

    static {
        m mVarA = q.a(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, null));
        zztv zztvVar = zztv.JS_INTERNAL_ERROR;
        zzbb zzbbVar = zzbb.zzb;
        zzb = G.e(mVarA, q.a(zztvVar, new zzbd(zzbbVar, zzba.zzc, null)), q.a(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, null)), q.a(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, null)), q.a(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, null)), q.a(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, null)), q.a(zztv.JS_PROGRAM_ERROR, new zzbd(zzbbVar, zzba.zzj, null)));
    }

    public zzbd(zzbb zzbbVar, zzba zzbaVar, String str) {
        this.zzc = zzbbVar;
        this.zzd = zzbaVar;
        this.zze = str;
        zzbb zzbbVar2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = G.e(q.a(zzbbVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), q.a(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), q.a(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), q.a(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), q.a(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), q.a(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), q.a(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), q.a(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), q.a(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    public final zzba zza() {
        return this.zzd;
    }

    public final zzbb zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzba zzbaVar = this.zzd;
        if (kotlin.jvm.internal.m.a(zzbaVar, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (kotlin.jvm.internal.m.a(zzbaVar, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
