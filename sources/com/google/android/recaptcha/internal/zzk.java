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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends l implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, zzek zzekVar, long j3, zzsc zzscVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j3;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        zzen zzenVar;
        Object objA2;
        Object objE = N1.d.e();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            o.b(obj);
            objA = obj;
        } else {
            o.b(obj);
            N n3 = (N) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0570k.b(n3, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null));
            }
            V[] vArr = (V[]) arrayList.toArray(new V[0]);
            V[] vArr2 = (V[]) Arrays.copyOf(vArr, vArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            objA = AbstractC0560f.a(vArr2, this);
            if (objA == objE) {
                return objE;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) objA;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            n.a aVar = n.f2411b;
            objA2 = o.a(zzbdVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!n.f(((n) it2.next()).i())) {
                    zzenVar.zza();
                    objA2 = u.f2419a;
                    break;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            n.a aVar2 = n.f2411b;
            objA2 = o.a(zzbdVar2);
        }
        return n.a(n.b(objA2));
    }
}
