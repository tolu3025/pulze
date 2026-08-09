package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.G;

/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5858c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5860e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f5856a = new G("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f5859d = new Object();

    y(String str, long j3) {
        this.f5857b = str;
        this.f5858c = j3;
    }

    public final Task a(Activity activity, int i3) {
        synchronized (this.f5859d) {
            try {
                if (this.f5860e) {
                    return Tasks.forResult(0);
                }
                this.f5860e = true;
                this.f5856a.a("checkAndShowDialog(%s)", Integer.valueOf(i3));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i3);
                bundle.putString("package.name", this.f5857b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f5858c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
