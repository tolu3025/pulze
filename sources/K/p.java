package K;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p f2572d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f2573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f2574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f2575c;

    private p(Context context) {
        c cVarB = c.b(context);
        this.f2573a = cVarB;
        this.f2574b = cVarB.c();
        this.f2575c = cVarB.d();
    }

    public static synchronized p a(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized p d(Context context) {
        p pVar = f2572d;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(context);
        f2572d = pVar2;
        return pVar2;
    }

    public final synchronized void b() {
        this.f2573a.a();
        this.f2574b = null;
        this.f2575c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f2573a.f(googleSignInAccount, googleSignInOptions);
        this.f2574b = googleSignInAccount;
        this.f2575c = googleSignInOptions;
    }
}
