package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0111b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0111b c0111b = new DynamiteModule.b.C0111b();
        int iA = aVar.a(context, str, true);
        c0111b.f5698b = iA;
        if (iA != 0) {
            c0111b.f5699c = 1;
        } else {
            int iB = aVar.b(context, str);
            c0111b.f5697a = iB;
            if (iB != 0) {
                c0111b.f5699c = -1;
            }
        }
        return c0111b;
    }
}
