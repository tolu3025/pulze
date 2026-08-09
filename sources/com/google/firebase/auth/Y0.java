package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class Y0 extends q0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f6029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A f6030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f6031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f6032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6033f;

    Y0(FirebaseAuth firebaseAuth, String str, boolean z2, A a3, String str2, String str3) {
        this.f6028a = str;
        this.f6029b = z2;
        this.f6030c = a3;
        this.f6031d = str2;
        this.f6032e = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f6033f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
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
        String str2;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f6028a;
            sb = new StringBuilder("Logging in as ");
            sb.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f6028a;
            sb = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        if (this.f6029b) {
            FirebaseAuth firebaseAuth = this.f6033f;
            return firebaseAuth.f5923e.zzb(firebaseAuth.f5919a, (A) AbstractC0643s.k(this.f6030c), this.f6028a, this.f6031d, this.f6032e, str, new FirebaseAuth.d(this.f6033f));
        }
        FirebaseAuth firebaseAuth2 = this.f6033f;
        return firebaseAuth2.f5923e.zzb(firebaseAuth2.f5919a, this.f6028a, this.f6031d, this.f6032e, str, new FirebaseAuth.c(this.f6033f));
    }
}
