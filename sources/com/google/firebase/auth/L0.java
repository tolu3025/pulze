package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.firebase.auth.Q;
import java.util.Objects;
import k0.C0999m;

/* JADX INFO: loaded from: classes.dex */
final class L0 extends Q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ P f5957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q0.r0 f5958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Q.b f5959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5960d;

    L0(FirebaseAuth firebaseAuth, P p2, q0.r0 r0Var, Q.b bVar) {
        this.f5957a = p2;
        this.f5958b = r0Var;
        this.f5959c = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.f5960d = firebaseAuth;
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f5959c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeSent(String str, Q.a aVar) {
        this.f5959c.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationCompleted(O o2) {
        this.f5959c.onVerificationCompleted(o2);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationFailed(C0999m c0999m) {
        if (zzaen.zza(c0999m)) {
            this.f5957a.b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f5957a.j());
            FirebaseAuth.j0(this.f5957a);
            return;
        }
        if (TextUtils.isEmpty(this.f5958b.c())) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f5957a.j() + ", error - " + c0999m.getMessage());
            this.f5959c.onVerificationFailed(c0999m);
            return;
        }
        if (zzaen.zzb(c0999m) && this.f5960d.q0().d("PHONE_PROVIDER") && TextUtils.isEmpty(this.f5958b.b())) {
            this.f5957a.d(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.f5957a.j());
            FirebaseAuth.j0(this.f5957a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.f5957a.j() + ", error - " + c0999m.getMessage());
        this.f5959c.onVerificationFailed(c0999m);
    }
}
