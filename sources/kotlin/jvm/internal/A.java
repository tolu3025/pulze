package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class A {
    public Z1.c b(Class cls) {
        return new f(cls);
    }

    public Z1.d c(Class cls, String str) {
        return new o(cls, str);
    }

    public String g(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(n nVar) {
        return g(nVar);
    }

    public Z1.e a(j jVar) {
        return jVar;
    }

    public Z1.f d(p pVar) {
        return pVar;
    }

    public Z1.g e(r rVar) {
        return rVar;
    }

    public Z1.h f(t tVar) {
        return tVar;
    }
}
