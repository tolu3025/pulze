package q0;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbc;
import com.google.android.gms.internal.p002firebaseauthapi.zzbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzby;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzlh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static y0 f10795c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzmy f10797b;

    private y0(Context context, String str, boolean z2) {
        zzmy zzmyVarZza;
        this.f10796a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzlh.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e3) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e3.getMessage());
            zzmyVarZza = null;
        }
        this.f10797b = zzmyVarZza;
    }

    public static y0 c(Context context, String str) {
        y0 y0Var = f10795c;
        if (y0Var == null || !Objects.equals(y0Var.f10796a, str)) {
            f10795c = new y0(context, str, true);
        }
        return f10795c;
    }

    public final String a() {
        if (this.f10797b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zzbyVarZza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f10797b) {
                this.f10797b.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e3) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e3.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f10797b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f10797b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e3) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e3.getMessage());
            return null;
        }
    }
}
