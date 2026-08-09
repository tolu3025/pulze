package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.G;
import com.google.android.play.integrity.internal.InterfaceC0662l;

/* JADX INFO: loaded from: classes.dex */
public final class al implements InterfaceC0662l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5758d;

    public al(com.google.android.play.integrity.internal.o oVar, com.google.android.play.integrity.internal.o oVar2, com.google.android.play.integrity.internal.o oVar3, com.google.android.play.integrity.internal.o oVar4) {
        this.f5755a = oVar;
        this.f5756b = oVar2;
        this.f5757c = oVar3;
        this.f5758d = oVar4;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f5755a.a(), (G) this.f5756b.a(), ((au) this.f5757c).a(), new i());
    }
}
