package y1;

import e0.AbstractC0829j;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y1.C1298a;

/* JADX INFO: renamed from: y1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1320x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1298a.c f12067d = C1298a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1298a f12069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12070c;

    public C1320x(SocketAddress socketAddress) {
        this(socketAddress, C1298a.f11856c);
    }

    public List a() {
        return this.f12068a;
    }

    public C1298a b() {
        return this.f12069b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1320x)) {
            return false;
        }
        C1320x c1320x = (C1320x) obj;
        if (this.f12068a.size() != c1320x.f12068a.size()) {
            return false;
        }
        for (int i3 = 0; i3 < this.f12068a.size(); i3++) {
            if (!((SocketAddress) this.f12068a.get(i3)).equals(c1320x.f12068a.get(i3))) {
                return false;
            }
        }
        return this.f12069b.equals(c1320x.f12069b);
    }

    public int hashCode() {
        return this.f12070c;
    }

    public String toString() {
        return "[" + this.f12068a + "/" + this.f12069b + "]";
    }

    public C1320x(SocketAddress socketAddress, C1298a c1298a) {
        this(Collections.singletonList(socketAddress), c1298a);
    }

    public C1320x(List list, C1298a c1298a) {
        AbstractC0829j.e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f12068a = listUnmodifiableList;
        this.f12069b = (C1298a) AbstractC0829j.o(c1298a, "attrs");
        this.f12070c = listUnmodifiableList.hashCode();
    }
}
