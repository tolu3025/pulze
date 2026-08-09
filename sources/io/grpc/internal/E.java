package io.grpc.internal;

import e0.AbstractC0829j;
import e0.C0831l;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends y1.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f8583a = y1.N.a(E.class.getClassLoader());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8584b = 0;

    @Override // y1.c0.c
    public String a() {
        return "dns";
    }

    @Override // y1.c0.c
    public y1.c0 b(URI uri, c0.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) AbstractC0829j.o(uri.getPath(), "targetPath");
        AbstractC0829j.k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new D(uri.getAuthority(), str.substring(1), aVar, S.f8671u, C0831l.c(), f8583a);
    }

    @Override // y1.d0
    public Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // y1.d0
    protected boolean e() {
        return true;
    }

    @Override // y1.d0
    public int f() {
        return 5;
    }
}
