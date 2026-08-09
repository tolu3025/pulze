package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class d implements DynamiteModule.b.a {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z2) {
        return DynamiteModule.d(context, str, z2);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
