package com.google.android.play.integrity.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658h {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
