package A0;

import A0.C0217o;
import A0.h0;
import J0.AbstractC0386b;
import com.google.firebase.firestore.EnumC0718b0;
import com.google.firebase.firestore.InterfaceC0756v;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0217o.b f147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0756v f148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f149d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC0201b0 f150e = EnumC0201b0.UNKNOWN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private E0 f151f;

    public g0(h0 h0Var, C0217o.b bVar, InterfaceC0756v interfaceC0756v) {
        if (h0Var.c()) {
            this.f146a = new h0.a(h0Var.g().t(bVar));
        } else {
            this.f146a = h0Var;
        }
        this.f148c = interfaceC0756v;
        this.f147b = bVar;
    }

    private void f(E0 e02) {
        AbstractC0386b.d(!this.f149d, "Trying to raise initial event for second time", new Object[0]);
        E0 e0C = E0.c(e02.h(), e02.e(), e02.f(), e02.k(), e02.b(), e02.i());
        this.f149d = true;
        this.f148c.a(e0C, null);
    }

    private boolean g(E0 e02) {
        if (!e02.d().isEmpty()) {
            return true;
        }
        E0 e03 = this.f151f;
        boolean z2 = (e03 == null || e03.j() == e02.j()) ? false : true;
        if (e02.a() || z2) {
            return this.f147b.f236b;
        }
        return false;
    }

    private boolean h(E0 e02, EnumC0201b0 enumC0201b0) {
        AbstractC0386b.d(!this.f149d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!e02.k() || !b()) {
            return true;
        }
        EnumC0201b0 enumC0201b02 = EnumC0201b0.OFFLINE;
        boolean z2 = !enumC0201b0.equals(enumC0201b02);
        if (!this.f147b.f237c || !z2) {
            return !e02.e().isEmpty() || e02.i() || enumC0201b0.equals(enumC0201b02);
        }
        AbstractC0386b.d(e02.k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public h0 a() {
        return this.f146a;
    }

    public boolean b() {
        if (this.f147b != null) {
            return !r0.f238d.equals(EnumC0718b0.CACHE);
        }
        return true;
    }

    public void c(com.google.firebase.firestore.T t2) {
        this.f148c.a(null, t2);
    }

    public boolean d(EnumC0201b0 enumC0201b0) {
        this.f150e = enumC0201b0;
        E0 e02 = this.f151f;
        if (e02 == null || this.f149d || !h(e02, enumC0201b0)) {
            return false;
        }
        f(this.f151f);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(A0.E0 r14) {
        /*
            r13 = this;
            java.util.List r0 = r14.d()
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            boolean r0 = r14.a()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            J0.AbstractC0386b.d(r0, r3, r4)
            A0.o$b r0 = r13.f147b
            boolean r0 = r0.f235a
            if (r0 != 0) goto L6c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r14.d()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            A0.m r3 = (A0.C0215m) r3
            A0.m$a r4 = r3.c()
            A0.m$a r5 = A0.C0215m.a.METADATA
            if (r4 == r5) goto L30
            r7.add(r3)
            goto L30
        L48:
            A0.E0 r0 = new A0.E0
            A0.h0 r4 = r14.h()
            D0.n r5 = r14.e()
            D0.n r6 = r14.g()
            boolean r8 = r14.k()
            t0.e r9 = r14.f()
            boolean r10 = r14.a()
            r11 = 1
            boolean r12 = r14.i()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = r0
        L6c:
            boolean r0 = r13.f149d
            if (r0 != 0) goto L7c
            A0.b0 r0 = r13.f150e
            boolean r0 = r13.h(r14, r0)
            if (r0 == 0) goto L89
            r13.f(r14)
            goto L8a
        L7c:
            boolean r0 = r13.g(r14)
            if (r0 == 0) goto L89
            com.google.firebase.firestore.v r0 = r13.f148c
            r2 = 0
            r0.a(r14, r2)
            goto L8a
        L89:
            r1 = r2
        L8a:
            r13.f151f = r14
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.g0.e(A0.E0):boolean");
    }
}
