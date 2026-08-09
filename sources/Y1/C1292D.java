package y1;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: y1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1292D extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SocketAddress f11757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f11758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11760d;

    /* JADX INFO: renamed from: y1.D$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SocketAddress f11761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InetSocketAddress f11762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f11764d;

        private b() {
        }

        public C1292D a() {
            return new C1292D(this.f11761a, this.f11762b, this.f11763c, this.f11764d);
        }

        public b b(String str) {
            this.f11764d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f11761a = (SocketAddress) AbstractC0829j.o(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f11762b = (InetSocketAddress) AbstractC0829j.o(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f11763c = str;
            return this;
        }
    }

    private C1292D(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        AbstractC0829j.o(socketAddress, "proxyAddress");
        AbstractC0829j.o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            AbstractC0829j.w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f11757a = socketAddress;
        this.f11758b = inetSocketAddress;
        this.f11759c = str;
        this.f11760d = str2;
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f11760d;
    }

    public SocketAddress b() {
        return this.f11757a;
    }

    public InetSocketAddress c() {
        return this.f11758b;
    }

    public String d() {
        return this.f11759c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1292D)) {
            return false;
        }
        C1292D c1292d = (C1292D) obj;
        return AbstractC0826g.a(this.f11757a, c1292d.f11757a) && AbstractC0826g.a(this.f11758b, c1292d.f11758b) && AbstractC0826g.a(this.f11759c, c1292d.f11759c) && AbstractC0826g.a(this.f11760d, c1292d.f11760d);
    }

    public int hashCode() {
        return AbstractC0826g.b(this.f11757a, this.f11758b, this.f11759c, this.f11760d);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("proxyAddr", this.f11757a).d("targetAddr", this.f11758b).d("username", this.f11759c).e("hasPassword", this.f11760d != null).toString();
    }
}
