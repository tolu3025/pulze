package com.google.firebase.firestore;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final M0 f6230c = new M0(false, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final M0 f6231d = new M0(true, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E0.d f6233b;

    private M0(boolean z2, E0.d dVar) {
        J0.C.a(dVar == null || z2, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f6232a = z2;
        this.f6233b = dVar;
    }

    public static M0 c() {
        return f6231d;
    }

    public static M0 d(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C0760x) it.next()).c());
        }
        return new M0(true, E0.d.b(hashSet));
    }

    public E0.d a() {
        return this.f6233b;
    }

    boolean b() {
        return this.f6232a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M0.class != obj.getClass()) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (this.f6232a != m02.f6232a) {
            return false;
        }
        E0.d dVar = this.f6233b;
        E0.d dVar2 = m02.f6233b;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        int i3 = (this.f6232a ? 1 : 0) * 31;
        E0.d dVar = this.f6233b;
        return i3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
