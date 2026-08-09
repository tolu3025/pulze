package com.google.android.gms.internal.p002firebaseauthapi;

import P.a;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.C0676f0;
import com.google.firebase.auth.I;
import com.google.firebase.auth.InterfaceC0668b0;
import com.google.firebase.auth.O;
import com.google.firebase.auth.S;
import com.google.firebase.auth.Y;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeo {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    zzaeo(C0992f c0992f, ScheduledExecutorService scheduledExecutorService) {
        AbstractC0643s.k(c0992f);
        Context contextM = c0992f.m();
        AbstractC0643s.k(contextM);
        this.zzb = new zzaar(new zzafb(c0992f, zzafc.zza()));
        this.zzc = new zzagc(contextM, scheduledExecutorService);
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaemVar);
        AbstractC0643s.k(zzaanVar);
        this.zzb.zza(zzafw.zza((O) AbstractC0643s.k(zzaanVar.zza())), new zzael(zzaemVar, zza));
    }

    public final void zzb(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzahmVar);
        AbstractC0643s.e(zzahmVar.zzc());
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, zzaem zzaemVar) {
        AbstractC0643s.k(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaaqVar);
        AbstractC0643s.k(zzaemVar);
        String strI = zzaaqVar.zzb().i();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strI)) {
            if (!zzaaqVar.zzh()) {
                this.zzc.zzb(zzaelVar, strI);
                return;
            }
            this.zzc.zzb(strI);
        }
        long jZza = zzaaqVar.zza();
        boolean zZzi = zzaaqVar.zzi();
        zzaiq zzaiqVarZza = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().a(), zzaaqVar.zzb().i(), zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(jZza, zZzi)) {
            zzaiqVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strI, zzaelVar, jZza, zZzi);
        this.zzb.zza(zzaiqVarZza, this.zzc.zza(zzaelVar, strI));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaemVar);
        AbstractC0643s.k(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzahmVar);
        AbstractC0643s.e(zzahmVar.zzd());
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaemVar);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaemVar);
        AbstractC0643s.k(zzahzVar);
        this.zzb.zza(AbstractC0643s.e(zzahzVar.zzb()), zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaicVar);
        AbstractC0643s.e(zzaicVar.zzb());
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzaemVar);
        AbstractC0643s.k(zzaijVar);
        String strZzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strZzd)) {
            if (!zzaijVar.zze()) {
                this.zzc.zzb(zzaelVar, strZzd);
                return;
            }
            this.zzc.zzb(strZzd);
        }
        long jZzb = zzaijVar.zzb();
        boolean zZzf = zzaijVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzaelVar, jZzb, zZzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, strZzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzainVar);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        this.zzb.zza(zzaiuVar, new zzael((zzaem) AbstractC0643s.k(zzaemVar), zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzajbVar);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        AbstractC0643s.k(zzajcVar);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(I i3, String str, String str2, String str3, zzaem zzaemVar) {
        zzagz zzagzVarZza;
        AbstractC0643s.k(i3);
        AbstractC0643s.f(str, "cachedTokenState should not be empty.");
        AbstractC0643s.k(zzaemVar);
        if (i3 instanceof S) {
            O oA = ((S) i3).a();
            zzagzVarZza = zzahd.zza(str, (String) AbstractC0643s.k(oA.zzc()), (String) AbstractC0643s.k(oA.v()), str2, str3);
        } else {
            if (!(i3 instanceof Y)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            Y y2 = (Y) i3;
            zzagzVarZza = zzahf.zza(str, AbstractC0643s.e(str2), AbstractC0643s.e(((InterfaceC0668b0) AbstractC0643s.k(y2.a())).c()), AbstractC0643s.e(y2.c()), str3);
        }
        this.zzb.zza(zzagzVarZza, str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzajbVar);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, I i3, String str2, zzaem zzaemVar) {
        zzaar zzaarVar;
        zzahb zzahbVarZza;
        zzael zzaelVar;
        AbstractC0643s.e(str);
        AbstractC0643s.k(i3);
        AbstractC0643s.k(zzaemVar);
        if (i3 instanceof S) {
            O oA = ((S) i3).a();
            zzaarVar = this.zzb;
            zzahbVarZza = zzahc.zza(str, (String) AbstractC0643s.k(oA.zzc()), (String) AbstractC0643s.k(oA.v()), str2);
            zzaelVar = new zzael(zzaemVar, zza);
        } else {
            if (!(i3 instanceof Y)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            Y y2 = (Y) i3;
            zzaarVar = this.zzb;
            zzahbVarZza = zzahe.zza(str, AbstractC0643s.e(y2.c()), str2, AbstractC0643s.e(y2.b()));
            zzaelVar = new zzael(zzaemVar, zza);
        }
        zzaarVar.zza(zzahbVarZza, zzaelVar);
    }

    public final void zza(String str, C0676f0 c0676f0, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(c0676f0);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, c0676f0, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j3, boolean z2, boolean z3, String str4, String str5, String str6, boolean z4, zzaem zzaemVar) {
        AbstractC0643s.f(str, "idToken should not be empty.");
        AbstractC0643s.k(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            zzagc zzagcVar = this.zzc;
            if (!z2) {
                zzagcVar.zzb(zzaelVar, str2);
                return;
            }
            zzagcVar.zzb(str2);
        }
        zzais zzaisVarZza = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j3, z4)) {
            zzaisVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j3, z4);
        this.zzb.zza(zzaisVarZza, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzaem zzaemVar) {
        AbstractC0643s.f(str, "cachedTokenState should not be empty.");
        AbstractC0643s.f(str2, "uid should not be empty.");
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaem zzaemVar) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.e(str3);
        AbstractC0643s.k(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j3, boolean z2) {
        if (j3 > 0 && z2) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
