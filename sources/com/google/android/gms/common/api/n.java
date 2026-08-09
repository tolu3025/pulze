package com.google.android.gms.common.api;

import M.C0415c;

/* JADX INFO: loaded from: classes.dex */
public final class n extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0415c f5479a;

    public n(C0415c c0415c) {
        this.f5479a = c0415c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5479a));
    }
}
