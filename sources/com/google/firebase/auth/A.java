package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import java.util.List;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends N.a implements InterfaceC0674e0 {
    public Task A(AbstractC0679h abstractC0679h) {
        AbstractC0643s.k(abstractC0679h);
        return FirebaseAuth.getInstance(O()).u0(this, abstractC0679h);
    }

    public Task B() {
        return FirebaseAuth.getInstance(O()).O(this);
    }

    public Task C() {
        return FirebaseAuth.getInstance(O()).V(this, false).continueWithTask(new C0692n0(this));
    }

    public Task D(C0673e c0673e) {
        return FirebaseAuth.getInstance(O()).V(this, false).continueWithTask(new C0690m0(this, c0673e));
    }

    public Task E(Activity activity, AbstractC0691n abstractC0691n) {
        AbstractC0643s.k(activity);
        AbstractC0643s.k(abstractC0691n);
        return FirebaseAuth.getInstance(O()).L(activity, abstractC0691n, this);
    }

    public Task F(Activity activity, AbstractC0691n abstractC0691n) {
        AbstractC0643s.k(activity);
        AbstractC0643s.k(abstractC0691n);
        return FirebaseAuth.getInstance(O()).n0(activity, abstractC0691n, this);
    }

    public Task G(String str) {
        AbstractC0643s.e(str);
        return FirebaseAuth.getInstance(O()).o0(this, str);
    }

    public Task H(String str) {
        AbstractC0643s.e(str);
        return FirebaseAuth.getInstance(O()).v0(this, str);
    }

    public Task I(String str) {
        AbstractC0643s.e(str);
        return FirebaseAuth.getInstance(O()).y0(this, str);
    }

    public Task J(O o2) {
        return FirebaseAuth.getInstance(O()).R(this, o2);
    }

    public Task K(C0676f0 c0676f0) {
        AbstractC0643s.k(c0676f0);
        return FirebaseAuth.getInstance(O()).S(this, c0676f0);
    }

    public Task L(String str) {
        return M(str, null);
    }

    public Task M(String str, C0673e c0673e) {
        return FirebaseAuth.getInstance(O()).V(this, false).continueWithTask(new C0694o0(this, str, c0673e));
    }

    public abstract A N(List list);

    public abstract C0992f O();

    public abstract void P(zzahv zzahvVar);

    public abstract A Q();

    public abstract void R(List list);

    public abstract zzahv S();

    public abstract void T(List list);

    public abstract List U();

    public abstract List V();

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public abstract String a();

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public abstract Uri b();

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public abstract String i();

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public abstract String m();

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public abstract String p();

    public Task s() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(O());
        AbstractC0643s.k(this);
        return firebaseAuth.f5923e.zza(this, new R0(firebaseAuth, this));
    }

    public Task t(boolean z2) {
        return FirebaseAuth.getInstance(O()).V(this, z2);
    }

    public abstract B u();

    public abstract H v();

    public abstract List w();

    public abstract String x();

    public abstract boolean y();

    public Task z(AbstractC0679h abstractC0679h) {
        AbstractC0643s.k(abstractC0679h);
        return FirebaseAuth.getInstance(O()).P(this, abstractC0679h);
    }

    public abstract String zzd();

    public abstract String zze();
}
