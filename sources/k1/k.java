package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.Locale;
import l1.C1015a;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f9507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1015a f9510d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9511a;

        static {
            int[] iArr = new int[b.values().length];
            f9511a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9511a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9511a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9511a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9511a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public k(C0543a c0543a) {
        this(new C1015a(c0543a, "flutter/lifecycle", l1.q.f9796b));
    }

    private void g(b bVar, boolean z2) {
        b bVar2 = this.f9507a;
        if (bVar2 == bVar && z2 == this.f9509c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f9509c = z2;
            return;
        }
        int i3 = a.f9511a[bVar.ordinal()];
        b bVar3 = i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? bVar : null : z2 ? b.RESUMED : b.INACTIVE;
        this.f9507a = bVar;
        this.f9509c = z2;
        if (bVar3 == this.f9508b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        AbstractC0525b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f9510d.c(str);
        this.f9508b = bVar3;
    }

    public void a() {
        g(this.f9507a, true);
    }

    public void b() {
        g(b.DETACHED, this.f9509c);
    }

    public void c() {
        g(b.INACTIVE, this.f9509c);
    }

    public void d() {
        g(b.PAUSED, this.f9509c);
    }

    public void e() {
        g(b.RESUMED, this.f9509c);
    }

    public void f() {
        g(this.f9507a, false);
    }

    public k(C1015a c1015a) {
        this.f9507a = null;
        this.f9508b = null;
        this.f9509c = true;
        this.f9510d = c1015a;
    }
}
