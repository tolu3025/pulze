package s1;

import android.util.Log;
import com.google.firebase.firestore.T;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import q1.AbstractC1167A;
import q1.C1169a;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1210a {
    public static Map a(Exception exc) {
        C1169a c1169a;
        HashMap map = new HashMap();
        if (exc == null) {
            return map;
        }
        if (exc instanceof T) {
            c1169a = new C1169a((T) exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof T)) {
            c1169a = null;
        } else {
            c1169a = new C1169a((T) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (c1169a != null) {
            map.put("code", c1169a.a());
            map.put("message", c1169a.getMessage());
        }
        if (map.containsKey("code")) {
            String str = (String) map.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return map;
    }

    public static void b(AbstractC1167A.z zVar, Exception exc) {
        zVar.b(new AbstractC1167A.j("firebase_firestore", exc != null ? exc.getMessage() : null, a(exc)));
    }
}
