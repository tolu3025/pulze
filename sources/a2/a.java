package a2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f3588a;

    public a(c sequence) {
        m.e(sequence, "sequence");
        this.f3588a = new AtomicReference(sequence);
    }

    @Override // a2.c
    public Iterator iterator() {
        c cVar = (c) this.f3588a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
