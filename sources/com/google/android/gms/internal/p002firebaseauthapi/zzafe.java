package com.google.android.gms.internal.p002firebaseauthapi;

import K0.i;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import k0.C0992f;
import m0.AbstractC1028b;
import p0.InterfaceC1059b;

/* JADX INFO: loaded from: classes.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final C0992f zzd;
    private boolean zze;
    private String zzf;

    public zzafe(Context context, C0992f c0992f, String str) {
        this.zze = false;
        this.zza = (Context) AbstractC0643s.k(context);
        this.zzd = (C0992f) AbstractC0643s.k(c0992f);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    private static String zza(C0992f c0992f) {
        InterfaceC1059b interfaceC1059b = (InterfaceC1059b) FirebaseAuth.getInstance(c0992f).t0().get();
        if (interfaceC1059b == null) {
            return null;
        }
        try {
            AbstractC1028b abstractC1028b = (AbstractC1028b) Tasks.await(interfaceC1059b.b(false));
            if (abstractC1028b.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC1028b.a()));
            }
            return abstractC1028b.b();
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        }
    }

    private static String zzb(C0992f c0992f) {
        i iVar = (i) FirebaseAuth.getInstance(c0992f).x0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e3) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e3.getMessage());
            }
        }
        return null;
    }

    public zzafe(C0992f c0992f, String str) {
        this(c0992f.m(), c0992f, str);
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder sb;
        String str;
        if (this.zze) {
            String str2 = this.zzc;
            sb = new StringBuilder();
            sb.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.zzc;
            sb = new StringBuilder();
            sb.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb.append(str);
        String string = sb.toString();
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", string);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.r().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }
}
