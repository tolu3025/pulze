package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0798p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f6870a = c();

    public static C0799q a() {
        C0799q c0799qB = b("getEmptyRegistry");
        return c0799qB != null ? c0799qB : C0799q.f6876d;
    }

    private static final C0799q b(String str) {
        Class cls = f6870a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0799q) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
