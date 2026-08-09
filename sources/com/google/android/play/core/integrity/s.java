package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C0661k;
import com.google.android.play.integrity.internal.C0663m;
import com.google.android.play.integrity.internal.InterfaceC0662l;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f5842a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5847f;

    /* synthetic */ s(Context context, r rVar) {
        InterfaceC0662l interfaceC0662lB = C0663m.b(context);
        this.f5843b = interfaceC0662lB;
        com.google.android.play.integrity.internal.o oVarB = C0661k.b(ac.f5733a);
        this.f5844c = oVarB;
        au auVar = new au(interfaceC0662lB, l.f5835a);
        this.f5845d = auVar;
        com.google.android.play.integrity.internal.o oVarB2 = C0661k.b(new al(interfaceC0662lB, oVarB, auVar, l.f5835a));
        this.f5846e = oVarB2;
        this.f5847f = C0661k.b(new ab(oVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f5847f.a();
    }
}
