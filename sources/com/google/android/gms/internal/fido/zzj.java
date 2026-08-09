package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends a.AbstractC0106a {
    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, f.a aVar, f.b bVar) {
        return new zzk(context, looper, c0630e, aVar, bVar);
    }
}
