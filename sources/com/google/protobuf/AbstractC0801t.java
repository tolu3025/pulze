package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0801t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f6902a = new C0800s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f6903b = c();

    static r a() {
        r rVar = f6903b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static r b() {
        return f6902a;
    }

    private static r c() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
