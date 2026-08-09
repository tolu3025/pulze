package io.grpc.internal;

import e0.AbstractC0826g;
import e0.AbstractC0829j;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import y1.AbstractC1303f;
import y1.C1292D;
import y1.C1298a;

/* JADX INFO: renamed from: io.grpc.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0970u extends Closeable {

    /* JADX INFO: renamed from: io.grpc.internal.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9330a = "unknown-authority";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C1298a f9331b = C1298a.f11856c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C1292D f9333d;

        public String a() {
            return this.f9330a;
        }

        public C1298a b() {
            return this.f9331b;
        }

        public C1292D c() {
            return this.f9333d;
        }

        public String d() {
            return this.f9332c;
        }

        public a e(String str) {
            this.f9330a = (String) AbstractC0829j.o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9330a.equals(aVar.f9330a) && this.f9331b.equals(aVar.f9331b) && AbstractC0826g.a(this.f9332c, aVar.f9332c) && AbstractC0826g.a(this.f9333d, aVar.f9333d);
        }

        public a f(C1298a c1298a) {
            AbstractC0829j.o(c1298a, "eagAttributes");
            this.f9331b = c1298a;
            return this;
        }

        public a g(C1292D c1292d) {
            this.f9333d = c1292d;
            return this;
        }

        public a h(String str) {
            this.f9332c = str;
            return this;
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f9330a, this.f9331b, this.f9332c, this.f9333d);
        }
    }

    ScheduledExecutorService F();

    InterfaceC0974w H(SocketAddress socketAddress, a aVar, AbstractC1303f abstractC1303f);

    Collection Q();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
