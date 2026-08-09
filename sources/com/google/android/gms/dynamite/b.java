package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes.dex */
final class b extends PathClassLoader {
    b(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z2) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z2);
    }
}
