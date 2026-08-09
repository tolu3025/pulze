package com.google.firebase.firestore;

import java.util.Map;
import k0.C1004r;

/* JADX INFO: renamed from: com.google.firebase.firestore.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f6398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1004r f6400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1004r f6401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0752t f6402e;

    public C0753t0(W0 userDataWriter, C0752t c0752t, Map fields, C1004r c1004r, C1004r c1004r2) {
        kotlin.jvm.internal.m.e(userDataWriter, "userDataWriter");
        kotlin.jvm.internal.m.e(fields, "fields");
        this.f6398a = userDataWriter;
        this.f6399b = fields;
        this.f6400c = c1004r;
        this.f6401d = c1004r2;
        this.f6402e = c0752t;
    }

    public final C1004r a() {
        return this.f6400c;
    }

    public final Map b() {
        Map mapB = this.f6398a.b(this.f6399b);
        kotlin.jvm.internal.m.d(mapB, "convertObject(...)");
        return mapB;
    }

    public final C0752t c() {
        return this.f6402e;
    }

    public final C1004r d() {
        return this.f6401d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m.a(C0753t0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type com.google.firebase.firestore.PipelineResult");
        C0753t0 c0753t0 = (C0753t0) obj;
        return kotlin.jvm.internal.m.a(this.f6402e, c0753t0.f6402e) && kotlin.jvm.internal.m.a(this.f6399b, c0753t0.f6399b);
    }

    public int hashCode() {
        C0752t c0752t = this.f6402e;
        return ((c0752t != null ? c0752t.hashCode() : 0) * 31) + this.f6399b.hashCode();
    }

    public String toString() {
        return "PipelineResult{ref=" + this.f6402e + ", updateTime=" + this.f6401d + "}, data=" + b();
    }
}
