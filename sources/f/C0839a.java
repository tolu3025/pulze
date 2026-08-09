package f;

import f.C0840b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0839a extends C0840b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f7174e = new HashMap();

    @Override // f.C0840b
    protected C0840b.c b(Object obj) {
        return (C0840b.c) this.f7174e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f7174e.containsKey(obj);
    }

    @Override // f.C0840b
    public Object m(Object obj, Object obj2) {
        C0840b.c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f7180b;
        }
        this.f7174e.put(obj, l(obj, obj2));
        return null;
    }

    @Override // f.C0840b
    public Object n(Object obj) {
        Object objN = super.n(obj);
        this.f7174e.remove(obj);
        return objN;
    }

    public Map.Entry o(Object obj) {
        if (contains(obj)) {
            return ((C0840b.c) this.f7174e.get(obj)).f7182d;
        }
        return null;
    }
}
