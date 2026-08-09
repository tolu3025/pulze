package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0799q f6746a = C0799q.b();

    private V c(V v2) throws D {
        if (v2 == null || v2.d()) {
            return v2;
        }
        throw d(v2).a().k(v2);
    }

    private u0 d(V v2) {
        return v2 instanceof AbstractC0780a ? ((AbstractC0780a) v2).n() : new u0(v2);
    }

    @Override // com.google.protobuf.f0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public V a(AbstractC0792j abstractC0792j, C0799q c0799q) {
        return c((V) b(abstractC0792j, c0799q));
    }
}
