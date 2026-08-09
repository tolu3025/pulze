package com.google.firebase.firestore;

import A0.C0217o;
import F0.AbstractC0315t;
import F0.C0307k;
import J0.AbstractC0386b;
import J1.AbstractC0411o;
import V0.D;
import V0.y;
import com.google.protobuf.AbstractC0806y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.P f6222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V0 f6223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0217o.b f6225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I1.g f6226f;

    public J0(FirebaseFirestore firebaseFirestore, I0.P serializer, V0 userDataReader, List stages, C0217o.b bVar) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        kotlin.jvm.internal.m.e(stages, "stages");
        this.f6221a = firebaseFirestore;
        this.f6222b = serializer;
        this.f6223c = userDataReader;
        this.f6224d = stages;
        this.f6225e = bVar;
        this.f6226f = I1.i.a(new U1.a() { // from class: com.google.firebase.firestore.H0
            @Override // U1.a
            public final Object invoke() {
                return J0.r(this.f6216a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(F0.O stage) {
        kotlin.jvm.internal.m.e(stage, "stage");
        return stage.b();
    }

    private final G0.Q g() {
        return new G0.Q(this);
    }

    private final F0.N j() {
        for (F0.O o2 : J1.v.w(k())) {
            if (o2 instanceof F0.N) {
                return (F0.N) o2;
            }
        }
        throw AbstractC0386b.a("RealtimePipeline must contain at least one Sort stage (ensured by RewriteStages).", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(J0 j02) {
        List listC = AbstractC0411o.c();
        boolean z2 = false;
        for (F0.O o2 : j02.f6224d) {
            if ((o2 instanceof F0.C) || (o2 instanceof F0.D)) {
                if (!z2) {
                    listC.add(F0.N.f1454e.a());
                    z2 = true;
                }
                listC.add(o2);
            } else if (o2 instanceof F0.N) {
                listC.add(((F0.N) o2).m());
                z2 = true;
            } else {
                listC.add(o2);
            }
        }
        if (!z2) {
            listC.add(F0.N.f1454e.a());
        }
        return AbstractC0411o.a(listC);
    }

    public final String c() {
        return J1.x.G(k(), "|", null, null, 0, null, new U1.l() { // from class: com.google.firebase.firestore.I0
            @Override // U1.l
            public final Object invoke(Object obj) {
                return J0.d((F0.O) obj);
            }
        }, 30, null);
    }

    public final Comparator e() {
        return j().l(g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        if (kotlin.jvm.internal.m.a(this.f6222b.a(), j02.f6222b.a())) {
            return kotlin.jvm.internal.m.a(k(), j02.k());
        }
        return false;
    }

    public final List f(List inputs) {
        kotlin.jvm.internal.m.e(inputs, "inputs");
        G0.Q q2 = new G0.Q(this);
        Iterator it = k().iterator();
        while (it.hasNext()) {
            inputs = ((F0.O) it.next()).c(q2, inputs);
        }
        return inputs;
    }

    public final FirebaseFirestore h() {
        return this.f6221a;
    }

    public int hashCode() {
        return (this.f6222b.a().hashCode() * 31) + this.f6224d.hashCode();
    }

    public final C0217o.b i() {
        return this.f6225e;
    }

    public final List k() {
        return (List) this.f6226f.getValue();
    }

    public final I0.P l() {
        return this.f6222b;
    }

    public final List m() {
        return this.f6224d;
    }

    public final V0 n() {
        return this.f6223c;
    }

    public final boolean o() {
        Iterator it = k().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((F0.O) it.next()).d(), "limit")) {
                return true;
            }
        }
        return false;
    }

    public final boolean p(D0.i doc) {
        kotlin.jvm.internal.m.e(doc, "doc");
        return !f(AbstractC0411o.d((D0.s) doc)).isEmpty();
    }

    public final boolean q() {
        D0.r rVarF0;
        for (F0.O o2 : k()) {
            if (kotlin.jvm.internal.m.a(o2.d(), "limit")) {
                return false;
            }
            if (o2 instanceof F0.V) {
                AbstractC0315t abstractC0315tG = ((F0.V) o2).g();
                C0307k c0307k = abstractC0315tG instanceof C0307k ? (C0307k) abstractC0315tG : null;
                AbstractC0315t abstractC0315tC0 = c0307k != null ? c0307k.C0() : null;
                F0.z zVar = abstractC0315tC0 instanceof F0.z ? (F0.z) abstractC0315tC0 : null;
                if (kotlin.jvm.internal.m.a(zVar != null ? zVar.B0() : null, "exists") && zVar.C0().length == 1) {
                    AbstractC0315t abstractC0315t = zVar.C0()[0];
                    F0.w wVar = abstractC0315t instanceof F0.w ? (F0.w) abstractC0315t : null;
                    if (wVar == null || (rVarF0 = wVar.F0()) == null || !rVarF0.D()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final V0.D s() {
        D.b bVarG0 = V0.D.g0();
        y.b bVarF0 = V0.y.f0();
        List listK = k();
        ArrayList arrayList = new ArrayList(J1.q.n(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(((F0.O) it.next()).f(this.f6223c));
        }
        bVarG0.x((V0.y) bVarF0.w(arrayList).n());
        AbstractC0806y abstractC0806yN = bVarG0.n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.D) abstractC0806yN;
    }

    public final J0 t(C0217o.b options) {
        kotlin.jvm.internal.m.e(options, "options");
        return new J0(this.f6221a, this.f6222b, this.f6223c, this.f6224d, options);
    }

    public String toString() {
        return c();
    }

    public /* synthetic */ J0(FirebaseFirestore firebaseFirestore, I0.P p2, V0 v02, List list, C0217o.b bVar, int i3, kotlin.jvm.internal.h hVar) {
        this(firebaseFirestore, p2, v02, list, (i3 & 16) != 0 ? null : bVar);
    }
}
