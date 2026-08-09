package s1;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0757v0;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    private static C0751s0 a(C0757v0 c0757v0, String str, Map map, FirebaseFirestore firebaseFirestore) {
        if (map == null && !"database".equals(str)) {
            throw new IllegalArgumentException("Stage args must not be null for stage: " + str);
        }
        str.hashCode();
        switch (str) {
            case "collection":
                return c0757v0.c((String) map.get("path"));
            case "collection_group":
                return c0757v0.d((String) map.get("path"));
            case "documents":
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) map).iterator();
                while (it.hasNext()) {
                    arrayList.add(firebaseFirestore.y((String) ((Map) it.next()).get("path")));
                }
                return c0757v0.g((C0752t[]) arrayList.toArray(new C0752t[0]));
            case "database":
                return c0757v0.f();
            default:
                throw new IllegalArgumentException("First stage must be one of: collection, collection_group, documents, database. Got: " + str);
        }
    }

    public static C0751s0 b(FirebaseFirestore firebaseFirestore, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Pipeline must have at least one stage (source).");
        }
        t tVar = new t(new q(firebaseFirestore));
        C0757v0 c0757v0X = firebaseFirestore.X();
        C0751s0 c0751s0A = null;
        int i3 = 0;
        while (i3 < list.size()) {
            Map map = (Map) list.get(i3);
            String str = (String) map.get("stage");
            if (str == null) {
                throw new IllegalArgumentException("Stage must have a 'stage' field");
            }
            Map map2 = (Map) map.get("args");
            c0751s0A = i3 == 0 ? a(c0757v0X, str, map2, firebaseFirestore) : tVar.a(c0751s0A, str, map2, firebaseFirestore);
            i3++;
        }
        return c0751s0A;
    }

    public static C0751s0.c c(FirebaseFirestore firebaseFirestore, List list, Map map) {
        C0751s0 c0751s0B = b(firebaseFirestore, list);
        return (C0751s0.c) Tasks.await((map == null || map.isEmpty()) ? c0751s0B.i() : c0751s0B.j(d(map)));
    }

    private static C0751s0.a d(Map map) {
        C0751s0.a aVar = new C0751s0.a();
        Object obj = map.get("indexMode");
        return ((obj instanceof String) && "recommended".equalsIgnoreCase((String) obj)) ? aVar.g(C0751s0.a.C0113a.f6388c) : aVar;
    }
}
