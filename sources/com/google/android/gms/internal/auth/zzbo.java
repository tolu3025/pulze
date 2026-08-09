package com.google.android.gms.internal.auth;

import D.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends e {
    public zzbo(Activity activity, c cVar) {
        super(activity, D.b.f1240a, (a.d) (cVar == null ? c.f1244b : cVar), e.a.f5327c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(AbstractC0620u.a().b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        }).e(1520).a());
    }

    public final Task<I.c> performProxyRequest(final I.b bVar) {
        return doWrite(AbstractC0620u.a().b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                I.b bVar2 = bVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), bVar2);
            }
        }).e(1518).a());
    }

    public zzbo(Context context, c cVar) {
        super(context, D.b.f1240a, cVar == null ? c.f1244b : cVar, e.a.f5327c);
    }
}
