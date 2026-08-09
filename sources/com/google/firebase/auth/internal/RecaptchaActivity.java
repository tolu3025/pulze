package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import h.C0875b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k0.C0992f;
import m0.AbstractC1028b;
import p0.InterfaceC1059b;
import q0.O;
import q0.i0;
import q0.k0;
import q0.r;
import q0.w0;
import q0.y0;
import x.C1269a;

/* JADX INFO: loaded from: classes.dex */
public class RecaptchaActivity extends d implements zzaes {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f6083M = "RecaptchaActivity";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static long f6084N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final k0 f6085O = k0.f();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f6086L = false;

    private final Uri.Builder R(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C0992f c0992fP = C0992f.p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c0992fP);
        w0.b().d(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strA = y0.c(getApplicationContext(), c0992fP.s()).a();
        if (TextUtils.isEmpty(strA)) {
            Log.e(f6083M, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            T(r.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.p()) ? firebaseAuth.p() : zzafd.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        return builder;
    }

    static /* synthetic */ Uri S(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC1028b abstractC1028b = (AbstractC1028b) task.getResult();
            if (abstractC1028b.a() != null) {
                Log.w(f6083M, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC1028b.a()));
            }
            builderBuildUpon.fragment("fac=" + abstractC1028b.b());
        } else {
            Log.e(f6083M, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }

    private final void T(Status status) {
        f6084N = 0L;
        this.f6086L = false;
        Intent intent = new Intent();
        i0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        V(intent);
        f6085O.a(this);
        finish();
    }

    public static /* synthetic */ void U(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f6083M, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            C0875b c0875bA = new C0875b.a().a();
            c0875bA.f7395a.addFlags(1073741824);
            c0875bA.f7395a.addFlags(268435456);
            c0875bA.a(recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        recaptchaActivity.startActivity(intent);
    }

    private final boolean V(Intent intent) {
        return C1269a.b(this).d(intent);
    }

    private final void W() {
        f6084N = 0L;
        this.f6086L = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        V(intent);
        f6085O.a(this);
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f6083M, "Could not do operation - unknown action: " + action);
            W();
            return;
        }
        long jA = f.c().a();
        if (jA - f6084N < 30000) {
            Log.e(f6083M, "Could not start operation - already in progress");
            return;
        }
        f6084N = jA;
        if (bundle != null) {
            this.f6086L = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6086L) {
                W();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(com.google.android.gms.common.util.a.a(this, packageName)).toLowerCase(Locale.US);
                C0992f c0992fP = C0992f.p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c0992fP);
                if (zzagl.zza(c0992fP)) {
                    zza(R(Uri.parse(zzagl.zza(c0992fP.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.t0());
                } else {
                    new zzaeq(packageName, lowerCase, intent, c0992fP, this).executeOnExecutor(firebaseAuth.B0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e(f6083M, "Could not get package signature: " + packageName + " " + String.valueOf(e3));
                zzaer.zzb(this, packageName);
            }
            this.f6086L = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            T(i0.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            W();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String strG = w0.b().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(strG)) {
            Log.e(f6083M, "Failed to find registration for this event - failing to prevent session injection.");
            T(r.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = y0.c(getApplicationContext(), C0992f.p(strG).s()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f6084N = 0L;
        this.f6086L = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (V(intent3)) {
            f6085O.a(this);
        } else {
            O.f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f6086L);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return R(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e(f6083M, "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(final Uri uri, final String str, L0.b bVar) {
        InterfaceC1059b interfaceC1059b = (InterfaceC1059b) bVar.get();
        (interfaceC1059b != null ? interfaceC1059b.b(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return RecaptchaActivity.S(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: q0.Q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.U(this.f10664a, str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            W();
        } else {
            T(status);
        }
    }
}
