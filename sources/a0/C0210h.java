package A0;

import com.google.firebase.firestore.InterfaceC0756v;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: A0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0210h implements InterfaceC0756v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0756v f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f154c = false;

    public C0210h(Executor executor, InterfaceC0756v interfaceC0756v) {
        this.f152a = executor;
        this.f153b = interfaceC0756v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj, com.google.firebase.firestore.T t2) {
        if (this.f154c) {
            return;
        }
        this.f153b.a(obj, t2);
    }

    @Override // com.google.firebase.firestore.InterfaceC0756v
    public void a(final Object obj, final com.google.firebase.firestore.T t2) {
        this.f152a.execute(new Runnable() { // from class: A0.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f143a.c(obj, t2);
            }
        });
    }

    public void d() {
        this.f154c = true;
    }
}
