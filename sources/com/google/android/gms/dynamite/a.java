package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class a implements DynamiteModule.b {
    a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0111b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0111b c0111b = new DynamiteModule.b.C0111b();
        int iB = aVar.b(context, str);
        c0111b.f5697a = iB;
        c0111b.f5699c = iB != 0 ? -1 : 0;
        return c0111b;
    }
}
