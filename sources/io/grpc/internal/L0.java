package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import e0.AbstractC0836q;
import io.grpc.internal.D0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.c0;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class L0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f8626b;

        public a(String str, Map map) {
            this.f8625a = (String) AbstractC0829j.o(str, "policyName");
            this.f8626b = (Map) AbstractC0829j.o(map, "rawConfigValue");
        }

        public String a() {
            return this.f8625a;
        }

        public Map b() {
            return this.f8626b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8625a.equals(aVar.f8625a) && this.f8626b.equals(aVar.f8626b);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f8625a, this.f8626b);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("policyName", this.f8625a).d("rawConfigValue", this.f8626b).toString();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y1.T f8627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f8628b;

        public b(y1.T t2, Object obj) {
            this.f8627a = (y1.T) AbstractC0829j.o(t2, "provider");
            this.f8628b = obj;
        }

        public Object a() {
            return this.f8628b;
        }

        public y1.T b() {
            return this.f8627a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC0826g.a(this.f8627a, bVar.f8627a) && AbstractC0826g.a(this.f8628b, bVar.f8628b);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f8627a, this.f8628b);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("provider", this.f8627a).d("config", this.f8628b).toString();
        }
    }

    public static List A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z((Map) it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Double a(Map map) {
        return AbstractC0936c0.h(map, "backoffMultiplier");
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        return AbstractC0936c0.j(map, "healthCheckConfig");
    }

    static Long c(Map map) {
        return AbstractC0936c0.l(map, "hedgingDelay");
    }

    static Map d(Map map) {
        return AbstractC0936c0.j(map, "hedgingPolicy");
    }

    static Long e(Map map) {
        return AbstractC0936c0.l(map, "initialBackoff");
    }

    private static Set f(Map map, String str) {
        List listE = AbstractC0936c0.e(map, str);
        if (listE == null) {
            return null;
        }
        return u(listE);
    }

    public static List g(Map map) {
        String strK;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(AbstractC0936c0.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strK = AbstractC0936c0.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strK.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Integer h(Map map) {
        return AbstractC0936c0.i(map, "maxAttempts");
    }

    static Integer i(Map map) {
        return AbstractC0936c0.i(map, "maxAttempts");
    }

    static Long j(Map map) {
        return AbstractC0936c0.l(map, "maxBackoff");
    }

    static Integer k(Map map) {
        return AbstractC0936c0.i(map, "maxRequestMessageBytes");
    }

    static Integer l(Map map) {
        return AbstractC0936c0.i(map, "maxResponseMessageBytes");
    }

    static List m(Map map) {
        return AbstractC0936c0.f(map, "methodConfig");
    }

    static String n(Map map) {
        return AbstractC0936c0.k(map, "method");
    }

    static List o(Map map) {
        return AbstractC0936c0.f(map, "name");
    }

    static Set p(Map map) {
        Set setF = f(map, "nonFatalStatusCodes");
        if (setF == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(l0.b.class));
        }
        AbstractC0836q.a(!setF.contains(l0.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setF;
    }

    static Long q(Map map) {
        return AbstractC0936c0.l(map, "perAttemptRecvTimeout");
    }

    static Map r(Map map) {
        return AbstractC0936c0.j(map, "retryPolicy");
    }

    static Set s(Map map) {
        Set setF = f(map, "retryableStatusCodes");
        AbstractC0836q.a(setF != null, "%s is required in retry policy", "retryableStatusCodes");
        AbstractC0836q.a(true ^ setF.contains(l0.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setF;
    }

    static String t(Map map) {
        return AbstractC0936c0.k(map, "service");
    }

    private static Set u(List list) {
        l0.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(l0.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d3 = (Double) obj;
                int iIntValue = d3.intValue();
                AbstractC0836q.a(((double) iIntValue) == d3.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = y1.l0.h(iIntValue).m();
                AbstractC0836q.a(bVarValueOf.g() == d3.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new e0.r("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = l0.b.valueOf((String) obj);
                } catch (IllegalArgumentException e3) {
                    throw new e0.r("Status code " + obj + " is not valid", e3);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    static D0.D v(Map map) {
        Map mapJ;
        if (map == null || (mapJ = AbstractC0936c0.j(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = AbstractC0936c0.h(mapJ, "maxTokens").floatValue();
        float fFloatValue2 = AbstractC0936c0.h(mapJ, "tokenRatio").floatValue();
        AbstractC0829j.u(fFloatValue > 0.0f, "maxToken should be greater than zero");
        AbstractC0829j.u(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new D0.D(fFloatValue, fFloatValue2);
    }

    static Long w(Map map) {
        return AbstractC0936c0.l(map, "timeout");
    }

    static Boolean x(Map map) {
        return AbstractC0936c0.d(map, "waitForReady");
    }

    public static c0.b y(List list, y1.U u2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strA = aVar.a();
            y1.T tD = u2.d(strA);
            if (tD != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(L0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                c0.b bVarE = tD.e(aVar.b());
                return bVarE.d() != null ? bVarE : c0.b.a(new b(tD, bVarE.c()));
            }
            arrayList.add(strA);
        }
        return c0.b.b(y1.l0.f11962g.q("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new a(str, AbstractC0936c0.j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
