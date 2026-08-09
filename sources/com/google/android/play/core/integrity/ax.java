package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC0658h;

/* JADX INFO: loaded from: classes.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f5777a;

    static synchronized aw a(Context context) {
        try {
            if (f5777a == null) {
                u uVar = new u(null);
                uVar.a(AbstractC0658h.a(context));
                f5777a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5777a;
    }
}
