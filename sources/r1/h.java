package r1;

import com.google.firebase.firestore.C0731i;
import com.google.firebase.firestore.C0754u;
import com.google.firebase.firestore.D0;
import com.google.firebase.firestore.EnumC0718b0;
import com.google.firebase.firestore.EnumC0736k0;
import com.google.firebase.firestore.G0;
import com.google.firebase.firestore.InterfaceC0720c0;
import com.google.firebase.firestore.InterfaceC0756v;
import com.google.firebase.firestore.N0;
import com.google.firebase.firestore.T;
import java.util.ArrayList;
import java.util.Iterator;
import l1.C1018d;
import s1.AbstractC1210a;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
public class h implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0720c0 f11188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    D0 f11189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    EnumC0736k0 f11190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0754u.a f11191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EnumC0718b0 f11192e;

    public h(D0 d02, Boolean bool, C0754u.a aVar, EnumC0718b0 enumC0718b0) {
        this.f11189b = d02;
        this.f11190c = bool.booleanValue() ? EnumC0736k0.INCLUDE : EnumC0736k0.EXCLUDE;
        this.f11191d = aVar;
        this.f11192e = enumC0718b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(C1018d.b bVar, G0 g02, T t2) {
        if (t2 != null) {
            bVar.b("firebase_firestore", t2.getMessage(), AbstractC1210a.a(t2));
            bVar.c();
            b(null);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(g02.m().size());
        ArrayList arrayList3 = new ArrayList(g02.f().size());
        Iterator it = g02.m().iterator();
        while (it.hasNext()) {
            arrayList2.add(r.k((C0754u) it.next(), this.f11191d).e());
        }
        Iterator it2 = g02.f().iterator();
        while (it2.hasNext()) {
            arrayList3.add(r.h((C0731i) it2.next(), this.f11191d).f());
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(r.n(g02.n()).d());
        bVar.a(arrayList);
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        InterfaceC0720c0 interfaceC0720c0 = this.f11188a;
        if (interfaceC0720c0 != null) {
            interfaceC0720c0.remove();
            this.f11188a = null;
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b bVar) {
        N0.b bVar2 = new N0.b();
        bVar2.f(this.f11190c);
        bVar2.g(this.f11192e);
        this.f11188a = this.f11189b.g(bVar2.e(), new InterfaceC0756v() { // from class: r1.g
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj2, T t2) {
                this.f11186a.d(bVar, (G0) obj2, t2);
            }
        });
    }
}
