package com.google.firebase.firestore;

import j.InterfaceC0980a;

/* JADX INFO: renamed from: com.google.firebase.firestore.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W f6369a;

    C0746p0(W w2) {
        this.f6369a = w2;
    }

    public void c() {
        this.f6369a.g(new InterfaceC0980a() { // from class: com.google.firebase.firestore.o0
            @Override // j.InterfaceC0980a
            public final void accept(Object obj) {
                ((A0.S) obj).C();
            }
        });
    }

    public void d() {
        this.f6369a.g(new InterfaceC0980a() { // from class: com.google.firebase.firestore.n0
            @Override // j.InterfaceC0980a
            public final void accept(Object obj) {
                ((A0.S) obj).p0(false);
            }
        });
    }

    public void e() {
        this.f6369a.g(new InterfaceC0980a() { // from class: com.google.firebase.firestore.m0
            @Override // j.InterfaceC0980a
            public final void accept(Object obj) {
                ((A0.S) obj).p0(true);
            }
        });
    }
}
