package b0;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0522d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g f4934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0106a f4935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.AbstractC0106a f4936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f4937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f4938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f4939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f4940h;

    static {
        a.g gVar = new a.g();
        f4933a = gVar;
        a.g gVar2 = new a.g();
        f4934b = gVar2;
        C0520b c0520b = new C0520b();
        f4935c = c0520b;
        C0521c c0521c = new C0521c();
        f4936d = c0521c;
        f4937e = new Scope("profile");
        f4938f = new Scope("email");
        f4939g = new com.google.android.gms.common.api.a("SignIn.API", c0520b, gVar);
        f4940h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", c0521c, gVar2);
    }
}
