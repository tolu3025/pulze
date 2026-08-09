package K;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0607g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P.a f2571a = new P.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f2571a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static com.google.android.gms.common.api.g b(com.google.android.gms.common.api.f fVar, Context context, boolean z2) {
        f2571a.a("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        d(context);
        return z2 ? f.a(strE) : fVar.b(new m(fVar));
    }

    public static com.google.android.gms.common.api.g c(com.google.android.gms.common.api.f fVar, Context context, boolean z2) {
        f2571a.a("Signing out", new Object[0]);
        d(context);
        return z2 ? com.google.android.gms.common.api.h.b(Status.f5312f, fVar) : fVar.b(new k(fVar));
    }

    private static void d(Context context) {
        p.a(context).b();
        Iterator it = com.google.android.gms.common.api.f.c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.f) it.next()).h();
        }
        C0607g.a();
    }
}
