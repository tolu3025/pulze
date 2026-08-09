package y1;

import e0.AbstractC0829j;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: y1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1293E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f11765f = Logger.getLogger(C1293E.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1293E f11766g = new C1293E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap f11767a = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentNavigableMap f11768b = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f11769c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f11770d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentMap f11771e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: y1.E$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f11772a;

        public b(c cVar) {
            this.f11772a = (c) AbstractC0829j.n(cVar);
        }
    }

    /* JADX INFO: renamed from: y1.E$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Certificate f11774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Certificate f11775c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e3) {
                C1293E.f11765f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e3);
            }
            this.f11773a = cipherSuite;
            this.f11774b = certificate2;
            this.f11775c = certificate;
        }
    }

    private static void b(Map map, J j3) {
    }

    public static long f(P p2) {
        return p2.g().d();
    }

    public static C1293E g() {
        return f11766g;
    }

    private static void h(Map map, J j3) {
    }

    public void c(J j3) {
        b(this.f11770d, j3);
    }

    public void d(J j3) {
        b(this.f11768b, j3);
    }

    public void e(J j3) {
        b(this.f11769c, j3);
    }

    public void i(J j3) {
        h(this.f11770d, j3);
    }

    public void j(J j3) {
        h(this.f11768b, j3);
    }

    public void k(J j3) {
        h(this.f11769c, j3);
    }
}
