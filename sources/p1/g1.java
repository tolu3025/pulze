package p1;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C1018d;

/* JADX INFO: loaded from: classes.dex */
public class g1 implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FirebaseAuth.b f10553b;

    public g1(FirebaseAuth firebaseAuth) {
        this.f10552a = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, Map map, C1018d.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        com.google.firebase.auth.A aM = firebaseAuth.m();
        map.put("user", aM == null ? null : j1.c(j1.j(aM)));
        bVar.a(map);
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        FirebaseAuth.b bVar = this.f10553b;
        if (bVar != null) {
            this.f10552a.t(bVar);
            this.f10553b = null;
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        final HashMap map = new HashMap();
        map.put("appName", this.f10552a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.b bVar2 = new FirebaseAuth.b() { // from class: p1.f1
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                g1.d(atomicBoolean, map, bVar, firebaseAuth);
            }
        };
        this.f10553b = bVar2;
        this.f10552a.f(bVar2);
    }
}
