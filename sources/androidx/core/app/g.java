package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f3779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f3780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m[] f3781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m[] f3782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f3786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f3788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f3789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3790l;

        public a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i3 != 0 ? IconCompat.b(null, "", i3) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f3789k;
        }

        public boolean b() {
            return this.f3783e;
        }

        public Bundle c() {
            return this.f3779a;
        }

        public IconCompat d() {
            int i3;
            if (this.f3780b == null && (i3 = this.f3787i) != 0) {
                this.f3780b = IconCompat.b(null, "", i3);
            }
            return this.f3780b;
        }

        public m[] e() {
            return this.f3781c;
        }

        public int f() {
            return this.f3785g;
        }

        public boolean g() {
            return this.f3784f;
        }

        public CharSequence h() {
            return this.f3788j;
        }

        public boolean i() {
            return this.f3790l;
        }

        public boolean j() {
            return this.f3786h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m[] mVarArr, m[] mVarArr2, boolean z2, int i3, boolean z3, boolean z4, boolean z5) {
            this.f3784f = true;
            this.f3780b = iconCompat;
            if (iconCompat != null && iconCompat.e() == 2) {
                this.f3787i = iconCompat.c();
            }
            this.f3788j = d.d(charSequence);
            this.f3789k = pendingIntent;
            this.f3779a = bundle == null ? new Bundle() : bundle;
            this.f3781c = mVarArr;
            this.f3782d = mVarArr2;
            this.f3783e = z2;
            this.f3785g = i3;
            this.f3784f = z3;
            this.f3786h = z4;
            this.f3790l = z5;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f3791e;

        @Override // androidx.core.app.g.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.g.e
        public void b(f fVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(fVar.a()).setBigContentTitle(this.f3840b).bigText(this.f3791e);
            if (this.f3842d) {
                bigTextStyleBigText.setSummaryText(this.f3841c);
            }
        }

        @Override // androidx.core.app.g.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f3791e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f3792A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f3793B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        String f3794C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        Bundle f3795D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f3796E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f3797F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        Notification f3798G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        RemoteViews f3799H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f3800I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f3801J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        String f3802K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f3803L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        String f3804M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        long f3805N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3806O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f3807P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        boolean f3808Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        Notification f3809R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f3810S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Object f3811T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public ArrayList f3812U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f3814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f3815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f3816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f3817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f3818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f3819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f3820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f3821i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f3822j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f3823k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3824l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3825m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f3826n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f3827o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e f3828p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f3829q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f3830r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f3831s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3832t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3833u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f3834v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f3835w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f3836x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f3837y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f3838z;

        public d(Context context) {
            this(context, null);
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i3, boolean z2) {
            Notification notification;
            int i4;
            if (z2) {
                notification = this.f3809R;
                i4 = i3 | notification.flags;
            } else {
                notification = this.f3809R;
                i4 = (~i3) & notification.flags;
            }
            notification.flags = i4;
        }

        public d a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3814b.add(new a(i3, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new h(this).c();
        }

        public Bundle c() {
            if (this.f3795D == null) {
                this.f3795D = new Bundle();
            }
            return this.f3795D;
        }

        public d e(boolean z2) {
            j(16, z2);
            return this;
        }

        public d f(String str) {
            this.f3802K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f3819g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f3818f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f3817e = d(charSequence);
            return this;
        }

        public d k(boolean z2) {
            this.f3838z = z2;
            return this;
        }

        public d l(int i3) {
            this.f3825m = i3;
            return this;
        }

        public d m(int i3) {
            this.f3809R.icon = i3;
            return this;
        }

        public d n(e eVar) {
            if (this.f3828p != eVar) {
                this.f3828p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.f3809R.tickerText = d(charSequence);
            return this;
        }

        public d p(long j3) {
            this.f3809R.when = j3;
            return this;
        }

        public d(Context context, String str) {
            this.f3814b = new ArrayList();
            this.f3815c = new ArrayList();
            this.f3816d = new ArrayList();
            this.f3826n = true;
            this.f3838z = false;
            this.f3796E = 0;
            this.f3797F = 0;
            this.f3803L = 0;
            this.f3806O = 0;
            this.f3807P = 0;
            Notification notification = new Notification();
            this.f3809R = notification;
            this.f3813a = context;
            this.f3802K = str;
            notification.when = System.currentTimeMillis();
            this.f3809R.audioStreamType = -1;
            this.f3825m = 0;
            this.f3812U = new ArrayList();
            this.f3808Q = true;
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f3839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f3840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f3841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3842d = false;

        public void a(Bundle bundle) {
            if (this.f3842d) {
                bundle.putCharSequence("android.summaryText", this.f3841c);
            }
            CharSequence charSequence = this.f3840b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(f fVar);

        protected abstract String c();

        public RemoteViews d(f fVar) {
            return null;
        }

        public RemoteViews e(f fVar) {
            return null;
        }

        public RemoteViews f(f fVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f3839a != dVar) {
                this.f3839a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
