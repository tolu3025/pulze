package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Handler f4485d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Runnable f4486e0 = new a();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f4487f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f4488g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f4489h0 = true;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f4490i0 = true;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f4491j0 = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    Dialog f4492k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f4493l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f4494m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    boolean f4495n0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f4492k0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Bundle bundle) {
        Bundle bundle2;
        super.V(bundle);
        if (this.f4490i0) {
            View viewL = L();
            if (viewL != null) {
                if (viewL.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f4492k0.setContentView(viewL);
            }
            d dVarL = l();
            if (dVarL != null) {
                this.f4492k0.setOwnerActivity(dVarL);
            }
            this.f4492k0.setCancelable(this.f4489h0);
            this.f4492k0.setOnCancelListener(this);
            this.f4492k0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f4492k0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y(Context context) {
        super.Y(context);
        if (this.f4495n0) {
            return;
        }
        this.f4494m0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.f4485d0 = new Handler();
        this.f4490i0 = this.f4398B == 0;
        if (bundle != null) {
            this.f4487f0 = bundle.getInt("android:style", 0);
            this.f4488g0 = bundle.getInt("android:theme", 0);
            this.f4489h0 = bundle.getBoolean("android:cancelable", true);
            this.f4490i0 = bundle.getBoolean("android:showsDialog", this.f4490i0);
            this.f4491j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        Dialog dialog = this.f4492k0;
        if (dialog != null) {
            this.f4493l0 = true;
            dialog.setOnDismissListener(null);
            this.f4492k0.dismiss();
            if (!this.f4494m0) {
                onDismiss(this.f4492k0);
            }
            this.f4492k0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        super.j0();
        if (this.f4495n0 || this.f4494m0) {
            return;
        }
        this.f4494m0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater k0(Bundle bundle) {
        Context contextG;
        if (!this.f4490i0) {
            return super.k0(bundle);
        }
        Dialog dialogQ1 = q1(bundle);
        this.f4492k0 = dialogQ1;
        if (dialogQ1 != null) {
            s1(dialogQ1, this.f4487f0);
            contextG = this.f4492k0.getContext();
        } else {
            contextG = this.f4443x.g();
        }
        return (LayoutInflater) contextG.getSystemService("layout_inflater");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4493l0) {
            return;
        }
        p1(true, true);
    }

    void p1(boolean z2, boolean z3) {
        if (this.f4494m0) {
            return;
        }
        this.f4494m0 = true;
        this.f4495n0 = false;
        Dialog dialog = this.f4492k0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4492k0.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.f4485d0.getLooper()) {
                    onDismiss(this.f4492k0);
                } else {
                    this.f4485d0.post(this.f4486e0);
                }
            }
        }
        this.f4493l0 = true;
        if (this.f4491j0 >= 0) {
            b1().g(this.f4491j0, 1);
            this.f4491j0 = -1;
            return;
        }
        n nVarA = b1().a();
        nVarA.g(this);
        if (z2) {
            nVarA.e();
        } else {
            nVarA.d();
        }
    }

    public abstract Dialog q1(Bundle bundle);

    public void r1(boolean z2) {
        this.f4490i0 = z2;
    }

    public void s1(Dialog dialog, int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.f4494m0 = false;
        this.f4495n0 = true;
        n nVarA = iVar.a();
        nVarA.b(this, str);
        nVarA.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void x0(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        super.x0(bundle);
        Dialog dialog = this.f4492k0;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i3 = this.f4487f0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f4488g0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z2 = this.f4489h0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f4490i0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i5 = this.f4491j0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        Dialog dialog = this.f4492k0;
        if (dialog != null) {
            this.f4493l0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z0() {
        super.z0();
        Dialog dialog = this.f4492k0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
