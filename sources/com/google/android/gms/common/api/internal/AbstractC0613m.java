package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0613m {
    public static C0612l a(Object obj, Looper looper, String str) {
        AbstractC0643s.l(obj, "Listener must not be null");
        AbstractC0643s.l(looper, "Looper must not be null");
        AbstractC0643s.l(str, "Listener type must not be null");
        return new C0612l(looper, obj, str);
    }
}
