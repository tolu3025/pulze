package q0;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC0668b0;

/* JADX INFO: renamed from: q0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1147g0 implements InterfaceC0668b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FirebaseAuth f10730g;

    public C1147g0(String str, String str2, int i3, int i4, long j3, String str3, FirebaseAuth firebaseAuth) {
        AbstractC0643s.f(str3, "sessionInfo cannot be empty.");
        AbstractC0643s.l(firebaseAuth, "firebaseAuth cannot be null.");
        this.f10724a = AbstractC0643s.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f10725b = AbstractC0643s.f(str2, "hashAlgorithm cannot be empty.");
        this.f10726c = i3;
        this.f10727d = i4;
        this.f10728e = j3;
        this.f10729f = str3;
        this.f10730g = firebaseAuth;
    }

    private final void j(String str) {
        this.f10730g.l().m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final String a() {
        return this.f10725b;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final int b() {
        return this.f10726c;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final String c() {
        return this.f10729f;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final String d(String str, String str2) {
        AbstractC0643s.f(str, "accountName cannot be empty.");
        AbstractC0643s.f(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f10724a, str2, this.f10725b, Integer.valueOf(this.f10726c));
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final String e() {
        return this.f10724a;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final String f() {
        return d(AbstractC0643s.f(((com.google.firebase.auth.A) AbstractC0643s.l(this.f10730g.m(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).m(), "Email cannot be empty, since verified email is required to use MFA."), this.f10730g.l().q());
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final long g() {
        return this.f10728e;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final int h() {
        return this.f10727d;
    }

    @Override // com.google.firebase.auth.InterfaceC0668b0
    public final void i(String str) {
        AbstractC0643s.f(str, "qrCodeUrl cannot be empty.");
        try {
            j(str);
        } catch (ActivityNotFoundException unused) {
            j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }
}
