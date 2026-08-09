package com.google.android.gms.common.internal;

import M.C0413a;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class o0 extends AbstractC0634i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f5597g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f5598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Handler f5599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f5600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final R.b f5601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f5602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f5603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Executor f5604n;

    o0(Context context, Looper looper, Executor executor) {
        n0 n0Var = new n0(this, null);
        this.f5600j = n0Var;
        this.f5598h = context.getApplicationContext();
        this.f5599i = new zzg(looper, n0Var);
        this.f5601k = R.b.a();
        this.f5602l = 5000L;
        this.f5603m = 300000L;
        this.f5604n = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0634i
    protected final C0413a c(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C0413a c0413aJ;
        AbstractC0643s.l(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f5597g;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (executor == null) {
                    executor = this.f5604n;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.b(serviceConnection, serviceConnection, str);
                    c0413aJ = m0Var.j(str, executor);
                    map.put(l0Var, m0Var);
                } else {
                    this.f5599i.removeMessages(0, l0Var);
                    if (m0Var.f(serviceConnection)) {
                        String string = l0Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    m0Var.b(serviceConnection, serviceConnection, str);
                    int iE = m0Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(m0Var.i(), m0Var.h());
                    } else if (iE == 2) {
                        c0413aJ = m0Var.j(str, executor);
                    }
                    c0413aJ = null;
                }
                if (m0Var.d()) {
                    return C0413a.f2656f;
                }
                if (c0413aJ == null) {
                    c0413aJ = new C0413a(-1);
                }
                return c0413aJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0634i
    protected final void e(l0 l0Var, ServiceConnection serviceConnection, String str) {
        AbstractC0643s.l(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f5597g;
        synchronized (map) {
            try {
                m0 m0Var = (m0) map.get(l0Var);
                if (m0Var == null) {
                    String string = l0Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!m0Var.f(serviceConnection)) {
                    String string2 = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                m0Var.c(serviceConnection, str);
                if (m0Var.g()) {
                    this.f5599i.sendMessageDelayed(this.f5599i.obtainMessage(0, l0Var), this.f5602l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ HashMap f() {
        return this.f5597g;
    }

    final /* synthetic */ Context g() {
        return this.f5598h;
    }

    final /* synthetic */ Handler h() {
        return this.f5599i;
    }

    final /* synthetic */ R.b i() {
        return this.f5601k;
    }

    final /* synthetic */ long j() {
        return this.f5603m;
    }
}
