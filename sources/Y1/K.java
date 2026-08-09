package y1;

import e0.AbstractC0829j;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f11795d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11798c;

    K(String str, String str2, long j3) {
        AbstractC0829j.o(str, "typeName");
        AbstractC0829j.e(!str.isEmpty(), "empty type");
        this.f11796a = str;
        this.f11797b = str2;
        this.f11798c = j3;
    }

    public static K a(Class cls, String str) {
        return b(c(cls), str);
    }

    public static K b(String str, String str2) {
        return new K(str, str2, e());
    }

    private static String c(Class cls) {
        String simpleName = ((Class) AbstractC0829j.o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f11795d.incrementAndGet();
    }

    public long d() {
        return this.f11798c;
    }

    public String f() {
        return this.f11796a + "<" + this.f11798c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        if (this.f11797b != null) {
            sb.append(": (");
            sb.append(this.f11797b);
            sb.append(')');
        }
        return sb.toString();
    }
}
