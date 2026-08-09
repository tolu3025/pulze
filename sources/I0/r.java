package I0;

import A0.f0;
import I0.C0384z;
import I0.c0;
import I0.d0;
import J0.AbstractC0386b;
import J0.C0391g;
import V0.A;
import V0.C0425d;
import V0.C0426e;
import V0.C0429h;
import V0.C0430i;
import V0.C0432k;
import V0.F;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.InterfaceC0755u0;
import com.google.firebase.firestore.T;
import e0.AbstractC0832m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import k0.C1004r;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Set f2345d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final P f2346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0391g f2347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0384z f2348c;

    class a extends C0384z.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f2350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f2351c;

        a(List list, List list2, TaskCompletionSource taskCompletionSource) {
            this.f2349a = list;
            this.f2350b = list2;
            this.f2351c = taskCompletionSource;
        }

        @Override // I0.C0384z.e
        public void a(l0 l0Var) {
            if (l0Var.o()) {
                this.f2351c.trySetResult(Collections.emptyList());
                return;
            }
            com.google.firebase.firestore.T tO = J0.L.o(l0Var);
            if (tO.a() == T.a.UNAUTHENTICATED) {
                r.this.f2348c.h();
            }
            this.f2351c.trySetException(tO);
        }

        @Override // I0.C0384z.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(C0426e c0426e) {
            this.f2349a.add(c0426e);
            if (this.f2349a.size() == this.f2350b.size()) {
                HashMap map = new HashMap();
                Iterator it = this.f2349a.iterator();
                while (it.hasNext()) {
                    D0.s sVarP = r.this.f2346a.p((C0426e) it.next());
                    map.put(sVarP.getKey(), sVarP);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f2350b.iterator();
                while (it2.hasNext()) {
                    arrayList.add((D0.s) map.get((D0.l) it2.next()));
                }
                this.f2351c.trySetResult(arrayList);
            }
        }
    }

    class b extends C0384z.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1004r f2353a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0755u0 f2354b;

        b(InterfaceC0755u0 interfaceC0755u0) {
            this.f2354b = interfaceC0755u0;
        }

        @Override // I0.C0384z.e
        public void a(l0 l0Var) {
            if (l0Var.o()) {
                this.f2354b.b(this.f2353a);
                return;
            }
            com.google.firebase.firestore.T tO = J0.L.o(l0Var);
            if (tO.a() == T.a.UNAUTHENTICATED) {
                r.this.f2348c.h();
            }
            this.f2354b.a(tO);
        }

        @Override // I0.C0384z.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(V0.r rVar) {
            if (rVar.d0()) {
                this.f2353a = r.this.f2346a.C(rVar.b0());
            }
            for (C0432k c0432k : rVar.c0()) {
                String strH0 = c0432k.h0();
                InterfaceC0755u0 interfaceC0755u0 = this.f2354b;
                C1004r c1004rC = null;
                D0.l lVarO = AbstractC0832m.a(strH0) ? null : r.this.f2346a.o(strH0);
                Map mapF0 = c0432k.f0();
                C1004r c1004rC2 = c0432k.j0() ? r.this.f2346a.C(c0432k.d0()) : null;
                if (c0432k.k0()) {
                    c1004rC = r.this.f2346a.C(c0432k.i0());
                }
                interfaceC0755u0.c(lVarO, mapF0, c1004rC2, c1004rC);
            }
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2356a;

        static {
            int[] iArr = new int[T.a.values().length];
            f2356a = iArr;
            try {
                iArr[T.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2356a[T.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2356a[T.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2356a[T.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2356a[T.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2356a[T.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2356a[T.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2356a[T.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2356a[T.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2356a[T.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2356a[T.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2356a[T.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2356a[T.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2356a[T.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2356a[T.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2356a[T.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2356a[T.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    r(C0391g c0391g, P p2, C0384z c0384z) {
        this.f2347b = c0391g;
        this.f2346a = p2;
        this.f2348c = c0384z;
    }

    public static boolean h(l0 l0Var) {
        l0Var.m();
        Throwable thL = l0Var.l();
        if (!(thL instanceof SSLHandshakeException)) {
            return false;
        }
        thL.getMessage().contains("no ciphers available");
        return false;
    }

    public static boolean i(T.a aVar) {
        switch (c.f2356a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    public static boolean j(l0 l0Var) {
        return i(T.a.g(l0Var.m().g()));
    }

    public static boolean k(l0 l0Var) {
        return j(l0Var) && !l0Var.m().equals(l0.b.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof com.google.firebase.firestore.T) && ((com.google.firebase.firestore.T) task.getException()).a() == T.a.UNAUTHENTICATED) {
                this.f2348c.h();
            }
            throw task.getException();
        }
        C0430i c0430i = (C0430i) task.getResult();
        D0.w wVarE = this.f2346a.E(c0430i.a0());
        int iD0 = c0430i.d0();
        ArrayList arrayList = new ArrayList(iD0);
        for (int i3 = 0; i3 < iD0; i3++) {
            arrayList.add(this.f2346a.s(c0430i.c0(i3), wVarE));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map m(HashMap map, Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof com.google.firebase.firestore.T) && ((com.google.firebase.firestore.T) task.getException()).a() == T.a.UNAUTHENTICATED) {
                this.f2348c.h();
            }
            throw task.getException();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((V0.B) task.getResult()).b0().a0().entrySet()) {
            AbstractC0386b.d(map.containsKey(entry.getKey()), "%s not present in aliasMap", entry.getKey());
            map2.put((String) map.get(entry.getKey()), (V0.I) entry.getValue());
        }
        return map2;
    }

    public Task d(List list) {
        C0429h.b bVarF0 = C0429h.f0();
        bVarF0.x(this.f2346a.b());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVarF0.w(this.f2346a.U((E0.f) it.next()));
        }
        return this.f2348c.n(V0.t.b(), (C0429h) bVarF0.n()).continueWith(this.f2347b.o(), new Continuation() { // from class: I0.p
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f2342a.l(task);
            }
        });
    }

    c0 e(c0.a aVar) {
        return new c0(this.f2348c, this.f2347b, this.f2346a, aVar);
    }

    d0 f(d0.a aVar) {
        return new d0(this.f2348c, this.f2347b, this.f2346a, aVar);
    }

    public void g(V0.q qVar, InterfaceC0755u0 interfaceC0755u0) {
        this.f2348c.o(V0.t.c(), qVar, new b(interfaceC0755u0));
    }

    public Task n(List list) {
        C0425d.b bVarF0 = C0425d.f0();
        bVarF0.x(this.f2346a.b());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVarF0.w(this.f2346a.R((D0.l) it.next()));
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2348c.o(V0.t.a(), (C0425d) bVarF0.n(), new a(arrayList, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task o(f0 f0Var, List list) {
        F.e eVarY = this.f2346a.Y(f0Var.C());
        final HashMap map = new HashMap();
        V0.C cA0 = this.f2346a.a0(eVarY, list, map);
        A.b bVarD0 = V0.A.d0();
        bVarD0.w(eVarY.d0());
        bVarD0.x(cA0);
        return this.f2348c.n(V0.t.e(), (V0.A) bVarD0.n()).continueWith(this.f2347b.o(), new Continuation() { // from class: I0.q
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f2343a.m(map, task);
            }
        });
    }

    void p() {
        this.f2348c.q();
    }
}
