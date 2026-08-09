package M;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: M.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC0414b extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f2662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f2664c;

    public static DialogFragmentC0414b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC0414b dialogFragmentC0414b = new DialogFragmentC0414b();
        Dialog dialog2 = (Dialog) AbstractC0643s.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC0414b.f2662a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC0414b.f2663b = onCancelListener;
        }
        return dialogFragmentC0414b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2663b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2662a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2664c == null) {
            this.f2664c = new AlertDialog.Builder((Context) AbstractC0643s.k(getActivity())).create();
        }
        return this.f2664c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
