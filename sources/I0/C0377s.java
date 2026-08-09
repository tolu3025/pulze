package I0;

import V0.C0428g;

/* JADX INFO: renamed from: I0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0428g f2358b;

    public C0377s(int i3, C0428g c0428g) {
        this.f2357a = i3;
        this.f2358b = c0428g;
    }

    public int a() {
        return this.f2357a;
    }

    public C0428g b() {
        return this.f2358b;
    }

    public String toString() {
        return "ExistenceFilter{count=" + this.f2357a + ", unchangedNames=" + this.f2358b + '}';
    }
}
