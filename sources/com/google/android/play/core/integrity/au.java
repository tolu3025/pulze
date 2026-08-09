package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.InterfaceC0662l;

/* JADX INFO: loaded from: classes.dex */
public final class au implements InterfaceC0662l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5776b;

    public au(com.google.android.play.integrity.internal.o oVar, com.google.android.play.integrity.internal.o oVar2) {
        this.f5775a = oVar;
        this.f5776b = oVar2;
    }

    @Override // com.google.android.play.integrity.internal.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f5775a, this.f5776b);
    }
}
