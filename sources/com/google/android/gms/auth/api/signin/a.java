package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC0643s.k(googleSignInOptions));
    }
}
