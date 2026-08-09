package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import y1.EnumC1313p;

/* JADX INFO: renamed from: io.grpc.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0976x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f9362a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile EnumC1313p f9363b = EnumC1313p.IDLE;

    /* JADX INFO: renamed from: io.grpc.internal.x$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f9364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f9365b;

        a(Runnable runnable, Executor executor) {
            this.f9364a = runnable;
            this.f9365b = executor;
        }

        void a() {
            this.f9365b.execute(this.f9364a);
        }
    }

    C0976x() {
    }

    EnumC1313p a() {
        EnumC1313p enumC1313p = this.f9363b;
        if (enumC1313p != null) {
            return enumC1313p;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void b(EnumC1313p enumC1313p) {
        AbstractC0829j.o(enumC1313p, "newState");
        if (this.f9363b == enumC1313p || this.f9363b == EnumC1313p.SHUTDOWN) {
            return;
        }
        this.f9363b = enumC1313p;
        if (this.f9362a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f9362a;
        this.f9362a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void c(Runnable runnable, Executor executor, EnumC1313p enumC1313p) {
        AbstractC0829j.o(runnable, "callback");
        AbstractC0829j.o(executor, "executor");
        AbstractC0829j.o(enumC1313p, "source");
        a aVar = new a(runnable, executor);
        if (this.f9363b != enumC1313p) {
            aVar.a();
        } else {
            this.f9362a.add(aVar);
        }
    }
}
