package q0;

import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import com.google.firebase.auth.AbstractC0667b;
import com.google.firebase.auth.InterfaceC0671d;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements InterfaceC0671d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0667b f10626d;

    public C0(zzaif zzaifVar) {
        int i3;
        this.f10624b = zzaifVar.zzg() ? zzaifVar.zzc() : zzaifVar.zzb();
        this.f10625c = zzaifVar.zzb();
        AbstractC0667b a02 = null;
        if (!zzaifVar.zzh()) {
            this.f10623a = 3;
            this.f10626d = null;
            return;
        }
        String strZzd = zzaifVar.zzd();
        strZzd.hashCode();
        i3 = 5;
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i3 = 6;
                break;
            case "PASSWORD_RESET":
                i3 = 0;
                break;
            case "VERIFY_EMAIL":
                i3 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i3 = 4;
                break;
            case "RECOVER_EMAIL":
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        this.f10623a = i3;
        if (i3 == 4 || i3 == 3) {
            this.f10626d = null;
            return;
        }
        if (zzaifVar.zzf()) {
            a02 = new D0(zzaifVar.zzb(), N.a(zzaifVar.zza()));
        } else if (zzaifVar.zzg()) {
            a02 = new B0(zzaifVar.zzc(), zzaifVar.zzb());
        } else if (zzaifVar.zze()) {
            a02 = new A0(zzaifVar.zzb());
        }
        this.f10626d = a02;
    }

    @Override // com.google.firebase.auth.InterfaceC0671d
    public final int a() {
        return this.f10623a;
    }

    @Override // com.google.firebase.auth.InterfaceC0671d
    public final AbstractC0667b b() {
        return this.f10626d;
    }
}
