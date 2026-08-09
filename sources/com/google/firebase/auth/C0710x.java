package com.google.firebase.auth;

/* JADX INFO: renamed from: com.google.firebase.auth.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710x extends C0697q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC0679h f6111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6112c;

    public C0710x(String str, String str2) {
        super(str, str2);
    }

    public final String b() {
        return this.f6112c;
    }

    public final AbstractC0679h c() {
        return this.f6111b;
    }

    public final C0710x d(AbstractC0679h abstractC0679h) {
        this.f6111b = abstractC0679h;
        return this;
    }

    public final C0710x e(String str) {
        this.f6112c = str;
        return this;
    }
}
