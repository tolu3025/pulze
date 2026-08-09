package y1;

import e0.AbstractC0825f;
import java.util.Map;
import y1.S;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends S.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0.b f11829a = c0.b.a(new a());

    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public abstract c0.b e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return AbstractC0825f.b(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
