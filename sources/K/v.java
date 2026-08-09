package K;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class v extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2576a;

    public v(Context context) {
        this.f2576a = context;
    }

    private final void a() {
        if (com.google.android.gms.common.util.q.a(this.f2576a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // K.r
    public final void g() {
        a();
        p.a(this.f2576a).b();
    }

    @Override // K.r
    public final void l() {
        a();
        c cVarB = c.b(this.f2576a);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f5264q;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f2576a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.e();
        } else {
            bVarA.signOut();
        }
    }
}
