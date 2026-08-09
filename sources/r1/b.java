package r1;

import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.EnumC0718b0;
import com.google.firebase.firestore.EnumC0736k0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.InterfaceC0720c0;
import com.google.firebase.firestore.InterfaceC0756v;
import com.google.firebase.firestore.N0;
import com.google.firebase.firestore.T;
import l1.C1018d;
import s1.AbstractC1210a;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0720c0 f11174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    FirebaseFirestore f11175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C0752t f11176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EnumC0736k0 f11177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C0754u.a f11178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    EnumC0718b0 f11179f;

    public b(FirebaseFirestore firebaseFirestore, C0752t c0752t, Boolean bool, C0754u.a aVar, EnumC0718b0 enumC0718b0) {
        this.f11175b = firebaseFirestore;
        this.f11176c = c0752t;
        this.f11177d = bool.booleanValue() ? EnumC0736k0.INCLUDE : EnumC0736k0.EXCLUDE;
        this.f11178e = aVar;
        this.f11179f = enumC0718b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C1018d.b bVar, C0754u c0754u, T t2) {
        if (t2 == null) {
            bVar.a(r.k(c0754u, this.f11178e).e());
            return;
        }
        bVar.b("firebase_firestore", t2.getMessage(), AbstractC1210a.a(t2));
        bVar.c();
        b(null);
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        InterfaceC0720c0 interfaceC0720c0 = this.f11174a;
        if (interfaceC0720c0 != null) {
            interfaceC0720c0.remove();
            this.f11174a = null;
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        N0.b bVar2 = new N0.b();
        bVar2.f(this.f11177d);
        bVar2.g(this.f11179f);
        this.f11174a = this.f11176c.j(bVar2.e(), new InterfaceC0756v() { // from class: r1.a
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj2, T t2) {
                this.f11172a.d(bVar, (C0754u) obj2, t2);
            }
        });
    }
}
