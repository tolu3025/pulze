package r1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.M0;
import com.google.firebase.firestore.S0;
import com.google.firebase.firestore.T;
import com.google.firebase.firestore.T0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import l1.C1018d;
import q1.AbstractC1167A;
import q1.C1193z;
import s1.AbstractC1210a;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
public class o implements f, C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f11204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FirebaseFirestore f11205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f11206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Long f11207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Long f11208e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AbstractC1167A.x f11210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f11211h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Semaphore f11209f = new Semaphore(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Handler f11212i = new Handler(Looper.getMainLooper());

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11213a;

        static {
            int[] iArr = new int[AbstractC1167A.y.values().length];
            f11213a = iArr;
            try {
                iArr[AbstractC1167A.y.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11213a[AbstractC1167A.y.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11213a[AbstractC1167A.y.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface b {
        void a(S0 s02);
    }

    public o(b bVar, FirebaseFirestore firebaseFirestore, String str, Long l3, Long l4) {
        this.f11204a = bVar;
        this.f11205b = firebaseFirestore;
        this.f11206c = str;
        this.f11207d = l3;
        this.f11208e = l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1193z i(final C1018d.b bVar, S0 s02) {
        M0 m0D;
        C0760x c0760xD;
        this.f11204a.a(s02);
        final HashMap map = new HashMap();
        map.put("appName", this.f11205b.A().q());
        this.f11212i.post(new Runnable() { // from class: r1.n
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a(map);
            }
        });
        try {
            if (!this.f11209f.tryAcquire(this.f11207d.longValue(), TimeUnit.MILLISECONDS)) {
                return C1193z.b(new T("timed out", T.a.DEADLINE_EXCEEDED));
            }
            if (this.f11211h.isEmpty()) {
                return C1193z.a();
            }
            if (this.f11210g == AbstractC1167A.x.FAILURE) {
                return C1193z.a();
            }
            for (AbstractC1167A.w wVar : this.f11211h) {
                C0752t c0752tY = this.f11205b.y(wVar.d());
                int i3 = a.f11213a[wVar.e().ordinal()];
                if (i3 == 1) {
                    s02.b(c0752tY);
                } else if (i3 == 2) {
                    Map mapB = wVar.b();
                    Objects.requireNonNull(mapB);
                    Map map2 = mapB;
                    HashMap map3 = new HashMap();
                    for (Object obj : map2.keySet()) {
                        if (obj instanceof String) {
                            c0760xD = C0760x.d((String) obj);
                        } else if (obj instanceof C0760x) {
                            c0760xD = (C0760x) obj;
                        }
                        map3.put(c0760xD, map2.get(obj));
                    }
                    C0760x c0760x = (C0760x) map3.keySet().iterator().next();
                    Object obj2 = map3.get(c0760x);
                    ArrayList arrayList = new ArrayList();
                    for (C0760x c0760x2 : map3.keySet()) {
                        if (!c0760x2.equals(c0760x)) {
                            arrayList.add(c0760x2);
                            arrayList.add(map3.get(c0760x2));
                        }
                    }
                    s02.i(c0752tY, c0760x, obj2, arrayList.toArray());
                } else if (i3 == 3) {
                    AbstractC1167A.n nVarC = wVar.c();
                    Objects.requireNonNull(nVarC);
                    if (nVarC.b() != null && nVarC.b().booleanValue()) {
                        m0D = M0.c();
                    } else if (nVarC.c() != null) {
                        List listC = nVarC.c();
                        Objects.requireNonNull(listC);
                        m0D = M0.d(r.c(listC));
                    } else {
                        m0D = null;
                    }
                    Map mapB2 = wVar.b();
                    Objects.requireNonNull(mapB2);
                    Map map4 = mapB2;
                    if (m0D == null) {
                        s02.f(c0752tY, map4);
                    } else {
                        s02.g(c0752tY, map4, m0D);
                    }
                }
            }
            return C1193z.a();
        } catch (InterruptedException unused) {
            return C1193z.b(new T("interrupted", T.a.DEADLINE_EXCEEDED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(C1018d.b bVar, HashMap map) {
        bVar.a(map);
        bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(final C1018d.b bVar, Task task) {
        String str;
        Object objA;
        final HashMap map = new HashMap();
        if (task.getException() == null && ((C1193z) task.getResult()).f11077a == null) {
            if (task.getResult() != null) {
                objA = Boolean.TRUE;
                str = "complete";
            }
            this.f11212i.post(new Runnable() { // from class: r1.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.j(bVar, map);
                }
            });
        }
        Exception exception = task.getException() != null ? task.getException() : ((C1193z) task.getResult()).f11077a;
        map.put("appName", this.f11205b.A().q());
        str = "error";
        objA = AbstractC1210a.a(exception);
        map.put(str, objA);
        this.f11212i.post(new Runnable() { // from class: r1.m
            @Override // java.lang.Runnable
            public final void run() {
                o.j(bVar, map);
            }
        });
    }

    @Override // r1.f
    public void a(AbstractC1167A.x xVar, List list) {
        this.f11210g = xVar;
        this.f11211h = list;
        this.f11209f.release();
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        this.f11209f.release();
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        this.f11205b.Y(new T0.b().b(this.f11208e.intValue()).a(), new S0.a() { // from class: r1.k
            @Override // com.google.firebase.firestore.S0.a
            public final Object a(S0 s02) {
                return this.f11196a.i(bVar, s02);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: r1.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f11198a.k(bVar, task);
            }
        });
    }
}
