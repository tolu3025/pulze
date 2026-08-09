package com.google.android.recaptcha.internal;

import I1.i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i3, String str, int i4, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i3;
        this.zzb = str;
        this.zzl = i4;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    private final void zzc(int i3, zzqq zzqqVar) {
        String iSO3Language;
        int i4;
        PackageInfo packageInfo;
        int i5;
        String iSO3Country = "";
        zzra zzraVarZzi = zzrc.zzi();
        zzraVarZzi.zzy(this.zzk);
        zzraVarZzi.zzq(this.zzc);
        zzraVarZzi.zzt(this.zzd);
        zzraVarZzi.zzz(this.zzl);
        String str = this.zze;
        if (str != null) {
            zzraVarZzi.zzx(str);
        }
        Integer num = this.zzh;
        if (num != null) {
            zzraVarZzi.zzv(num.intValue());
        }
        if (zzqqVar != null) {
            zzraVarZzi.zzs(zzqqVar);
        }
        zzraVarZzi.zzA(i3);
        zzraVarZzi.zzw(this.zzi);
        zzraVarZzi.zzr(System.currentTimeMillis() - this.zzj);
        int i6 = zzav.zza;
        for (zzax zzaxVar : ((zzaz) i.a(zzel.zza).getValue()).zza()) {
            zzraVarZzi.zzf(0);
        }
        int i7 = zzbk.zza;
        int i8 = this.zzk - 2;
        zzbk.zza((i8 != 4 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? i8 != 14 ? zzbl.zza : zzbl.zzf : zzbl.zze : zzbl.zzd : zzbl.zzc : zzbl.zzb).zza(), zzraVarZzi.zze() * 1000);
        Context context = this.zzg;
        Set setZza = zzbe.zza(context);
        zzqk zzqkVar = zza;
        if (zzqkVar == null) {
            zzqh zzqhVarZzf = zzqk.zzf();
            int i9 = Build.VERSION.SDK_INT;
            zzqhVarZzf.zzf(i9);
            String strValueOf = "unknown";
            String strValueOf2 = (i9 < 33 ? (i5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1)) != -1 : (i5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1)) != -1) ? String.valueOf(i5) : "unknown";
            zzqhVarZzf.zzs(strValueOf2);
            zzqhVarZzf.zzu("18.6.1");
            zzqhVarZzf.zzr(Build.MODEL);
            zzqhVarZzf.zzt(Build.MANUFACTURER);
            try {
                i4 = Build.VERSION.SDK_INT;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (i4 >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            } else if (i4 >= 28) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } else {
                strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                zzqhVarZzf.zzq(strValueOf);
                zzqkVar = (zzqk) zzqhVarZzf.zzk();
            }
            strValueOf = String.valueOf(packageInfo.getLongVersionCode());
            zzqhVarZzf.zzq(strValueOf);
            zzqkVar = (zzqk) zzqhVarZzf.zzk();
        }
        zza = zzqkVar;
        zzqh zzqhVar = (zzqh) zzqkVar.zzr();
        zzqhVar.zze(setZza);
        zzqk zzqkVar2 = (zzqk) zzqhVar.zzk();
        try {
            iSO3Language = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused2) {
            iSO3Language = "";
        }
        try {
            iSO3Country = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused3) {
        }
        String str2 = this.zzb;
        zzrm zzrmVarZzf = zzro.zzf();
        zzrmVarZzf.zzr(str2);
        zzrmVarZzf.zze(zzqkVar2);
        zzrmVarZzf.zzq(iSO3Language);
        zzrmVarZzf.zzf(iSO3Country);
        zzraVarZzi.zzu((zzro) zzrmVarZzf.zzk());
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zze(zzraVarZzi);
        this.zzf.zza((zztx) zztwVarZzi.zzk());
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzqoVarZzg = zzqq.zzg();
        zzqoVarZzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzqoVarZzg.zze(zzbdVar.zza().zza());
        zzqoVarZzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbdVar.zzd();
        if (strZzd != null) {
            zzqoVarZzg.zzf(strZzd);
        }
        zzc(4, (zzqq) zzqoVarZzg.zzk());
    }
}
