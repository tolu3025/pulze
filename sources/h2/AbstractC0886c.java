package h2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: h2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0886c {
    public static final Object a(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final void b(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
    }
}
