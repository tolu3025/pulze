package com.google.android.gms.internal.auth;

import C.g;
import C.h;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends e implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0106a zzb;
    private static final com.google.android.gms.common.api.a zzc;
    private static final P.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new com.google.android.gms.common.api.a("GoogleAuthService.API", zzvVar, gVar);
        zzd = g.a("GoogleAuthServiceClient");
    }

    zzab(Context context) {
        super(context, zzc, a.d.f5326j, e.a.f5327c);
        this.zze = context;
    }

    static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC0621v.c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(AbstractC0620u.a().d(h.f749j).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).e(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final C.b bVar) {
        AbstractC0643s.l(bVar, "request cannot be null.");
        return doWrite(AbstractC0620u.a().d(h.f748i).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                C.b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        }).e(1515).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        AbstractC0643s.l(account, "Account name cannot be null!");
        AbstractC0643s.f(str, "Scope cannot be null!");
        return doWrite(AbstractC0620u.a().d(h.f749j).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).e(1512).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        AbstractC0643s.l(account, "account cannot be null.");
        return doWrite(AbstractC0620u.a().d(h.f748i).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).e(1517).a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        AbstractC0643s.l(str, "Client package name cannot be null!");
        return doWrite(AbstractC0620u.a().d(h.f748i).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).e(1514).a());
    }
}
