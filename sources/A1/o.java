package A1;

import e0.AbstractC0829j;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List f519a = Collections.unmodifiableList(Arrays.asList(B1.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i3, B1.b bVar) throws SSLPeerUnverifiedException {
        AbstractC0829j.o(sSLSocketFactory, "sslSocketFactory");
        AbstractC0829j.o(socket, "socket");
        AbstractC0829j.o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i3, true);
        bVar.c(sSLSocket, false);
        String strH = k.e().h(sSLSocket, str, bVar.f() ? f519a : null);
        List list = f519a;
        AbstractC0829j.w(list.contains(B1.i.c(strH)), "Only " + list + " are supported, but negotiated protocol is %s", strH);
        if (hostnameVerifier == null) {
            hostnameVerifier = B1.f.f680a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
