package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.Q;
import java.util.Objects;
import k0.C0999m;
import q0.C1126D;
import q0.C1157p;

/* JADX INFO: loaded from: classes.dex */
final class J0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ P f5951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5953c;

    J0(FirebaseAuth firebaseAuth, P p2, String str) {
        this.f5951a = p2;
        this.f5952b = str;
        Objects.requireNonNull(firebaseAuth);
        this.f5953c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String strD;
        String strB;
        String strC;
        if (task.isSuccessful()) {
            strD = ((q0.r0) task.getResult()).d();
            strB = ((q0.r0) task.getResult()).b();
            strC = ((q0.r0) task.getResult()).c();
        } else {
            Exception exception = task.getException();
            String str = "Error while validating application identity: ";
            if (exception != null) {
                str = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str);
            if (exception != null && C1126D.i(exception)) {
                FirebaseAuth.l0((C0999m) exception, this.f5951a, this.f5952b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            strC = null;
            strD = null;
            strB = null;
        }
        long jLongValue = this.f5951a.i().longValue();
        Q.b bVarD0 = this.f5953c.d0(this.f5951a.j(), this.f5951a.g());
        if (TextUtils.isEmpty(strD)) {
            bVarD0 = this.f5953c.c0(this.f5951a, bVarD0, (q0.r0) task.getResult());
        }
        Q.b bVar = bVarD0;
        C1157p c1157p = (C1157p) AbstractC0643s.k(this.f5951a.e());
        if (zzac.zzc(strC) && this.f5953c.q0() != null && this.f5953c.q0().d("PHONE_PROVIDER")) {
            strC = "NO_RECAPTCHA";
        }
        String str2 = strC;
        if (c1157p.w()) {
            this.f5953c.f5923e.zza(c1157p, (String) AbstractC0643s.k(this.f5951a.j()), this.f5953c.f5927i, jLongValue, this.f5951a.f() != null, this.f5951a.m(), strD, strB, str2, this.f5953c.F0(), bVar, this.f5951a.k(), this.f5951a.a());
        } else {
            this.f5953c.f5923e.zza(c1157p, (U) AbstractC0643s.k(this.f5951a.h()), this.f5953c.f5927i, jLongValue, this.f5951a.f() != null, this.f5951a.m(), strD, strB, str2, this.f5953c.F0(), bVar, this.f5951a.k(), this.f5951a.a());
        }
    }
}
