package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0652b extends H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ IBinder f5873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC0655e f5874m;

    C0652b(ServiceConnectionC0655e serviceConnectionC0655e, IBinder iBinder) {
        this.f5874m = serviceConnectionC0655e;
        this.f5873l = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.H
    public final void b() {
        this.f5874m.f5876a.f5891n = (IInterface) this.f5874m.f5876a.f5886i.a(this.f5873l);
        C0656f.r(this.f5874m.f5876a);
        this.f5874m.f5876a.f5884g = false;
        Iterator it = this.f5874m.f5876a.f5881d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f5874m.f5876a.f5881d.clear();
    }
}
