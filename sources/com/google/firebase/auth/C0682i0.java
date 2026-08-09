package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.auth.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0682i0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f6076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A f6077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C0683j f6078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6079d;

    C0682i0(FirebaseAuth firebaseAuth, boolean z2, A a3, C0683j c0683j) {
        this.f6076a = z2;
        this.f6077b = a3;
        this.f6078c = c0683j;
        Objects.requireNonNull(firebaseAuth);
        this.f6079d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q0.S
    public final Task c(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (this.f6076a) {
            FirebaseAuth firebaseAuth = this.f6079d;
            return firebaseAuth.f5923e.zzb(firebaseAuth.f5919a, (A) AbstractC0643s.k(this.f6077b), this.f6078c, str, (q0.j0) new FirebaseAuth.d(this.f6079d));
        }
        FirebaseAuth firebaseAuth2 = this.f6079d;
        return firebaseAuth2.f5923e.zza(firebaseAuth2.f5919a, this.f6078c, str, (q0.t0) new FirebaseAuth.c(this.f6079d));
    }
}
