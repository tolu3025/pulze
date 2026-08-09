package q0;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import k0.C0992f;

/* JADX INFO: renamed from: q0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f10713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1160t f10714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f10715c;

    private C1143e0(Context context, C1160t c1160t) {
        this.f10715c = false;
        this.f10713a = 0;
        this.f10714b = c1160t;
        ComponentCallbacks2C0603c.c((Application) context.getApplicationContext());
        ComponentCallbacks2C0603c.b().a(new C1149h0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return this.f10713a > 0 && !this.f10715c;
    }

    public final void b() {
        this.f10714b.b();
    }

    public final void c(int i3) {
        if (i3 > 0 && this.f10713a == 0) {
            this.f10713a = i3;
            if (f()) {
                this.f10714b.c();
            }
        } else if (i3 == 0 && this.f10713a != 0) {
            this.f10714b.b();
        }
        this.f10713a = i3;
    }

    public final void d(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long jZza = zzahvVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzahvVar.zzb() + (jZza * 1000);
        C1160t c1160t = this.f10714b;
        c1160t.f10778b = jZzb;
        c1160t.f10779c = -1L;
        if (f()) {
            this.f10714b.c();
        }
    }

    public C1143e0(C0992f c0992f) {
        this(c0992f.m(), new C1160t(c0992f));
    }
}
