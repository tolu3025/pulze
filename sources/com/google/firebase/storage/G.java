package com.google.firebase.storage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static G f6463a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Executor f6464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Executor f6465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Executor f6466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f6467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Executor f6468f;

    public static G b() {
        return f6463a;
    }

    public static void d(Executor executor, Executor executor2) {
        f6464b = s0.j.a(executor, 5);
        f6466d = s0.j.a(executor, 3);
        f6465c = s0.j.a(executor, 2);
        f6467e = s0.j.b(executor);
        f6468f = executor2;
    }

    public Executor a() {
        return f6464b;
    }

    public Executor c() {
        return f6468f;
    }

    public void e(Runnable runnable) {
        f6467e.execute(runnable);
    }

    public void f(Runnable runnable) {
        f6464b.execute(runnable);
    }

    public void g(Runnable runnable) {
        f6466d.execute(runnable);
    }

    public void h(Runnable runnable) {
        f6465c.execute(runnable);
    }
}
