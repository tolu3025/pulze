package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0785c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC0781a0 f6748a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC0781a0 f6749b = new C0783b0();

    static InterfaceC0781a0 a() {
        return f6748a;
    }

    static InterfaceC0781a0 b() {
        return f6749b;
    }

    private static InterfaceC0781a0 c() {
        try {
            return (InterfaceC0781a0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
