package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.firebase.auth.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0685k {
    public static AbstractC0679h a(String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        return new C0683j(str, str2);
    }

    public static AbstractC0679h b(String str, String str2) {
        if (C0683j.w(str2)) {
            return new C0683j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
