package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
abstract class t {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
