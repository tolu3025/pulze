package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC0604d;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.api.internal.r;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f5332a = Collections.newSetFromMap(new WeakHashMap());

    public interface a extends InterfaceC0606f {
    }

    public interface b extends InterfaceC0614n {
    }

    public static Set c() {
        Set set = f5332a;
        synchronized (set) {
        }
        return set;
    }

    public abstract AbstractC0604d a(AbstractC0604d abstractC0604d);

    public abstract AbstractC0604d b(AbstractC0604d abstractC0604d);

    public a.f d(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Context e();

    public abstract Looper f();

    public boolean g(r rVar) {
        throw new UnsupportedOperationException();
    }

    public void h() {
        throw new UnsupportedOperationException();
    }
}
