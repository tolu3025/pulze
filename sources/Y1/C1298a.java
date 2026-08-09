package y1;

import e0.AbstractC0826g;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1298a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap f11855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1298a f11856c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f11857a;

    /* JADX INFO: renamed from: y1.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1298a f11858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IdentityHashMap f11859b;

        private b(C1298a c1298a) {
            this.f11858a = c1298a;
        }

        private IdentityHashMap b(int i3) {
            if (this.f11859b == null) {
                this.f11859b = new IdentityHashMap(i3);
            }
            return this.f11859b;
        }

        public C1298a a() {
            if (this.f11859b != null) {
                for (Map.Entry entry : this.f11858a.f11857a.entrySet()) {
                    if (!this.f11859b.containsKey(entry.getKey())) {
                        this.f11859b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f11858a = new C1298a(this.f11859b);
                this.f11859b = null;
            }
            return this.f11858a;
        }

        public b c(c cVar) {
            if (this.f11858a.f11857a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f11858a.f11857a);
                identityHashMap.remove(cVar);
                this.f11858a = new C1298a(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f11859b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        public b d(c cVar, Object obj) {
            b(1).put(cVar, obj);
            return this;
        }
    }

    /* JADX INFO: renamed from: y1.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11860a;

        private c(String str) {
            this.f11860a = str;
        }

        public static c a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f11860a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f11855b = identityHashMap;
        f11856c = new C1298a(identityHashMap);
    }

    private C1298a(IdentityHashMap identityHashMap) {
        this.f11857a = identityHashMap;
    }

    public static b c() {
        return new b();
    }

    public Object b(c cVar) {
        return this.f11857a.get(cVar);
    }

    public b d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1298a.class != obj.getClass()) {
            return false;
        }
        C1298a c1298a = (C1298a) obj;
        if (this.f11857a.size() != c1298a.f11857a.size()) {
            return false;
        }
        for (Map.Entry entry : this.f11857a.entrySet()) {
            if (!c1298a.f11857a.containsKey(entry.getKey()) || !AbstractC0826g.a(entry.getValue(), c1298a.f11857a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iB = 0;
        for (Map.Entry entry : this.f11857a.entrySet()) {
            iB += AbstractC0826g.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public String toString() {
        return this.f11857a.toString();
    }
}
