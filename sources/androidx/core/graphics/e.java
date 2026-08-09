package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f3882e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3886d;

    static class a {
        static Insets a(int i3, int i4, int i5, int i6) {
            return Insets.of(i3, i4, i5, i6);
        }
    }

    private e(int i3, int i4, int i5, int i6) {
        this.f3883a = i3;
        this.f3884b = i4;
        this.f3885c = i5;
        this.f3886d = i6;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f3883a, eVar2.f3883a), Math.max(eVar.f3884b, eVar2.f3884b), Math.max(eVar.f3885c, eVar2.f3885c), Math.max(eVar.f3886d, eVar2.f3886d));
    }

    public static e b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f3882e : new e(i3, i4, i5, i6);
    }

    public static e c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f3883a, this.f3884b, this.f3885c, this.f3886d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3886d == eVar.f3886d && this.f3883a == eVar.f3883a && this.f3885c == eVar.f3885c && this.f3884b == eVar.f3884b;
    }

    public int hashCode() {
        return (((((this.f3883a * 31) + this.f3884b) * 31) + this.f3885c) * 31) + this.f3886d;
    }

    public String toString() {
        return "Insets{left=" + this.f3883a + ", top=" + this.f3884b + ", right=" + this.f3885c + ", bottom=" + this.f3886d + '}';
    }
}
