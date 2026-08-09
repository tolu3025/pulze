package M;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class t extends androidx.fragment.app.c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Dialog f2687o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Dialog f2689q0;

    public static t u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        t tVar = new t();
        Dialog dialog2 = (Dialog) AbstractC0643s.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        tVar.f2687o0 = dialog2;
        if (onCancelListener != null) {
            tVar.f2688p0 = onCancelListener;
        }
        return tVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2688p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog q1(Bundle bundle) {
        Dialog dialog = this.f2687o0;
        if (dialog != null) {
            return dialog;
        }
        r1(false);
        if (this.f2689q0 == null) {
            this.f2689q0 = new AlertDialog.Builder((Context) AbstractC0643s.k(r())).create();
        }
        return this.f2689q0;
    }

    @Override // androidx.fragment.app.c
    public void t1(androidx.fragment.app.i iVar, String str) {
        super.t1(iVar, str);
    }
}
