package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8758a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f8758a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f8758a.isEmpty();
    }

    public final void e(Object obj, boolean z2) {
        int size = this.f8758a.size();
        if (z2) {
            this.f8758a.add(obj);
            if (size == 0) {
                b();
                return;
            }
            return;
        }
        if (this.f8758a.remove(obj) && size == 1) {
            c();
        }
    }
}
