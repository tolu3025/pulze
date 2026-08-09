package O0;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2731b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f2730a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f2731b = str2;
    }

    @Override // O0.f
    public String b() {
        return this.f2730a;
    }

    @Override // O0.f
    public String c() {
        return this.f2731b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2730a.equals(fVar.b()) && this.f2731b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f2730a.hashCode() ^ 1000003) * 1000003) ^ this.f2731b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f2730a + ", version=" + this.f2731b + "}";
    }
}
