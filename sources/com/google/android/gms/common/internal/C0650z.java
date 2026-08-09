package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0650z implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0650z f5632b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5633a;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.z$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5634a;

        /* synthetic */ a(byte[] bArr) {
        }

        public C0650z a() {
            return new C0650z(this.f5634a, null);
        }
    }

    /* synthetic */ C0650z(String str, byte[] bArr) {
        this.f5633a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f5633a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0650z) {
            return AbstractC0642q.b(this.f5633a, ((C0650z) obj).f5633a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f5633a);
    }
}
