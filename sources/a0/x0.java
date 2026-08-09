package A0;

import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.r f304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f305c;

    private x0(w0 w0Var, D0.r rVar, boolean z2) {
        this.f303a = w0Var;
        this.f304b = rVar;
        this.f305c = z2;
    }

    private void k() {
        if (this.f304b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f304b.w(); i3++) {
            l(this.f304b.t(i3));
        }
    }

    private void l(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        }
        if (j() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public void a(D0.r rVar) {
        this.f303a.b(rVar);
    }

    public void b(D0.r rVar, E0.p pVar) {
        this.f303a.c(rVar, pVar);
    }

    public x0 c(int i3) {
        return new x0(this.f303a, null, true);
    }

    public x0 d(D0.r rVar) {
        D0.r rVar2 = this.f304b;
        x0 x0Var = new x0(this.f303a, rVar2 == null ? null : (D0.r) rVar2.l(rVar), false);
        x0Var.k();
        return x0Var;
    }

    public x0 e(String str) {
        D0.r rVar = this.f304b;
        x0 x0Var = new x0(this.f303a, rVar == null ? null : (D0.r) rVar.m(str), false);
        x0Var.l(str);
        return x0Var;
    }

    public RuntimeException f(String str) {
        String str2;
        D0.r rVar = this.f304b;
        if (rVar == null || rVar.isEmpty()) {
            str2 = "";
        } else {
            str2 = " (found in field " + this.f304b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    public A0 g() {
        return this.f303a.f299a;
    }

    public D0.r h() {
        return this.f304b;
    }

    public boolean i() {
        return this.f305c;
    }

    public boolean j() {
        int i3 = v0.f296a[this.f303a.f299a.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return true;
        }
        if (i3 == 4 || i3 == 5) {
            return false;
        }
        throw AbstractC0386b.a("Unexpected case for UserDataSource: %s", this.f303a.f299a.name());
    }

    /* synthetic */ x0(w0 w0Var, D0.r rVar, boolean z2, v0 v0Var) {
        this(w0Var, rVar, z2);
    }
}
