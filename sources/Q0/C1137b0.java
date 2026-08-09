package q0;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import com.google.android.gms.internal.p002firebaseauthapi.zzcl;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: renamed from: q0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1137b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1137b0 f10683c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzmy f10685b;

    private C1137b0(String str, zzmy zzmyVar) {
        this.f10684a = str;
        this.f10685b = zzmyVar;
    }

    public static C1137b0 b(Context context, String str) {
        C1137b0 c1137b0 = f10683c;
        if (c1137b0 == null || !Objects.equals(c1137b0.f10684a, str)) {
            f10683c = new C1137b0(str, e(context, str));
        }
        return f10683c;
    }

    private static zzmy c(Context context, String str) {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", f(str)).zza(zzcv.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", str)).zza();
    }

    private static zzmy e(Context context, String str) {
        try {
            zzcl.zza();
            return c(context, str);
        } catch (IOException | GeneralSecurityException e3) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e3.getMessage());
            if (e3 instanceof GeneralSecurityException) {
                context.getSharedPreferences(f(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return c(context, str);
                } catch (IOException | GeneralSecurityException e4) {
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e4.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    private static String f(String str) {
        return String.format("com.google.firebase.auth.api.crypto.%s", str);
    }

    public final String a(String str) {
        String str2;
        AbstractC0643s.k(str);
        zzmy zzmyVar = this.f10685b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) this.f10685b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e3) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e3.getMessage());
            return null;
        }
    }

    public final String d(String str) {
        String strEncodeToString;
        AbstractC0643s.k(str);
        zzmy zzmyVar = this.f10685b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                strEncodeToString = Base64.encodeToString(((zzba) this.f10685b.zza().zza(zzco.zza(), zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return strEncodeToString;
        } catch (GeneralSecurityException e3) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e3.getMessage());
            return null;
        }
    }
}
