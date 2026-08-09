package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f5662a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5663b = 0;

    public static byte[] a(Context context, String str) {
        MessageDigest messageDigestB;
        PackageInfo packageInfoC = T.e.a(context).c(str, 64);
        Signature[] signatureArr = packageInfoC.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoC.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i3 = 0; i3 < 2; i3++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
