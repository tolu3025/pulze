package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.A;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.C;
import com.google.firebase.auth.C0673e;
import com.google.firebase.auth.C0676f0;
import com.google.firebase.auth.C0683j;
import com.google.firebase.auth.InterfaceC0671d;
import com.google.firebase.auth.InterfaceC0681i;
import com.google.firebase.auth.O;
import com.google.firebase.auth.Q;
import com.google.firebase.auth.S;
import com.google.firebase.auth.U;
import com.google.firebase.auth.X;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;
import q0.C1142e;
import q0.C1150i;
import q0.C1152k;
import q0.C1157p;
import q0.InterfaceC1164x;
import q0.InterfaceC1165y;
import q0.N;
import q0.j0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
public final class zzacq extends zzafo {
    public zzacq(C0992f c0992f, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(c0992f, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<Void> zzb(C0992f c0992f, A a3, AbstractC0679h abstractC0679h, String str, j0 j0Var) {
        return zza((zzadg) new zzadg(abstractC0679h, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<InterfaceC0681i> zzc(C0992f c0992f, A a3, AbstractC0679h abstractC0679h, String str, j0 j0Var) {
        return zza((zzadf) new zzadf(abstractC0679h, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zzd(C0992f c0992f, A a3, String str, j0 j0Var) {
        return zza((zzaeg) new zzaeg(str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(A a3, InterfaceC1165y interfaceC1165y) {
        return zza((zzact) new zzact().zza(a3).zza(interfaceC1165y).zza((InterfaceC1164x) interfaceC1165y));
    }

    public final Task<InterfaceC0681i> zzb(C0992f c0992f, A a3, C0683j c0683j, String str, j0 j0Var) {
        return zza((zzadh) new zzadh(c0683j, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zzc(C0992f c0992f, A a3, String str, j0 j0Var) {
        return zza((zzaed) new zzaed(str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<String> zzd(C0992f c0992f, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(c0992f));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzads(str));
    }

    public final Task<InterfaceC0681i> zzb(C0992f c0992f, A a3, O o2, String str, j0 j0Var) {
        zzagb.zza();
        return zza((zzadl) new zzadl(o2, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<X> zzc(C0992f c0992f, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(c0992f));
    }

    public final Task<zzahs> zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<InterfaceC0681i> zzb(C0992f c0992f, A a3, String str, String str2, String str3, String str4, j0 j0Var) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(String str, String str2, C0673e c0673e) {
        c0673e.B(7);
        return zza(new zzaeh(str, str2, c0673e));
    }

    public final Task<InterfaceC0681i> zzb(C0992f c0992f, A a3, String str, j0 j0Var) {
        AbstractC0643s.k(c0992f);
        AbstractC0643s.e(str);
        AbstractC0643s.k(a3);
        AbstractC0643s.k(j0Var);
        List listV = a3.V();
        if ((listV != null && !listV.contains(str)) || a3.y()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals("password") ? zza((zzaee) new zzaee(str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var)) : zza((zzaeb) new zzaeb().zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zzb(C0992f c0992f, String str, C0673e c0673e, String str2, String str3) {
        c0673e.B(6);
        return zza((zzadp) new zzadp(str, c0673e, str2, str3, "sendSignInLinkToEmail").zza(c0992f));
    }

    public final Task<Void> zza(C0992f c0992f, C0673e c0673e, String str) {
        return zza((zzadq) new zzadq(str, c0673e).zza(c0992f));
    }

    public final Task<InterfaceC0671d> zzb(C0992f c0992f, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(c0992f));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, AbstractC0679h abstractC0679h, String str, t0 t0Var) {
        return zza((zzadu) new zzadu(abstractC0679h, str).zza(c0992f).zza(t0Var));
    }

    public final Task<InterfaceC0681i> zzb(C0992f c0992f, String str, String str2, String str3, String str4, t0 t0Var) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(c0992f).zza(t0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, C0683j c0683j, String str, t0 t0Var) {
        return zza((zzadv) new zzadv(c0683j, str).zza(c0992f).zza(t0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, A a3, AbstractC0679h abstractC0679h, String str, j0 j0Var) {
        AbstractC0643s.k(c0992f);
        AbstractC0643s.k(abstractC0679h);
        AbstractC0643s.k(a3);
        AbstractC0643s.k(j0Var);
        List listV = a3.V();
        if (listV != null && listV.contains(abstractC0679h.s())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (abstractC0679h instanceof C0683j) {
            C0683j c0683j = (C0683j) abstractC0679h;
            return !c0683j.y() ? zza((zzadc) new zzadc(c0683j, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var)) : zza((zzadd) new zzadd(c0683j).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
        }
        if (abstractC0679h instanceof O) {
            zzagb.zza();
            return zza((zzade) new zzade((O) abstractC0679h).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
        }
        AbstractC0643s.k(c0992f);
        AbstractC0643s.k(abstractC0679h);
        AbstractC0643s.k(a3);
        AbstractC0643s.k(j0Var);
        return zza((zzadb) new zzadb(abstractC0679h).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, C0683j c0683j, String str, j0 j0Var) {
        return zza((zzadi) new zzadi(c0683j, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, O o2, String str, j0 j0Var) {
        zzagb.zza();
        return zza((zzadm) new zzadm(o2, str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, O o2, j0 j0Var) {
        zzagb.zza();
        return zza((zzaef) new zzaef(o2).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, A a3, S s2, String str, t0 t0Var) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(s2, str, null);
        zzacyVar.zza(c0992f).zza(t0Var);
        if (a3 != null) {
            zzacyVar.zza(a3);
        }
        return zza(zzacyVar);
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, A a3, Y y2, String str, String str2, t0 t0Var) {
        zzacy zzacyVar = new zzacy(y2, str, str2);
        zzacyVar.zza(c0992f).zza(t0Var);
        if (a3 != null) {
            zzacyVar.zza(a3);
        }
        return zza(zzacyVar);
    }

    public final Task<Void> zza(C0992f c0992f, A a3, C0676f0 c0676f0, j0 j0Var) {
        return zza((zzaei) new zzaei(c0676f0).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, String str, String str2, String str3, String str4, j0 j0Var) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, String str, String str2, j0 j0Var) {
        return zza((zzaec) new zzaec(a3.zze(), str, str2).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<C> zza(C0992f c0992f, A a3, String str, j0 j0Var) {
        return zza((zzacx) new zzacx(str).zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<Void> zza(C0992f c0992f, A a3, j0 j0Var) {
        return zza((zzado) new zzado().zza(c0992f).zza(a3).zza(j0Var).zza((InterfaceC1164x) j0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, O o2, String str, t0 t0Var) {
        zzagb.zza();
        return zza((zzady) new zzady(o2, str).zza(c0992f).zza(t0Var));
    }

    public final Task<Void> zza(C0992f c0992f, S s2, A a3, String str, t0 t0Var) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(s2, a3.zze(), str, null);
        zzacvVar.zza(c0992f).zza(t0Var);
        return zza(zzacvVar);
    }

    public final Task<Void> zza(C0992f c0992f, Y y2, A a3, String str, String str2, t0 t0Var) {
        zzacv zzacvVar = new zzacv(y2, a3.zze(), str, str2);
        zzacvVar.zza(c0992f).zza(t0Var);
        return zza(zzacvVar);
    }

    public final Task<Void> zza(C0992f c0992f, String str, C0673e c0673e, String str2, String str3) {
        c0673e.B(1);
        return zza((zzadp) new zzadp(str, c0673e, str2, str3, "sendPasswordResetEmail").zza(c0992f));
    }

    public final Task<Void> zza(C0992f c0992f, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(c0992f));
    }

    public final Task<Void> zza(C0992f c0992f, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(c0992f));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, String str, String str2, String str3, String str4, t0 t0Var) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(c0992f).zza(t0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, String str, String str2, t0 t0Var) {
        return zza((zzadt) new zzadt(str, str2).zza(c0992f).zza(t0Var));
    }

    public final Task<InterfaceC0681i> zza(C0992f c0992f, t0 t0Var, String str) {
        return zza((zzadr) new zzadr(str).zza(c0992f).zza(t0Var));
    }

    public final Task<Void> zza(C1157p c1157p, U u2, String str, long j3, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, Q.b bVar, Executor executor, Activity activity) {
        zzadz zzadzVar = new zzadz(u2, AbstractC0643s.e(c1157p.zzc()), str, j3, z2, z3, str2, str3, str4, z4);
        zzadzVar.zza(bVar, activity, executor, u2.a());
        return zza(zzadzVar);
    }

    public final Task<zzair> zza(C1157p c1157p, String str) {
        return zza(new zzaea(c1157p, str));
    }

    public final Task<Void> zza(C1157p c1157p, String str, String str2, long j3, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, Q.b bVar, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(c1157p, str, str2, j3, z2, z3, str3, str4, str5, z4);
        zzadxVar.zza(bVar, activity, executor, str);
        return zza(zzadxVar);
    }

    static C1150i zza(C0992f c0992f, zzahk zzahkVar) {
        AbstractC0643s.k(c0992f);
        AbstractC0643s.k(zzahkVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1142e(zzahkVar, "firebase"));
        List<zzaib> listZzl = zzahkVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i3 = 0; i3 < listZzl.size(); i3++) {
                arrayList.add(new C1142e(listZzl.get(i3)));
            }
        }
        C1150i c1150i = new C1150i(c0992f, arrayList);
        c1150i.Y(new C1152k(zzahkVar.zzb(), zzahkVar.zza()));
        c1150i.Z(zzahkVar.zzn());
        c1150i.X(zzahkVar.zze());
        c1150i.T(N.b(zzahkVar.zzk()));
        c1150i.R(zzahkVar.zzd());
        return c1150i;
    }

    public final void zza(C0992f c0992f, zzaij zzaijVar, Q.b bVar, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(c0992f).zza(bVar, activity, executor, zzaijVar.zzd()));
    }
}
