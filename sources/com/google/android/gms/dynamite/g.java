package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0111b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0111b c0111b = new DynamiteModule.b.C0111b();
        int iA = aVar.a(context, str, false);
        c0111b.f5698b = iA;
        c0111b.f5699c = iA != 0 ? 1 : 0;
        return c0111b;
    }
}
