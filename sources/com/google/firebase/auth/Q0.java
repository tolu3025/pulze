package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class Q0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0673e f6008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6009c;

    Q0(FirebaseAuth firebaseAuth, String str, C0673e c0673e) {
        this.f6007a = str;
        this.f6008b = c0673e;
        Objects.requireNonNull(firebaseAuth);
        this.f6009c = firebaseAuth;
    }

    @Override // q0.S
    public final Task c(String str) {
        String str2;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f6007a;
            sb = new StringBuilder("Password reset request ");
            sb.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f6007a;
            sb = new StringBuilder("Got reCAPTCHA token for password reset of email ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        FirebaseAuth firebaseAuth = this.f6009c;
        return firebaseAuth.f5923e.zza(firebaseAuth.f5919a, this.f6007a, this.f6008b, this.f6009c.f5929k, str);
    }
}
