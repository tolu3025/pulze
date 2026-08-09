package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum g {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4848a;

    g(long j3) {
        this.f4848a = j3;
    }

    public long e() {
        return this.f4848a;
    }
}
