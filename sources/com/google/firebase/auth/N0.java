package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class N0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f5971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5973c;

    N0(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f5971a = str;
        this.f5972b = str2;
        Objects.requireNonNull(firebaseAuth);
        this.f5973c = firebaseAuth;
    }

    @Override // q0.S
    public final Task c(String str) {
        String str2;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f5971a;
            sb = new StringBuilder("Creating user with ");
            sb.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f5971a;
            sb = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        FirebaseAuth firebaseAuth = this.f5973c;
        return firebaseAuth.f5923e.zza(firebaseAuth.f5919a, this.f5971a, this.f5972b, this.f5973c.f5929k, str, new FirebaseAuth.c(this.f5973c));
    }
}
