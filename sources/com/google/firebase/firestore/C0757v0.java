package com.google.firebase.firestore;

import F0.C0308l;
import F0.C0309m;
import F0.C0310n;
import F0.C0311o;
import F0.C0312p;
import F0.C0314s;
import java.util.ArrayList;
import k0.C0992f;
import k0.C1001o;

/* JADX INFO: renamed from: com.google.firebase.firestore.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6412b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6413a;

    /* JADX INFO: renamed from: com.google.firebase.firestore.v0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public C0757v0(FirebaseFirestore firestore) {
        kotlin.jvm.internal.m.e(firestore, "firestore");
        this.f6413a = firestore;
    }

    public final C0751s0 a(C0729h ref) {
        kotlin.jvm.internal.m.e(ref, "ref");
        return b(ref, new C0311o());
    }

    public final C0751s0 b(C0729h ref, C0311o options) {
        C1001o c1001oR;
        C1001o c1001oR2;
        kotlin.jvm.internal.m.e(ref, "ref");
        kotlin.jvm.internal.m.e(options, "options");
        if (kotlin.jvm.internal.m.a(ref.f6177b.B(), this.f6413a.B())) {
            C0992f c0992fA = ref.f6177b.A();
            String strG = null;
            String strG2 = (c0992fA == null || (c1001oR2 = c0992fA.r()) == null) ? null : c1001oR2.g();
            C0992f c0992fA2 = this.f6413a.A();
            if (c0992fA2 != null && (c1001oR = c0992fA2.r()) != null) {
                strG = c1001oR.g();
            }
            if (kotlin.jvm.internal.m.a(strG2, strG)) {
                FirebaseFirestore firebaseFirestore = this.f6413a;
                V0 v0F = firebaseFirestore.F();
                D0.u uVarB = D0.u.B(ref.X());
                kotlin.jvm.internal.m.d(uVarB, "fromString(...)");
                return new C0751s0(firebaseFirestore, v0F, new C0310n(uVarB, new I0.P(this.f6413a.B()), options));
            }
        }
        throw new IllegalArgumentException("Invalid CollectionReference. The Firestore instance of the CollectionReference must match the Firestore instance of the PipelineSource.");
    }

    public final C0751s0 c(String path) {
        kotlin.jvm.internal.m.e(path, "path");
        C0729h c0729hV = this.f6413a.v(path);
        kotlin.jvm.internal.m.d(c0729hV, "collection(...)");
        return a(c0729hV);
    }

    public final C0751s0 d(String collectionId) {
        kotlin.jvm.internal.m.e(collectionId, "collectionId");
        return e(collectionId, new C0308l());
    }

    public final C0751s0 e(String collectionId, C0308l options) {
        kotlin.jvm.internal.m.e(collectionId, "collectionId");
        kotlin.jvm.internal.m.e(options, "options");
        FirebaseFirestore firebaseFirestore = this.f6413a;
        return new C0751s0(firebaseFirestore, firebaseFirestore.F(), new C0309m(collectionId, options));
    }

    public final C0751s0 f() {
        FirebaseFirestore firebaseFirestore = this.f6413a;
        return new C0751s0(firebaseFirestore, firebaseFirestore.F(), new C0312p(null, 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0751s0 g(C0752t... documents) {
        kotlin.jvm.internal.m.e(documents, "documents");
        D0.f fVarB = this.f6413a.B();
        kotlin.jvm.internal.m.d(fVarB, "getDatabaseId(...)");
        for (C0752t c0752t : documents) {
            if (!kotlin.jvm.internal.m.a(c0752t.p().B(), fVarB)) {
                throw new IllegalArgumentException("Provided document reference is from a different Firestore instance.");
            }
        }
        FirebaseFirestore firebaseFirestore = this.f6413a;
        V0 v0F = firebaseFirestore.F();
        ArrayList arrayList = new ArrayList(documents.length);
        for (C0752t c0752t2 : documents) {
            arrayList.add(D0.u.B(c0752t2.s()));
        }
        return new C0751s0(firebaseFirestore, v0F, new C0314s((D0.u[]) arrayList.toArray(new D0.u[0]), null, 2, 0 == true ? 1 : 0));
    }
}
