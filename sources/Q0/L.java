package q0;

import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P.a f10655a = new P.a("GetTokenResultFactory", new String[0]);

    public static com.google.firebase.auth.C a(String str) {
        Map map;
        try {
            map = AbstractC1133K.b(str);
        } catch (zzaao e3) {
            f10655a.b("Error parsing token claims", e3, new Object[0]);
            map = new HashMap();
        }
        return new com.google.firebase.auth.C(str, map);
    }
}
