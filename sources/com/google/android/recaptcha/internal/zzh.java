package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.AbstractC0560f;
import c2.AbstractC0570k;
import c2.N;
import c2.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzh extends l implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j3, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVarZzf;
        Object objA;
        zzen zzenVar;
        Object objE = N1.d.e();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            o.b(obj);
            objA = obj;
        } else {
            o.b(obj);
            N n3 = (N) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            zzen zzenVar2 = zzenVarZzf;
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(AbstractC0570k.b(n3, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null));
                }
            }
            V[] vArr = (V[]) arrayList.toArray(new V[0]);
            V[] vArr2 = (V[]) Arrays.copyOf(vArr, vArr.length);
            this.zze = zzenVar2;
            this.zza = 1;
            objA = AbstractC0560f.a(vArr2, this);
            if (objA == objE) {
                return objE;
            }
            zzenVar = zzenVar2;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) objA).iterator();
        while (it.hasNext()) {
            Object objI = ((n) it.next()).i();
            if (n.g(objI)) {
                zzshVarZzf.zzh((zzsi) objI);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
