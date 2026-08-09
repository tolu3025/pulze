package n0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;
import k0.C0999m;
import m0.AbstractC1027a;
import o0.InterfaceC1040a;
import p0.InterfaceC1058a;

/* JADX INFO: loaded from: classes.dex */
public class e extends m0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0992f f9920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0.b f9921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f9924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f9925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f9926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f9927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f9928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Task f9929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC1040a f9930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC1027a f9931l;

    public e(C0992f c0992f, L0.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        AbstractC0643s.k(c0992f);
        AbstractC0643s.k(bVar);
        this.f9920a = c0992f;
        this.f9921b = bVar;
        this.f9922c = new ArrayList();
        this.f9923d = new ArrayList();
        this.f9924e = new j(c0992f.m(), c0992f.s());
        this.f9925f = new k(c0992f.m(), this, executor2, scheduledExecutorService);
        this.f9926g = executor;
        this.f9927h = executor2;
        this.f9928i = executor3;
        this.f9929j = j(executor3);
        this.f9930k = new InterfaceC1040a.C0153a();
    }

    private boolean g() {
        AbstractC1027a abstractC1027a = this.f9931l;
        return abstractC1027a != null && abstractC1027a.a() - this.f9930k.a() > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task h(boolean z2, Task task) {
        return Tasks.forResult((z2 || !g()) ? b.d(new C0999m("No AppCheckProvider installed.")) : b.c(this.f9931l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(TaskCompletionSource taskCompletionSource) {
        AbstractC1027a abstractC1027aD = this.f9924e.d();
        if (abstractC1027aD != null) {
            k(abstractC1027aD);
        }
        taskCompletionSource.setResult(null);
    }

    private Task j(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: n0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9916a.i(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p0.InterfaceC1059b
    public void a(InterfaceC1058a interfaceC1058a) {
        AbstractC0643s.k(interfaceC1058a);
        this.f9922c.remove(interfaceC1058a);
        this.f9925f.d(this.f9922c.size() + this.f9923d.size());
    }

    @Override // p0.InterfaceC1059b
    public Task b(final boolean z2) {
        return this.f9929j.continueWithTask(this.f9927h, new Continuation() { // from class: n0.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f9918a.h(z2, task);
            }
        });
    }

    @Override // p0.InterfaceC1059b
    public void c(InterfaceC1058a interfaceC1058a) {
        AbstractC0643s.k(interfaceC1058a);
        this.f9922c.add(interfaceC1058a);
        this.f9925f.d(this.f9922c.size() + this.f9923d.size());
        if (g()) {
            interfaceC1058a.a(b.c(this.f9931l));
        }
    }

    Task f() {
        throw null;
    }

    void k(AbstractC1027a abstractC1027a) {
        this.f9931l = abstractC1027a;
    }
}
