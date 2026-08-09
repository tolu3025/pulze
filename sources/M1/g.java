package M1;

import M1.e;
import U1.p;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: M1.g$a$a, reason: collision with other inner class name */
        static final class C0051a extends n implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0051a f2706a = new C0051a();

            C0051a() {
                super(2);
            }

            @Override // U1.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                M1.c cVar;
                m.e(acc, "acc");
                m.e(element, "element");
                g gVarMinusKey = acc.minusKey(element.getKey());
                h hVar = h.f2707a;
                if (gVarMinusKey == hVar) {
                    return element;
                }
                e.b bVar = e.f2704g;
                e eVar = (e) gVarMinusKey.get(bVar);
                if (eVar == null) {
                    cVar = new M1.c(gVarMinusKey, element);
                } else {
                    g gVarMinusKey2 = gVarMinusKey.minusKey(bVar);
                    if (gVarMinusKey2 == hVar) {
                        return new M1.c(element, eVar);
                    }
                    cVar = new M1.c(new M1.c(gVarMinusKey2, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            m.e(context, "context");
            return context == h.f2707a ? gVar : (g) context.fold(gVar, C0051a.f2706a);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                m.e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                m.e(key, "key");
                if (!m.a(bVar.getKey(), key)) {
                    return null;
                }
                m.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c key) {
                m.e(key, "key");
                return m.a(bVar.getKey(), key) ? h.f2707a : bVar;
            }

            public static g d(b bVar, g context) {
                m.e(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // M1.g
        Object fold(Object obj, p pVar);

        @Override // M1.g
        b get(c cVar);

        c getKey();

        @Override // M1.g
        g minusKey(c cVar);
    }

    public interface c {
    }

    Object fold(Object obj, p pVar);

    b get(c cVar);

    g minusKey(c cVar);

    g plus(g gVar);
}
