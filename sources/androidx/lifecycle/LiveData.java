package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;
import e.C0817c;
import f.C0840b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f4707k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f4708a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0840b f4709b = new C0840b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4710c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f4712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f4713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f4717j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.b implements g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final i f4718e;

        LifecycleBoundObserver(i iVar, n nVar) {
            super(nVar);
            this.f4718e = iVar;
        }

        @Override // androidx.lifecycle.g
        public void d(i iVar, AbstractC0516e.a aVar) {
            AbstractC0516e.b bVarB = this.f4718e.a().b();
            if (bVarB == AbstractC0516e.b.DESTROYED) {
                LiveData.this.l(this.f4721a);
                return;
            }
            AbstractC0516e.b bVar = null;
            while (bVar != bVarB) {
                e(k());
                bVar = bVarB;
                bVarB = this.f4718e.a().b();
            }
        }

        void i() {
            this.f4718e.a().c(this);
        }

        boolean j(i iVar) {
            return this.f4718e == iVar;
        }

        boolean k() {
            return this.f4718e.a().b().e(AbstractC0516e.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4708a) {
                obj = LiveData.this.f4713f;
                LiveData.this.f4713f = LiveData.f4707k;
            }
            LiveData.this.m(obj);
        }
    }

    private abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n f4721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4723c = -1;

        b(n nVar) {
            this.f4721a = nVar;
        }

        void e(boolean z2) {
            if (z2 == this.f4722b) {
                return;
            }
            this.f4722b = z2;
            LiveData.this.c(z2 ? 1 : -1);
            if (this.f4722b) {
                LiveData.this.e(this);
            }
        }

        abstract void i();

        abstract boolean j(i iVar);

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f4707k;
        this.f4713f = obj;
        this.f4717j = new a();
        this.f4712e = obj;
        this.f4714g = -1;
    }

    static void b(String str) {
        if (C0817c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(b bVar) {
        if (bVar.f4722b) {
            if (!bVar.k()) {
                bVar.e(false);
                return;
            }
            int i3 = bVar.f4723c;
            int i4 = this.f4714g;
            if (i3 >= i4) {
                return;
            }
            bVar.f4723c = i4;
            bVar.f4721a.a(this.f4712e);
        }
    }

    void c(int i3) {
        int i4 = this.f4710c;
        this.f4710c = i3 + i4;
        if (this.f4711d) {
            return;
        }
        this.f4711d = true;
        while (true) {
            try {
                int i5 = this.f4710c;
                if (i4 == i5) {
                    this.f4711d = false;
                    return;
                }
                boolean z2 = i4 == 0 && i5 > 0;
                boolean z3 = i4 > 0 && i5 == 0;
                if (z2) {
                    i();
                } else if (z3) {
                    j();
                }
                i4 = i5;
            } catch (Throwable th) {
                this.f4711d = false;
                throw th;
            }
        }
    }

    void e(b bVar) {
        if (this.f4715h) {
            this.f4716i = true;
            return;
        }
        this.f4715h = true;
        do {
            this.f4716i = false;
            if (bVar != null) {
                d(bVar);
                bVar = null;
            } else {
                C0840b.d dVarD = this.f4709b.d();
                while (dVarD.hasNext()) {
                    d((b) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f4716i) {
                        break;
                    }
                }
            }
        } while (this.f4716i);
        this.f4715h = false;
    }

    public Object f() {
        Object obj = this.f4712e;
        if (obj != f4707k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f4710c > 0;
    }

    public void h(i iVar, n nVar) {
        b("observe");
        if (iVar.a().b() == AbstractC0516e.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, nVar);
        b bVar = (b) this.f4709b.m(nVar, lifecycleBoundObserver);
        if (bVar != null && !bVar.j(iVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bVar != null) {
            return;
        }
        iVar.a().a(lifecycleBoundObserver);
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k(Object obj) {
        boolean z2;
        synchronized (this.f4708a) {
            z2 = this.f4713f == f4707k;
            this.f4713f = obj;
        }
        if (z2) {
            C0817c.f().c(this.f4717j);
        }
    }

    public void l(n nVar) {
        b("removeObserver");
        b bVar = (b) this.f4709b.n(nVar);
        if (bVar == null) {
            return;
        }
        bVar.i();
        bVar.e(false);
    }

    protected void m(Object obj) {
        b("setValue");
        this.f4714g++;
        this.f4712e = obj;
        e(null);
    }
}
