package A0;

import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f225b;

    m0(int i3, int i4) {
        AbstractC0386b.d((i3 & 1) == i3, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i3), 1);
        this.f225b = i3;
        d(i4);
    }

    public static m0 a() {
        return new m0(1, 1);
    }

    public static m0 b(int i3) {
        m0 m0Var = new m0(0, i3);
        m0Var.c();
        return m0Var;
    }

    private void d(int i3) {
        AbstractC0386b.d((i3 & 1) == this.f225b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f224a = i3;
    }

    public int c() {
        int i3 = this.f224a;
        this.f224a = i3 + 2;
        return i3;
    }
}
