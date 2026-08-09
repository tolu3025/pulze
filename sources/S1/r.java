package s1;

import android.util.Log;
import com.google.firebase.firestore.AbstractC0764z;
import com.google.firebase.firestore.C0731i;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.D0;
import com.google.firebase.firestore.EnumC0718b0;
import com.google.firebase.firestore.EnumC0725f;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.G0;
import com.google.firebase.firestore.O0;
import com.google.firebase.firestore.P0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q1.AbstractC1167A;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f11271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f11272e;

        static {
            int[] iArr = new int[AbstractC1167A.c.values().length];
            f11272e = iArr;
            try {
                iArr[AbstractC1167A.c.SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[AbstractC1167A.k.values().length];
            f11271d = iArr2;
            try {
                iArr2[AbstractC1167A.k.DEFAULT_SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11271d[AbstractC1167A.k.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[C0731i.a.values().length];
            f11270c = iArr3;
            try {
                iArr3[C0731i.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11270c[C0731i.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11270c[C0731i.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[AbstractC1167A.EnumC0162A.values().length];
            f11269b = iArr4;
            try {
                iArr4[AbstractC1167A.EnumC0162A.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11269b[AbstractC1167A.EnumC0162A.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11269b[AbstractC1167A.EnumC0162A.PREVIOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[AbstractC1167A.B.values().length];
            f11268a = iArr5;
            try {
                iArr5[AbstractC1167A.B.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11268a[AbstractC1167A.B.SERVER_AND_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11268a[AbstractC1167A.B.SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static AbstractC0764z a(Map map) {
        C0760x c0760x;
        Object obj;
        if (!map.containsKey("fieldPath")) {
            String str = (String) map.get("op");
            List list = (List) map.get("queries");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((Map) it.next()));
            }
            if (str.equals("OR")) {
                return AbstractC0764z.l((AbstractC0764z[]) arrayList.toArray(new AbstractC0764z[0]));
            }
            if (str.equals("AND")) {
                return AbstractC0764z.a((AbstractC0764z[]) arrayList.toArray(new AbstractC0764z[0]));
            }
            throw new Error("Invalid operator");
        }
        String str2 = (String) map.get("op");
        c0760x = (C0760x) map.get("fieldPath");
        obj = map.get("value");
        str2.hashCode();
        switch (str2) {
            case "not-in":
                return AbstractC0764z.k(c0760x, (List) obj);
            case "<":
                return AbstractC0764z.h(c0760x, obj);
            case ">":
                return AbstractC0764z.e(c0760x, obj);
            case "!=":
                return AbstractC0764z.j(c0760x, obj);
            case "<=":
                return AbstractC0764z.i(c0760x, obj);
            case "==":
                return AbstractC0764z.d(c0760x, obj);
            case ">=":
                return AbstractC0764z.f(c0760x, obj);
            case "in":
                return AbstractC0764z.g(c0760x, (List) obj);
            case "array-contains":
                return AbstractC0764z.b(c0760x, obj);
            case "array-contains-any":
                return AbstractC0764z.c(c0760x, (List) obj);
            default:
                throw new Error("Invalid operator");
        }
    }

    public static EnumC0725f b(AbstractC1167A.c cVar) {
        if (a.f11272e[cVar.ordinal()] == 1) {
            return EnumC0725f.SERVER;
        }
        throw new IllegalArgumentException("Unknown AggregateSource value: " + cVar);
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0760x.d((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    public static EnumC0718b0 d(AbstractC1167A.k kVar) {
        int i3 = a.f11271d[kVar.ordinal()];
        if (i3 == 1) {
            return EnumC0718b0.DEFAULT;
        }
        if (i3 == 2) {
            return EnumC0718b0.CACHE;
        }
        throw new IllegalArgumentException("Unknown ListenSource value: " + kVar);
    }

    public static C0754u.a e(AbstractC1167A.EnumC0162A enumC0162A) {
        if (enumC0162A == null) {
            return C0754u.a.NONE;
        }
        int i3 = a.f11269b[enumC0162A.ordinal()];
        if (i3 == 1) {
            return C0754u.a.NONE;
        }
        if (i3 == 2) {
            return C0754u.a.ESTIMATE;
        }
        if (i3 == 3) {
            return C0754u.a.PREVIOUS;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: " + enumC0162A);
    }

    public static P0 f(AbstractC1167A.B b3) {
        int i3 = a.f11268a[b3.ordinal()];
        if (i3 == 1) {
            return P0.CACHE;
        }
        if (i3 == 2) {
            return P0.DEFAULT;
        }
        if (i3 == 3) {
            return P0.SERVER;
        }
        throw new IllegalArgumentException("Unknown source: " + b3);
    }

    public static D0 g(FirebaseFirestore firebaseFirestore, String str, boolean z2, AbstractC1167A.t tVar) {
        try {
            D0 d0W = z2 ? firebaseFirestore.w(str) : firebaseFirestore.v(str);
            if (tVar == null) {
                return d0W;
            }
            if (tVar.d() != null) {
                d0W = d0W.M(a(tVar.d()));
            }
            List<List> listJ = tVar.j();
            Objects.requireNonNull(listJ);
            for (List list : listJ) {
                C0760x c0760x = (C0760x) list.get(0);
                String str2 = (String) list.get(1);
                Object obj = list.get(2);
                if ("==".equals(str2)) {
                    d0W = d0W.P(c0760x, obj);
                } else if ("!=".equals(str2)) {
                    d0W = d0W.V(c0760x, obj);
                } else if ("<".equals(str2)) {
                    d0W = d0W.T(c0760x, obj);
                } else if ("<=".equals(str2)) {
                    d0W = d0W.U(c0760x, obj);
                } else if (">".equals(str2)) {
                    d0W = d0W.Q(c0760x, obj);
                } else if (">=".equals(str2)) {
                    d0W = d0W.R(c0760x, obj);
                } else if ("array-contains".equals(str2)) {
                    d0W = d0W.N(c0760x, obj);
                } else if ("array-contains-any".equals(str2)) {
                    d0W = d0W.O(c0760x, (List) obj);
                } else if ("in".equals(str2)) {
                    d0W = d0W.S(c0760x, (List) obj);
                } else if ("not-in".equals(str2)) {
                    d0W = d0W.W(c0760x, (List) obj);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long lE = tVar.e();
            if (lE != null) {
                d0W = d0W.y(lE.longValue());
            }
            Long lF = tVar.f();
            if (lF != null) {
                d0W = d0W.z(lF.longValue());
            }
            List<List> listG = tVar.g();
            if (listG == null) {
                return d0W;
            }
            for (List list2 : listG) {
                d0W = d0W.B((C0760x) list2.get(0), ((Boolean) list2.get(1)).booleanValue() ? D0.c.DESCENDING : D0.c.ASCENDING);
            }
            List listI = tVar.i();
            if (listI != null) {
                Object[] array = listI.toArray();
                Objects.requireNonNull(array);
                d0W = d0W.H(array);
            }
            List listH = tVar.h();
            if (listH != null) {
                Object[] array2 = listH.toArray();
                Objects.requireNonNull(array2);
                d0W = d0W.G(array2);
            }
            List listB = tVar.b();
            if (listB != null) {
                Object[] array3 = listB.toArray();
                Objects.requireNonNull(array3);
                d0W = d0W.l(array3);
            }
            List listC = tVar.c();
            if (listC == null) {
                return d0W;
            }
            Object[] array4 = listC.toArray();
            Objects.requireNonNull(array4);
            return d0W.m(array4);
        } catch (Exception e3) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e3);
            return null;
        }
    }

    public static AbstractC1167A.m h(C0731i c0731i, C0754u.a aVar) {
        AbstractC1167A.m.a aVar2 = new AbstractC1167A.m.a();
        aVar2.e(i(c0731i.d()));
        aVar2.d(Long.valueOf(c0731i.c()));
        aVar2.c(Long.valueOf(c0731i.b()));
        aVar2.b(k(c0731i.a(), aVar));
        return aVar2.a();
    }

    public static AbstractC1167A.e i(C0731i.a aVar) {
        int i3 = a.f11270c[aVar.ordinal()];
        if (i3 == 1) {
            return AbstractC1167A.e.ADDED;
        }
        if (i3 == 2) {
            return AbstractC1167A.e.MODIFIED;
        }
        if (i3 == 3) {
            return AbstractC1167A.e.REMOVED;
        }
        throw new IllegalArgumentException("Unknown change type: " + aVar);
    }

    public static List j(List list, C0754u.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((C0731i) it.next(), aVar));
        }
        return arrayList;
    }

    public static AbstractC1167A.o k(C0754u c0754u, C0754u.a aVar) {
        AbstractC1167A.o.a aVar2 = new AbstractC1167A.o.a();
        aVar2.c(n(c0754u.f()));
        aVar2.b(c0754u.e(aVar));
        aVar2.d(c0754u.g().s());
        return aVar2.a();
    }

    public static List l(List list, C0754u.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k((C0754u) it.next(), aVar));
        }
        return arrayList;
    }

    public static AbstractC1167A.u m(G0 g02, C0754u.a aVar) {
        AbstractC1167A.u.a aVar2 = new AbstractC1167A.u.a();
        aVar2.d(n(g02.n()));
        aVar2.b(j(g02.f(), aVar));
        aVar2.c(l(g02.m(), aVar));
        return aVar2.a();
    }

    public static AbstractC1167A.v n(O0 o02) {
        AbstractC1167A.v.a aVar = new AbstractC1167A.v.a();
        aVar.b(Boolean.valueOf(o02.a()));
        aVar.c(Boolean.valueOf(o02.b()));
        return aVar.a();
    }
}
