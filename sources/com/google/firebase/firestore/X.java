package com.google.firebase.firestore;

import J0.AbstractC0386b;
import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k0.C0992f;
import k0.C1001o;
import k0.InterfaceC0993g;

/* JADX INFO: loaded from: classes.dex */
class X implements InterfaceC0993g, FirebaseFirestore.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6300a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0992f f6301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f6302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0.a f6303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L0.a f6304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I0.J f6305f;

    X(Context context, C0992f c0992f, L0.a aVar, L0.a aVar2, I0.J j3) {
        this.f6302c = context;
        this.f6301b = c0992f;
        this.f6303d = aVar;
        this.f6304e = aVar2;
        this.f6305f = j3;
        c0992f.h(this);
    }

    @Override // com.google.firebase.firestore.FirebaseFirestore.a
    public synchronized void a(String str) {
        this.f6300a.remove(str);
    }

    @Override // k0.InterfaceC0993g
    public synchronized void b(String str, C1001o c1001o) {
        for (Map.Entry entry : new ArrayList(this.f6300a.entrySet())) {
            ((FirebaseFirestore) entry.getValue()).d0();
            AbstractC0386b.d(!this.f6300a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    synchronized FirebaseFirestore c(String str) {
        FirebaseFirestore firebaseFirestoreW;
        firebaseFirestoreW = (FirebaseFirestore) this.f6300a.get(str);
        if (firebaseFirestoreW == null) {
            firebaseFirestoreW = FirebaseFirestore.W(this.f6302c, this.f6301b, this.f6303d, this.f6304e, str, this, this.f6305f);
            this.f6300a.put(str, firebaseFirestoreW);
        }
        return firebaseFirestoreW;
    }
}
