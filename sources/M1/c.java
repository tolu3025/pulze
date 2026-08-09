package M1;

import M1.g;
import U1.p;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f2701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.b f2702b;

    static final class a extends n implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2703a = new a();

        a() {
            super(2);
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            m.e(acc, "acc");
            m.e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        m.e(left, "left");
        m.e(element, "element");
        this.f2701a = left;
        this.f2702b = element;
    }

    private final boolean a(g.b bVar) {
        return m.a(get(bVar.getKey()), bVar);
    }

    private final boolean b(c cVar) {
        while (a(cVar.f2702b)) {
            g gVar = cVar.f2701a;
            if (!(gVar instanceof c)) {
                m.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int c() {
        int i3 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f2701a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i3;
            }
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.c() != c() || !cVar.b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // M1.g
    public Object fold(Object obj, p operation) {
        m.e(operation, "operation");
        return operation.invoke(this.f2701a.fold(obj, operation), this.f2702b);
    }

    @Override // M1.g
    public g.b get(g.c key) {
        m.e(key, "key");
        c cVar = this;
        while (true) {
            g.b bVar = cVar.f2702b.get(key);
            if (bVar != null) {
                return bVar;
            }
            g gVar = cVar.f2701a;
            if (!(gVar instanceof c)) {
                return gVar.get(key);
            }
            cVar = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f2701a.hashCode() + this.f2702b.hashCode();
    }

    @Override // M1.g
    public g minusKey(g.c key) {
        m.e(key, "key");
        if (this.f2702b.get(key) != null) {
            return this.f2701a;
        }
        g gVarMinusKey = this.f2701a.minusKey(key);
        return gVarMinusKey == this.f2701a ? this : gVarMinusKey == h.f2707a ? this.f2702b : new c(gVarMinusKey, this.f2702b);
    }

    @Override // M1.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f2703a)) + ']';
    }
}
