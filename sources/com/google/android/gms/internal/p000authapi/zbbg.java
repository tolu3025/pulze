package com.google.android.gms.internal.p000authapi;

import G.C0319b;
import G.C0320c;
import G.C0322e;
import G.D;
import G.f;
import G.k;
import G.l;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.C0607g;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zbbg extends e implements k {
    private static final a.g zba;
    private static final a.AbstractC0106a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbbbVar, gVar);
    }

    public zbbg(Activity activity, D d3) {
        super(activity, zbc, (a.d) d3, e.a.f5327c);
        this.zbd = zbbj.zba();
    }

    @Override // G.k
    public final Task<C0320c> beginSignIn(C0319b c0319b) {
        AbstractC0643s.k(c0319b);
        C0319b.a aVarY = C0319b.y(c0319b);
        aVarY.g(this.zbd);
        final C0319b c0319bA = aVarY.a();
        return doRead(AbstractC0620u.a().d(zbbi.zba).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbax
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                C0319b c0319b2 = c0319bA;
                ((zbam) ((zbbh) obj).getService()).zbc(new zbbc(zbbgVar, (TaskCompletionSource) obj2), (C0319b) AbstractC0643s.k(c0319b2));
            }
        }).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f5314m);
        }
        Status status = (Status) N.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f5316o);
        }
        if (!status.x()) {
            throw new b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new b(Status.f5314m);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final C0322e c0322e) {
        AbstractC0643s.k(c0322e);
        return doRead(AbstractC0620u.a().d(zbbi.zbh).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                this.zba.zba(c0322e, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).e(1653).a());
    }

    public final l getSignInCredentialFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f5314m);
        }
        Status status = (Status) N.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f5316o);
        }
        if (!status.x()) {
            throw new b(status);
        }
        l lVar = (l) N.e.b(intent, "sign_in_credential", l.CREATOR);
        if (lVar != null) {
            return lVar;
        }
        throw new b(Status.f5314m);
    }

    @Override // G.k
    public final Task<PendingIntent> getSignInIntent(f fVar) {
        AbstractC0643s.k(fVar);
        f.a aVarX = f.x(fVar);
        aVarX.f(this.zbd);
        final f fVarA = aVarX.a();
        return doRead(AbstractC0620u.a().d(zbbi.zbf).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbay
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                f fVar2 = fVarA;
                ((zbam) ((zbbh) obj).getService()).zbe(new zbbe(zbbgVar, (TaskCompletionSource) obj2), (f) AbstractC0643s.k(fVar2));
            }
        }).e(1555).a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = com.google.android.gms.common.api.f.c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.f) it.next()).h();
        }
        C0607g.a();
        return doWrite(AbstractC0620u.a().d(zbbi.zbb).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                this.zba.zbb((zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).c(false).e(1554).a());
    }

    final /* synthetic */ void zba(C0322e c0322e, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), c0322e, this.zbd);
    }

    final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }

    public zbbg(Context context, D d3) {
        super(context, zbc, d3, e.a.f5327c);
        this.zbd = zbbj.zba();
    }
}
