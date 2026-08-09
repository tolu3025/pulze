package e2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i3, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }
}
