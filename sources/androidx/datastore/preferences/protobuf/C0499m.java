package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0505t;
import c.AbstractC0527b;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0499m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C0499m f4187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C0499m f4188c = new C0499m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4189a = Collections.emptyMap();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4191b;

        a(Object obj, int i3) {
            this.f4190a = obj;
            this.f4191b = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4190a == aVar.f4190a && this.f4191b == aVar.f4191b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4190a) * 65535) + this.f4191b;
        }
    }

    C0499m(boolean z2) {
    }

    public static C0499m b() {
        if (U.f4028d) {
            return f4188c;
        }
        C0499m c0499mA = f4187b;
        if (c0499mA == null) {
            synchronized (C0499m.class) {
                try {
                    c0499mA = f4187b;
                    if (c0499mA == null) {
                        c0499mA = AbstractC0498l.a();
                        f4187b = c0499mA;
                    }
                } finally {
                }
            }
        }
        return c0499mA;
    }

    public AbstractC0505t.c a(J j3, int i3) {
        AbstractC0527b.a(this.f4189a.get(new a(j3, i3)));
        return null;
    }
}
