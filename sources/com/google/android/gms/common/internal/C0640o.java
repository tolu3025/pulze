package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0640o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0635j f5594b = new C0635j("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0640o f5595c = new C0640o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f5596a = new ConcurrentHashMap();

    protected C0640o() {
    }

    public static C0640o a() {
        return f5595c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public String b(String str) throws Throwable {
        ?? r3;
        InputStream resourceAsStream;
        AbstractC0643s.f(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f5596a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = C0640o.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e = e3;
            r3 = 0;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                String property = properties.getProperty("version", null);
                C0635j c0635j = f5594b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(property);
                c0635j.d("LibraryVersion", sb.toString());
                r4 = property;
            } else {
                C0635j c0635j2 = f5594b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Failed to get app version for libraryName: ");
                sb2.append(str);
                c0635j2.e("LibraryVersion", sb2.toString());
            }
        } catch (IOException e4) {
            e = e4;
            r3 = r4;
            inputStream = resourceAsStream;
            C0635j c0635j3 = f5594b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
            sb3.append("Failed to get app version for libraryName: ");
            sb3.append(str);
            c0635j3.c("LibraryVersion", sb3.toString(), e);
            resourceAsStream = inputStream;
            r4 = r3;
        } catch (Throwable th2) {
            th = th2;
            r4 = resourceAsStream;
            if (r4 != 0) {
                com.google.android.gms.common.util.i.a(r4);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            com.google.android.gms.common.util.i.a(resourceAsStream);
        }
        if (r4 == 0) {
            f5594b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r4 = "UNKNOWN";
        }
        this.f5596a.put(str, r4);
        return r4;
    }
}
