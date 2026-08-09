package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f5521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5523c;

    public c0(AbstractC0629d abstractC0629d, Object obj) {
        Objects.requireNonNull(abstractC0629d);
        this.f5523c = abstractC0629d;
        this.f5521a = obj;
        this.f5522b = false;
    }

    protected abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f5521a;
                if (this.f5522b) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f5522b = true;
        }
        c();
    }

    public final void c() {
        d();
        AbstractC0629d abstractC0629d = this.f5523c;
        synchronized (abstractC0629d.zzj()) {
            abstractC0629d.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f5521a = null;
        }
    }
}
