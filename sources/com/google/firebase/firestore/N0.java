package com.google.firebase.firestore;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0736k0 f6235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0718b0 f6236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f6237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Activity f6238d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EnumC0736k0 f6239a = EnumC0736k0.EXCLUDE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumC0718b0 f6240b = EnumC0718b0.DEFAULT;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f6241c = J0.s.f2499a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Activity f6242d = null;

        public N0 e() {
            return new N0(this);
        }

        public b f(EnumC0736k0 enumC0736k0) {
            J0.C.c(enumC0736k0, "metadataChanges must not be null.");
            this.f6239a = enumC0736k0;
            return this;
        }

        public b g(EnumC0718b0 enumC0718b0) {
            J0.C.c(enumC0718b0, "listen source must not be null.");
            this.f6240b = enumC0718b0;
            return this;
        }
    }

    private N0(b bVar) {
        this.f6235a = bVar.f6239a;
        this.f6236b = bVar.f6240b;
        this.f6237c = bVar.f6241c;
        this.f6238d = bVar.f6242d;
    }

    public Activity a() {
        return this.f6238d;
    }

    public Executor b() {
        return this.f6237c;
    }

    public EnumC0736k0 c() {
        return this.f6235a;
    }

    public EnumC0718b0 d() {
        return this.f6236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N0.class != obj.getClass()) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f6235a == n02.f6235a && this.f6236b == n02.f6236b && this.f6237c.equals(n02.f6237c) && this.f6238d.equals(n02.f6238d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f6235a.hashCode() * 31) + this.f6236b.hashCode()) * 31) + this.f6237c.hashCode()) * 31;
        Activity activity = this.f6238d;
        return iHashCode + (activity != null ? activity.hashCode() : 0);
    }

    public String toString() {
        return "SnapshotListenOptions{metadataChanges=" + this.f6235a + ", source=" + this.f6236b + ", executor=" + this.f6237c + ", activity=" + this.f6238d + '}';
    }
}
