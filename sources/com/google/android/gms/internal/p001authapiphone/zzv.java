package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends e {
    private static final a.g zza;
    private static final a.AbstractC0106a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (a.d) a.d.f5326j, e.a.f5327c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC0620u.a().d(zzac.zzb).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1566).a());
    }

    public zzv(Context context) {
        super(context, zzc, a.d.f5326j, e.a.f5327c);
    }
}
