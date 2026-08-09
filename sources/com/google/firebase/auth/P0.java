package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class P0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0673e f6005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6006c;

    P0(FirebaseAuth firebaseAuth, String str, C0673e c0673e) {
        this.f6004a = str;
        this.f6005b = c0673e;
        Objects.requireNonNull(firebaseAuth);
        this.f6006c = firebaseAuth;
    }

    @Override // q0.S
    public final Task c(String str) {
        String str2;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f6004a;
            sb = new StringBuilder("Email link sign in for ");
            sb.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f6004a;
            sb = new StringBuilder("Got reCAPTCHA token for email link sign in for ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        FirebaseAuth firebaseAuth = this.f6006c;
        return firebaseAuth.f5923e.zzb(firebaseAuth.f5919a, this.f6004a, this.f6005b, this.f6006c.f5929k, str);
    }
}
