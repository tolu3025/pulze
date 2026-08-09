package com.google.android.gms.common.api.internal;

import M.C0413a;
import M.C0421i;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends AbstractC0610j implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile boolean f5448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference f5449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f5450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C0421i f5451d;

    n0(InterfaceC0611k interfaceC0611k, C0421i c0421i) {
        super(interfaceC0611k);
        this.f5449b = new AtomicReference(null);
        this.f5450c = new zao(Looper.getMainLooper());
        this.f5451d = c0421i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void g() {
        this.f5449b.set(null);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void h(C0413a c0413a, int i3) {
        this.f5449b.set(null);
        d(c0413a, i3);
    }

    private static final int c(j0 j0Var) {
        if (j0Var == null) {
            return -1;
        }
        return j0Var.a();
    }

    protected abstract void d(C0413a c0413a, int i3);

    protected abstract void e();

    public final void f(C0413a c0413a, int i3) {
        j0 j0Var = new j0(c0413a, i3);
        if (m0.a(this.f5449b, null, j0Var)) {
            this.f5450c.post(new l0(this, j0Var));
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onActivityResult(int i3, int i4, Intent intent) {
        j0 j0Var = (j0) this.f5449b.get();
        if (i3 != 1) {
            if (i3 == 2) {
                int iF = this.f5451d.f(getActivity());
                if (iF == 0) {
                    g();
                    return;
                } else {
                    if (j0Var == null) {
                        return;
                    }
                    if (j0Var.b().t() == 18 && iF == 18) {
                        return;
                    }
                }
            }
        } else if (i4 == -1) {
            g();
            return;
        } else if (i4 == 0) {
            if (j0Var != null) {
                h(new C0413a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, j0Var.b().toString()), c(j0Var));
                return;
            }
            return;
        }
        if (j0Var != null) {
            h(j0Var.b(), j0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        h(new C0413a(13, null), c((j0) this.f5449b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5449b.set(bundle.getBoolean("resolving_error", false) ? new j0(new C0413a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j0 j0Var = (j0) this.f5449b.get();
        if (j0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", j0Var.a());
        bundle.putInt("failed_status", j0Var.b().t());
        bundle.putParcelable("failed_resolution", j0Var.b().v());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public void onStart() {
        super.onStart();
        this.f5448a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public void onStop() {
        super.onStop();
        this.f5448a = false;
    }
}
