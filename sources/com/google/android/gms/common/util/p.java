package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f5677a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
