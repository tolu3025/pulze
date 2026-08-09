package E0;

import D0.s;
import D0.w;
import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f1404c = new m(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f1405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f1406b;

    private m(w wVar, Boolean bool) {
        AbstractC0386b.d(wVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f1405a = wVar;
        this.f1406b = bool;
    }

    public static m a(boolean z2) {
        return new m(null, Boolean.valueOf(z2));
    }

    public static m f(w wVar) {
        return new m(wVar, null);
    }

    public Boolean b() {
        return this.f1406b;
    }

    public w c() {
        return this.f1405a;
    }

    public boolean d() {
        return this.f1405a == null && this.f1406b == null;
    }

    public boolean e(s sVar) {
        if (this.f1405a != null) {
            return sVar.d() && sVar.l().equals(this.f1405a);
        }
        Boolean bool = this.f1406b;
        if (bool != null) {
            return bool.booleanValue() == sVar.d();
        }
        AbstractC0386b.d(d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        w wVar = this.f1405a;
        if (wVar == null ? mVar.f1405a != null : !wVar.equals(mVar.f1405a)) {
            return false;
        }
        Boolean bool = this.f1406b;
        Boolean bool2 = mVar.f1406b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public int hashCode() {
        w wVar = this.f1405a;
        int iHashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        Boolean bool = this.f1406b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        if (d()) {
            return "Precondition{<none>}";
        }
        if (this.f1405a != null) {
            sb = new StringBuilder();
            sb.append("Precondition{updateTime=");
            obj = this.f1405a;
        } else {
            if (this.f1406b == null) {
                throw AbstractC0386b.a("Invalid Precondition", new Object[0]);
            }
            sb = new StringBuilder();
            sb.append("Precondition{exists=");
            obj = this.f1406b;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
