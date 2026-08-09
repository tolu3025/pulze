package com.google.android.recaptcha.internal;

import c2.AbstractC0599z;
import c2.InterfaceC0595x;
import c2.InterfaceC0600z0;
import c2.V;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class zzbx {
    public static final V zza(Task task) {
        final InterfaceC0595x interfaceC0595xB = AbstractC0599z.b(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC0595x interfaceC0595x = interfaceC0595xB;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC0595x.r(exception);
                } else if (task2.isCanceled()) {
                    InterfaceC0600z0.a.b(interfaceC0595x, null, 1, null);
                } else {
                    interfaceC0595x.u(task2.getResult());
                }
            }
        });
        return new zzbw(interfaceC0595xB);
    }
}
