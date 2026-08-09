package a2;

import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U1.l f3598b;

    public static final class a implements Iterator, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3599a;

        a() {
            this.f3599a = l.this.f3597a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3599a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return l.this.f3598b.invoke(this.f3599a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(c sequence, U1.l transformer) {
        m.e(sequence, "sequence");
        m.e(transformer, "transformer");
        this.f3597a = sequence;
        this.f3598b = transformer;
    }

    @Override // a2.c
    public Iterator iterator() {
        return new a();
    }
}
