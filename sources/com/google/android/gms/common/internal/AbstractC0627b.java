package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0627b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.v() ? new com.google.android.gms.common.api.i(status) : new com.google.android.gms.common.api.b(status);
    }
}
