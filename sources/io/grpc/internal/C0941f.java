package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.C0956m0;
import io.grpc.internal.R0;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: io.grpc.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0941f implements C0956m0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f8900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0956m0.b f8901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f8902c = new ArrayDeque();

    /* JADX INFO: renamed from: io.grpc.internal.f$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8903a;

        a(int i3) {
            this.f8903a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0941f.this.f8901b.f(this.f8903a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8905a;

        b(boolean z2) {
            this.f8905a = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0941f.this.f8901b.e(this.f8905a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f8907a;

        c(Throwable th) {
            this.f8907a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0941f.this.f8901b.b(this.f8907a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.f$d */
    public interface d {
        void c(Runnable runnable);
    }

    public C0941f(C0956m0.b bVar, d dVar) {
        this.f8901b = (C0956m0.b) AbstractC0829j.o(bVar, "listener");
        this.f8900a = (d) AbstractC0829j.o(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.C0956m0.b
    public void a(R0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f8902c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.C0956m0.b
    public void b(Throwable th) {
        this.f8900a.c(new c(th));
    }

    public InputStream d() {
        return (InputStream) this.f8902c.poll();
    }

    @Override // io.grpc.internal.C0956m0.b
    public void e(boolean z2) {
        this.f8900a.c(new b(z2));
    }

    @Override // io.grpc.internal.C0956m0.b
    public void f(int i3) {
        this.f8900a.c(new a(i3));
    }
}
