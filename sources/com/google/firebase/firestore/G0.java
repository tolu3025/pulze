package com.google.firebase.firestore;

import com.google.firebase.firestore.C0731i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class G0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f6206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0.E0 f6207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseFirestore f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f6209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC0736k0 f6210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O0 f6211f;

    private class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f6212a;

        a(Iterator it) {
            this.f6212a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E0 next() {
            return G0.this.d((D0.i) this.f6212a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6212a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    G0(D0 d02, A0.E0 e02, FirebaseFirestore firebaseFirestore) {
        this.f6206a = (D0) J0.C.b(d02);
        this.f6207b = (A0.E0) J0.C.b(e02);
        this.f6208c = (FirebaseFirestore) J0.C.b(firebaseFirestore);
        this.f6211f = new O0(e02.j(), e02.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E0 d(D0.i iVar) {
        return E0.h(this.f6208c, iVar, this.f6207b.k(), this.f6207b.f().contains(iVar.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0731i o(D0.i iVar, C0731i.a aVar, Integer num, Integer num2) {
        return new C0731i(E0.h(this.f6208c, iVar, this.f6207b.k(), this.f6207b.f().contains(iVar.getKey())), aVar, num.intValue(), num2.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f6208c.equals(g02.f6208c) && this.f6206a.equals(g02.f6206a) && this.f6207b.equals(g02.f6207b) && this.f6211f.equals(g02.f6211f);
    }

    public List f() {
        return l(EnumC0736k0.EXCLUDE);
    }

    public int hashCode() {
        return (((((this.f6208c.hashCode() * 31) + this.f6206a.hashCode()) * 31) + this.f6207b.hashCode()) * 31) + this.f6211f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f6207b.e().iterator());
    }

    public List l(EnumC0736k0 enumC0736k0) {
        if (EnumC0736k0.INCLUDE.equals(enumC0736k0) && this.f6207b.b()) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f6209d == null || this.f6210e != enumC0736k0) {
            this.f6209d = Collections.unmodifiableList(K0.a(enumC0736k0, this.f6207b, new U1.r() { // from class: com.google.firebase.firestore.F0
                @Override // U1.r
                public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
                    return this.f6189a.o((D0.i) obj, (C0731i.a) obj2, (Integer) obj3, (Integer) obj4);
                }
            }));
            this.f6210e = enumC0736k0;
        }
        return this.f6209d;
    }

    public List m() {
        ArrayList arrayList = new ArrayList(this.f6207b.e().size());
        Iterator it = this.f6207b.e().iterator();
        while (it.hasNext()) {
            arrayList.add(d((D0.i) it.next()));
        }
        return arrayList;
    }

    public O0 n() {
        return this.f6211f;
    }
}
