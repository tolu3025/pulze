package h2;

/* JADX INFO: renamed from: h2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895l {
    public static final void a(int i3) {
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
    }

    public static final c2.K b(c2.K k3, String str) {
        return str != null ? new v(k3, str) : k3;
    }
}
