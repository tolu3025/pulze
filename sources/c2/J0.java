package c2;

import h2.AbstractC0895l;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 extends K {
    @Override // c2.K
    public K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return AbstractC0895l.b(this, str);
    }

    public abstract J0 Y();

    protected final String Z() {
        J0 j0Y;
        J0 j0C = C0557d0.c();
        if (this == j0C) {
            return "Dispatchers.Main";
        }
        try {
            j0Y = j0C.Y();
        } catch (UnsupportedOperationException unused) {
            j0Y = null;
        }
        if (this == j0Y) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
