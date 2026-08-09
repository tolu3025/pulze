package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.C0676f0;
import com.google.firebase.auth.C0683j;
import com.google.firebase.auth.E0;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        this.zza = (zzaft) AbstractC0643s.k(zzaftVar);
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC0643s.k(zzahmVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC0643s.e(zzahmVar.zzc());
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zze(String str, zzael zzaelVar) {
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC0643s.k(zzaelVar);
        AbstractC0643s.k(zzahvVar);
        AbstractC0643s.k(zzahkVar);
        AbstractC0643s.k(zzailVar);
        AbstractC0643s.k(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zzd(String str, zzael zzaelVar) {
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zze(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC0643s.k(zzaelVar);
        AbstractC0643s.k(zzahvVar);
        AbstractC0643s.k(zzailVar);
        AbstractC0643s.k(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        AbstractC0643s.k(zzaelVar);
        AbstractC0643s.k(zzaimVar);
        AbstractC0643s.k(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        if (!zzajdVar.zzo()) {
            zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
            return;
        }
        zzaelVar.zza(new zzaap(zzajdVar.zzm() ? new Status(17012) : r.a(zzajdVar.zzd()), zzajdVar.zzb(), zzajdVar.zzc(), zzajdVar.zzj()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        AbstractC0643s.k(zzagxVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        AbstractC0643s.k(zzagzVar);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        AbstractC0643s.k(zzahbVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC0643s.e(zzahmVar.zzd());
        AbstractC0643s.k(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        AbstractC0643s.k(zzahoVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        AbstractC0643s.k(zzahtVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, String str, String str2, Boolean bool, E0 e02, zzael zzaelVar, zzafs zzafsVar) {
        AbstractC0643s.k(zzahvVar);
        AbstractC0643s.k(zzafsVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, e02, zzaelVar, zzahvVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        AbstractC0643s.e(zzaicVar.zzb());
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        AbstractC0643s.e(zzaijVar.zzd());
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        AbstractC0643s.k(zzaioVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        AbstractC0643s.k(zzaiqVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        AbstractC0643s.k(zzajbVar);
        AbstractC0643s.k(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        AbstractC0643s.k(zzajcVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        AbstractC0643s.k(zzajgVar);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(C0683j c0683j, String str, zzael zzaelVar) {
        AbstractC0643s.k(c0683j);
        AbstractC0643s.k(zzaelVar);
        if (c0683j.zzg()) {
            zza(c0683j.x(), new zzaav(this, c0683j, str, zzaelVar));
        } else {
            zza(new zzagx(c0683j, null, str), zzaelVar);
        }
    }

    public final void zza(String str, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        AbstractC0643s.k(zzafvVar);
        AbstractC0643s.e(str);
        zzahv zzahvVarZzb = zzahv.zzb(str);
        if (zzahvVarZzb.zzg()) {
            zzafvVar.zza(zzahvVarZzb);
        } else {
            this.zza.zza(new zzahj(zzahvVarZzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzajbVar);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzajgVar);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(String str, C0676f0 c0676f0, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(c0676f0);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzack(this, c0676f0, zzaelVar));
    }

    public final void zza(String str, String str2, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzael zzaelVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.e(str3);
        AbstractC0643s.k(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }
}
