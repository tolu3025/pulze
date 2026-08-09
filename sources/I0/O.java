package I0;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.w f2183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f2185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f2186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f2187e;

    public O(D0.w wVar, Map map, Map map2, Map map3, Set set) {
        this.f2183a = wVar;
        this.f2184b = map;
        this.f2185c = map2;
        this.f2186d = map3;
        this.f2187e = set;
    }

    public Map a() {
        return this.f2186d;
    }

    public Set b() {
        return this.f2187e;
    }

    public D0.w c() {
        return this.f2183a;
    }

    public Map d() {
        return this.f2184b;
    }

    public Map e() {
        return this.f2185c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f2183a + ", targetChanges=" + this.f2184b + ", targetMismatches=" + this.f2185c + ", documentUpdates=" + this.f2186d + ", resolvedLimboDocuments=" + this.f2187e + '}';
    }
}
