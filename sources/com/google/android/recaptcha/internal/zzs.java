package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.AbstractC0560f;
import c2.AbstractC0570k;
import c2.InterfaceC0600z0;
import c2.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends l implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzv zzvVar, String str, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            N n3 = (N) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC0570k.d(n3, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, null));
            }
            InterfaceC0600z0[] interfaceC0600z0Arr = (InterfaceC0600z0[]) arrayList2.toArray(new InterfaceC0600z0[0]);
            InterfaceC0600z0[] interfaceC0600z0Arr2 = (InterfaceC0600z0[]) Arrays.copyOf(interfaceC0600z0Arr, interfaceC0600z0Arr.length);
            this.zza = 1;
            if (AbstractC0560f.c(interfaceC0600z0Arr2, this) == objE) {
                return objE;
            }
        }
        n.a aVar = n.f2411b;
        return n.a(n.b(this.zzb.zzq(this.zzc)));
    }
}
