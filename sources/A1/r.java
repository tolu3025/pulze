package A1;

import com.google.android.gms.common.api.a;
import e0.AbstractC0829j;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1.c f524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f525c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f526d = new c(0, 65535, null);

    public interface b {
        void d(int i3);
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f532f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m2.d f527a = new m2.d();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f533g = false;

        c(int i3, int i4, b bVar) {
            this.f529c = i3;
            this.f530d = i4;
            this.f532f = bVar;
        }

        void a(int i3) {
            this.f531e += i3;
        }

        int b() {
            return this.f531e;
        }

        void c() {
            this.f531e = 0;
        }

        void d(m2.d dVar, int i3, boolean z2) {
            this.f527a.T(dVar, i3);
            this.f533g |= z2;
        }

        boolean e() {
            return this.f527a.b0() > 0;
        }

        int f(int i3) {
            if (i3 <= 0 || a.e.API_PRIORITY_OTHER - i3 >= this.f530d) {
                int i4 = this.f530d + i3;
                this.f530d = i4;
                return i4;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f529c);
        }

        int g() {
            return Math.max(0, Math.min(this.f530d, (int) this.f527a.b0()));
        }

        int h() {
            return g() - this.f531e;
        }

        int i() {
            return this.f530d;
        }

        int j() {
            return Math.min(this.f530d, r.this.f526d.i());
        }

        void k(m2.d dVar, int i3, boolean z2) {
            do {
                int iMin = Math.min(i3, r.this.f524b.I());
                int i4 = -iMin;
                r.this.f526d.f(i4);
                f(i4);
                try {
                    r.this.f524b.D(dVar.b0() == ((long) iMin) && z2, this.f529c, dVar, iMin);
                    this.f532f.d(iMin);
                    i3 -= iMin;
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            } while (i3 > 0);
        }

        int l(int i3, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i3, j());
            int iB0 = 0;
            while (e() && iMin > 0) {
                if (iMin >= this.f527a.b0()) {
                    iB0 += (int) this.f527a.b0();
                    m2.d dVar = this.f527a;
                    k(dVar, (int) dVar.b0(), this.f533g);
                } else {
                    iB0 += iMin;
                    k(this.f527a, iMin, false);
                }
                eVar.b();
                iMin = Math.min(i3 - iB0, j());
            }
            if (!e() && (runnable = this.f528b) != null) {
                runnable.run();
                this.f528b = null;
            }
            return iB0;
        }
    }

    public interface d {
        c[] a();
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f535a;

        private e() {
        }

        boolean a() {
            return this.f535a > 0;
        }

        void b() {
            this.f535a++;
        }
    }

    public r(d dVar, C1.c cVar) {
        this.f523a = (d) AbstractC0829j.o(dVar, "transport");
        this.f524b = (C1.c) AbstractC0829j.o(cVar, "frameWriter");
    }

    public c c(b bVar, int i3) {
        return new c(i3, this.f525c, (b) AbstractC0829j.o(bVar, "stream"));
    }

    public void d(boolean z2, c cVar, m2.d dVar, boolean z3) {
        AbstractC0829j.o(dVar, "source");
        int iJ = cVar.j();
        boolean zE = cVar.e();
        int iB0 = (int) dVar.b0();
        if (zE || iJ < iB0) {
            if (!zE && iJ > 0) {
                cVar.k(dVar, iJ, false);
            }
            cVar.d(dVar, (int) dVar.b0(), z2);
        } else {
            cVar.k(dVar, iB0, z2);
        }
        if (z3) {
            e();
        }
    }

    public void e() {
        try {
            this.f524b.flush();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public boolean f(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i3);
        }
        int i4 = i3 - this.f525c;
        this.f525c = i3;
        for (c cVar : this.f523a.a()) {
            cVar.f(i4);
        }
        return i4 > 0;
    }

    public int g(c cVar, int i3) {
        if (cVar == null) {
            int iF = this.f526d.f(i3);
            h();
            return iF;
        }
        int iF2 = cVar.f(i3);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return iF2;
    }

    public void h() {
        int i3;
        c[] cVarArrA = this.f523a.a();
        Collections.shuffle(Arrays.asList(cVarArrA));
        int i4 = this.f526d.i();
        int length = cVarArrA.length;
        while (true) {
            i3 = 0;
            if (length <= 0 || i4 <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i4 / length);
            for (int i5 = 0; i5 < length && i4 > 0; i5++) {
                c cVar = cVarArrA[i5];
                int iMin = Math.min(i4, Math.min(cVar.h(), iCeil));
                if (iMin > 0) {
                    cVar.a(iMin);
                    i4 -= iMin;
                }
                if (cVar.h() > 0) {
                    cVarArrA[i3] = cVar;
                    i3++;
                }
            }
            length = i3;
        }
        e eVar = new e();
        c[] cVarArrA2 = this.f523a.a();
        int length2 = cVarArrA2.length;
        while (i3 < length2) {
            c cVar2 = cVarArrA2[i3];
            cVar2.l(cVar2.b(), eVar);
            cVar2.c();
            i3++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
