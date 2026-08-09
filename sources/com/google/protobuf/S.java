package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f6719a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P f6720b = new Q();

    static P a() {
        return f6719a;
    }

    static P b() {
        return f6720b;
    }

    private static P c() {
        try {
            return (P) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
