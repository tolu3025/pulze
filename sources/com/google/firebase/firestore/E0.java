package com.google.firebase.firestore;

import J0.AbstractC0386b;
import com.google.firebase.firestore.C0754u;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class E0 extends C0754u {
    private E0(FirebaseFirestore firebaseFirestore, D0.l lVar, D0.i iVar, boolean z2, boolean z3) {
        super(firebaseFirestore, lVar, iVar, z2, z3);
    }

    static E0 h(FirebaseFirestore firebaseFirestore, D0.i iVar, boolean z2, boolean z3) {
        return new E0(firebaseFirestore, iVar.getKey(), iVar, z2, z3);
    }

    @Override // com.google.firebase.firestore.C0754u
    public Map d() {
        Map mapD = super.d();
        AbstractC0386b.d(mapD != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapD;
    }

    @Override // com.google.firebase.firestore.C0754u
    public Map e(C0754u.a aVar) {
        J0.C.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map mapE = super.e(aVar);
        AbstractC0386b.d(mapE != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mapE;
    }
}
