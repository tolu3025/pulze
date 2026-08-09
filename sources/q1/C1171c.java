package q1;

import android.util.Log;
import com.google.firebase.firestore.AbstractC0762y;
import com.google.firebase.firestore.AbstractC0764z;
import com.google.firebase.firestore.C0726f0;
import com.google.firebase.firestore.C0727g;
import com.google.firebase.firestore.C0730h0;
import com.google.firebase.firestore.C0731i;
import com.google.firebase.firestore.C0748q0;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.D0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.G0;
import com.google.firebase.firestore.InterfaceC0728g0;
import com.google.firebase.firestore.O0;
import com.google.firebase.firestore.U;
import com.google.firebase.firestore.X0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k0.C0992f;
import k0.C1004r;

/* JADX INFO: renamed from: q1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1171c extends l1.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1171c f11001d = new C1171c();

    /* JADX INFO: renamed from: q1.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11003b;

        static {
            int[] iArr = new int[C0726f0.a.values().length];
            f11003b = iArr;
            try {
                iArr[C0726f0.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11003b[C0726f0.a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11003b[C0726f0.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C0731i.a.values().length];
            f11002a = iArr2;
            try {
                iArr2[C0731i.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11002a[C0731i.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11002a[C0731i.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C1171c() {
    }

    private AbstractC0764z q(Map map) {
        C0760x c0760x;
        Object obj;
        if (!map.containsKey("fieldPath")) {
            String str = (String) map.get("op");
            List list = (List) map.get("queries");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q((Map) it.next()));
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

    private FirebaseFirestore r(ByteBuffer byteBuffer) {
        String str = (String) f(byteBuffer);
        String str2 = (String) f(byteBuffer);
        com.google.firebase.firestore.U u2 = (com.google.firebase.firestore.U) f(byteBuffer);
        synchronized (C1192y.f11065j) {
            try {
                FirebaseFirestore firebaseFirestoreE0 = C1192y.e0(str, str2);
                if (firebaseFirestoreE0 != null) {
                    return firebaseFirestoreE0;
                }
                FirebaseFirestore firebaseFirestoreC = FirebaseFirestore.C(C0992f.p(str), str2);
                firebaseFirestoreC.a0(u2);
                C1192y.F0(firebaseFirestoreC, str2);
                return firebaseFirestoreC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private D0 s(ByteBuffer byteBuffer) {
        try {
            Map map = (Map) f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean zBooleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            D0 d0W = zBooleanValue ? firebaseFirestore.w(str) : firebaseFirestore.v(str);
            if (map2 == null) {
                return d0W;
            }
            if (map2.containsKey("filters")) {
                Object obj3 = map2.get("filters");
                Objects.requireNonNull(obj3);
                d0W = d0W.M(q((Map) obj3));
            }
            Object obj4 = map2.get("where");
            Objects.requireNonNull(obj4);
            for (List list : (List) obj4) {
                C0760x c0760x = (C0760x) list.get(0);
                String str2 = (String) list.get(1);
                Object obj5 = list.get(2);
                if ("==".equals(str2)) {
                    d0W = d0W.P(c0760x, obj5);
                } else if ("!=".equals(str2)) {
                    d0W = d0W.V(c0760x, obj5);
                } else if ("<".equals(str2)) {
                    d0W = d0W.T(c0760x, obj5);
                } else if ("<=".equals(str2)) {
                    d0W = d0W.U(c0760x, obj5);
                } else if (">".equals(str2)) {
                    d0W = d0W.Q(c0760x, obj5);
                } else if (">=".equals(str2)) {
                    d0W = d0W.R(c0760x, obj5);
                } else if ("array-contains".equals(str2)) {
                    d0W = d0W.N(c0760x, obj5);
                } else if ("array-contains-any".equals(str2)) {
                    d0W = d0W.O(c0760x, (List) obj5);
                } else if ("in".equals(str2)) {
                    d0W = d0W.S(c0760x, (List) obj5);
                } else if ("not-in".equals(str2)) {
                    d0W = d0W.W(c0760x, (List) obj5);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                d0W = d0W.y(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                d0W = d0W.z(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return d0W;
            }
            for (List list3 : list2) {
                d0W = d0W.B((C0760x) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? D0.c.DESCENDING : D0.c.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                d0W = d0W.H(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                d0W = d0W.G(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                d0W = d0W.l(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return d0W;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            return d0W.m(array4);
        } catch (Exception e3) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e3);
            return null;
        }
    }

    private com.google.firebase.firestore.U t(ByteBuffer byteBuffer) {
        InterfaceC0728g0 interfaceC0728g0A;
        Map map = (Map) f(byteBuffer);
        U.b bVar = new U.b();
        if (map.get("persistenceEnabled") != null) {
            if (Boolean.TRUE.equals((Boolean) map.get("persistenceEnabled"))) {
                C0748q0.b bVarB = C0748q0.b();
                if (map.get("cacheSizeBytes") != null) {
                    Long lValueOf = 104857600L;
                    Object obj = map.get("cacheSizeBytes");
                    if (obj instanceof Long) {
                        lValueOf = (Long) obj;
                    } else if (obj instanceof Integer) {
                        lValueOf = Long.valueOf(((Integer) obj).intValue());
                    }
                    if (lValueOf.longValue() == -1) {
                        bVarB.b(-1L);
                    } else {
                        bVarB.b(lValueOf.longValue());
                    }
                }
                interfaceC0728g0A = bVarB.a();
            } else {
                interfaceC0728g0A = C0730h0.b().a();
            }
            bVar.h(interfaceC0728g0A);
        }
        if (map.get("host") != null) {
            Object obj2 = map.get("host");
            Objects.requireNonNull(obj2);
            bVar.g((String) obj2);
            if (map.get("sslEnabled") != null) {
                Object obj3 = map.get("sslEnabled");
                Objects.requireNonNull(obj3);
                bVar.i(((Boolean) obj3).booleanValue());
            }
        }
        return bVar.f();
    }

    private Object[] u(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", obj.getClass().getCanonicalName()));
    }

    private void v(ByteArrayOutputStream byteArrayOutputStream, C0731i c0731i) {
        HashMap map = new HashMap();
        int i3 = a.f11002a[c0731i.d().ordinal()];
        map.put("type", i3 != 1 ? i3 != 2 ? i3 != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        map.put("data", c0731i.a().d());
        map.put("path", c0731i.a().g().s());
        map.put("oldIndex", Integer.valueOf(c0731i.c()));
        map.put("newIndex", Integer.valueOf(c0731i.b()));
        map.put("metadata", c0731i.a().f());
        p(byteArrayOutputStream, map);
    }

    private void w(ByteArrayOutputStream byteArrayOutputStream, C0754u c0754u) {
        Map mapE;
        HashMap map = new HashMap();
        map.put("path", c0754u.g().s());
        if (c0754u.a()) {
            C0754u.a aVar = (C0754u.a) C1192y.f11066k.get(Integer.valueOf(c0754u.hashCode()));
            mapE = aVar != null ? c0754u.e(aVar) : c0754u.d();
        } else {
            mapE = null;
        }
        map.put("data", mapE);
        map.put("metadata", c0754u.f());
        C1192y.f11066k.remove(Integer.valueOf(c0754u.hashCode()));
        p(byteArrayOutputStream, map);
    }

    private void x(ByteArrayOutputStream byteArrayOutputStream, C0726f0 c0726f0) {
        HashMap map = new HashMap();
        map.put("bytesLoaded", Long.valueOf(c0726f0.c()));
        map.put("documentsLoaded", Integer.valueOf(c0726f0.d()));
        map.put("totalBytes", Long.valueOf(c0726f0.f()));
        map.put("totalDocuments", Integer.valueOf(c0726f0.g()));
        int i3 = a.f11003b[c0726f0.e().ordinal()];
        String str = "running";
        if (i3 != 1) {
            if (i3 == 2) {
                str = "success";
            } else if (i3 == 3) {
                str = "error";
            }
        }
        map.put("taskState", str);
        p(byteArrayOutputStream, map);
    }

    private void y(ByteArrayOutputStream byteArrayOutputStream, G0 g02) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C0754u.a aVar = (C0754u.a) C1192y.f11066k.get(Integer.valueOf(g02.hashCode()));
        for (C0754u c0754u : g02.m()) {
            arrayList.add(c0754u.g().s());
            arrayList2.add(aVar != null ? c0754u.e(aVar) : c0754u.d());
            arrayList3.add(c0754u.f());
        }
        map.put("paths", arrayList);
        map.put("documents", arrayList2);
        map.put("metadatas", arrayList3);
        map.put("documentChanges", g02.f());
        map.put("metadata", g02.n());
        C1192y.f11066k.remove(Integer.valueOf(g02.hashCode()));
        p(byteArrayOutputStream, map);
    }

    private void z(ByteArrayOutputStream byteArrayOutputStream, O0 o02) {
        HashMap map = new HashMap();
        map.put("hasPendingWrites", Boolean.valueOf(o02.a()));
        map.put("isFromCache", Boolean.valueOf(o02.b()));
        p(byteArrayOutputStream, map);
    }

    @Override // l1.o
    protected Object g(byte b3, ByteBuffer byteBuffer) {
        switch (b3) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                l1.o.c(byteBuffer, 8);
                return new com.google.firebase.firestore.Z(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) f(byteBuffer)).y((String) f(byteBuffer));
            case -73:
                return C0727g.g(l1.o.d(byteBuffer));
            case -72:
                return AbstractC0762y.b(u(f(byteBuffer)));
            case -71:
                return AbstractC0762y.a(u(f(byteBuffer)));
            case -70:
                return AbstractC0762y.c();
            case -69:
                return AbstractC0762y.g();
            case -68:
                return new C1004r(byteBuffer.getLong(), byteBuffer.getInt());
            case -67:
                return AbstractC0762y.e(((Number) f(byteBuffer)).doubleValue());
            case -66:
                return AbstractC0762y.f(((Number) f(byteBuffer)).intValue());
            case -65:
                return C0760x.a();
            case -64:
                int iE = l1.o.e(byteBuffer);
                ArrayList arrayList = new ArrayList(iE);
                for (int i3 = 0; i3 < iE; i3++) {
                    arrayList.add(f(byteBuffer));
                }
                return C0760x.d((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                return r(byteBuffer);
            case -59:
                return s(byteBuffer);
            case -58:
                return t(byteBuffer);
            case -57:
                ArrayList arrayList2 = (ArrayList) f(byteBuffer);
                double[] dArr = new double[arrayList2.size()];
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    Double d3 = (Double) arrayList2.get(i4);
                    Objects.requireNonNull(d3, "Null value at index " + i4);
                    dArr[i4] = d3.doubleValue();
                }
                return AbstractC0762y.h(dArr);
            default:
                return super.g(b3, byteBuffer);
        }
    }

    @Override // l1.o
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i3;
        String strA;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            l1.o.n(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof C1004r) {
            byteArrayOutputStream.write(-68);
            C1004r c1004r = (C1004r) obj;
            l1.o.n(byteArrayOutputStream, c1004r.l());
            l1.o.m(byteArrayOutputStream, c1004r.i());
            return;
        }
        if (obj instanceof com.google.firebase.firestore.Z) {
            byteArrayOutputStream.write(-75);
            l1.o.h(byteArrayOutputStream, 8);
            com.google.firebase.firestore.Z z2 = (com.google.firebase.firestore.Z) obj;
            l1.o.k(byteArrayOutputStream, z2.e());
            l1.o.k(byteArrayOutputStream, z2.g());
            return;
        }
        if (obj instanceof X0) {
            byteArrayOutputStream.write(-57);
            p(byteArrayOutputStream, ((X0) obj).a());
            return;
        }
        if (obj instanceof C0752t) {
            byteArrayOutputStream.write(-74);
            C0752t c0752t = (C0752t) obj;
            FirebaseFirestore firebaseFirestoreP = c0752t.p();
            p(byteArrayOutputStream, firebaseFirestoreP.A().q());
            p(byteArrayOutputStream, c0752t.s());
            synchronized (C1192y.f11065j) {
                strA = C1192y.c0(firebaseFirestoreP).a();
            }
            p(byteArrayOutputStream, strA);
            return;
        }
        if (obj instanceof C0754u) {
            w(byteArrayOutputStream, (C0754u) obj);
            return;
        }
        if (obj instanceof G0) {
            y(byteArrayOutputStream, (G0) obj);
            return;
        }
        if (obj instanceof C0731i) {
            v(byteArrayOutputStream, (C0731i) obj);
            return;
        }
        if (obj instanceof C0726f0) {
            x(byteArrayOutputStream, (C0726f0) obj);
            return;
        }
        if (obj instanceof O0) {
            z(byteArrayOutputStream, (O0) obj);
            return;
        }
        if (obj instanceof C0727g) {
            byteArrayOutputStream.write(-73);
            l1.o.i(byteArrayOutputStream, ((C0727g) obj).i());
            return;
        }
        if (obj instanceof Double) {
            Double d3 = (Double) obj;
            if (Double.isNaN(d3.doubleValue())) {
                i3 = -63;
            } else if (d3.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                i3 = -61;
            } else if (d3.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                i3 = -62;
            }
            byteArrayOutputStream.write(i3);
            return;
        }
        super.p(byteArrayOutputStream, obj);
    }
}
