package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k0.C0992f;

/* JADX INFO: renamed from: com.google.firebase.storage.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0772g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6560a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0992f f6561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0.b f6562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0.b f6563d;

    C0772g(C0992f c0992f, L0.b bVar, L0.b bVar2, Executor executor, Executor executor2) {
        this.f6561b = c0992f;
        this.f6562c = bVar;
        this.f6563d = bVar2;
        G.d(executor, executor2);
    }

    synchronized C0771f a(String str) {
        C0771f c0771f;
        c0771f = (C0771f) this.f6560a.get(str);
        if (c0771f == null) {
            c0771f = new C0771f(str, this.f6561b, this.f6562c, this.f6563d);
            this.f6560a.put(str, c0771f);
        }
        return c0771f;
    }
}
