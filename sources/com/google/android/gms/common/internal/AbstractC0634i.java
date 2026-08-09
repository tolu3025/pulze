package com.google.android.gms.common.internal;

import M.C0413a;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0634i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f5573a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5574b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o0 f5575c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f5576d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f5577e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f5578f = false;

    public static AbstractC0634i a(Context context) {
        synchronized (f5573a) {
            try {
                if (f5575c == null) {
                    f5575c = new o0(context.getApplicationContext(), f5578f ? b().getLooper() : context.getMainLooper(), f5577e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5575c;
    }

    public static HandlerThread b() {
        synchronized (f5573a) {
            try {
                HandlerThread handlerThread = f5576d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f5574b);
                f5576d = handlerThread2;
                handlerThread2.start();
                return f5576d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract C0413a c(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(String str, String str2, int i3, ServiceConnection serviceConnection, String str3, boolean z2) {
        e(new l0(str, str2, 4225, z2), serviceConnection, str3);
    }

    protected abstract void e(l0 l0Var, ServiceConnection serviceConnection, String str);
}
