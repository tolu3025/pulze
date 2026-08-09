package P0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Random;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Random f2756f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static e f2757g = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static com.google.android.gms.common.util.d f2758h = com.google.android.gms.common.util.f.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1136b f2760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1059b f2761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f2762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f2763e;

    public c(Context context, InterfaceC1136b interfaceC1136b, InterfaceC1059b interfaceC1059b, long j3) {
        this.f2759a = context;
        this.f2760b = interfaceC1136b;
        this.f2761c = interfaceC1059b;
        this.f2762d = j3;
    }

    public void a() {
        this.f2763e = true;
    }

    public boolean b(int i3) {
        return (i3 >= 500 && i3 < 600) || i3 == -2 || i3 == 429 || i3 == 408;
    }

    public void c() {
        this.f2763e = false;
    }

    public void d(Q0.e eVar) {
        e(eVar, true);
    }

    public void e(Q0.e eVar, boolean z2) {
        AbstractC0643s.k(eVar);
        long jB = f2758h.b() + this.f2762d;
        String strC = i.c(this.f2760b);
        String strB = i.b(this.f2761c);
        if (z2) {
            eVar.B(strC, strB, this.f2759a);
        } else {
            eVar.D(strC, strB);
        }
        int i3 = 1000;
        while (f2758h.b() + ((long) i3) <= jB && !eVar.v() && b(eVar.o())) {
            try {
                f2757g.a(f2756f.nextInt(250) + i3);
                if (i3 < 30000) {
                    if (eVar.o() != -2) {
                        i3 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i3 = 1000;
                    }
                }
                if (this.f2763e) {
                    return;
                }
                eVar.F();
                String strC2 = i.c(this.f2760b);
                String strB2 = i.b(this.f2761c);
                if (z2) {
                    eVar.B(strC2, strB2, this.f2759a);
                } else {
                    eVar.D(strC2, strB2);
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
