package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.AbstractC0610j;
import com.google.android.gms.common.api.internal.InterfaceC0611k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends AbstractC0610j {
    private final List zza;

    private zzv(InterfaceC0611k interfaceC0611k) {
        super(interfaceC0611k);
        this.zza = new ArrayList();
        this.mLifecycleFragment.b("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        InterfaceC0611k fragment = AbstractC0610j.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.c("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}
