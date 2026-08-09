package h2;

import c2.U0;

/* JADX INFO: loaded from: classes.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1.g f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f7435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U0[] f7436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7437d;

    public O(M1.g gVar, int i3) {
        this.f7434a = gVar;
        this.f7435b = new Object[i3];
        this.f7436c = new U0[i3];
    }

    public final void a(U0 u02, Object obj) {
        Object[] objArr = this.f7435b;
        int i3 = this.f7437d;
        objArr[i3] = obj;
        U0[] u0Arr = this.f7436c;
        this.f7437d = i3 + 1;
        kotlin.jvm.internal.m.c(u02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        u0Arr[i3] = u02;
    }

    public final void b(M1.g gVar) {
        int length = this.f7436c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            U0 u02 = this.f7436c[length];
            kotlin.jvm.internal.m.b(u02);
            u02.l(gVar, this.f7435b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }
}
