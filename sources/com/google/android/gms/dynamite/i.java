package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0111b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0111b c0111b = new DynamiteModule.b.C0111b();
        int iB = aVar.b(context, str);
        c0111b.f5697a = iB;
        int i3 = 1;
        int i4 = 0;
        int iA = iB != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0111b.f5698b = iA;
        int i5 = c0111b.f5697a;
        if (i5 == 0) {
            if (iA == 0) {
                i3 = 0;
            }
            c0111b.f5699c = i3;
            return c0111b;
        }
        i4 = i5;
        if (i4 >= iA) {
            i3 = -1;
        }
        c0111b.f5699c = i3;
        return c0111b;
    }
}
