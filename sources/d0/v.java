package D0;

import V0.I;
import V0.x;
import com.google.protobuf.t0;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static t0 a(I i3) {
        return i3.x0().f0("__local_write_time__").A0();
    }

    public static I b(I i3) {
        I iE0 = i3.x0().e0("__previous_value__", null);
        return c(iE0) ? b(iE0) : iE0;
    }

    public static boolean c(I i3) {
        I iE0 = i3 != null ? i3.x0().e0("__type__", null) : null;
        return iE0 != null && "server_timestamp".equals(iE0.z0());
    }

    public static I d(C1004r c1004r, I i3) {
        I i4 = (I) I.J0().L("server_timestamp").n();
        x.b bVarY = V0.x.j0().y("__type__", i4).y("__local_write_time__", (I) I.J0().M(t0.f0().x(c1004r.l()).w(c1004r.i())).n());
        if (c(i3)) {
            i3 = b(i3);
        }
        if (i3 != null) {
            bVarY.y("__previous_value__", i3);
        }
        return (I) I.J0().G(bVarY).n();
    }
}
