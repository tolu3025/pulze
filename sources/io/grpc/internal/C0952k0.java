package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;
import e0.AbstractC0832m;
import io.grpc.internal.D0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y1.AbstractC1295G;
import y1.C1300c;
import y1.S;

/* JADX INFO: renamed from: io.grpc.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0952k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f9140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.D f9143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9145f;

    /* JADX INFO: renamed from: io.grpc.internal.k0$b */
    static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final C1300c.C0193c f9146g = C1300c.C0193c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Long f9147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Boolean f9148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Integer f9149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Integer f9150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final E0 f9151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final U f9152f;

        b(Map map, boolean z2, int i3, int i4) {
            this.f9147a = L0.w(map);
            this.f9148b = L0.x(map);
            Integer numL = L0.l(map);
            this.f9149c = numL;
            if (numL != null) {
                AbstractC0829j.j(numL.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numL);
            }
            Integer numK = L0.k(map);
            this.f9150d = numK;
            if (numK != null) {
                AbstractC0829j.j(numK.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numK);
            }
            Map mapR = z2 ? L0.r(map) : null;
            this.f9151e = mapR == null ? null : b(mapR, i3);
            Map mapD = z2 ? L0.d(map) : null;
            this.f9152f = mapD != null ? a(mapD, i4) : null;
        }

        private static U a(Map map, int i3) {
            int iIntValue = ((Integer) AbstractC0829j.o(L0.h(map), "maxAttempts cannot be empty")).intValue();
            AbstractC0829j.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i3);
            long jLongValue = ((Long) AbstractC0829j.o(L0.c(map), "hedgingDelay cannot be empty")).longValue();
            AbstractC0829j.i(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new U(iMin, jLongValue, L0.p(map));
        }

        private static E0 b(Map map, int i3) {
            int iIntValue = ((Integer) AbstractC0829j.o(L0.i(map), "maxAttempts cannot be empty")).intValue();
            AbstractC0829j.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i3);
            long jLongValue = ((Long) AbstractC0829j.o(L0.e(map), "initialBackoff cannot be empty")).longValue();
            AbstractC0829j.i(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) AbstractC0829j.o(L0.j(map), "maxBackoff cannot be empty")).longValue();
            AbstractC0829j.i(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d3 = (Double) AbstractC0829j.o(L0.a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d3.doubleValue();
            AbstractC0829j.j(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d3);
            Long lQ = L0.q(map);
            AbstractC0829j.j(lQ == null || lQ.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lQ);
            Set setS = L0.s(map);
            AbstractC0829j.e((lQ == null && setS.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new E0(iMin, jLongValue, jLongValue2, dDoubleValue, lQ, setS);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC0826g.a(this.f9147a, bVar.f9147a) && AbstractC0826g.a(this.f9148b, bVar.f9148b) && AbstractC0826g.a(this.f9149c, bVar.f9149c) && AbstractC0826g.a(this.f9150d, bVar.f9150d) && AbstractC0826g.a(this.f9151e, bVar.f9151e) && AbstractC0826g.a(this.f9152f, bVar.f9152f);
        }

        public int hashCode() {
            return AbstractC0826g.b(this.f9147a, this.f9148b, this.f9149c, this.f9150d, this.f9151e, this.f9152f);
        }

        public String toString() {
            return AbstractC0825f.b(this).d("timeoutNanos", this.f9147a).d("waitForReady", this.f9148b).d("maxInboundMessageSize", this.f9149c).d("maxOutboundMessageSize", this.f9150d).d("retryPolicy", this.f9151e).d("hedgingPolicy", this.f9152f).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.k0$c */
    static final class c extends AbstractC1295G {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C0952k0 f9153b;

        private c(C0952k0 c0952k0) {
            this.f9153b = c0952k0;
        }

        @Override // y1.AbstractC1295G
        public AbstractC1295G.b a(S.g gVar) {
            return AbstractC1295G.b.d().b(this.f9153b).a();
        }
    }

    C0952k0(b bVar, Map map, Map map2, D0.D d3, Object obj, Map map3) {
        this.f9140a = bVar;
        this.f9141b = Collections.unmodifiableMap(new HashMap(map));
        this.f9142c = Collections.unmodifiableMap(new HashMap(map2));
        this.f9143d = d3;
        this.f9144e = obj;
        this.f9145f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static C0952k0 a() {
        return new C0952k0(null, new HashMap(), new HashMap(), null, null, null);
    }

    static C0952k0 b(Map map, boolean z2, int i3, int i4, Object obj) {
        D0.D dV = z2 ? L0.v(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapB = L0.b(map);
        List<Map> listM = L0.m(map);
        if (listM == null) {
            return new C0952k0(null, map2, map3, dV, obj, mapB);
        }
        b bVar = null;
        for (Map map4 : listM) {
            b bVar2 = new b(map4, z2, i3, i4);
            List<Map> listO = L0.o(map4);
            if (listO != null && !listO.isEmpty()) {
                for (Map map5 : listO) {
                    String strT = L0.t(map5);
                    String strN = L0.n(map5);
                    if (AbstractC0832m.a(strT)) {
                        AbstractC0829j.j(AbstractC0832m.a(strN), "missing service name for method %s", strN);
                        AbstractC0829j.j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (AbstractC0832m.a(strN)) {
                        AbstractC0829j.j(!map3.containsKey(strT), "Duplicate service %s", strT);
                        map3.put(strT, bVar2);
                    } else {
                        String strB = y1.a0.b(strT, strN);
                        AbstractC0829j.j(!map2.containsKey(strB), "Duplicate method name %s", strB);
                        map2.put(strB, bVar2);
                    }
                }
            }
        }
        return new C0952k0(bVar, map2, map3, dV, obj, mapB);
    }

    AbstractC1295G c() {
        if (this.f9142c.isEmpty() && this.f9141b.isEmpty() && this.f9140a == null) {
            return null;
        }
        return new c();
    }

    Map d() {
        return this.f9145f;
    }

    Object e() {
        return this.f9144e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0952k0.class != obj.getClass()) {
            return false;
        }
        C0952k0 c0952k0 = (C0952k0) obj;
        return AbstractC0826g.a(this.f9140a, c0952k0.f9140a) && AbstractC0826g.a(this.f9141b, c0952k0.f9141b) && AbstractC0826g.a(this.f9142c, c0952k0.f9142c) && AbstractC0826g.a(this.f9143d, c0952k0.f9143d) && AbstractC0826g.a(this.f9144e, c0952k0.f9144e);
    }

    b f(y1.a0 a0Var) {
        b bVar = (b) this.f9141b.get(a0Var.c());
        if (bVar == null) {
            bVar = (b) this.f9142c.get(a0Var.d());
        }
        return bVar == null ? this.f9140a : bVar;
    }

    D0.D g() {
        return this.f9143d;
    }

    public int hashCode() {
        return AbstractC0826g.b(this.f9140a, this.f9141b, this.f9142c, this.f9143d, this.f9144e);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("defaultMethodConfig", this.f9140a).d("serviceMethodMap", this.f9141b).d("serviceMap", this.f9142c).d("retryThrottling", this.f9143d).d("loadBalancingConfig", this.f9144e).toString();
    }
}
