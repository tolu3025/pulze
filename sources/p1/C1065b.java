package p1;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C1018d;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1065b implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f10381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FirebaseAuth.a f10382b;

    public C1065b(FirebaseAuth firebaseAuth) {
        this.f10381a = firebaseAuth;
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
        FirebaseAuth.a aVar = this.f10382b;
        if (aVar != null) {
            this.f10381a.s(aVar);
            this.f10382b = null;
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        final HashMap map = new HashMap();
        map.put("appName", this.f10381a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: p1.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                C1065b.d(atomicBoolean, map, bVar, firebaseAuth);
            }
        };
        this.f10382b = aVar;
        this.f10381a.e(aVar);
    }
}
