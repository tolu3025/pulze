package a2;

import J1.AbstractC0411o;
import J1.AbstractC0412p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends j {

    public static final class a implements Iterable, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3596a;

        public a(c cVar) {
            this.f3596a = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f3596a.iterator();
        }
    }

    public static Iterable g(c cVar) {
        m.e(cVar, "<this>");
        return new a(cVar);
    }

    public static c h(c cVar, U1.l transform) {
        m.e(cVar, "<this>");
        m.e(transform, "transform");
        return new l(cVar, transform);
    }

    public static List i(c cVar) {
        m.e(cVar, "<this>");
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return AbstractC0412p.h();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0411o.d(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
