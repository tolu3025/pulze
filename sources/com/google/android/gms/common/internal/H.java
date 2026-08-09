package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0611k;

/* JADX INFO: loaded from: classes.dex */
public abstract class H implements DialogInterface.OnClickListener {
    public static H b(Activity activity, Intent intent, int i3) {
        return new F(intent, activity, i3);
    }

    public static H c(InterfaceC0611k interfaceC0611k, Intent intent, int i3) {
        return new G(intent, interfaceC0611k, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e3) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e3);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
