package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0805x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0805x f6986a = new C0805x();

    private C0805x() {
    }

    public static C0805x c() {
        return f6986a;
    }

    @Override // com.google.protobuf.U
    public T a(Class cls) {
        if (!AbstractC0806y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (T) AbstractC0806y.B(cls.asSubclass(AbstractC0806y.class)).o();
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e3);
        }
    }

    @Override // com.google.protobuf.U
    public boolean b(Class cls) {
        return AbstractC0806y.class.isAssignableFrom(cls);
    }
}
