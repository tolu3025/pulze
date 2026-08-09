package e0;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: e0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0828i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f7076a = Logger.getLogger(AbstractC0828i.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC0827h f7077b = b();

    /* JADX INFO: renamed from: e0.i$b */
    private static final class b implements InterfaceC0827h {
        private b() {
        }
    }

    static String a(double d3) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d3));
    }

    private static InterfaceC0827h b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
