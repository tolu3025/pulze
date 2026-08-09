package com.google.android.gms.common.internal;

import M.C0413a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements ServiceConnection, p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f5589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0 f5590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f5591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ o0 f5592g;

    public m0(o0 o0Var, l0 l0Var) {
        Objects.requireNonNull(o0Var);
        this.f5592g = o0Var;
        this.f5590e = l0Var;
        this.f5586a = new HashMap();
        this.f5587b = 2;
    }

    public final void a(String str) {
        l0 l0Var = this.f5590e;
        o0 o0Var = this.f5592g;
        o0Var.h().removeMessages(1, l0Var);
        o0Var.i().b(o0Var.g(), this);
        this.f5588c = false;
        this.f5587b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f5586a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f5586a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f5588c;
    }

    public final int e() {
        return this.f5587b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f5586a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f5586a.isEmpty();
    }

    public final IBinder h() {
        return this.f5589d;
    }

    public final ComponentName i() {
        return this.f5591f;
    }

    final /* synthetic */ C0413a j(String str, Executor executor) {
        C0413a c0413a;
        try {
            Intent intentA = a0.a(this.f5592g.g(), this.f5590e);
            this.f5587b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.u.a();
            try {
                o0 o0Var = this.f5592g;
                R.b bVarI = o0Var.i();
                Context contextG = o0Var.g();
                l0 l0Var = this.f5590e;
                boolean zC = bVarI.c(contextG, str, intentA, this, 4225, executor);
                this.f5588c = zC;
                if (zC) {
                    o0Var.h().sendMessageDelayed(o0Var.h().obtainMessage(1, l0Var), o0Var.j());
                    c0413a = C0413a.f2656f;
                } else {
                    this.f5587b = 2;
                    try {
                        o0Var.i().b(o0Var.g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    c0413a = new C0413a(16);
                }
                return c0413a;
            } finally {
                StrictMode.setVmPolicy(vmPolicyA);
            }
        } catch (Y e3) {
            return e3.f5518a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0 o0Var = this.f5592g;
        synchronized (o0Var.f()) {
            try {
                o0Var.h().removeMessages(1, this.f5590e);
                this.f5589d = iBinder;
                this.f5591f = componentName;
                Iterator it = this.f5586a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f5587b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0 o0Var = this.f5592g;
        synchronized (o0Var.f()) {
            try {
                o0Var.h().removeMessages(1, this.f5590e);
                this.f5589d = null;
                this.f5591f = componentName;
                Iterator it = this.f5586a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f5587b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
