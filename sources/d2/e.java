package d2;

import I1.u;
import U1.l;
import Y1.i;
import android.os.Handler;
import android.os.Looper;
import c2.C0;
import c2.C0557d0;
import c2.InterfaceC0561f0;
import c2.InterfaceC0576n;
import c2.L0;
import c2.X;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f7039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f7042f;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0576n f7043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f7044b;

        public a(InterfaceC0576n interfaceC0576n, e eVar) {
            this.f7043a = interfaceC0576n;
            this.f7044b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7043a.k(this.f7044b, u.f2419a);
        }
    }

    public e(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void c0(M1.g gVar, Runnable runnable) {
        C0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0557d0.b().U(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(e eVar, Runnable runnable) {
        eVar.f7039c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u f0(e eVar, Runnable runnable, Throwable th) {
        eVar.f7039c.removeCallbacks(runnable);
        return u.f2419a;
    }

    @Override // c2.X
    public void L(long j3, InterfaceC0576n interfaceC0576n) {
        final a aVar = new a(interfaceC0576n, this);
        if (this.f7039c.postDelayed(aVar, i.d(j3, 4611686018427387903L))) {
            interfaceC0576n.c(new l() { // from class: d2.d
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return e.f0(this.f7037a, aVar, (Throwable) obj);
                }
            });
        } else {
            c0(interfaceC0576n.getContext(), aVar);
        }
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        if (this.f7039c.post(runnable)) {
            return;
        }
        c0(gVar, runnable);
    }

    @Override // c2.K
    public boolean V(M1.g gVar) {
        return (this.f7041e && m.a(Looper.myLooper(), this.f7039c.getLooper())) ? false : true;
    }

    @Override // c2.X
    public InterfaceC0561f0 b(long j3, final Runnable runnable, M1.g gVar) {
        if (this.f7039c.postDelayed(runnable, i.d(j3, 4611686018427387903L))) {
            return new InterfaceC0561f0() { // from class: d2.c
                @Override // c2.InterfaceC0561f0
                public final void e() {
                    e.e0(this.f7035a, runnable);
                }
            };
        }
        c0(gVar, runnable);
        return L0.f5094a;
    }

    @Override // c2.J0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public e Y() {
        return this.f7042f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f7039c == this.f7039c && eVar.f7041e == this.f7041e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7039c) ^ (this.f7041e ? 1231 : 1237);
    }

    @Override // c2.K
    public String toString() {
        String strZ = Z();
        if (strZ != null) {
            return strZ;
        }
        String string = this.f7040d;
        if (string == null) {
            string = this.f7039c.toString();
        }
        if (!this.f7041e) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ e(Handler handler, String str, int i3, h hVar) {
        this(handler, (i3 & 2) != 0 ? null : str);
    }

    private e(Handler handler, String str, boolean z2) {
        super(null);
        this.f7039c = handler;
        this.f7040d = str;
        this.f7041e = z2;
        this.f7042f = z2 ? this : new e(handler, str, true);
    }
}
