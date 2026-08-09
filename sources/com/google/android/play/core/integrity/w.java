package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C0661k;
import com.google.android.play.integrity.internal.C0663m;
import com.google.android.play.integrity.internal.InterfaceC0662l;

/* JADX INFO: loaded from: classes.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f5849a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5855g;

    /* synthetic */ w(Context context, v vVar) {
        InterfaceC0662l interfaceC0662lB = C0663m.b(context);
        this.f5850b = interfaceC0662lB;
        com.google.android.play.integrity.internal.o oVarB = C0661k.b(bb.f5786a);
        this.f5851c = oVarB;
        au auVar = new au(interfaceC0662lB, n.f5840a);
        this.f5852d = auVar;
        com.google.android.play.integrity.internal.o oVarB2 = C0661k.b(new bp(interfaceC0662lB, oVarB, auVar, n.f5840a));
        this.f5853e = oVarB2;
        com.google.android.play.integrity.internal.o oVarB3 = C0661k.b(new bu(oVarB2));
        this.f5854f = oVarB3;
        this.f5855g = C0661k.b(new ba(oVarB2, oVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f5855g.a();
    }
}
