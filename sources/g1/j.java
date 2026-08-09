package G1;

import G1.h;
import io.grpc.internal.AbstractC0936c0;
import io.grpc.internal.L0;
import io.grpc.internal.S0;
import java.util.List;
import java.util.Map;
import y1.S;
import y1.T;
import y1.U;
import y1.c0;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends T {
    private c0.b f(Map map) {
        Long l3 = AbstractC0936c0.l(map, "interval");
        Long l4 = AbstractC0936c0.l(map, "baseEjectionTime");
        Long l5 = AbstractC0936c0.l(map, "maxEjectionTime");
        Integer numI = AbstractC0936c0.i(map, "maxEjectionPercentage");
        h.g.a aVar = new h.g.a();
        if (l3 != null) {
            aVar.e(l3);
        }
        if (l4 != null) {
            aVar.b(l4);
        }
        if (l5 != null) {
            aVar.g(l5);
        }
        if (numI != null) {
            aVar.f(numI);
        }
        Map mapJ = AbstractC0936c0.j(map, "successRateEjection");
        if (mapJ != null) {
            h.g.c.a aVar2 = new h.g.c.a();
            Integer numI2 = AbstractC0936c0.i(mapJ, "stdevFactor");
            Integer numI3 = AbstractC0936c0.i(mapJ, "enforcementPercentage");
            Integer numI4 = AbstractC0936c0.i(mapJ, "minimumHosts");
            Integer numI5 = AbstractC0936c0.i(mapJ, "requestVolume");
            if (numI2 != null) {
                aVar2.e(numI2);
            }
            if (numI3 != null) {
                aVar2.b(numI3);
            }
            if (numI4 != null) {
                aVar2.c(numI4);
            }
            if (numI5 != null) {
                aVar2.d(numI5);
            }
            aVar.h(aVar2.a());
        }
        Map mapJ2 = AbstractC0936c0.j(map, "failurePercentageEjection");
        if (mapJ2 != null) {
            h.g.b.a aVar3 = new h.g.b.a();
            Integer numI6 = AbstractC0936c0.i(mapJ2, "threshold");
            Integer numI7 = AbstractC0936c0.i(mapJ2, "enforcementPercentage");
            Integer numI8 = AbstractC0936c0.i(mapJ2, "minimumHosts");
            Integer numI9 = AbstractC0936c0.i(mapJ2, "requestVolume");
            if (numI6 != null) {
                aVar3.e(numI6);
            }
            if (numI7 != null) {
                aVar3.b(numI7);
            }
            if (numI8 != null) {
                aVar3.c(numI8);
            }
            if (numI9 != null) {
                aVar3.d(numI9);
            }
            aVar.d(aVar3.a());
        }
        List listA = L0.A(AbstractC0936c0.f(map, "childPolicy"));
        if (listA == null || listA.isEmpty()) {
            return c0.b.b(l0.f11974s.q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        c0.b bVarY = L0.y(listA, U.b());
        if (bVarY.d() != null) {
            return bVarY;
        }
        aVar.c((L0.b) bVarY.c());
        return c0.b.a(aVar.a());
    }

    @Override // y1.S.c
    public S a(S.e eVar) {
        return new h(eVar, S0.f8694a);
    }

    @Override // y1.T
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // y1.T
    public int c() {
        return 5;
    }

    @Override // y1.T
    public boolean d() {
        return true;
    }

    @Override // y1.T
    public c0.b e(Map map) {
        try {
            return f(map);
        } catch (RuntimeException e3) {
            return c0.b.b(l0.f11975t.p(e3).q("Failed parsing configuration for " + b()));
        }
    }
}
