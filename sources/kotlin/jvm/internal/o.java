package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public final class o implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9746b;

    public o(Class jClass, String moduleName) {
        m.e(jClass, "jClass");
        m.e(moduleName, "moduleName");
        this.f9745a = jClass;
        this.f9746b = moduleName;
    }

    @Override // kotlin.jvm.internal.e
    public Class c() {
        return this.f9745a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && m.a(c(), ((o) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
