package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC0664n;

/* JADX INFO: loaded from: classes.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5848a;

    private u() {
    }

    /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f5848a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        AbstractC0664n.a(this.f5848a, Context.class);
        return new w(this.f5848a, null);
    }
}
