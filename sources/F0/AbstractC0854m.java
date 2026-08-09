package f0;

import e0.AbstractC0826g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: f0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854m {

    /* JADX INFO: renamed from: f0.m$a */
    class a extends AbstractC0867z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7216b;

        a(Object obj) {
            this.f7216b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7215a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f7215a) {
                throw new NoSuchElementException();
            }
            this.f7215a = true;
            return this.f7216b;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC0826g.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static AbstractC0867z b(Object obj) {
        return new a(obj);
    }
}
