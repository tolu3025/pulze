package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final F f6460c = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6461a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6462b = new Object();

    F() {
    }

    static F b() {
        return f6460c;
    }

    public void a(E e3) {
        synchronized (this.f6462b) {
            this.f6461a.put(e3.I().toString(), new WeakReference(e3));
        }
    }

    public void c(E e3) {
        synchronized (this.f6462b) {
            try {
                String string = e3.I().toString();
                WeakReference weakReference = (WeakReference) this.f6461a.get(string);
                E e4 = weakReference != null ? (E) weakReference.get() : null;
                if (e4 == null || e4 == e3) {
                    this.f6461a.remove(string);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
