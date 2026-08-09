package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f6311b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6312c = false;

    Z0(FirebaseFirestore firebaseFirestore) {
        this.f6310a = (FirebaseFirestore) J0.C.b(firebaseFirestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task d(A0.S s2) {
        return s2.v0(this.f6311b);
    }

    private Z0 g(C0752t c0752t, A0.z0 z0Var) {
        this.f6310a.e0(c0752t);
        i();
        this.f6311b.add(z0Var.a(c0752t.r(), E0.m.a(true)));
        return this;
    }

    private void i() {
        if (this.f6312c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    public Task b() {
        i();
        this.f6312c = true;
        return !this.f6311b.isEmpty() ? (Task) this.f6310a.s(new J0.y() { // from class: com.google.firebase.firestore.Y0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6307a.d((A0.S) obj);
            }
        }) : Tasks.forResult(null);
    }

    public Z0 c(C0752t c0752t) {
        this.f6310a.e0(c0752t);
        i();
        this.f6311b.add(new E0.c(c0752t.r(), E0.m.f1404c));
        return this;
    }

    public Z0 e(C0752t c0752t, Object obj) {
        return f(c0752t, obj, M0.f6230c);
    }

    public Z0 f(C0752t c0752t, Object obj, M0 m02) {
        this.f6310a.e0(c0752t);
        J0.C.c(obj, "Provided data must not be null.");
        J0.C.c(m02, "Provided options must not be null.");
        i();
        this.f6311b.add((m02.b() ? this.f6310a.F().g(obj, m02.a()) : this.f6310a.F().l(obj)).a(c0752t.r(), E0.m.f1404c));
        return this;
    }

    public Z0 h(C0752t c0752t, C0760x c0760x, Object obj, Object... objArr) {
        return g(c0752t, this.f6310a.F().m(J0.L.f(1, c0760x, obj, objArr)));
    }
}
