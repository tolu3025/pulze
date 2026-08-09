package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class n0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0 f5593a;

    /* synthetic */ n0(o0 o0Var, byte[] bArr) {
        Objects.requireNonNull(o0Var);
        this.f5593a = o0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            o0 o0Var = this.f5593a;
            synchronized (o0Var.f()) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) o0Var.f().get(l0Var);
                    if (m0Var != null && m0Var.g()) {
                        if (m0Var.d()) {
                            m0Var.a("GmsClientSupervisor");
                        }
                        o0Var.f().remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        o0 o0Var2 = this.f5593a;
        synchronized (o0Var2.f()) {
            try {
                l0 l0Var2 = (l0) message.obj;
                m0 m0Var2 = (m0) o0Var2.f().get(l0Var2);
                if (m0Var2 != null && m0Var2.e() == 3) {
                    String strValueOf = String.valueOf(l0Var2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentNameI = m0Var2.i();
                    if (componentNameI == null) {
                        componentNameI = l0Var2.c();
                    }
                    if (componentNameI == null) {
                        String strB = l0Var2.b();
                        AbstractC0643s.k(strB);
                        componentNameI = new ComponentName(strB, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentNameI);
                }
            } finally {
            }
        }
        return true;
    }
}
