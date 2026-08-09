package com.google.android.gms.common.internal;

import M.C0413a;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0413a f5518a;

    public Y(C0413a c0413a) {
        AbstractC0643s.b(c0413a.w(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f5518a = c0413a;
    }
}
