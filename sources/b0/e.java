package B0;

import D0.l;
import J0.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Comparable {
    public static e e(int i3, l lVar, byte[] bArr, byte[] bArr2) {
        return new a(i3, lVar, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int iCompare = Integer.compare(j(), eVar.j());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = i().compareTo(eVar.i());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iG = L.g(g(), eVar.g());
        return iG != 0 ? iG : L.g(h(), eVar.h());
    }

    public abstract byte[] g();

    public abstract byte[] h();

    public abstract l i();

    public abstract int j();
}
