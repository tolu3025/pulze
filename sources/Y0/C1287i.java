package y0;

import J0.A;
import J0.s;
import J0.z;
import L0.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C;
import k0.C0989c;
import q0.InterfaceC1134a;
import q0.InterfaceC1136b;

/* JADX INFO: renamed from: y0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1287i extends AbstractC1279a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1134a f11745a = new InterfaceC1134a() { // from class: y0.f
        @Override // q0.InterfaceC1134a
        public final void a(M0.b bVar) {
            this.f11741a.j(bVar);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1136b f11746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f11747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11749e;

    public C1287i(L0.a aVar) {
        aVar.a(new a.InterfaceC0050a() { // from class: y0.g
            @Override // L0.a.InterfaceC0050a
            public final void a(L0.b bVar) {
                this.f11742a.k(bVar);
            }
        });
    }

    private synchronized C1288j h() {
        String strA;
        try {
            InterfaceC1136b interfaceC1136b = this.f11746b;
            strA = interfaceC1136b == null ? null : interfaceC1136b.a();
        } catch (Throwable th) {
            throw th;
        }
        return strA != null ? new C1288j(strA) : C1288j.f11750b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(int i3, Task task) {
        synchronized (this) {
            try {
                if (i3 != this.f11748d) {
                    A.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    return a();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((C) task.getResult()).g());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(M0.b bVar) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(L0.b bVar) {
        synchronized (this) {
            this.f11746b = (InterfaceC1136b) bVar.get();
            l();
            this.f11746b.d(this.f11745a);
        }
    }

    private synchronized void l() {
        this.f11748d++;
        z zVar = this.f11747c;
        if (zVar != null) {
            zVar.a(h());
        }
    }

    @Override // y0.AbstractC1279a
    public synchronized Task a() {
        InterfaceC1136b interfaceC1136b = this.f11746b;
        if (interfaceC1136b == null) {
            return Tasks.forException(new C0989c("auth is not available"));
        }
        Task taskC = interfaceC1136b.c(this.f11749e);
        this.f11749e = false;
        final int i3 = this.f11748d;
        return taskC.continueWithTask(s.f2500b, new Continuation() { // from class: y0.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f11743a.i(i3, task);
            }
        });
    }

    @Override // y0.AbstractC1279a
    public synchronized void b() {
        this.f11749e = true;
    }

    @Override // y0.AbstractC1279a
    public synchronized void c() {
        this.f11747c = null;
        InterfaceC1136b interfaceC1136b = this.f11746b;
        if (interfaceC1136b != null) {
            interfaceC1136b.b(this.f11745a);
        }
    }

    @Override // y0.AbstractC1279a
    public synchronized void d(z zVar) {
        this.f11747c = zVar;
        zVar.a(h());
    }
}
