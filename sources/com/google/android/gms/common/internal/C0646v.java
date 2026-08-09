package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0646v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5629b;

    public C0646v(Context context) {
        AbstractC0643s.k(context);
        Resources resources = context.getResources();
        this.f5628a = resources;
        this.f5629b = resources.getResourcePackageName(M.s.f2686a);
    }

    public String a(String str) {
        String str2 = this.f5629b;
        Resources resources = this.f5628a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
