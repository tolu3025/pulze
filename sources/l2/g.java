package l2;

import h2.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f9809a = new D("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f9810b = new D("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z2) {
        return new f(z2);
    }

    public static /* synthetic */ a b(boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        return a(z2);
    }
}
