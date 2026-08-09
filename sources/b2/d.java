package b2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class d implements a2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U1.p f4961d;

    public static final class a implements Iterator, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4962a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Y1.f f4965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4966e;

        a() {
            int iE = Y1.i.e(d.this.f4959b, 0, d.this.f4958a.length());
            this.f4963b = iE;
            this.f4964c = iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f4964c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f4962a = r1
                r0 = 0
                r6.f4965d = r0
                goto L99
            Lc:
                b2.d r0 = b2.d.this
                int r0 = b2.d.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f4966e
                int r0 = r0 + r3
                r6.f4966e = r0
                b2.d r4 = b2.d.this
                int r4 = b2.d.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f4964c
                b2.d r4 = b2.d.this
                java.lang.CharSequence r4 = b2.d.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                Y1.f r0 = new Y1.f
                int r1 = r6.f4963b
                b2.d r4 = b2.d.this
                java.lang.CharSequence r4 = b2.d.b(r4)
                int r4 = b2.p.u(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f4965d = r0
            L44:
                r6.f4964c = r2
                goto L97
            L47:
                b2.d r0 = b2.d.this
                U1.p r0 = b2.d.a(r0)
                b2.d r4 = b2.d.this
                java.lang.CharSequence r4 = b2.d.b(r4)
                int r5 = r6.f4964c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                I1.m r0 = (I1.m) r0
                if (r0 != 0) goto L73
                Y1.f r0 = new Y1.f
                int r1 = r6.f4963b
                b2.d r4 = b2.d.this
                java.lang.CharSequence r4 = b2.d.b(r4)
                int r4 = b2.p.u(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f4963b
                Y1.f r4 = Y1.g.g(r4, r2)
                r6.f4965d = r4
                int r2 = r2 + r0
                r6.f4963b = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f4962a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.d.a.b():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Y1.f next() {
            if (this.f4962a == -1) {
                b();
            }
            if (this.f4962a == 0) {
                throw new NoSuchElementException();
            }
            Y1.f fVar = this.f4965d;
            kotlin.jvm.internal.m.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f4965d = null;
            this.f4962a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4962a == -1) {
                b();
            }
            return this.f4962a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence input, int i3, int i4, U1.p getNextMatch) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(getNextMatch, "getNextMatch");
        this.f4958a = input;
        this.f4959b = i3;
        this.f4960c = i4;
        this.f4961d = getNextMatch;
    }

    @Override // a2.c
    public Iterator iterator() {
        return new a();
    }
}
