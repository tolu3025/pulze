package m2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f9877a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        String message;
        kotlin.jvm.internal.m.e(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !b2.p.s(message, "getsockname failed", false, 2, null)) ? false : true;
    }

    public static final r c(Socket socket) throws IOException {
        kotlin.jvm.internal.m.e(socket, "<this>");
        s sVar = new s(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.m.d(outputStream, "getOutputStream()");
        return sVar.v(new l(outputStream, sVar));
    }

    public static final t d(Socket socket) throws IOException {
        kotlin.jvm.internal.m.e(socket, "<this>");
        s sVar = new s(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.m.d(inputStream, "getInputStream()");
        return sVar.w(new h(inputStream, sVar));
    }
}
