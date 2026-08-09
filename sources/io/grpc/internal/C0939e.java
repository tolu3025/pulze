package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.C0941f;
import io.grpc.internal.C0956m0;
import io.grpc.internal.R0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import y1.InterfaceC1317u;

/* JADX INFO: renamed from: io.grpc.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0939e implements InterfaceC0979z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0956m0.b f8882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0941f f8883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0956m0 f8884c;

    /* JADX INFO: renamed from: io.grpc.internal.e$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8885a;

        a(int i3) {
            this.f8885a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0939e.this.f8884c.B()) {
                return;
            }
            try {
                C0939e.this.f8884c.b(this.f8885a);
            } catch (Throwable th) {
                C0939e.this.f8883b.b(th);
                C0939e.this.f8884c.close();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f8887a;

        b(z0 z0Var) {
            this.f8887a = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0939e.this.f8884c.q(this.f8887a);
            } catch (Throwable th) {
                C0939e.this.f8883b.b(th);
                C0939e.this.f8884c.close();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$c */
    class c implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f8889a;

        c(z0 z0Var) {
            this.f8889a = z0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8889a.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0939e.this.f8884c.l();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$e, reason: collision with other inner class name */
    class RunnableC0138e implements Runnable {
        RunnableC0138e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0939e.this.f8884c.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$f */
    private class f extends g implements Closeable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Closeable f8893d;

        public f(Runnable runnable, Closeable closeable) {
            super(C0939e.this, runnable, null);
            this.f8893d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f8893d.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$g */
    private class g implements R0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f8895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8896b;

        private g(Runnable runnable) {
            this.f8896b = false;
            this.f8895a = runnable;
        }

        private void b() {
            if (this.f8896b) {
                return;
            }
            this.f8895a.run();
            this.f8896b = true;
        }

        @Override // io.grpc.internal.R0.a
        public InputStream next() {
            b();
            return C0939e.this.f8883b.d();
        }

        /* synthetic */ g(C0939e c0939e, Runnable runnable, a aVar) {
            this(runnable);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$h */
    interface h extends C0941f.d {
    }

    C0939e(C0956m0.b bVar, h hVar, C0956m0 c0956m0) {
        O0 o02 = new O0((C0956m0.b) AbstractC0829j.o(bVar, "listener"));
        this.f8882a = o02;
        C0941f c0941f = new C0941f(o02, hVar);
        this.f8883b = c0941f;
        c0956m0.W(c0941f);
        this.f8884c = c0956m0;
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void b(int i3) {
        this.f8882a.a(new g(this, new a(i3), null));
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void c(int i3) {
        this.f8884c.c(i3);
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void close() {
        this.f8884c.X();
        this.f8882a.a(new g(this, new RunnableC0138e(), null));
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void f(InterfaceC1317u interfaceC1317u) {
        this.f8884c.f(interfaceC1317u);
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void l() {
        this.f8882a.a(new g(this, new d(), null));
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void q(z0 z0Var) {
        this.f8882a.a(new f(new b(z0Var), new c(z0Var)));
    }
}
