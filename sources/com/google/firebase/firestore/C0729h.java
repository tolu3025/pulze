package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0729h extends D0 {
    C0729h(D0.u uVar, FirebaseFirestore firebaseFirestore) {
        super(A0.f0.b(uVar), firebaseFirestore);
        if (uVar.w() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + uVar.n() + " has " + uVar.w());
    }

    public String X() {
        return this.f6176a.n().n();
    }
}
