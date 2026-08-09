package com.google.firebase.firestore;

import A0.C0213k;
import A0.C0218p;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.firestore.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0764z {

    /* JADX INFO: renamed from: com.google.firebase.firestore.z$a */
    static class a extends AbstractC0764z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f6428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0213k.a f6429b;

        public a(List list, C0213k.a aVar) {
            this.f6428a = list;
            this.f6429b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6429b == aVar.f6429b && Objects.equals(this.f6428a, aVar.f6428a);
        }

        public int hashCode() {
            List list = this.f6428a;
            int iHashCode = (list != null ? list.hashCode() : 0) * 31;
            C0213k.a aVar = this.f6429b;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public List m() {
            return this.f6428a;
        }

        public C0213k.a n() {
            return this.f6429b;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.z$b */
    static class b extends AbstractC0764z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0760x f6430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0218p.b f6431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f6432c;

        public b(C0760x c0760x, C0218p.b bVar, Object obj) {
            this.f6430a = c0760x;
            this.f6431b = bVar;
            this.f6432c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6431b == bVar.f6431b && Objects.equals(this.f6430a, bVar.f6430a) && Objects.equals(this.f6432c, bVar.f6432c);
        }

        public int hashCode() {
            C0760x c0760x = this.f6430a;
            int iHashCode = (c0760x != null ? c0760x.hashCode() : 0) * 31;
            C0218p.b bVar = this.f6431b;
            int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            Object obj = this.f6432c;
            return iHashCode2 + (obj != null ? obj.hashCode() : 0);
        }

        public C0760x m() {
            return this.f6430a;
        }

        public C0218p.b n() {
            return this.f6431b;
        }

        public Object o() {
            return this.f6432c;
        }
    }

    public static AbstractC0764z a(AbstractC0764z... abstractC0764zArr) {
        return new a(Arrays.asList(abstractC0764zArr), C0213k.a.AND);
    }

    public static AbstractC0764z b(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.ARRAY_CONTAINS, obj);
    }

    public static AbstractC0764z c(C0760x c0760x, List list) {
        return new b(c0760x, C0218p.b.ARRAY_CONTAINS_ANY, list);
    }

    public static AbstractC0764z d(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.EQUAL, obj);
    }

    public static AbstractC0764z e(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.GREATER_THAN, obj);
    }

    public static AbstractC0764z f(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.GREATER_THAN_OR_EQUAL, obj);
    }

    public static AbstractC0764z g(C0760x c0760x, List list) {
        return new b(c0760x, C0218p.b.IN, list);
    }

    public static AbstractC0764z h(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.LESS_THAN, obj);
    }

    public static AbstractC0764z i(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.LESS_THAN_OR_EQUAL, obj);
    }

    public static AbstractC0764z j(C0760x c0760x, Object obj) {
        return new b(c0760x, C0218p.b.NOT_EQUAL, obj);
    }

    public static AbstractC0764z k(C0760x c0760x, List list) {
        return new b(c0760x, C0218p.b.NOT_IN, list);
    }

    public static AbstractC0764z l(AbstractC0764z... abstractC0764zArr) {
        return new a(Arrays.asList(abstractC0764zArr), C0213k.a.OR);
    }
}
