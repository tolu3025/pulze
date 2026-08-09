package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class O0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A f5979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0683j f5980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5981c;

    O0(FirebaseAuth firebaseAuth, A a3, C0683j c0683j) {
        this.f5979a = a3;
        this.f5980b = c0683j;
        Objects.requireNonNull(firebaseAuth);
        this.f5981c = firebaseAuth;
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
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        FirebaseAuth firebaseAuth = this.f5981c;
        return firebaseAuth.f5923e.zza(firebaseAuth.f5919a, this.f5979a, (AbstractC0679h) this.f5980b, str, (q0.j0) new FirebaseAuth.d(this.f5981c));
    }
}
