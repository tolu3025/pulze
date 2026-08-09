package A1;

import io.grpc.internal.T0;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import y1.M;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f536a = Logger.getLogger(s.class.getName());

    public static Z a(List list) {
        return M.c(b(list));
    }

    private static byte[][] b(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C1.d dVar = (C1.d) it.next();
            int i4 = i3 + 1;
            bArr[i3] = dVar.f1163a.x();
            i3 += 2;
            bArr[i4] = dVar.f1164b.x();
        }
        return T0.e(bArr);
    }

    public static Z c(List list) {
        return M.c(b(list));
    }
}
