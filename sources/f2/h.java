package f2;

import g2.k;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class h {
    public static final b a(b bVar, int i3, e2.a aVar) {
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i3).toString());
        }
        if (i3 == -1 && aVar != e2.a.f7117a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i3 == -1) {
            aVar = e2.a.f7118b;
            i3 = 0;
        }
        int i4 = i3;
        e2.a aVar2 = aVar;
        if (bVar instanceof g2.k) {
            return k.a.a((g2.k) bVar, null, i4, aVar2, 1, null);
        }
        return new g2.h(bVar, null, i4, aVar2, 2, null);
    }

    public static /* synthetic */ b b(b bVar, int i3, e2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i3 = -2;
        }
        if ((i4 & 2) != 0) {
            aVar = e2.a.f7117a;
        }
        return d.a(bVar, i3, aVar);
    }

    public static final b c(b bVar) {
        return b(bVar, -1, null, 2, null);
    }
}
