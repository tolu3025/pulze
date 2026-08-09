package P1;

import J1.AbstractC0407k;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: P1.a$a, reason: collision with other inner class name */
    private static final class C0054a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0054a f2769a = new C0054a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f2770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f2771c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            m.b(methods);
            int length = methods.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                method = null;
                if (i4 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i4];
                if (m.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    m.d(parameterTypes, "getParameterTypes(...)");
                    if (m.a(AbstractC0407k.Q(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i4++;
            }
            f2770b = method2;
            int length2 = methods.length;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                Method method3 = methods[i3];
                if (m.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i3++;
            }
            f2771c = method;
        }

        private C0054a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        m.e(cause, "cause");
        m.e(exception, "exception");
        Method method = C0054a.f2770b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
