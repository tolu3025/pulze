package io.grpc.internal;

import e0.AbstractC0829j;
import e0.InterfaceC0833n;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.C1292D;

/* JADX INFO: renamed from: io.grpc.internal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0977x0 implements y1.h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f9366d = Logger.getLogger(C0977x0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f9367e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final InterfaceC0833n f9368f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0833n f9369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f9370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f9371c;

    /* JADX INFO: renamed from: io.grpc.internal.x0$a */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.C0977x0.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i3, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i3, "");
            } catch (MalformedURLException unused) {
                C0977x0.f9366d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i3, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.x0$b */
    class b implements InterfaceC0833n {
        b() {
        }

        @Override // e0.InterfaceC0833n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.x0$c */
    interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i3, String str2, String str3, String str4);
    }

    public C0977x0() {
        this(f9368f, f9367e, System.getenv("GRPC_PROXY_EXP"));
    }

    private y1.g0 c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, S.i(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f9369a.get();
                if (proxySelector == null) {
                    f9366d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    f9366d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationA = this.f9370b.a(S.i(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C1292D.b bVarC = C1292D.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (passwordAuthenticationA == null) {
                    return bVarC.a();
                }
                return bVarC.e(passwordAuthenticationA.getUserName()).b(passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null).a();
            } catch (URISyntaxException e3) {
                f9366d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e3);
                return null;
            }
        } catch (Throwable th) {
            f9366d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":", 2);
        int i3 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f9366d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i3);
    }

    @Override // y1.h0
    public y1.g0 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f9371c != null ? C1292D.e().c(this.f9371c).d((InetSocketAddress) socketAddress).a() : c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    C0977x0(InterfaceC0833n interfaceC0833n, c cVar, String str) {
        this.f9369a = (InterfaceC0833n) AbstractC0829j.n(interfaceC0833n);
        this.f9370b = (c) AbstractC0829j.n(cVar);
        this.f9371c = str != null ? d(str) : null;
    }
}
