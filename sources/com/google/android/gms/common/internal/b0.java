package com.google.android.gms.common.internal;

import M.C0413a;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5520a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC0629d abstractC0629d, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC0629d);
        this.f5520a = abstractC0629d;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    private static final boolean b(Message message) {
        int i3 = message.what;
        return i3 == 2 || i3 == 1 || i3 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC0629d abstractC0629d = this.f5520a;
        if (abstractC0629d.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i3 = message.what;
        if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !abstractC0629d.enableLocalFallback()) || message.what == 5)) && !abstractC0629d.isConnecting()) {
            a(message);
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            abstractC0629d.zzn(new C0413a(message.arg2));
            if (abstractC0629d.zzg() && !abstractC0629d.zzo()) {
                abstractC0629d.zzd(3, null);
                return;
            }
            C0413a c0413aZzm = abstractC0629d.zzm() != null ? abstractC0629d.zzm() : new C0413a(8);
            abstractC0629d.zzc.b(c0413aZzm);
            abstractC0629d.onConnectionFailed(c0413aZzm);
            return;
        }
        if (i4 == 5) {
            C0413a c0413aZzm2 = abstractC0629d.zzm() != null ? abstractC0629d.zzm() : new C0413a(8);
            abstractC0629d.zzc.b(c0413aZzm2);
            abstractC0629d.onConnectionFailed(c0413aZzm2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            C0413a c0413a = new C0413a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC0629d.zzc.b(c0413a);
            abstractC0629d.onConnectionFailed(c0413a);
            return;
        }
        if (i4 == 6) {
            abstractC0629d.zzd(5, null);
            if (abstractC0629d.zzk() != null) {
                abstractC0629d.zzk().a(message.arg2);
            }
            abstractC0629d.onConnectionSuspended(message.arg2);
            abstractC0629d.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !abstractC0629d.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((c0) message.obj).b();
            return;
        }
        int i5 = message.what;
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
        sb.append("Don't know how to handle message: ");
        sb.append(i5);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
