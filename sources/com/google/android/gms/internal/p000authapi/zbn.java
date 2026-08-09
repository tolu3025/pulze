package com.google.android.gms.internal.p000authapi;

import D.a;
import N.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zbn {
    public static PendingIntent zba(Context context, a.C0005a c0005a, HintRequest hintRequest, String str) {
        AbstractC0643s.l(context, "context must not be null");
        AbstractC0643s.l(hintRequest, "request must not be null");
        Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", TextUtils.isEmpty(str) ? zbbj.zba() : (String) AbstractC0643s.k(str));
        e.e(hintRequest, intentPutExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, intentPutExtra, zbbk.zba | 134217728);
    }
}
