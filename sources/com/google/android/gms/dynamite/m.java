package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class m implements DynamiteModule.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5701a;

    public m(int i3, int i4) {
        this.f5701a = i3;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z2) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return this.f5701a;
    }
}
