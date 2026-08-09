package com.google.firebase.firestore;

import J0.C0391g;
import com.google.android.gms.tasks.Task;
import j.InterfaceC0980a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0.y f6294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private A0.S f6295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0391g f6296c = new C0391g();

    W(J0.y yVar) {
        this.f6294a = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Runnable runnable) {
        this.f6296c.m(runnable);
    }

    synchronized Object b(J0.y yVar) {
        c();
        return yVar.c(this.f6295b);
    }

    synchronized void c() {
        if (!e()) {
            this.f6295b = (A0.S) this.f6294a.c(this.f6296c);
        }
    }

    synchronized Object d(J0.y yVar, J0.y yVar2) {
        Executor executor = new Executor() { // from class: com.google.firebase.firestore.V
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f6292a.f(runnable);
            }
        };
        A0.S s2 = this.f6295b;
        if (s2 != null && !s2.K()) {
            return yVar2.c(executor);
        }
        return yVar.c(executor);
    }

    boolean e() {
        return this.f6295b != null;
    }

    synchronized void g(InterfaceC0980a interfaceC0980a) {
        c();
        interfaceC0980a.accept(this.f6295b);
    }

    synchronized Task h() {
        Task taskR0;
        c();
        taskR0 = this.f6295b.r0();
        this.f6296c.w();
        return taskR0;
    }
}
