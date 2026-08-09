package y0;

import J0.A;
import J0.s;
import J0.z;
import L0.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import k0.C0989c;
import m0.AbstractC1028b;
import p0.InterfaceC1058a;
import p0.InterfaceC1059b;

/* JADX INFO: renamed from: y0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1283e extends AbstractC1279a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f11737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1059b f11738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1058a f11740d = new InterfaceC1058a() { // from class: y0.b
        @Override // p0.InterfaceC1058a
        public final void a(AbstractC1028b abstractC1028b) {
            this.f11735a.i(abstractC1028b);
        }
    };

    public C1283e(L0.a aVar) {
        aVar.a(new a.InterfaceC0050a() { // from class: y0.c
            @Override // L0.a.InterfaceC0050a
            public final void a(L0.b bVar) {
                this.f11736a.j(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task h(Task task) {
        return task.isSuccessful() ? Tasks.forResult(((AbstractC1028b) task.getResult()).b()) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(L0.b bVar) {
        synchronized (this) {
            try {
                InterfaceC1059b interfaceC1059b = (InterfaceC1059b) bVar.get();
                this.f11738b = interfaceC1059b;
                if (interfaceC1059b != null) {
                    interfaceC1059b.c(this.f11740d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized void i(AbstractC1028b abstractC1028b) {
        try {
            if (abstractC1028b.a() != null) {
                A.e("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + abstractC1028b.a(), new Object[0]);
            }
            z zVar = this.f11737a;
            if (zVar != null) {
                zVar.a(abstractC1028b.b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // y0.AbstractC1279a
    public synchronized Task a() {
        InterfaceC1059b interfaceC1059b = this.f11738b;
        if (interfaceC1059b == null) {
            return Tasks.forException(new C0989c("AppCheck is not available"));
        }
        Task taskB = interfaceC1059b.b(this.f11739c);
        this.f11739c = false;
        return taskB.continueWithTask(s.f2500b, new Continuation() { // from class: y0.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1283e.h(task);
            }
        });
    }

    @Override // y0.AbstractC1279a
    public synchronized void b() {
        this.f11739c = true;
    }

    @Override // y0.AbstractC1279a
    public synchronized void c() {
        this.f11737a = null;
        InterfaceC1059b interfaceC1059b = this.f11738b;
        if (interfaceC1059b != null) {
            interfaceC1059b.a(this.f11740d);
        }
    }

    @Override // y0.AbstractC1279a
    public synchronized void d(z zVar) {
        this.f11737a = zVar;
    }
}
