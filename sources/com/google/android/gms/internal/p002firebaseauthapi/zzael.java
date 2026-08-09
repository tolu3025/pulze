package com.google.android.gms.internal.p002firebaseauthapi;

import P.a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.O;

/* JADX INFO: loaded from: classes.dex */
public class zzael implements zzaem {
    private final zzaem zza;
    private final a zzb;

    public zzael(zzael zzaelVar) {
        this(zzaelVar.zza, zzaelVar.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending delete account response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending email verification response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e3, new Object[0]);
        }
    }

    public zzael(zzaem zzaemVar, a aVar) {
        this.zza = (zzaem) AbstractC0643s.k(zzaemVar);
        this.zzb = (a) AbstractC0643s.k(aVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending failure result.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending send verification code response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending set account info response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, O o2) {
        try {
            this.zza.zza(status, o2);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending failure result.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        try {
            this.zza.zza(zzaapVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending failure result with credential", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        try {
            this.zza.zza(zzaasVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending failure result for mfa", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending create auth uri response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        try {
            this.zza.zza(zzahrVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        try {
            this.zza.zza(zzahsVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        try {
            this.zza.zza(zzahvVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending token result.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        try {
            this.zza.zza(zzahvVar, zzahkVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending get token and account info user response", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        try {
            this.zza.zza(zzaifVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending password reset response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        try {
            this.zza.zza(zzaigVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending revoke token response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        try {
            this.zza.zza(zzairVar);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(O o2) {
        try {
            this.zza.zza(o2);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending verification completed response.", e3, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e3) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e3, new Object[0]);
        }
    }
}
