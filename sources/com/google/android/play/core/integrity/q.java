package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC0664n;

/* JADX INFO: loaded from: classes.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5841a;

    private q() {
    }

    /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f5841a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        AbstractC0664n.a(this.f5841a, Context.class);
        return new s(this.f5841a, null);
    }
}
