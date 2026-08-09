package Y0;

import Y0.i;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f3337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f3338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f3339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f3340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f3341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f3342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f3343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f3344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f3345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Queue f3346j = new ArrayDeque();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f3347k;

    private n(String str, m mVar, int i3, boolean z2) {
        this.f3337a = str;
        this.f3338b = mVar;
        this.f3340d = i3;
        this.f3339c = mVar.i();
        this.f3341e = z2;
    }

    static n a(String str, int i3, boolean z2) {
        o oVarS = j.s(str, i3);
        int iB = oVarS.b();
        o oVarA = p.a(oVarS);
        m mVarE = d.e(oVarA);
        n nVar = new n(str, mVarE, iB, z2);
        StringBuilder sb = new StringBuilder();
        nVar.f3344h = mVarE.g(sb);
        String string = sb.toString();
        nVar.f3342f = string;
        try {
            nVar.f3343g = string.getBytes("UTF-8");
            if (!nVar.f3342f.isEmpty()) {
                nVar.f3345i = nVar.f3342f.codePointAt(0);
            }
            nVar.f3347k = oVarA.f3357i;
            return nVar;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("can't happen");
        }
    }

    private int[] b(g gVar, int i3, int i4, int i5) {
        f fVarC = c();
        fVarC.f(i5);
        int[] iArrK = fVarC.h(gVar, i3, i4) ? fVarC.k() : null;
        f(fVarC);
        return iArrK;
    }

    f c() {
        synchronized (this) {
            try {
                if (this.f3346j.isEmpty()) {
                    return new f(this);
                }
                return (f) this.f3346j.remove();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean d(i iVar, int i3, int i4, int i5, int[] iArr, int i6) {
        if (i3 > i4) {
            return false;
        }
        int[] iArrB = b(iVar.c() == i.a.UTF_16 ? g.d(iVar.b(), 0, i4) : g.e(iVar.a(), 0, i4), i3, i5, i6 * 2);
        if (iArrB == null) {
            return false;
        }
        if (iArr == null) {
            return true;
        }
        System.arraycopy(iArrB, 0, iArr, 0, iArrB.length);
        return true;
    }

    int e() {
        return this.f3340d;
    }

    synchronized void f(f fVar) {
        this.f3346j.add(fVar);
    }

    public String toString() {
        return this.f3337a;
    }
}
