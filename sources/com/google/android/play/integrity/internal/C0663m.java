package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663m implements InterfaceC0662l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0663m f5896b = new C0663m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5897a;

    private C0663m(Object obj) {
        this.f5897a = obj;
    }

    public static InterfaceC0662l b(Object obj) {
        if (obj != null) {
            return new C0663m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.o
    public final Object a() {
        return this.f5897a;
    }
}
