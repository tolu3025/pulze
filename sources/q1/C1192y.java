package q1;

import I0.C0384z;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC0715a;
import com.google.firebase.firestore.C0721d;
import com.google.firebase.firestore.C0723e;
import com.google.firebase.firestore.C0730h0;
import com.google.firebase.firestore.C0746p0;
import com.google.firebase.firestore.C0748q0;
import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0753t0;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.D0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.G0;
import com.google.firebase.firestore.InterfaceC0728g0;
import com.google.firebase.firestore.M0;
import com.google.firebase.firestore.P0;
import com.google.firebase.firestore.S0;
import com.google.firebase.firestore.U;
import com.google.firebase.firestore.Z0;
import g1.InterfaceC0872a;
import h1.InterfaceC0881a;
import h1.InterfaceC0883c;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0992f;
import l1.C1018d;
import l1.InterfaceC1017c;
import q1.AbstractC1167A;
import r1.o;
import s1.AbstractC1210a;

/* JADX INFO: renamed from: q1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1192y implements FlutterFirebasePlugin, InterfaceC0872a, InterfaceC0881a, AbstractC1167A.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final HashMap f11065j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f11066k = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1017c f11068d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l1.p f11067c = new l1.p(C1171c.f11001d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f11069e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f11070f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f11071g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f11072h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f11073i = new HashMap();

    /* JADX INFO: renamed from: q1.y$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11076c;

        static {
            int[] iArr = new int[AbstractC1167A.l.values().length];
            f11076c = iArr;
            try {
                iArr[AbstractC1167A.l.ENABLE_INDEX_AUTO_CREATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11076c[AbstractC1167A.l.DISABLE_INDEX_AUTO_CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11076c[AbstractC1167A.l.DELETE_ALL_INDEXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC1167A.y.values().length];
            f11075b = iArr2;
            try {
                iArr2[AbstractC1167A.y.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11075b[AbstractC1167A.y.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11075b[AbstractC1167A.y.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[AbstractC1167A.d.values().length];
            f11074a = iArr3;
            try {
                iArr3[AbstractC1167A.d.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11074a[AbstractC1167A.d.SUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11074a[AbstractC1167A.d.AVERAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            Tasks.await(d0(iVar).f0());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(AbstractC1167A.i iVar, List list, AbstractC1167A.z zVar) {
        M0 m0D;
        C0760x c0760xD;
        Object obj;
        try {
            FirebaseFirestore firebaseFirestoreD0 = d0(iVar);
            Z0 z0R = firebaseFirestoreD0.r();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1167A.w wVar = (AbstractC1167A.w) it.next();
                AbstractC1167A.y yVarE = wVar.e();
                Objects.requireNonNull(yVarE);
                String strD = wVar.d();
                Objects.requireNonNull(strD);
                C0752t c0752tY = firebaseFirestoreD0.y(strD);
                int i3 = a.f11075b[yVarE.ordinal()];
                if (i3 == 1) {
                    z0R = z0R.c(c0752tY);
                } else if (i3 == 2) {
                    Map mapB = wVar.b();
                    Objects.requireNonNull(mapB);
                    Map map = mapB;
                    HashMap map2 = new HashMap();
                    for (Object obj2 : map.keySet()) {
                        if (obj2 instanceof String) {
                            c0760xD = C0760x.d((String) obj2);
                            obj = map.get(obj2);
                        } else if (obj2 instanceof C0760x) {
                            c0760xD = (C0760x) obj2;
                            obj = map.get(obj2);
                        }
                        map2.put(c0760xD, obj);
                    }
                    C0760x c0760x = (C0760x) map2.keySet().iterator().next();
                    Object obj3 = map2.get(c0760x);
                    ArrayList arrayList = new ArrayList();
                    for (C0760x c0760x2 : map2.keySet()) {
                        if (!c0760x2.equals(c0760x)) {
                            arrayList.add(c0760x2);
                            arrayList.add(map2.get(c0760x2));
                        }
                    }
                    z0R = z0R.h(c0752tY, c0760x, obj3, arrayList.toArray());
                } else if (i3 == 3) {
                    Map mapB2 = wVar.b();
                    Objects.requireNonNull(mapB2);
                    Map map3 = mapB2;
                    AbstractC1167A.n nVarC = wVar.c();
                    Objects.requireNonNull(nVarC);
                    if (nVarC.b() != null && nVarC.b().booleanValue()) {
                        m0D = M0.c();
                    } else if (nVarC.c() != null) {
                        List listC = nVarC.c();
                        Objects.requireNonNull(listC);
                        m0D = M0.d(s1.r.c(listC));
                    } else {
                        z0R = z0R.e(c0752tY, map3);
                    }
                    z0R = z0R.f(c0752tY, map3, m0D);
                }
            }
            Tasks.await(z0R.b());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    private String C0(String str, String str2, C1018d.InterfaceC0147d interfaceC0147d) {
        C1018d c1018d = new C1018d(this.f11068d, str + "/" + str2, this.f11067c);
        c1018d.d(interfaceC0147d);
        this.f11071g.put(str2, c1018d);
        this.f11072h.put(str2, interfaceC0147d);
        return str2;
    }

    private String D0(String str, C1018d.InterfaceC0147d interfaceC0147d) {
        return C0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), interfaceC0147d);
    }

    private void E0() {
        synchronized (this.f11071g) {
            try {
                Iterator it = this.f11071g.keySet().iterator();
                while (it.hasNext()) {
                    C1018d c1018d = (C1018d) this.f11071g.get((String) it.next());
                    Objects.requireNonNull(c1018d);
                    c1018d.d(null);
                }
                this.f11071g.clear();
            } finally {
            }
        }
        synchronized (this.f11072h) {
            try {
                Iterator it2 = this.f11072h.keySet().iterator();
                while (it2.hasNext()) {
                    C1018d.InterfaceC0147d interfaceC0147d = (C1018d.InterfaceC0147d) this.f11072h.get((String) it2.next());
                    Objects.requireNonNull(interfaceC0147d);
                    interfaceC0147d.b(null);
                }
                this.f11072h.clear();
            } finally {
            }
        }
        this.f11073i.clear();
    }

    protected static void F0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap map = f11065j;
        synchronized (map) {
            try {
                if (((C1170b) map.get(firebaseFirestore)) == null) {
                    map.put(firebaseFirestore, new C1170b(firebaseFirestore, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Z(InterfaceC0883c interfaceC0883c) {
        this.f11069e.set(interfaceC0883c.d());
    }

    private static void a0(FirebaseFirestore firebaseFirestore) {
        HashMap map = f11065j;
        synchronized (map) {
            try {
                if (((C1170b) map.get(firebaseFirestore)) != null) {
                    map.remove(firebaseFirestore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b0() {
        this.f11069e.set(null);
    }

    protected static C1170b c0(FirebaseFirestore firebaseFirestore) {
        C1170b c1170b;
        HashMap map = f11065j;
        synchronized (map) {
            c1170b = (C1170b) map.get(firebaseFirestore);
        }
        return c1170b;
    }

    public static FirebaseFirestore d0(AbstractC1167A.i iVar) {
        synchronized (f11065j) {
            try {
                FirebaseFirestore firebaseFirestoreE0 = e0(iVar.b(), iVar.c());
                if (firebaseFirestoreE0 != null) {
                    return firebaseFirestoreE0;
                }
                FirebaseFirestore firebaseFirestoreC = FirebaseFirestore.C(C0992f.p(iVar.b()), iVar.c());
                firebaseFirestoreC.a0(f0(iVar));
                F0(firebaseFirestoreC, iVar.c());
                return firebaseFirestoreC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected static FirebaseFirestore e0(String str, String str2) {
        HashMap map = f11065j;
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (((C1170b) entry.getValue()).b().A().q().equals(str) && ((C1170b) entry.getValue()).a().equals(str2)) {
                        return (FirebaseFirestore) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static com.google.firebase.firestore.U f0(AbstractC1167A.i iVar) {
        InterfaceC0728g0 interfaceC0728g0A;
        U.b bVar = new U.b();
        if (iVar.d().c() != null) {
            bVar.g(iVar.d().c());
        }
        if (iVar.d().e() != null) {
            bVar.i(iVar.d().e().booleanValue());
        }
        if (iVar.d().d() != null) {
            if (iVar.d().d().booleanValue()) {
                Long lB = iVar.d().b();
                interfaceC0728g0A = C0748q0.b().b((lB == null || lB.longValue() == -1) ? 104857600L : lB.longValue()).a();
            } else {
                interfaceC0728g0A = C0730h0.b().a();
            }
            bVar.h(interfaceC0728g0A);
        }
        return bVar.f();
    }

    private void g0(InterfaceC1017c interfaceC1017c) {
        this.f11068d = interfaceC1017c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        a0.z(this.f11068d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(C0721d c0721d, AbstractC1167A.c cVar, List list, AbstractC1167A.z zVar) {
        AbstractC1167A.C1168b c1168bA;
        try {
            C0723e c0723e = (C0723e) Tasks.await(c0721d.c(s1.r.b(cVar)));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1167A.a aVar = (AbstractC1167A.a) it.next();
                int i3 = a.f11074a[aVar.c().ordinal()];
                if (i3 == 1) {
                    AbstractC1167A.C1168b.a aVar2 = new AbstractC1167A.C1168b.a();
                    aVar2.c(AbstractC1167A.d.COUNT);
                    aVar2.d(Double.valueOf(c0723e.e()));
                    c1168bA = aVar2.a();
                } else if (i3 == 2) {
                    AbstractC1167A.C1168b.a aVar3 = new AbstractC1167A.C1168b.a();
                    aVar3.c(AbstractC1167A.d.SUM);
                    Object objD = c0723e.d(AbstractC0715a.f(aVar.b()));
                    Objects.requireNonNull(objD);
                    aVar3.d(Double.valueOf(((Number) objD).doubleValue()));
                    aVar3.b(aVar.b());
                    c1168bA = aVar3.a();
                } else if (i3 == 3) {
                    AbstractC1167A.C1168b.a aVar4 = new AbstractC1167A.C1168b.a();
                    aVar4.c(AbstractC1167A.d.AVERAGE);
                    aVar4.d(c0723e.c(AbstractC0715a.a(aVar.b())));
                    aVar4.b(aVar.b());
                    c1168bA = aVar4.a();
                }
                arrayList.add(c1168bA);
            }
            zVar.a(arrayList);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            Tasks.await(d0(iVar).t());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap map = f11065j;
            synchronized (map) {
                try {
                    for (FirebaseFirestore firebaseFirestore : new ArrayList(map.keySet())) {
                        Tasks.await(firebaseFirestore.d0());
                        a0(firebaseFirestore);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            E0();
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            Tasks.await(d0(iVar).x());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(AbstractC1167A.i iVar, AbstractC1167A.f fVar, AbstractC1167A.z zVar) {
        try {
            zVar.a((Void) Tasks.await(d0(iVar).y(fVar.d()).m()));
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(AbstractC1167A.f fVar, AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            zVar.a(s1.r.k((C0754u) Tasks.await(d0(iVar).y(fVar.d()).o(s1.r.f(fVar.f()))), s1.r.e(fVar.e())));
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(AbstractC1167A.i iVar, AbstractC1167A.f fVar, AbstractC1167A.z zVar) {
        Task taskE;
        M0 m0D;
        try {
            C0752t c0752tY = d0(iVar).y(fVar.d());
            Map mapB = fVar.b();
            Objects.requireNonNull(mapB);
            Map map = mapB;
            if (fVar.c().b() != null && fVar.c().b().booleanValue()) {
                m0D = M0.c();
            } else if (fVar.c().c() == null) {
                taskE = c0752tY.E(map);
                zVar.a((Void) Tasks.await(taskE));
            } else {
                List listC = fVar.c().c();
                Objects.requireNonNull(listC);
                m0D = M0.d(s1.r.c(listC));
            }
            taskE = c0752tY.F(map, m0D);
            zVar.a((Void) Tasks.await(taskE));
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(AbstractC1167A.i iVar, AbstractC1167A.f fVar, AbstractC1167A.z zVar) {
        C0760x c0760xD;
        Object obj;
        try {
            C0752t c0752tY = d0(iVar).y(fVar.d());
            Map mapB = fVar.b();
            Objects.requireNonNull(mapB);
            Map map = mapB;
            HashMap map2 = new HashMap();
            for (Object obj2 : map.keySet()) {
                if (obj2 instanceof String) {
                    c0760xD = C0760x.d((String) obj2);
                    obj = map.get(obj2);
                } else {
                    if (!(obj2 instanceof C0760x)) {
                        throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                    }
                    c0760xD = (C0760x) obj2;
                    obj = map.get(obj2);
                }
                map2.put(c0760xD, obj);
            }
            C0760x c0760x = (C0760x) map2.keySet().iterator().next();
            Object obj3 = map2.get(c0760x);
            ArrayList arrayList = new ArrayList();
            for (C0760x c0760x2 : map2.keySet()) {
                if (!c0760x2.equals(c0760x)) {
                    arrayList.add(c0760x2);
                    arrayList.add(map2.get(c0760x2));
                }
            }
            zVar.a((Void) Tasks.await(c0752tY.H(c0760x, obj3, arrayList.toArray())));
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            Tasks.await(d0(iVar).z());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(AbstractC1167A.i iVar, List list, Map map, AbstractC1167A.z zVar) {
        try {
            C0751s0.c cVarC = s1.s.c(d0(iVar), list, map);
            ArrayList arrayList = new ArrayList();
            for (C0753t0 c0753t0 : cVarC.b()) {
                AbstractC1167A.r.a aVar = new AbstractC1167A.r.a();
                if (c0753t0.c() != null) {
                    aVar.d(c0753t0.c().s());
                }
                if (c0753t0.a() != null) {
                    aVar.b(Long.valueOf(c0753t0.a().p().getTime()));
                }
                if (c0753t0.d() != null) {
                    aVar.e(Long.valueOf(c0753t0.d().p().getTime()));
                }
                Map mapB = c0753t0.b();
                if (mapB != null) {
                    aVar.c(mapB);
                }
                arrayList.add(aVar.a());
            }
            AbstractC1167A.s.a aVar2 = new AbstractC1167A.s.a();
            aVar2.c(arrayList);
            if (cVarC.a() != null) {
                aVar2.b(Long.valueOf(cVarC.a().p().getTime()));
            }
            zVar.a(aVar2.a());
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(AbstractC1167A.i iVar, String str, AbstractC1167A.z zVar, AbstractC1167A.q qVar) {
        try {
            D0 d02 = (D0) Tasks.await(d0(iVar).D(str));
            if (d02 == null) {
                zVar.b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
            } else {
                zVar.a(s1.r.m((G0) Tasks.await(d02.o(s1.r.f(qVar.c()))), s1.r.e(qVar.b())));
            }
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(AbstractC1167A.i iVar, AbstractC1167A.l lVar, AbstractC1167A.z zVar) {
        C0746p0 c0746p0E = d0(iVar).E();
        if (c0746p0E != null) {
            int i3 = a.f11076c[lVar.ordinal()];
            if (i3 == 1) {
                c0746p0E.e();
            } else if (i3 == 2) {
                c0746p0E.d();
            } else if (i3 == 3) {
                c0746p0E.c();
            }
        } else {
            Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
        }
        zVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(AbstractC1167A.q qVar, AbstractC1167A.i iVar, String str, Boolean bool, AbstractC1167A.t tVar, AbstractC1167A.z zVar) {
        try {
            P0 p0F = s1.r.f(qVar.c());
            D0 d0G = s1.r.g(d0(iVar), str, bool.booleanValue(), tVar);
            if (d0G == null) {
                zVar.b(new AbstractC1167A.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
            } else {
                zVar.a(s1.r.m((G0) Tasks.await(d0G.o(p0F)), s1.r.e(qVar.b())));
            }
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(AbstractC1167A.i iVar, String str, AbstractC1167A.z zVar) {
        try {
            Tasks.await(d0(iVar).b0(str));
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w0(Boolean bool, AbstractC1167A.z zVar) {
        try {
            FirebaseFirestore.c0(bool.booleanValue());
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x0(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        try {
            FirebaseFirestore firebaseFirestoreD0 = d0(iVar);
            Tasks.await(firebaseFirestoreD0.d0());
            a0(firebaseFirestoreD0);
            zVar.a(null);
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(String str, S0 s02) {
        this.f11070f.put(str, s02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(AbstractC1167A.i iVar, String str, String str2, AbstractC1167A.z zVar) {
        try {
            C0752t c0752tY = d0(iVar).y(str);
            S0 s02 = (S0) this.f11070f.get(str2);
            if (s02 != null) {
                zVar.a(s1.r.k(s02.c(c0752tY), C0754u.a.NONE));
                return;
            }
            zVar.b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
        } catch (Exception e3) {
            AbstractC1210a.b(zVar, e3);
        }
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        g0(bVar.b());
        C0384z.p("gl-dart/6.3.0");
    }

    @Override // q1.AbstractC1167A.g
    public void B(final AbstractC1167A.i iVar, final String str, final AbstractC1167A.q qVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.f
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.s0(iVar, str, zVar, qVar);
            }
        });
    }

    @Override // h1.InterfaceC0881a
    public void C() {
        b0();
    }

    @Override // q1.AbstractC1167A.g
    public void D(final Boolean bool, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.m
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.w0(bool, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void a(AbstractC1167A.i iVar, AbstractC1167A.f fVar, Boolean bool, AbstractC1167A.k kVar, AbstractC1167A.z zVar) {
        zVar.a(D0("plugins.flutter.io/firebase_firestore/document", new r1.b(d0(iVar), d0(iVar).y(fVar.d()), bool, s1.r.e(fVar.e()), s1.r.d(kVar))));
    }

    @Override // q1.AbstractC1167A.g
    public void b(final AbstractC1167A.i iVar, final String str, final String str2, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f11014a.z0(iVar, str2, str, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void c(final AbstractC1167A.i iVar, final String str, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.e
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.v0(iVar, str, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void d(final AbstractC1167A.i iVar, final AbstractC1167A.f fVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.k
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.n0(iVar, fVar, zVar);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f11036a.j0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // q1.AbstractC1167A.g
    public void e(final AbstractC1167A.i iVar, final String str, final Boolean bool, final AbstractC1167A.t tVar, final AbstractC1167A.q qVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.r
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.u0(qVar, iVar, str, bool, tVar, zVar);
            }
        });
    }

    @Override // h1.InterfaceC0881a
    public void f(InterfaceC0883c interfaceC0883c) {
        Z(interfaceC0883c);
    }

    @Override // h1.InterfaceC0881a
    public void g(InterfaceC0883c interfaceC0883c) {
        Z(interfaceC0883c);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C0992f c0992f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.d
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.r0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // q1.AbstractC1167A.g
    public void h(final AbstractC1167A.i iVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.g
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.i0(iVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void i(final AbstractC1167A.i iVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.s
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.A0(iVar, zVar);
            }
        });
    }

    @Override // h1.InterfaceC0881a
    public void j() {
        b0();
    }

    @Override // q1.AbstractC1167A.g
    public void k(AbstractC1167A.i iVar, AbstractC1167A.z zVar) {
        zVar.a(D0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new r1.j(d0(iVar))));
    }

    @Override // q1.AbstractC1167A.g
    public void l(AbstractC1167A.i iVar, String str, Boolean bool, AbstractC1167A.t tVar, AbstractC1167A.q qVar, Boolean bool2, AbstractC1167A.k kVar, AbstractC1167A.z zVar) {
        D0 d0G = s1.r.g(d0(iVar), str, bool.booleanValue(), tVar);
        if (d0G == null) {
            zVar.b(new AbstractC1167A.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
        } else {
            zVar.a(D0("plugins.flutter.io/firebase_firestore/query", new r1.h(d0G, bool2, s1.r.e(qVar.b()), s1.r.d(kVar))));
        }
    }

    @Override // q1.AbstractC1167A.g
    public void m(final AbstractC1167A.i iVar, final AbstractC1167A.f fVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.x
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.o0(iVar, fVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void n(final AbstractC1167A.i iVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.u
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.x0(iVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void o(final AbstractC1167A.i iVar, final AbstractC1167A.f fVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.j
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.l0(iVar, fVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void p(AbstractC1167A.i iVar, Long l3, Long l4, AbstractC1167A.z zVar) {
        FirebaseFirestore firebaseFirestoreD0 = d0(iVar);
        final String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        r1.o oVar = new r1.o(new o.b() { // from class: q1.p
            @Override // r1.o.b
            public final void a(S0 s02) {
                this.f11038a.y0(lowerCase, s02);
            }
        }, firebaseFirestoreD0, lowerCase, l3, l4);
        C0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, oVar);
        this.f11073i.put(lowerCase, oVar);
        zVar.a(lowerCase);
    }

    @Override // q1.AbstractC1167A.g
    public void q(AbstractC1167A.i iVar, String str, AbstractC1167A.t tVar, final AbstractC1167A.c cVar, final List list, Boolean bool, final AbstractC1167A.z zVar) {
        AbstractC0715a abstractC0715aB;
        D0 d0G = s1.r.g(d0(iVar), str, bool.booleanValue(), tVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1167A.a aVar = (AbstractC1167A.a) it.next();
            int i3 = a.f11074a[aVar.c().ordinal()];
            if (i3 == 1) {
                abstractC0715aB = AbstractC0715a.b();
            } else if (i3 == 2) {
                abstractC0715aB = AbstractC0715a.f(aVar.b());
            } else if (i3 == 3) {
                abstractC0715aB = AbstractC0715a.a(aVar.b());
            }
            arrayList.add(abstractC0715aB);
        }
        final C0721d c0721dI = d0G.i((AbstractC0715a) arrayList.get(0), (AbstractC0715a[]) arrayList.subList(1, arrayList.size()).toArray(new AbstractC0715a[0]));
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.v
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.h0(c0721dI, cVar, list, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void r(final AbstractC1167A.i iVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.i
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.k0(iVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void s(String str, AbstractC1167A.x xVar, List list, AbstractC1167A.z zVar) {
        r1.f fVar = (r1.f) this.f11073i.get(str);
        Objects.requireNonNull(fVar);
        fVar.a(xVar, list);
        zVar.a(null);
    }

    @Override // q1.AbstractC1167A.g
    public void t(final AbstractC1167A.i iVar, final List list, final Map map, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.n
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.q0(iVar, list, map, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void u(final AbstractC1167A.i iVar, final AbstractC1167A.l lVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.w
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.t0(iVar, lVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void v(final AbstractC1167A.i iVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.q
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.p0(iVar, zVar);
            }
        });
    }

    @Override // q1.AbstractC1167A.g
    public void w(AbstractC1167A.i iVar, byte[] bArr, AbstractC1167A.z zVar) {
        zVar.a(D0("plugins.flutter.io/firebase_firestore/loadBundle", new r1.e(d0(iVar), bArr)));
    }

    @Override // q1.AbstractC1167A.g
    public void x(final AbstractC1167A.i iVar, final AbstractC1167A.f fVar, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.l
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.m0(fVar, iVar, zVar);
            }
        });
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        E0();
        this.f11068d = null;
    }

    @Override // q1.AbstractC1167A.g
    public void z(final AbstractC1167A.i iVar, final List list, final AbstractC1167A.z zVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q1.t
            @Override // java.lang.Runnable
            public final void run() {
                C1192y.B0(iVar, list, zVar);
            }
        });
    }
}
