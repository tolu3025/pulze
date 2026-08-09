package p1;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.P;
import com.google.firebase.auth.Q;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0999m;
import l1.C1018d;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public class i1 implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap f10558k = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f10559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final FirebaseAuth f10560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f10561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.google.firebase.auth.U f10562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f10563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f10564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.firebase.auth.L f10565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f10566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Integer f10567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1018d.b f10568j;

    class a extends Q.b {
        a() {
        }

        @Override // com.google.firebase.auth.Q.b
        public void onCodeAutoRetrievalTimeOut(String str) {
            HashMap map = new HashMap();
            map.put("verificationId", str);
            map.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (i1.this.f10568j != null) {
                i1.this.f10568j.a(map);
            }
        }

        @Override // com.google.firebase.auth.Q.b
        public void onCodeSent(String str, Q.a aVar) {
            int iHashCode = aVar.hashCode();
            i1.f10558k.put(Integer.valueOf(iHashCode), aVar);
            HashMap map = new HashMap();
            map.put("verificationId", str);
            map.put("forceResendingToken", Integer.valueOf(iHashCode));
            map.put("name", "Auth#phoneCodeSent");
            if (i1.this.f10568j != null) {
                i1.this.f10568j.a(map);
            }
        }

        @Override // com.google.firebase.auth.Q.b
        public void onVerificationCompleted(com.google.firebase.auth.O o2) {
            int iHashCode = o2.hashCode();
            i1.this.f10564f.a(o2);
            HashMap map = new HashMap();
            map.put("token", Integer.valueOf(iHashCode));
            if (o2.v() != null) {
                map.put("smsCode", o2.v());
            }
            map.put("name", "Auth#phoneVerificationCompleted");
            if (i1.this.f10568j != null) {
                i1.this.f10568j.a(map);
            }
        }

        @Override // com.google.firebase.auth.Q.b
        public void onVerificationFailed(C0999m c0999m) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            AbstractC1068c0.C1075g c1075gE = AbstractC1113w.e(c0999m);
            map2.put("code", c1075gE.f10444a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
            map2.put("message", c1075gE.getMessage());
            map2.put("details", c1075gE.f10445b);
            map.put("error", map2);
            map.put("name", "Auth#phoneVerificationFailed");
            if (i1.this.f10568j != null) {
                i1.this.f10568j.a(map);
            }
        }
    }

    interface b {
        void a(com.google.firebase.auth.O o2);
    }

    public i1(Activity activity, AbstractC1068c0.C1070b c1070b, AbstractC1068c0.E e3, com.google.firebase.auth.L l3, com.google.firebase.auth.U u2, b bVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f10559a = atomicReference;
        atomicReference.set(activity);
        this.f10565g = l3;
        this.f10562d = u2;
        this.f10560b = C1111v.X(c1070b);
        this.f10561c = e3.f();
        this.f10563e = h1.a(e3.g().longValue());
        if (e3.b() != null) {
            this.f10566h = e3.b();
        }
        if (e3.c() != null) {
            this.f10567i = Integer.valueOf(h1.a(e3.c().longValue()));
        }
        this.f10564f = bVar;
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        this.f10568j = null;
        this.f10559a.set(null);
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, C1018d.b bVar) {
        Q.a aVar;
        this.f10568j = bVar;
        a aVar2 = new a();
        if (this.f10566h != null) {
            this.f10560b.o().c(this.f10561c, this.f10566h);
        }
        P.a aVar3 = new P.a(this.f10560b);
        aVar3.b((Activity) this.f10559a.get());
        aVar3.c(aVar2);
        String str = this.f10561c;
        if (str != null) {
            aVar3.g(str);
        }
        com.google.firebase.auth.L l3 = this.f10565g;
        if (l3 != null) {
            aVar3.f(l3);
        }
        com.google.firebase.auth.U u2 = this.f10562d;
        if (u2 != null) {
            aVar3.e(u2);
        }
        aVar3.h(Long.valueOf(this.f10563e), TimeUnit.MILLISECONDS);
        Integer num = this.f10567i;
        if (num != null && (aVar = (Q.a) f10558k.get(num)) != null) {
            aVar3.d(aVar);
        }
        com.google.firebase.auth.Q.b(aVar3.a());
    }
}
