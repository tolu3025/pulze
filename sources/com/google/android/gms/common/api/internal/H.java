package com.google.android.gms.common.api.internal;

import M.C0415c;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0602b f5353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0415c f5354b;

    /* synthetic */ H(C0602b c0602b, C0415c c0415c, byte[] bArr) {
        this.f5353a = c0602b;
        this.f5354b = c0415c;
    }

    final /* synthetic */ C0602b a() {
        return this.f5353a;
    }

    final /* synthetic */ C0415c b() {
        return this.f5354b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h3 = (H) obj;
            if (AbstractC0642q.b(this.f5353a, h3.f5353a) && AbstractC0642q.b(this.f5354b, h3.f5354b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f5353a, this.f5354b);
    }

    public final String toString() {
        return AbstractC0642q.d(this).a("key", this.f5353a).a("feature", this.f5354b).toString();
    }
}
