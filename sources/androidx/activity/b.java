package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3668e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f3669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f3670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f3671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3672d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public b(float f3, float f4, float f5, int i3) {
        this.f3669a = f3;
        this.f3670b = f4;
        this.f3671c = f5;
        this.f3672d = i3;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f3669a + ", touchY=" + this.f3670b + ", progress=" + this.f3671c + ", swipeEdge=" + this.f3672d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.f3667a;
        this(aVar.d(backEvent), aVar.e(backEvent), aVar.b(backEvent), aVar.c(backEvent));
    }
}
