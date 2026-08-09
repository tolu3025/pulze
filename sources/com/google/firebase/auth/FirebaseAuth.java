package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.Q;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import k0.C0992f;
import k0.C0999m;
import q0.C1126D;
import q0.C1135a0;
import q0.C1143e0;
import q0.C1144f;
import q0.C1145f0;
import q0.C1150i;
import q0.C1157p;
import q0.InterfaceC1134a;
import q0.InterfaceC1136b;
import q0.InterfaceC1164x;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC1136b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected final Executor f5917A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f5918B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0992f f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f5921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List f5922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final zzacq f5923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f5924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1144f f5925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f5926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f5928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f5929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C1135a0 f5930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RecaptchaAction f5931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RecaptchaAction f5932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RecaptchaAction f5933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RecaptchaAction f5934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final RecaptchaAction f5935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RecaptchaAction f5936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1145f0 f5937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final q0.k0 f5938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1126D f5939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final L0.b f5940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final L0.b f5941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C1143e0 f5942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Executor f5943y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Executor f5944z;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    class c implements q0.t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ FirebaseAuth f5945a;

        c(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f5945a = firebaseAuth;
        }

        @Override // q0.t0
        public final void a(zzahv zzahvVar, A a3) {
            AbstractC0643s.k(zzahvVar);
            AbstractC0643s.k(a3);
            a3.P(zzahvVar);
            this.f5945a.h0(a3, zzahvVar, true);
        }
    }

    class d implements InterfaceC1164x, q0.t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ FirebaseAuth f5946a;

        d(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f5946a = firebaseAuth;
        }

        @Override // q0.t0
        public final void a(zzahv zzahvVar, A a3) {
            AbstractC0643s.k(zzahvVar);
            AbstractC0643s.k(a3);
            a3.P(zzahvVar);
            this.f5946a.i0(a3, zzahvVar, true, true);
        }

        @Override // q0.InterfaceC1164x
        public final void zza(Status status) {
            if (status.t() == 17011 || status.t() == 17021 || status.t() == 17005 || status.t() == 17091) {
                this.f5946a.F();
            }
        }
    }

    public FirebaseAuth(C0992f c0992f, L0.b bVar, L0.b bVar2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(c0992f, new zzacq(c0992f, executor2, scheduledExecutorService), new C1145f0(c0992f.m(), c0992f.s()), q0.k0.f(), C1126D.b(), bVar, bVar2, executor, executor2, executor3, executor4);
    }

    private static C1143e0 D0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f5942x == null) {
            firebaseAuth.f5942x = new C1143e0((C0992f) AbstractC0643s.k(firebaseAuth.f5919a));
        }
        return firebaseAuth.f5942x;
    }

    private final synchronized C1143e0 G0() {
        return D0(this);
    }

    private final Task N(C0683j c0683j, A a3, boolean z2) {
        return new C0682i0(this, z2, a3, c0683j).b(this, this.f5929k, this.f5931m, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task U(A a3, q0.j0 j0Var) {
        AbstractC0643s.k(a3);
        return this.f5923e.zza(this.f5919a, a3, j0Var);
    }

    private final Task Z(String str, String str2, String str3, A a3, boolean z2) {
        return new Y0(this, str, z2, a3, str2, str3).b(this, str3, this.f5932n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q.b d0(String str, Q.b bVar) {
        return (this.f5925g.g() && str != null && str.equals(this.f5925g.d())) ? new M0(this, bVar) : bVar;
    }

    private static void f0(FirebaseAuth firebaseAuth, A a3) {
        String str;
        if (a3 != null) {
            str = "Notifying auth state listeners about user ( " + a3.a() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f5917A.execute(new X0(firebaseAuth));
    }

    private static void g0(FirebaseAuth firebaseAuth, A a3, zzahv zzahvVar, boolean z2, boolean z3) {
        boolean z4;
        AbstractC0643s.k(a3);
        AbstractC0643s.k(zzahvVar);
        boolean z5 = true;
        boolean z6 = firebaseAuth.f5924f != null && a3.a().equals(firebaseAuth.f5924f.a());
        if (z6 || !z3) {
            A a4 = firebaseAuth.f5924f;
            if (a4 == null) {
                z4 = true;
            } else {
                boolean z7 = !z6 || (a4.S().zzc().equals(zzahvVar.zzc()) ^ true);
                z4 = z6 ? false : true;
                z5 = z7;
            }
            AbstractC0643s.k(a3);
            if (firebaseAuth.f5924f == null || !a3.a().equals(firebaseAuth.a())) {
                firebaseAuth.f5924f = a3;
            } else {
                firebaseAuth.f5924f.N(a3.w());
                if (!a3.y()) {
                    firebaseAuth.f5924f.Q();
                }
                List listB = a3.v().b();
                List listU = a3.U();
                firebaseAuth.f5924f.T(listB);
                firebaseAuth.f5924f.R(listU);
            }
            if (z2) {
                firebaseAuth.f5937s.j(firebaseAuth.f5924f);
            }
            if (z5) {
                A a5 = firebaseAuth.f5924f;
                if (a5 != null) {
                    a5.P(zzahvVar);
                }
                r0(firebaseAuth, firebaseAuth.f5924f);
            }
            if (z4) {
                f0(firebaseAuth, firebaseAuth.f5924f);
            }
            if (z2) {
                firebaseAuth.f5937s.e(a3, zzahvVar);
            }
            A a6 = firebaseAuth.f5924f;
            if (a6 != null) {
                D0(firebaseAuth).d(a6.S());
            }
        }
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C0992f.o().k(FirebaseAuth.class);
    }

    public static void j0(P p2) {
        String strE;
        String strI;
        if (!p2.o()) {
            FirebaseAuth firebaseAuthC = p2.c();
            String strE2 = AbstractC0643s.e(p2.j());
            if (p2.f() == null && zzagb.zza(strE2, p2.g(), p2.a(), p2.k())) {
                return;
            }
            firebaseAuthC.f5939u.a(firebaseAuthC, strE2, p2.a(), firebaseAuthC.F0(), p2.l(), p2.n(), firebaseAuthC.f5934p).addOnCompleteListener(new K0(firebaseAuthC, p2, strE2));
            return;
        }
        FirebaseAuth firebaseAuthC2 = p2.c();
        C1157p c1157p = (C1157p) AbstractC0643s.k(p2.e());
        if (c1157p.w()) {
            strI = AbstractC0643s.e(p2.j());
            strE = strI;
        } else {
            U u2 = (U) AbstractC0643s.k(p2.h());
            strE = AbstractC0643s.e(u2.a());
            strI = u2.i();
        }
        if (p2.f() == null || !zzagb.zza(strE, p2.g(), p2.a(), p2.k())) {
            firebaseAuthC2.f5939u.a(firebaseAuthC2, strI, p2.a(), firebaseAuthC2.F0(), p2.l(), p2.n(), c1157p.w() ? firebaseAuthC2.f5935q : firebaseAuthC2.f5936r).addOnCompleteListener(new J0(firebaseAuthC2, p2, strE));
        }
    }

    public static void l0(final C0999m c0999m, P p2, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final Q.b bVarZza = zzagb.zza(str, p2.g(), null);
        p2.k().execute(new Runnable() { // from class: com.google.firebase.auth.I0
            @Override // java.lang.Runnable
            public final void run() {
                bVarZza.onVerificationFailed(c0999m);
            }
        });
    }

    private static void r0(FirebaseAuth firebaseAuth, A a3) {
        String str;
        if (a3 != null) {
            str = "Notifying id token listeners about user ( " + a3.a() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f5917A.execute(new V0(firebaseAuth, new M0.b(a3 != null ? a3.zzd() : null)));
    }

    private final boolean s0(String str) {
        C0675f c0675fC = C0675f.c(str);
        return (c0675fC == null || TextUtils.equals(this.f5929k, c0675fC.d())) ? false : true;
    }

    public Task A() {
        A a3 = this.f5924f;
        if (a3 == null || !a3.y()) {
            return this.f5923e.zza(this.f5919a, new c(this), this.f5929k);
        }
        C1150i c1150i = (C1150i) this.f5924f;
        c1150i.Z(false);
        return Tasks.forResult(new q0.H0(c1150i));
    }

    public Task B(AbstractC0679h abstractC0679h) {
        AbstractC0643s.k(abstractC0679h);
        AbstractC0679h abstractC0679hU = abstractC0679h.u();
        if (abstractC0679hU instanceof C0683j) {
            C0683j c0683j = (C0683j) abstractC0679hU;
            return !c0683j.y() ? Z(c0683j.zzc(), (String) AbstractC0643s.k(c0683j.zzd()), this.f5929k, null, false) : s0(AbstractC0643s.e(c0683j.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : N(c0683j, null, false);
        }
        if (abstractC0679hU instanceof O) {
            return this.f5923e.zza(this.f5919a, (O) abstractC0679hU, this.f5929k, (q0.t0) new c(this));
        }
        return this.f5923e.zza(this.f5919a, abstractC0679hU, this.f5929k, new c(this));
    }

    public final Executor B0() {
        return this.f5943y;
    }

    public Task C(String str) {
        AbstractC0643s.e(str);
        return this.f5923e.zza(this.f5919a, str, this.f5929k, new c(this));
    }

    public final Executor C0() {
        return this.f5944z;
    }

    public Task D(String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        return Z(str, str2, this.f5929k, null, false);
    }

    public Task E(String str, String str2) {
        return B(AbstractC0685k.b(str, str2));
    }

    public final void E0() {
        AbstractC0643s.k(this.f5937s);
        A a3 = this.f5924f;
        if (a3 != null) {
            this.f5937s.h(a3);
            this.f5924f = null;
        }
        this.f5937s.g();
        r0(this, null);
        f0(this, null);
    }

    public void F() {
        E0();
        C1143e0 c1143e0 = this.f5942x;
        if (c1143e0 != null) {
            c1143e0.b();
        }
    }

    final boolean F0() {
        return zzaeu.zza(l().m());
    }

    public Task G(Activity activity, AbstractC0691n abstractC0691n) {
        AbstractC0643s.k(abstractC0691n);
        AbstractC0643s.k(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f5938t.c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        q0.O.d(activity.getApplicationContext(), this);
        abstractC0691n.c(activity);
        return taskCompletionSource.getTask();
    }

    public void H() {
        synchronized (this.f5926h) {
            this.f5927i = zzafd.zza();
        }
    }

    public void I(String str, int i3) {
        AbstractC0643s.e(str);
        AbstractC0643s.b(i3 >= 0 && i3 <= 65535, "Port number must be in the range 0-65535");
        zzagl.zza(this.f5919a, str, i3);
    }

    public Task J(String str) {
        AbstractC0643s.e(str);
        return this.f5923e.zzd(this.f5919a, str, this.f5929k);
    }

    public final Task K() {
        return this.f5923e.zza();
    }

    public final Task L(Activity activity, AbstractC0691n abstractC0691n, A a3) {
        AbstractC0643s.k(activity);
        AbstractC0643s.k(abstractC0691n);
        AbstractC0643s.k(a3);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f5938t.d(activity, taskCompletionSource, this, a3)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        q0.O.e(activity.getApplicationContext(), this, a3);
        abstractC0691n.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task M(C0673e c0673e, String str) {
        AbstractC0643s.e(str);
        if (this.f5927i != null) {
            if (c0673e == null) {
                c0673e = C0673e.D();
            }
            c0673e.C(this.f5927i);
        }
        return this.f5923e.zza(this.f5919a, c0673e, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    public final Task O(A a3) {
        return U(a3, new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task P(A a3, AbstractC0679h abstractC0679h) {
        AbstractC0643s.k(abstractC0679h);
        AbstractC0643s.k(a3);
        return abstractC0679h instanceof C0683j ? new O0(this, a3, (C0683j) abstractC0679h.u()).b(this, a3.x(), this.f5933o, "EMAIL_PASSWORD_PROVIDER") : this.f5923e.zza(this.f5919a, a3, abstractC0679h.u(), (String) null, (q0.j0) new d(this));
    }

    public final Task Q(A a3, I i3, String str) {
        AbstractC0643s.k(a3);
        AbstractC0643s.k(i3);
        return i3 instanceof S ? this.f5923e.zza(this.f5919a, (S) i3, a3, str, new c(this)) : i3 instanceof Y ? this.f5923e.zza(this.f5919a, (Y) i3, a3, str, this.f5929k, new c(this)) : Tasks.forException(zzaen.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task R(A a3, O o2) {
        AbstractC0643s.k(a3);
        AbstractC0643s.k(o2);
        return this.f5923e.zza(this.f5919a, a3, (O) o2.u(), (q0.j0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task S(A a3, C0676f0 c0676f0) {
        AbstractC0643s.k(a3);
        AbstractC0643s.k(c0676f0);
        return this.f5923e.zza(this.f5919a, a3, c0676f0, (q0.j0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task T(A a3, String str) {
        AbstractC0643s.k(a3);
        AbstractC0643s.e(str);
        return this.f5923e.zza(this.f5919a, a3, str, this.f5929k, (q0.j0) new d(this)).continueWithTask(new S0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.W0, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task V(A a3, boolean z2) {
        if (a3 == null) {
            return Tasks.forException(zzaen.zza(new Status(17495)));
        }
        zzahv zzahvVarS = a3.S();
        return (!zzahvVarS.zzg() || z2) ? this.f5923e.zza(this.f5919a, a3, zzahvVarS.zzd(), (q0.j0) new W0(this)) : Tasks.forResult(q0.L.a(zzahvVarS.zzc()));
    }

    public final Task W(I i3, C1157p c1157p, A a3) {
        AbstractC0643s.k(i3);
        AbstractC0643s.k(c1157p);
        if (i3 instanceof S) {
            return this.f5923e.zza(this.f5919a, a3, (S) i3, AbstractC0643s.e(c1157p.zzc()), new c(this));
        }
        if (i3 instanceof Y) {
            return this.f5923e.zza(this.f5919a, a3, (Y) i3, AbstractC0643s.e(c1157p.zzc()), this.f5929k, new c(this));
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task X(String str) {
        return this.f5923e.zza(this.f5929k, str);
    }

    public final Task Y(String str, String str2, C0673e c0673e) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        if (c0673e == null) {
            c0673e = C0673e.D();
        }
        String str3 = this.f5927i;
        if (str3 != null) {
            c0673e.C(str3);
        }
        return this.f5923e.zza(str, str2, c0673e);
    }

    @Override // q0.InterfaceC1136b
    public String a() {
        A a3 = this.f5924f;
        if (a3 == null) {
            return null;
        }
        return a3.a();
    }

    public final Task a0(C1157p c1157p) {
        AbstractC0643s.k(c1157p);
        return this.f5923e.zza(c1157p, this.f5929k).continueWithTask(new T0(this));
    }

    @Override // q0.InterfaceC1136b
    public void b(InterfaceC1134a interfaceC1134a) {
        AbstractC0643s.k(interfaceC1134a);
        this.f5922d.remove(interfaceC1134a);
        G0().c(this.f5922d.size());
    }

    @Override // q0.InterfaceC1136b
    public Task c(boolean z2) {
        return V(this.f5924f, z2);
    }

    final Q.b c0(P p2, Q.b bVar, q0.r0 r0Var) {
        return p2.l() ? bVar : new L0(this, p2, r0Var, bVar);
    }

    @Override // q0.InterfaceC1136b
    public void d(InterfaceC1134a interfaceC1134a) {
        AbstractC0643s.k(interfaceC1134a);
        this.f5922d.add(interfaceC1134a);
        G0().c(this.f5922d.size());
    }

    public void e(a aVar) {
        this.f5921c.add(aVar);
        this.f5917A.execute(new U0(this, aVar));
    }

    public void f(b bVar) {
        this.f5920b.add(bVar);
        this.f5917A.execute(new H0(this, bVar));
    }

    public Task g(String str) {
        AbstractC0643s.e(str);
        return this.f5923e.zza(this.f5919a, str, this.f5929k);
    }

    public Task h(String str) {
        AbstractC0643s.e(str);
        return this.f5923e.zzb(this.f5919a, str, this.f5929k);
    }

    public final void h0(A a3, zzahv zzahvVar, boolean z2) {
        i0(a3, zzahvVar, true, false);
    }

    public Task i(String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        return this.f5923e.zza(this.f5919a, str, str2, this.f5929k);
    }

    final void i0(A a3, zzahv zzahvVar, boolean z2, boolean z3) {
        g0(this, a3, zzahvVar, true, z3);
    }

    public Task j(String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        return new N0(this, str, str2).b(this, this.f5929k, this.f5933o, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task k(String str) {
        AbstractC0643s.e(str);
        return this.f5923e.zzc(this.f5919a, str, this.f5929k);
    }

    public final void k0(P p2, q0.r0 r0Var) {
        long jLongValue = p2.i().longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String strE = AbstractC0643s.e(p2.j());
        String strC = r0Var.c();
        String strB = r0Var.b();
        String strD = r0Var.d();
        if (zzac.zzc(strC) && q0() != null && q0().d("PHONE_PROVIDER")) {
            strC = "NO_RECAPTCHA";
        }
        String str = strC;
        zzaij zzaijVar = new zzaij(strE, jLongValue, p2.f() != null, this.f5927i, this.f5929k, strD, strB, str, F0());
        Q.b bVarD0 = d0(strE, p2.g());
        if (TextUtils.isEmpty(r0Var.d())) {
            bVarD0 = c0(p2, bVarD0, q0.r0.a().d(strD).c(str).a(strB).b());
        }
        this.f5923e.zza(this.f5919a, zzaijVar, bVarD0, p2.a(), p2.k());
    }

    public C0992f l() {
        return this.f5919a;
    }

    public A m() {
        return this.f5924f;
    }

    public final synchronized void m0(C1135a0 c1135a0) {
        this.f5930l = c1135a0;
    }

    public String n() {
        return this.f5918B;
    }

    public final Task n0(Activity activity, AbstractC0691n abstractC0691n, A a3) {
        AbstractC0643s.k(activity);
        AbstractC0643s.k(abstractC0691n);
        AbstractC0643s.k(a3);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f5938t.d(activity, taskCompletionSource, this, a3)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        q0.O.e(activity.getApplicationContext(), this, a3);
        abstractC0691n.b(activity);
        return taskCompletionSource.getTask();
    }

    public AbstractC0708w o() {
        return this.f5925g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task o0(A a3, String str) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(a3);
        return this.f5923e.zzb(this.f5919a, a3, str, new d(this));
    }

    public String p() {
        String str;
        synchronized (this.f5926h) {
            str = this.f5927i;
        }
        return str;
    }

    public String q() {
        String str;
        synchronized (this.f5928j) {
            str = this.f5929k;
        }
        return str;
    }

    public final synchronized C1135a0 q0() {
        return this.f5930l;
    }

    public Task r() {
        if (this.f5930l == null) {
            this.f5930l = new C1135a0(this.f5919a, this);
        }
        return this.f5930l.a(this.f5929k, Boolean.FALSE).continueWithTask(new C0680h0(this));
    }

    public void s(a aVar) {
        this.f5921c.remove(aVar);
    }

    public void t(b bVar) {
        this.f5920b.remove(bVar);
    }

    public final L0.b t0() {
        return this.f5940v;
    }

    public Task u(String str) {
        AbstractC0643s.e(str);
        return v(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task u0(A a3, AbstractC0679h abstractC0679h) {
        AbstractC0643s.k(a3);
        AbstractC0643s.k(abstractC0679h);
        AbstractC0679h abstractC0679hU = abstractC0679h.u();
        if (!(abstractC0679hU instanceof C0683j)) {
            return abstractC0679hU instanceof O ? this.f5923e.zzb(this.f5919a, a3, (O) abstractC0679hU, this.f5929k, (q0.j0) new d(this)) : this.f5923e.zzc(this.f5919a, a3, abstractC0679hU, a3.x(), new d(this));
        }
        C0683j c0683j = (C0683j) abstractC0679hU;
        return "password".equals(c0683j.t()) ? Z(c0683j.zzc(), AbstractC0643s.e(c0683j.zzd()), a3.x(), a3, true) : s0(AbstractC0643s.e(c0683j.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : N(c0683j, a3, true);
    }

    public Task v(String str, C0673e c0673e) {
        AbstractC0643s.e(str);
        if (c0673e == null) {
            c0673e = C0673e.D();
        }
        String str2 = this.f5927i;
        if (str2 != null) {
            c0673e.C(str2);
        }
        c0673e.B(1);
        return new Q0(this, str, c0673e).b(this, this.f5929k, this.f5931m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task v0(A a3, String str) {
        AbstractC0643s.k(a3);
        AbstractC0643s.e(str);
        return this.f5923e.zzc(this.f5919a, a3, str, new d(this));
    }

    public Task w(String str, C0673e c0673e) {
        AbstractC0643s.e(str);
        AbstractC0643s.k(c0673e);
        if (!c0673e.s()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f5927i;
        if (str2 != null) {
            c0673e.C(str2);
        }
        return new P0(this, str, c0673e).b(this, this.f5929k, this.f5931m, "EMAIL_PASSWORD_PROVIDER");
    }

    public void x(String str) {
        String str2;
        AbstractC0643s.e(str);
        if (str.startsWith("chrome-extension://")) {
            this.f5918B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f5918B = (String) AbstractC0643s.k(new URI(str2).getHost());
        } catch (URISyntaxException e3) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e3.getMessage());
            }
            this.f5918B = str;
        }
    }

    public final L0.b x0() {
        return this.f5941w;
    }

    public void y(String str) {
        AbstractC0643s.e(str);
        synchronized (this.f5926h) {
            this.f5927i = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$d, q0.j0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task y0(A a3, String str) {
        AbstractC0643s.k(a3);
        AbstractC0643s.e(str);
        return this.f5923e.zzd(this.f5919a, a3, str, new d(this));
    }

    public void z(String str) {
        AbstractC0643s.e(str);
        synchronized (this.f5928j) {
            this.f5929k = str;
        }
    }

    private FirebaseAuth(C0992f c0992f, zzacq zzacqVar, C1145f0 c1145f0, q0.k0 k0Var, C1126D c1126d, L0.b bVar, L0.b bVar2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzahv zzahvVarA;
        this.f5920b = new CopyOnWriteArrayList();
        this.f5921c = new CopyOnWriteArrayList();
        this.f5922d = new CopyOnWriteArrayList();
        this.f5926h = new Object();
        this.f5928j = new Object();
        this.f5931m = RecaptchaAction.custom("getOobCode");
        this.f5932n = RecaptchaAction.custom("signInWithPassword");
        this.f5933o = RecaptchaAction.custom("signUpPassword");
        this.f5934p = RecaptchaAction.custom("sendVerificationCode");
        this.f5935q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f5936r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f5919a = (C0992f) AbstractC0643s.k(c0992f);
        this.f5923e = (zzacq) AbstractC0643s.k(zzacqVar);
        C1145f0 c1145f02 = (C1145f0) AbstractC0643s.k(c1145f0);
        this.f5937s = c1145f02;
        this.f5925g = new C1144f();
        q0.k0 k0Var2 = (q0.k0) AbstractC0643s.k(k0Var);
        this.f5938t = k0Var2;
        this.f5939u = (C1126D) AbstractC0643s.k(c1126d);
        this.f5940v = bVar;
        this.f5941w = bVar2;
        this.f5943y = executor2;
        this.f5944z = executor3;
        this.f5917A = executor4;
        A aB = c1145f02.b();
        this.f5924f = aB;
        if (aB != null && (zzahvVarA = c1145f02.a(aB)) != null) {
            g0(this, this.f5924f, zzahvVarA, false, false);
        }
        k0Var2.b(this);
    }

    public static FirebaseAuth getInstance(C0992f c0992f) {
        return (FirebaseAuth) c0992f.k(FirebaseAuth.class);
    }
}
