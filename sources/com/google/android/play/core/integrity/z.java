package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC0658h;

/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f5861a;

    static synchronized s a(Context context) {
        try {
            if (f5861a == null) {
                q qVar = new q(null);
                qVar.a(AbstractC0658h.a(context));
                f5861a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5861a;
    }
}
