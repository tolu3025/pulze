package A0;

import A0.k0;
import J0.AbstractC0386b;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.EnumC0718b0;
import com.google.firebase.firestore.InterfaceC0756v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: A0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217o implements k0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f229a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f231c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0201b0 f232d = EnumC0201b0.UNKNOWN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f230b = new HashMap();

    /* JADX INFO: renamed from: A0.o$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f234b;

        static {
            int[] iArr = new int[c.values().length];
            f234b = iArr;
            try {
                iArr[c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f234b[c.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f234b[c.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f233a = iArr2;
            try {
                iArr2[d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f233a[d.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f233a[d.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: A0.o$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public EnumC0718b0 f238d = EnumC0718b0.DEFAULT;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0754u.a f239e = C0754u.a.NONE;
    }

    /* JADX INFO: renamed from: A0.o$c */
    private enum c {
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION,
        TERMINATE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_DISCONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: A0.o$d */
    private enum d {
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION,
        INITIALIZE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_CONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* JADX INFO: renamed from: A0.o$e */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f250a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private E0 f251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f252c;

        e() {
        }

        boolean f() {
            Iterator it = this.f250a.iterator();
            while (it.hasNext()) {
                if (((g0) it.next()).b()) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0217o(k0 k0Var) {
        this.f229a = k0Var;
        k0Var.y(this);
    }

    private void f() {
        Iterator it = this.f231c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0756v) it.next()).a(null, null);
        }
    }

    @Override // A0.k0.c
    public void a(EnumC0201b0 enumC0201b0) {
        this.f232d = enumC0201b0;
        Iterator it = this.f230b.values().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Iterator it2 = ((e) it.next()).f250a.iterator();
            while (it2.hasNext()) {
                if (((g0) it2.next()).d(enumC0201b0)) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            f();
        }
    }

    @Override // A0.k0.c
    public void b(h0 h0Var, y1.l0 l0Var) {
        e eVar = (e) this.f230b.get(h0Var);
        if (eVar != null) {
            Iterator it = eVar.f250a.iterator();
            while (it.hasNext()) {
                ((g0) it.next()).c(J0.L.o(l0Var));
            }
        }
        this.f230b.remove(h0Var);
    }

    @Override // A0.k0.c
    public void c(List list) {
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            E0 e02 = (E0) it.next();
            e eVar = (e) this.f230b.get(e02.h());
            if (eVar != null) {
                Iterator it2 = eVar.f250a.iterator();
                while (it2.hasNext()) {
                    if (((g0) it2.next()).e(e02)) {
                        z2 = true;
                    }
                }
                eVar.f251b = e02;
            }
        }
        if (z2) {
            f();
        }
    }

    public int d(g0 g0Var) {
        int iN;
        h0 h0VarA = g0Var.a();
        d dVar = d.NO_ACTION_REQUIRED;
        e eVar = (e) this.f230b.get(h0VarA);
        if (eVar == null) {
            eVar = new e();
            this.f230b.put(h0VarA, eVar);
            dVar = g0Var.b() ? d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : d.INITIALIZE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.f() && g0Var.b()) {
            dVar = d.REQUIRE_WATCH_CONNECTION_ONLY;
        }
        eVar.f250a.add(g0Var);
        AbstractC0386b.d(!g0Var.d(this.f232d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (eVar.f251b != null && g0Var.e(eVar.f251b)) {
            f();
        }
        int i3 = a.f233a[dVar.ordinal()];
        if (i3 == 1) {
            iN = this.f229a.n(h0VarA, true);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    this.f229a.o(h0VarA);
                }
                return eVar.f252c;
            }
            iN = this.f229a.n(h0VarA, false);
        }
        eVar.f252c = iN;
        return eVar.f252c;
    }

    public void e(InterfaceC0756v interfaceC0756v) {
        this.f231c.add(interfaceC0756v);
        interfaceC0756v.a(null, null);
    }

    public void g(g0 g0Var) {
        k0 k0Var;
        h0 h0VarA = g0Var.a();
        e eVar = (e) this.f230b.get(h0VarA);
        c cVar = c.NO_ACTION_REQUIRED;
        if (eVar == null) {
            return;
        }
        eVar.f250a.remove(g0Var);
        if (eVar.f250a.isEmpty()) {
            cVar = g0Var.b() ? c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION : c.TERMINATE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.f() && g0Var.b()) {
            cVar = c.REQUIRE_WATCH_DISCONNECTION_ONLY;
        }
        int i3 = a.f234b[cVar.ordinal()];
        boolean z2 = true;
        if (i3 == 1) {
            this.f230b.remove(h0VarA);
            k0Var = this.f229a;
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f229a.A(h0VarA);
            return;
        } else {
            this.f230b.remove(h0VarA);
            k0Var = this.f229a;
            z2 = false;
        }
        k0Var.z(h0VarA, z2);
    }

    public void h(InterfaceC0756v interfaceC0756v) {
        this.f231c.remove(interfaceC0756v);
    }
}
