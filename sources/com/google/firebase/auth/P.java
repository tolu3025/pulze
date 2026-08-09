package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.Q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q0.C1157p;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f5982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f5983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q.b f5984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Executor f5985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Activity f5987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Q.a f5988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private L f5989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private U f5990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5993l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f5994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f5996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Q.b f5997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f5998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Activity f5999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Q.a f6000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private L f6001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private U f6002i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f6003j;

        public a(FirebaseAuth firebaseAuth) {
            this.f5994a = (FirebaseAuth) AbstractC0643s.k(firebaseAuth);
        }

        public final P a() {
            boolean z2;
            String str;
            AbstractC0643s.l(this.f5994a, "FirebaseAuth instance cannot be null");
            AbstractC0643s.l(this.f5996c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            AbstractC0643s.l(this.f5997d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f5998e = this.f5994a.f5917A;
            if (this.f5996c.longValue() < 0 || this.f5996c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            L l3 = this.f6001h;
            if (l3 == null) {
                AbstractC0643s.f(this.f5995b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                AbstractC0643s.b(!this.f6003j, "You cannot require sms validation without setting a multi-factor session.");
                AbstractC0643s.b(this.f6002i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (l3 == null || !((C1157p) l3).w()) {
                    AbstractC0643s.b(this.f6002i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z2 = this.f5995b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                } else {
                    AbstractC0643s.e(this.f5995b);
                    z2 = this.f6002i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                }
                AbstractC0643s.b(z2, str);
            }
            return new P(this.f5994a, this.f5996c, this.f5997d, this.f5998e, this.f5995b, this.f5999f, this.f6000g, this.f6001h, this.f6002i, this.f6003j);
        }

        public final a b(Activity activity) {
            this.f5999f = activity;
            return this;
        }

        public final a c(Q.b bVar) {
            this.f5997d = bVar;
            return this;
        }

        public final a d(Q.a aVar) {
            this.f6000g = aVar;
            return this;
        }

        public final a e(U u2) {
            this.f6002i = u2;
            return this;
        }

        public final a f(L l3) {
            this.f6001h = l3;
            return this;
        }

        public final a g(String str) {
            this.f5995b = str;
            return this;
        }

        public final a h(Long l3, TimeUnit timeUnit) {
            this.f5996c = Long.valueOf(TimeUnit.SECONDS.convert(l3.longValue(), timeUnit));
            return this;
        }
    }

    private P(FirebaseAuth firebaseAuth, Long l3, Q.b bVar, Executor executor, String str, Activity activity, Q.a aVar, L l4, U u2, boolean z2) {
        this.f5982a = firebaseAuth;
        this.f5986e = str;
        this.f5983b = l3;
        this.f5984c = bVar;
        this.f5987f = activity;
        this.f5985d = executor;
        this.f5988g = aVar;
        this.f5989h = l4;
        this.f5990i = u2;
        this.f5991j = z2;
    }

    public final Activity a() {
        return this.f5987f;
    }

    public final void b(boolean z2) {
        this.f5992k = true;
    }

    public final FirebaseAuth c() {
        return this.f5982a;
    }

    public final void d(boolean z2) {
        this.f5993l = true;
    }

    public final L e() {
        return this.f5989h;
    }

    public final Q.a f() {
        return this.f5988g;
    }

    public final Q.b g() {
        return this.f5984c;
    }

    public final U h() {
        return this.f5990i;
    }

    public final Long i() {
        return this.f5983b;
    }

    public final String j() {
        return this.f5986e;
    }

    public final Executor k() {
        return this.f5985d;
    }

    public final boolean l() {
        return this.f5992k;
    }

    public final boolean m() {
        return this.f5991j;
    }

    public final boolean n() {
        return this.f5993l;
    }

    public final boolean o() {
        return this.f5989h != null;
    }
}
