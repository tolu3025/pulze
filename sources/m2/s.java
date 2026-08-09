package m2;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class s extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f9901o;

    public s(Socket socket) {
        kotlin.jvm.internal.m.e(socket, "socket");
        this.f9901o = socket;
    }

    @Override // m2.c
    protected IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // m2.c
    protected void x() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Throwable th;
        try {
            this.f9901o.close();
        } catch (AssertionError e3) {
            if (!i.c(e3)) {
                throw e3;
            }
            Logger logger2 = j.f9877a;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e3;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f9901o);
            logger.log(level, sb.toString(), th);
        } catch (Exception e4) {
            Logger logger3 = j.f9877a;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e4;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f9901o);
            logger.log(level, sb.toString(), th);
        }
    }
}
