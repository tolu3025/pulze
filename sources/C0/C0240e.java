package C0;

import java.util.Comparator;

/* JADX INFO: renamed from: C0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0240e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Comparator f953c = new Comparator() { // from class: C0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C0240e.e((C0240e) obj, (C0240e) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Comparator f954d = new Comparator() { // from class: C0.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C0240e.f((C0240e) obj, (C0240e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.l f955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f956b;

    public C0240e(D0.l lVar, int i3) {
        this.f955a = lVar;
        this.f956b = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(C0240e c0240e, C0240e c0240e2) {
        int iCompareTo = c0240e.f955a.compareTo(c0240e2.f955a);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(c0240e.f956b, c0240e2.f956b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(C0240e c0240e, C0240e c0240e2) {
        int iCompare = Integer.compare(c0240e.f956b, c0240e2.f956b);
        return iCompare != 0 ? iCompare : c0240e.f955a.compareTo(c0240e2.f955a);
    }

    int c() {
        return this.f956b;
    }

    D0.l d() {
        return this.f955a;
    }
}
