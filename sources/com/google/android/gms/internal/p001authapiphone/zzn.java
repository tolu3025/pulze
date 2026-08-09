package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends a.AbstractC0106a {
    zzn() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        return new zzw(context, looper, c0630e, interfaceC0606f, interfaceC0614n);
    }
}
