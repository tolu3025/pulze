package com.google.android.gms.auth.api.signin.internal;

import K.p;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends d {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static boolean f5300Q = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f5301L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private SignInConfiguration f5302M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f5303N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f5304O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Intent f5305P;

    private final void T() {
        J().c(0, null, new a(this, null));
        f5300Q = false;
    }

    private final void U(int i3) {
        Status status = new Status(i3);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5300Q = false;
    }

    private final void V(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f5302M);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5301L = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            U(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f5301L) {
            return;
        }
        setResult(0);
        if (i3 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.s() != null) {
                GoogleSignInAccount googleSignInAccountS = signInAccount.s();
                p pVarA = p.a(this);
                GoogleSignInOptions googleSignInOptionsS = this.f5302M.s();
                googleSignInAccountS.getClass();
                pVarA.c(googleSignInOptionsS, googleSignInAccountS);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountS);
                this.f5303N = true;
                this.f5304O = i4;
                this.f5305P = intent;
                T();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                U(intExtra);
                return;
            }
        }
        U(8);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            U(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f5302M = signInConfiguration;
        if (bundle == null) {
            if (f5300Q) {
                setResult(0);
                U(12502);
                return;
            } else {
                f5300Q = true;
                V(action);
                return;
            }
        }
        boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
        this.f5303N = z2;
        if (z2) {
            this.f5304O = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f5305P = intent2;
            T();
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f5300Q = false;
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5303N);
        if (this.f5303N) {
            bundle.putInt("signInResultCode", this.f5304O);
            bundle.putParcelable("signInResultData", this.f5305P);
        }
    }
}
