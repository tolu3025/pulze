package com.google.firebase.firestore;

import J0.AbstractC0386b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0.q0 f6254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseFirestore f6255b;

    public interface a {
        Object a(S0 s02);
    }

    S0(A0.q0 q0Var, FirebaseFirestore firebaseFirestore) {
        this.f6254a = (A0.q0) J0.C.b(q0Var);
        this.f6255b = (FirebaseFirestore) J0.C.b(firebaseFirestore);
    }

    private Task d(C0752t c0752t) {
        return this.f6254a.j(Collections.singletonList(c0752t.r())).continueWith(J0.s.f2500b, new Continuation() { // from class: com.google.firebase.firestore.R0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f6252a.e(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0754u e(Task task) throws Exception {
        if (!task.isSuccessful()) {
            throw task.getException();
        }
        List list = (List) task.getResult();
        if (list.size() != 1) {
            throw AbstractC0386b.a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        D0.s sVar = (D0.s) list.get(0);
        if (sVar.d()) {
            return C0754u.b(this.f6255b, sVar, false, false);
        }
        if (sVar.j()) {
            return C0754u.c(this.f6255b, sVar.getKey(), false);
        }
        throw AbstractC0386b.a("BatchGetDocumentsRequest returned unexpected document type: " + D0.s.class.getCanonicalName(), new Object[0]);
    }

    private S0 h(C0752t c0752t, A0.z0 z0Var) {
        this.f6255b.e0(c0752t);
        this.f6254a.o(c0752t.r(), z0Var);
        return this;
    }

    public S0 b(C0752t c0752t) {
        this.f6255b.e0(c0752t);
        this.f6254a.e(c0752t.r());
        return this;
    }

    public C0754u c(C0752t c0752t) throws T {
        this.f6255b.e0(c0752t);
        try {
            return (C0754u) Tasks.await(d(c0752t));
        } catch (InterruptedException e3) {
            throw new RuntimeException(e3);
        } catch (ExecutionException e4) {
            if (e4.getCause() instanceof T) {
                throw ((T) e4.getCause());
            }
            throw new RuntimeException(e4.getCause());
        }
    }

    public S0 f(C0752t c0752t, Object obj) {
        return g(c0752t, obj, M0.f6230c);
    }

    public S0 g(C0752t c0752t, Object obj, M0 m02) {
        this.f6255b.e0(c0752t);
        J0.C.c(obj, "Provided data must not be null.");
        J0.C.c(m02, "Provided options must not be null.");
        this.f6254a.n(c0752t.r(), m02.b() ? this.f6255b.F().g(obj, m02.a()) : this.f6255b.F().l(obj));
        return this;
    }

    public S0 i(C0752t c0752t, C0760x c0760x, Object obj, Object... objArr) {
        return h(c0752t, this.f6255b.F().m(J0.L.f(1, c0760x, obj, objArr)));
    }
}
