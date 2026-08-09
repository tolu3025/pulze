package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0610j;
import com.google.android.gms.common.api.internal.InterfaceC0611k;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.A;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.Q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k0.C0992f;
import q0.InterfaceC1164x;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected C0992f zzc;
    protected A zzd;
    protected CallbackT zze;
    protected InterfaceC1164x zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AbstractC0679h zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<Q.b> zzh = new ArrayList();

    private static class zza extends AbstractC0610j {
        private final List<Q.b> zza;

        private zza(InterfaceC0611k interfaceC0611k, List<Q.b> list) {
            super(interfaceC0611k);
            this.mLifecycleFragment.b("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<Q.b> list) {
            InterfaceC0611k fragment = AbstractC0610j.getFragment(activity);
            if (((zza) fragment.c("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC0610j
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i3) {
        this.zza = i3;
    }

    public final zzaff<ResultT, CallbackT> zza(A a3) {
        this.zzd = (A) AbstractC0643s.l(a3, "firebaseUser cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(Q.b bVar, Activity activity, Executor executor, String str) {
        Q.b bVarZza = zzagb.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((Q.b) AbstractC0643s.k(bVarZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) AbstractC0643s.k(executor);
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) AbstractC0643s.l(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(C0992f c0992f) {
        this.zzc = (C0992f) AbstractC0643s.l(c0992f, "firebaseApp cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(InterfaceC1164x interfaceC1164x) {
        this.zzf = (InterfaceC1164x) AbstractC0643s.l(interfaceC1164x, "external failure callback cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }

    static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        AbstractC0643s.n(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        InterfaceC1164x interfaceC1164x = zzaffVar.zzf;
        if (interfaceC1164x != null) {
            interfaceC1164x.zza(status);
        }
    }
}
