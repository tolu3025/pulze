package F1;

import e0.AbstractC0832m;
import java.util.logging.Logger;
import y1.C1300c;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f1519a = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f1520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1300c.C0193c f1521c;

    enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        f1520b = !AbstractC0832m.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f1521c = C1300c.C0193c.b("internal-stub-type");
    }
}
