package r1;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.InterfaceC0720c0;
import l1.C1018d;

/* JADX INFO: loaded from: classes.dex */
public class j implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0720c0 f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    FirebaseFirestore f11195b;

    public j(FirebaseFirestore firebaseFirestore) {
        this.f11195b = firebaseFirestore;
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        InterfaceC0720c0 interfaceC0720c0 = this.f11194a;
        if (interfaceC0720c0 != null) {
            interfaceC0720c0.remove();
            this.f11194a = null;
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        this.f11194a = this.f11195b.o(new Runnable() { // from class: r1.i
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a(null);
            }
        });
    }
}
