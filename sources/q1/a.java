package Q1;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends P1.a {

    /* JADX INFO: renamed from: Q1.a$a, reason: collision with other inner class name */
    private static final class C0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0055a f2806a = new C0055a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f2807b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f2807b = num;
        }

        private C0055a() {
        }
    }

    private final boolean b(int i3) {
        Integer num = C0055a.f2807b;
        return num == null || num.intValue() >= i3;
    }

    @Override // P1.a
    public void a(Throwable cause, Throwable exception) {
        m.e(cause, "cause");
        m.e(exception, "exception");
        if (b(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
