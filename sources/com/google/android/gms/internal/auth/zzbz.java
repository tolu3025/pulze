package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbz extends com.google.android.gms.common.server.response.b {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e3) {
            Log.e("AUTH", "Error serializing object.", e3);
            return null;
        }
    }
}
