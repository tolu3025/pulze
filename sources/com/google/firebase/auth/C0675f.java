package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.google.firebase.auth.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0675f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final zzal f6060g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6066f;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f6060g = zzal.zza(map);
    }

    private C0675f(String str) {
        String strE = e(str, "apiKey");
        String strE2 = e(str, "oobCode");
        String strE3 = e(str, "mode");
        if (strE == null || strE2 == null || strE3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f6061a = AbstractC0643s.e(strE);
        this.f6062b = AbstractC0643s.e(strE2);
        this.f6063c = AbstractC0643s.e(strE3);
        this.f6064d = e(str, "continueUrl");
        this.f6065e = e(str, "lang");
        this.f6066f = e(str, "tenantId");
    }

    public static C0675f c(String str) {
        AbstractC0643s.e(str);
        try {
            return new C0675f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(AbstractC0643s.e(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f6062b;
    }

    public int b() {
        zzal zzalVar = f6060g;
        if (zzalVar.containsKey(this.f6063c)) {
            return ((Integer) zzalVar.get(this.f6063c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f6066f;
    }
}
