package E0;

import D0.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f1383b = b(new HashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f1384a;

    private d(Set set) {
        this.f1384a = set;
    }

    public static d b(Set set) {
        return new d(set);
    }

    public boolean a(r rVar) {
        Iterator it = this.f1384a.iterator();
        while (it.hasNext()) {
            if (((r) it.next()).v(rVar)) {
                return true;
            }
        }
        return false;
    }

    public Set c() {
        return this.f1384a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f1384a.equals(((d) obj).f1384a);
    }

    public int hashCode() {
        return this.f1384a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f1384a.toString() + "}";
    }
}
