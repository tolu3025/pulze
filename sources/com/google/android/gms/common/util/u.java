package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (l.g()) {
            StrictMode.setVmPolicy(t.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
