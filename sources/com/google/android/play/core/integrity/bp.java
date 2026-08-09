package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.G;
import com.google.android.play.integrity.internal.InterfaceC0662l;

/* JADX INFO: loaded from: classes.dex */
public final class bp implements InterfaceC0662l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5822d;

    public bp(com.google.android.play.integrity.internal.o oVar, com.google.android.play.integrity.internal.o oVar2, com.google.android.play.integrity.internal.o oVar3, com.google.android.play.integrity.internal.o oVar4) {
        this.f5819a = oVar;
        this.f5820b = oVar2;
        this.f5821c = oVar3;
        this.f5822d = oVar4;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f5819a.a(), (G) this.f5820b.a(), ((au) this.f5821c).a(), new j());
    }
}
