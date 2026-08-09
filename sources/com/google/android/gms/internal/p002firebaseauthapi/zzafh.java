package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.O;
import java.util.Objects;
import q0.InterfaceC1164x;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 5, "Unexpected response type " + i3);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 6, "Unexpected response type " + i3);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 9, "Unexpected response type " + i3);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) {
        String strU = status.u();
        if (strU != null) {
            if (strU.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (strU.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (strU.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (strU.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (strU.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (strU.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (strU.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (strU.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (strU.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (strU.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 8, "Unexpected response type " + i3);
        zza(new zzafj(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 7, "Unexpected response type " + i3);
        zzaff.zza(this.zza);
    }

    private final void zza(Status status, AbstractC0679h abstractC0679h, String str, String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = abstractC0679h;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        InterfaceC1164x interfaceC1164x = zzaffVar.zzf;
        if (interfaceC1164x != null) {
            interfaceC1164x.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, O o2) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 2, "Unexpected response type " + i3);
        zza(status, o2, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(r.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 3, "Unexpected response type " + i3);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 1, "Unexpected response type: " + i3);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 2, "Unexpected response type: " + i3);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 4, "Unexpected response type " + i3);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(O o2) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 8, "Unexpected response type " + i3);
        this.zza.zzu = true;
        zza(new zzafi(this, o2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        int i3 = this.zza.zza;
        AbstractC0643s.n(i3 == 8, "Unexpected response type " + i3);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }
}
