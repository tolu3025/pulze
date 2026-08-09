package com.google.android.gms.common.api.internal;

import M.C0413a;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class I implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0413a f5355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f5356b;

    I(J j3, C0413a c0413a) {
        this.f5355a = c0413a;
        Objects.requireNonNull(j3);
        this.f5356b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0413a c0413a;
        J j3 = this.f5356b;
        G g3 = (G) j3.f5362f.d().get(j3.g());
        if (g3 == null) {
            return;
        }
        if (this.f5355a.x()) {
            j3.h(true);
            if (j3.f().requiresSignIn()) {
                j3.e();
                return;
            }
            try {
                j3.f().getRemoteService(null, j3.f().getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException e3) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                this.f5356b.f().disconnect("Failed to get service from broker.");
                c0413a = new C0413a(10);
            }
        } else {
            c0413a = this.f5355a;
        }
        g3.t(c0413a, null);
    }
}
