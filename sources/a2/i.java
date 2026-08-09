package a2;

import J1.AbstractC0407k;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f3595a;

        public a(Iterator it) {
            this.f3595a = it;
        }

        @Override // a2.c
        public Iterator iterator() {
            return this.f3595a;
        }
    }

    public static c c(Iterator it) {
        m.e(it, "<this>");
        return d(new a(it));
    }

    public static final c d(c cVar) {
        m.e(cVar, "<this>");
        return cVar instanceof a2.a ? cVar : new a2.a(cVar);
    }

    public static c e() {
        return b.f3589a;
    }

    public static c f(Object... elements) {
        m.e(elements, "elements");
        return AbstractC0407k.n(elements);
    }
}
