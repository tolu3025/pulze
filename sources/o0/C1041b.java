package o0;

import android.util.Log;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1041b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1041b f9963c = new C1041b("FirebaseAppCheck");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9965b = 4;

    public C1041b(String str) {
        this.f9964a = str;
    }

    private boolean a(int i3) {
        return this.f9965b <= i3 || Log.isLoggable(this.f9964a, i3);
    }

    public static C1041b f() {
        return f9963c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f9964a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f9964a, str, th);
        }
    }
}
