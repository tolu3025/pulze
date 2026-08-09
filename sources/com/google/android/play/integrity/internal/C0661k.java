package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661k implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f5893c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile o f5894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f5895b = f5893c;

    private C0661k(o oVar) {
        this.f5894a = oVar;
    }

    public static o b(o oVar) {
        return oVar instanceof C0661k ? oVar : new C0661k(oVar);
    }

    @Override // com.google.android.play.integrity.internal.o
    public final Object a() {
        Object objA = this.f5895b;
        Object obj = f5893c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f5895b;
                    if (objA == obj) {
                        objA = this.f5894a.a();
                        Object obj2 = this.f5895b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f5895b = objA;
                        this.f5894a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
