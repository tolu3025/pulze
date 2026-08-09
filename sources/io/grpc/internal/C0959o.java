package io.grpc.internal;

import e0.AbstractC0829j;
import java.text.MessageFormat;
import java.util.logging.Level;
import y1.AbstractC1303f;
import y1.C1294F;

/* JADX INFO: renamed from: io.grpc.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0959o extends AbstractC1303f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0961p f9227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0 f9228b;

    /* JADX INFO: renamed from: io.grpc.internal.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9229a;

        static {
            int[] iArr = new int[AbstractC1303f.a.values().length];
            f9229a = iArr;
            try {
                iArr[AbstractC1303f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9229a[AbstractC1303f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9229a[AbstractC1303f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C0959o(C0961p c0961p, S0 s02) {
        this.f9227a = (C0961p) AbstractC0829j.o(c0961p, "tracer");
        this.f9228b = (S0) AbstractC0829j.o(s02, "time");
    }

    private boolean c(AbstractC1303f.a aVar) {
        return aVar != AbstractC1303f.a.DEBUG && this.f9227a.c();
    }

    static void d(y1.K k3, AbstractC1303f.a aVar, String str) {
        Level levelF = f(aVar);
        if (C0961p.f9241f.isLoggable(levelF)) {
            C0961p.d(k3, levelF, str);
        }
    }

    static void e(y1.K k3, AbstractC1303f.a aVar, String str, Object... objArr) {
        Level levelF = f(aVar);
        if (C0961p.f9241f.isLoggable(levelF)) {
            C0961p.d(k3, levelF, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(AbstractC1303f.a aVar) {
        int i3 = a.f9229a[aVar.ordinal()];
        return (i3 == 1 || i3 == 2) ? Level.FINE : i3 != 3 ? Level.FINEST : Level.FINER;
    }

    private static C1294F.b g(AbstractC1303f.a aVar) {
        int i3 = a.f9229a[aVar.ordinal()];
        return i3 != 1 ? i3 != 2 ? C1294F.b.CT_INFO : C1294F.b.CT_WARNING : C1294F.b.CT_ERROR;
    }

    private void h(AbstractC1303f.a aVar, String str) {
        if (aVar == AbstractC1303f.a.DEBUG) {
            return;
        }
        this.f9227a.f(new C1294F.a().b(str).c(g(aVar)).e(this.f9228b.a()).a());
    }

    @Override // y1.AbstractC1303f
    public void a(AbstractC1303f.a aVar, String str) {
        d(this.f9227a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // y1.AbstractC1303f
    public void b(AbstractC1303f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || C0961p.f9241f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
