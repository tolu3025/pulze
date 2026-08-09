package com.google.protobuf;

import c.AbstractC0527b;
import com.google.protobuf.AbstractC0806y;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0799q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6874b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C0799q f6875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C0799q f6876d = new C0799q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6877a = Collections.emptyMap();

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6879b;

        a(Object obj, int i3) {
            this.f6878a = obj;
            this.f6879b = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6878a == aVar.f6878a && this.f6879b == aVar.f6879b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f6878a) * 65535) + this.f6879b;
        }
    }

    C0799q(boolean z2) {
    }

    public static C0799q b() {
        if (!f6874b) {
            return f6876d;
        }
        C0799q c0799qA = f6875c;
        if (c0799qA == null) {
            synchronized (C0799q.class) {
                try {
                    c0799qA = f6875c;
                    if (c0799qA == null) {
                        c0799qA = AbstractC0798p.a();
                        f6875c = c0799qA;
                    }
                } finally {
                }
            }
        }
        return c0799qA;
    }

    public AbstractC0806y.c a(V v2, int i3) {
        AbstractC0527b.a(this.f6877a.get(new a(v2, i3)));
        return null;
    }
}
