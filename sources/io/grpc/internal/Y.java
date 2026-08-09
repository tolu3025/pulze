package io.grpc.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f8759a = new ArrayList();

    public Y a(Object obj) {
        this.f8759a.add(String.valueOf(obj));
        return this;
    }

    public Y b(String str, Object obj) {
        this.f8759a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f8759a.toString();
    }
}
