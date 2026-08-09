package a2;

import U1.p;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f3594a;

        public a(p pVar) {
            this.f3594a = pVar;
        }

        @Override // a2.c
        public Iterator iterator() {
            return g.a(this.f3594a);
        }
    }

    public static Iterator a(p block) {
        m.e(block, "block");
        d dVar = new d();
        dVar.h(N1.c.a(block, dVar, dVar));
        return dVar;
    }

    public static c b(p block) {
        m.e(block, "block");
        return new a(block);
    }
}
