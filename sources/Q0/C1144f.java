package q0;

import com.google.firebase.auth.AbstractC0708w;

/* JADX INFO: renamed from: q0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144f extends AbstractC0708w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10718c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10719d = false;

    @Override // com.google.firebase.auth.AbstractC0708w
    public final void a(boolean z2) {
        this.f10719d = z2;
    }

    @Override // com.google.firebase.auth.AbstractC0708w
    public final void b(boolean z2) {
        this.f10718c = z2;
    }

    @Override // com.google.firebase.auth.AbstractC0708w
    public final void c(String str, String str2) {
        this.f10716a = str;
        this.f10717b = str2;
    }

    public final String d() {
        return this.f10716a;
    }

    public final String e() {
        return this.f10717b;
    }

    public final boolean f() {
        return this.f10719d;
    }

    public final boolean g() {
        return (this.f10716a == null || this.f10717b == null) ? false : true;
    }

    public final boolean h() {
        return this.f10718c;
    }
}
