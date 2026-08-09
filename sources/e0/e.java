package E0;

import D0.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f1386b;

    public e(r rVar, p pVar) {
        this.f1385a = rVar;
        this.f1386b = pVar;
    }

    public r a() {
        return this.f1385a;
    }

    public p b() {
        return this.f1386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1385a.equals(eVar.f1385a)) {
            return this.f1386b.equals(eVar.f1386b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f1385a.hashCode() * 31) + this.f1386b.hashCode();
    }
}
