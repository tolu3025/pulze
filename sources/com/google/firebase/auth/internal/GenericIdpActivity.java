package com.google.firebase.auth.internal;

import N.e;
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
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import h.C0875b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k0.C0992f;
import m0.AbstractC1028b;
import org.json.JSONException;
import org.json.JSONObject;
import p0.InterfaceC1059b;
import q0.O;
import q0.i0;
import q0.k0;
import q0.r;
import q0.w0;
import q0.y0;
import q0.z0;
import x.C1269a;

/* JADX INFO: loaded from: classes.dex */
public class GenericIdpActivity extends d implements zzaes {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static long f6080M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final k0 f6081N = k0.f();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f6082L = false;

    private final Uri.Builder R(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String strT = T(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = strJoin;
        w0.b().e(getApplicationContext(), str, string, strZza, action, stringExtra2, stringExtra3, stringExtra4);
        String strA = y0.c(getApplicationContext(), C0992f.p(stringExtra4).s()).a();
        if (TextUtils.isEmpty(strA)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            U(r.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(strT)) {
            builder.appendQueryParameter("customParameters", strT);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    static /* synthetic */ Uri S(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC1028b abstractC1028b = (AbstractC1028b) task.getResult();
            if (abstractC1028b.a() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC1028b.a()));
            }
            builderBuildUpon.fragment("fac=" + abstractC1028b.b());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }

    private static String T(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    private final void U(Status status) {
        f6080M = 0L;
        this.f6082L = false;
        Intent intent = new Intent();
        i0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (W(intent)) {
            f6081N.a(this);
        } else {
            O.b(getApplicationContext(), status);
        }
        finish();
    }

    public static /* synthetic */ void V(GenericIdpActivity genericIdpActivity, String str, Task task) {
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            C0875b c0875bA = new C0875b.a().a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            c0875bA.a(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
        }
    }

    private final boolean W(Intent intent) {
        return C1269a.b(this).d(intent);
    }

    private final void X() {
        f6080M = 0L;
        this.f6082L = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (W(intent)) {
            f6081N.a(this);
        } else {
            O.b(this, r.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            X();
            return;
        }
        long jA = f.c().a();
        if (jA - f6080M < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f6080M = jA;
        if (bundle != null) {
            this.f6082L = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
            if (this.f6082L) {
                X();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(com.google.android.gms.common.util.a.a(this, packageName)).toLowerCase(Locale.US);
                C0992f c0992fP = C0992f.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c0992fP);
                if (zzagl.zza(c0992fP)) {
                    zza(R(Uri.parse(zzagl.zza(c0992fP.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.t0());
                } else {
                    new zzaeq(packageName, lowerCase, getIntent(), c0992fP, this).executeOnExecutor(firebaseAuth.B0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e3));
                zzaer.zzb(this, packageName);
            }
            this.f6082L = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            U(i0.b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            X();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        z0 z0VarC = w0.b().c(this, packageName2, stringExtra2);
        if (z0VarC == null) {
            X();
        }
        if (booleanExtra) {
            stringExtra = y0.c(getApplicationContext(), C0992f.p(z0VarC.a()).s()).b(stringExtra);
        }
        zzajb zzajbVar = new zzajb(z0VarC, stringExtra);
        String strE = z0VarC.e();
        String strB = z0VarC.b();
        zzajbVar.zzb(strE);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strB) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strB)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + strB);
            X();
            return;
        }
        f6080M = 0L;
        this.f6082L = false;
        Intent intent2 = new Intent();
        e.e(zzajbVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strB);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (W(intent2)) {
            f6081N.a(this);
        } else {
            O.c(getApplicationContext(), zzajbVar, strB, strE);
        }
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f6082L);
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
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(final Uri uri, final String str, L0.b bVar) {
        InterfaceC1059b interfaceC1059b = (InterfaceC1059b) bVar.get();
        (interfaceC1059b != null ? interfaceC1059b.b(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return GenericIdpActivity.S(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: q0.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity.V(this.f10652a, str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            X();
        } else {
            U(status);
        }
    }
}
