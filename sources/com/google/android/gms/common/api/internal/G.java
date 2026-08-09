package com.google.android.gms.common.api.internal;

import M.C0413a;
import M.C0415c;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c.AbstractC0527b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0612l;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class G implements f.a, f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f5340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.f f5341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0602b f5342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0623x f5343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f5344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f5345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f5346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Z f5347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f5349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0413a f5350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ C0607g f5352m;

    public G(C0607g c0607g, com.google.android.gms.common.api.e eVar) {
        Objects.requireNonNull(c0607g);
        this.f5352m = c0607g;
        this.f5340a = new LinkedList();
        this.f5344e = new HashSet();
        this.f5345f = new HashMap();
        this.f5349j = new ArrayList();
        this.f5350k = null;
        this.f5351l = 0;
        a.f fVarZaf = eVar.zaf(c0607g.g().getLooper(), this);
        this.f5341b = fVarZaf;
        this.f5342c = eVar.getApiKey();
        this.f5343d = new C0623x();
        this.f5346g = eVar.zab();
        if (fVarZaf.requiresSignIn()) {
            this.f5347h = eVar.zac(c0607g.H(), c0607g.g());
        } else {
            this.f5347h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void H() {
        y();
        q(C0413a.f2656f);
        n();
        Iterator it = this.f5345f.values().iterator();
        if (it.hasNext()) {
            ((V) it.next()).getClass();
            throw null;
        }
        i();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void I(int i3) {
        y();
        this.f5348i = true;
        this.f5343d.e(i3, this.f5341b.getLastDisconnectMessage());
        C0602b c0602b = this.f5342c;
        C0607g c0607g = this.f5352m;
        c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 9, c0602b), 5000L);
        c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 11, c0602b), 120000L);
        c0607g.c().c();
        Iterator it = this.f5345f.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).f5380a.run();
        }
    }

    private final boolean h(C0413a c0413a) {
        synchronized (C0607g.f5414r) {
            try {
                C0607g c0607g = this.f5352m;
                if (c0607g.e() == null || !c0607g.f().contains(this.f5342c)) {
                    return false;
                }
                c0607g.e().f(c0413a, this.f5346g);
                c0607g.b().t(c0607g.H(), c0413a, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i() {
        Queue queue = this.f5340a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) arrayList.get(i3);
            if (!this.f5341b.isConnected()) {
                return;
            }
            if (j(i0Var)) {
                queue.remove(i0Var);
            }
        }
    }

    private final boolean j(i0 i0Var) {
        String strT;
        long jU;
        StringBuilder sb;
        String str;
        if (!(i0Var instanceof T)) {
            k(i0Var);
            return true;
        }
        T t2 = (T) i0Var;
        C0415c c0415cR = r(t2.f(this));
        if (c0415cR == null) {
            k(i0Var);
            return true;
        }
        String name = this.f5341b.getClass().getName();
        String strT2 = c0415cR.t();
        long jU2 = c0415cR.u();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(strT2).length() + 2 + String.valueOf(jU2).length() + 2);
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(strT2);
        sb2.append(", ");
        sb2.append(jU2);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        C0607g c0607g = this.f5352m;
        if (!c0607g.h() || !t2.g(this)) {
            t2.b(new com.google.android.gms.common.api.n(c0415cR));
            return true;
        }
        int iH = t2.h(this);
        H h3 = new H(this.f5342c, c0415cR, null);
        List list = this.f5349j;
        int iIndexOf = list.indexOf(h3);
        if (iIndexOf >= 0) {
            H h4 = (H) list.get(iIndexOf);
            c0607g.g().removeMessages(15, h4);
            c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 15, h4), 5000L);
            return false;
        }
        list.add(h3);
        c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 15, h3), 5000L);
        c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 16, h3), 120000L);
        C0413a c0413a = new C0413a(2, null, null, Integer.valueOf(iH));
        if (h(c0413a)) {
            strT = c0415cR.t();
            jU = c0415cR.u();
            sb = new StringBuilder(String.valueOf(strT).length() + 61 + String.valueOf(jU).length());
            str = "A dialog should be displayed for missing feature: ";
        } else {
            if (!c0607g.z(c0413a, this.f5346g)) {
                return false;
            }
            strT = c0415cR.t();
            jU = c0415cR.u();
            sb = new StringBuilder(String.valueOf(strT).length() + 55 + String.valueOf(jU).length());
            str = "Notification displayed for missing feature: ";
        }
        sb.append(str);
        sb.append(strT);
        sb.append(", version: ");
        sb.append(jU);
        Log.w("GoogleApiManager", sb.toString());
        return false;
    }

    private final void k(i0 i0Var) {
        i0Var.c(this.f5343d, D());
        try {
            i0Var.d(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.f5341b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l(Status status, Exception exc, boolean z2) {
        AbstractC0643s.d(this.f5352m.g());
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5340a.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (!z2 || i0Var.f5437a == 2) {
                if (status != null) {
                    i0Var.a(status);
                } else {
                    i0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void J(Status status) {
        AbstractC0643s.d(this.f5352m.g());
        l(status, null, false);
    }

    private final void n() {
        if (this.f5348i) {
            C0607g c0607g = this.f5352m;
            C0602b c0602b = this.f5342c;
            c0607g.g().removeMessages(11, c0602b);
            c0607g.g().removeMessages(9, c0602b);
            this.f5348i = false;
        }
    }

    private final void o() {
        C0602b c0602b = this.f5342c;
        C0607g c0607g = this.f5352m;
        c0607g.g().removeMessages(12, c0602b);
        c0607g.g().sendMessageDelayed(c0607g.g().obtainMessage(12, c0602b), c0607g.E());
    }

    private final boolean p(boolean z2) {
        AbstractC0643s.d(this.f5352m.g());
        a.f fVar = this.f5341b;
        if (!fVar.isConnected() || !this.f5345f.isEmpty()) {
            return false;
        }
        if (!this.f5343d.c()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z2) {
            return false;
        }
        o();
        return false;
    }

    private final void q(C0413a c0413a) {
        Set set = this.f5344e;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        AbstractC0527b.a(it.next());
        if (AbstractC0642q.b(c0413a, C0413a.f2656f)) {
            this.f5341b.getEndpointPackageName();
        }
        throw null;
    }

    private final C0415c r(C0415c[] c0415cArr) {
        if (c0415cArr != null && c0415cArr.length != 0) {
            C0415c[] availableFeatures = this.f5341b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C0415c[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(availableFeatures.length);
            for (C0415c c0415c : availableFeatures) {
                aVar.put(c0415c.t(), Long.valueOf(c0415c.u()));
            }
            for (C0415c c0415c2 : c0415cArr) {
                Long l3 = (Long) aVar.get(c0415c2.t());
                if (l3 == null || l3.longValue() < c0415c2.u()) {
                    return c0415c2;
                }
            }
        }
        return null;
    }

    public final void A() {
        C0607g c0607g = this.f5352m;
        AbstractC0643s.d(c0607g.g());
        if (this.f5348i) {
            n();
            J(c0607g.b().f(c0607g.H()) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f5341b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean B() {
        return p(true);
    }

    public final void C() {
        C0413a c0413a;
        C0607g c0607g = this.f5352m;
        AbstractC0643s.d(c0607g.g());
        a.f fVar = this.f5341b;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            int iA = c0607g.c().a(c0607g.H(), fVar);
            if (iA != 0) {
                C0413a c0413a2 = new C0413a(iA, null);
                String name = this.f5341b.getClass().getName();
                String string = c0413a2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                t(c0413a2, null);
                return;
            }
            J j3 = new J(c0607g, fVar, this.f5342c);
            if (fVar.requiresSignIn()) {
                ((Z) AbstractC0643s.k(this.f5347h)).t(j3);
            }
            try {
                fVar.connect(j3);
                return;
            } catch (SecurityException e3) {
                e = e3;
                c0413a = new C0413a(10);
            }
        } catch (IllegalStateException e4) {
            e = e4;
            c0413a = new C0413a(10);
        }
        t(c0413a, e);
    }

    public final boolean D() {
        return this.f5341b.requiresSignIn();
    }

    public final int E() {
        return this.f5346g;
    }

    final int F() {
        return this.f5351l;
    }

    final void G() {
        this.f5351l++;
    }

    final /* synthetic */ boolean K(boolean z2) {
        return p(false);
    }

    final /* synthetic */ void L(H h3) {
        if (this.f5349j.contains(h3) && !this.f5348i) {
            if (this.f5341b.isConnected()) {
                i();
            } else {
                C();
            }
        }
    }

    final /* synthetic */ void M(H h3) {
        C0415c[] c0415cArrF;
        if (this.f5349j.remove(h3)) {
            C0607g c0607g = this.f5352m;
            c0607g.g().removeMessages(15, h3);
            c0607g.g().removeMessages(16, h3);
            C0415c c0415cB = h3.b();
            Queue<i0> queue = this.f5340a;
            ArrayList arrayList = new ArrayList(queue.size());
            for (i0 i0Var : queue) {
                if ((i0Var instanceof T) && (c0415cArrF = ((T) i0Var).f(this)) != null && com.google.android.gms.common.util.b.b(c0415cArrF, c0415cB)) {
                    arrayList.add(i0Var);
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                i0 i0Var2 = (i0) arrayList.get(i3);
                queue.remove(i0Var2);
                i0Var2.b(new com.google.android.gms.common.api.n(c0415cB));
            }
        }
    }

    final /* synthetic */ a.f N() {
        return this.f5341b;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0606f
    public final void a(int i3) {
        C0607g c0607g = this.f5352m;
        if (Looper.myLooper() == c0607g.g().getLooper()) {
            I(i3);
        } else {
            c0607g.g().post(new D(this, i3));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0614n
    public final void b(C0413a c0413a) {
        t(c0413a, null);
    }

    final /* synthetic */ C0602b c() {
        return this.f5342c;
    }

    final /* synthetic */ boolean d() {
        return this.f5348i;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0606f
    public final void f(Bundle bundle) {
        C0607g c0607g = this.f5352m;
        if (Looper.myLooper() == c0607g.g().getLooper()) {
            H();
        } else {
            c0607g.g().post(new C(this));
        }
    }

    public final void s(C0413a c0413a) {
        AbstractC0643s.d(this.f5352m.g());
        a.f fVar = this.f5341b;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(c0413a);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        fVar.disconnect(sb.toString());
        t(c0413a, null);
    }

    public final void t(C0413a c0413a, Exception exc) {
        C0607g c0607g = this.f5352m;
        AbstractC0643s.d(c0607g.g());
        Z z2 = this.f5347h;
        if (z2 != null) {
            z2.u();
        }
        y();
        c0607g.c().c();
        q(c0413a);
        if ((this.f5341b instanceof O.j) && c0413a.t() != 24) {
            c0607g.F(true);
            c0607g.g().sendMessageDelayed(c0607g.g().obtainMessage(19), 300000L);
        }
        if (c0413a.t() == 4) {
            J(C0607g.f5413q);
            return;
        }
        if (c0413a.t() == 25) {
            J(C0607g.k(this.f5342c, c0413a));
            return;
        }
        Queue queue = this.f5340a;
        if (queue.isEmpty()) {
            this.f5350k = c0413a;
            return;
        }
        if (exc != null) {
            AbstractC0643s.d(c0607g.g());
            l(null, exc, false);
            return;
        }
        if (!c0607g.h()) {
            J(C0607g.k(this.f5342c, c0413a));
            return;
        }
        C0602b c0602b = this.f5342c;
        l(C0607g.k(c0602b, c0413a), null, true);
        if (queue.isEmpty() || h(c0413a) || c0607g.z(c0413a, this.f5346g)) {
            return;
        }
        if (c0413a.t() == 18) {
            this.f5348i = true;
        }
        if (this.f5348i) {
            c0607g.g().sendMessageDelayed(Message.obtain(c0607g.g(), 9, c0602b), 5000L);
        } else {
            J(C0607g.k(c0602b, c0413a));
        }
    }

    public final void u(i0 i0Var) {
        AbstractC0643s.d(this.f5352m.g());
        if (this.f5341b.isConnected()) {
            if (j(i0Var)) {
                o();
                return;
            } else {
                this.f5340a.add(i0Var);
                return;
            }
        }
        this.f5340a.add(i0Var);
        C0413a c0413a = this.f5350k;
        if (c0413a == null || !c0413a.w()) {
            C();
        } else {
            t(this.f5350k, null);
        }
    }

    public final void v() {
        AbstractC0643s.d(this.f5352m.g());
        J(C0607g.f5412p);
        this.f5343d.d();
        for (C0612l.a aVar : (C0612l.a[]) this.f5345f.keySet().toArray(new C0612l.a[0])) {
            u(new h0(aVar, new TaskCompletionSource()));
        }
        q(new C0413a(4));
        a.f fVar = this.f5341b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new F(this));
        }
    }

    public final a.f w() {
        return this.f5341b;
    }

    public final Map x() {
        return this.f5345f;
    }

    public final void y() {
        AbstractC0643s.d(this.f5352m.g());
        this.f5350k = null;
    }

    public final void z() {
        AbstractC0643s.d(this.f5352m.g());
        if (this.f5348i) {
            C();
        }
    }
}
