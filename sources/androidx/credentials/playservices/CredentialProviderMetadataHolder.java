package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f3967a = new a();

    public final class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m.e(intent, "intent");
        return this.f3967a;
    }
}
