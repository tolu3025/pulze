package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0504s implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0504s f4267a = new C0504s();

    private C0504s() {
    }

    public static C0504s c() {
        return f4267a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public H a(Class cls) {
        if (!AbstractC0505t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (H) AbstractC0505t.u(cls.asSubclass(AbstractC0505t.class)).j();
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean b(Class cls) {
        return AbstractC0505t.class.isAssignableFrom(cls);
    }
}
