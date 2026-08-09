package com.google.android.gms.auth.api.identity;

import N.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f5223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Account f5227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5228f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f5230m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f5231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Account f5235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f5236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f5237g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f5238h;

        private final String h(String str) {
            AbstractC0643s.k(str);
            String str2 = this.f5232b;
            boolean z2 = true;
            if (str2 != null && !str2.equals(str)) {
                z2 = false;
            }
            AbstractC0643s.b(z2, "two different server client ids provided");
            return str;
        }

        public AuthorizationRequest a() {
            return new AuthorizationRequest(this.f5231a, this.f5232b, this.f5233c, this.f5234d, this.f5235e, this.f5236f, this.f5237g, this.f5238h);
        }

        public a b(String str) {
            this.f5236f = AbstractC0643s.e(str);
            return this;
        }

        public a c(String str, boolean z2) {
            h(str);
            this.f5232b = str;
            this.f5233c = true;
            this.f5238h = z2;
            return this;
        }

        public a d(Account account) {
            this.f5235e = (Account) AbstractC0643s.k(account);
            return this;
        }

        public a e(List list) {
            boolean z2 = false;
            if (list != null && !list.isEmpty()) {
                z2 = true;
            }
            AbstractC0643s.b(z2, "requestedScopes cannot be null or empty");
            this.f5231a = list;
            return this;
        }

        public final a f(String str) {
            h(str);
            this.f5232b = str;
            this.f5234d = true;
            return this;
        }

        public final a g(String str) {
            this.f5237g = str;
            return this;
        }
    }

    AuthorizationRequest(List list, String str, boolean z2, boolean z3, Account account, String str2, String str3, boolean z4) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        AbstractC0643s.b(z5, "requestedScopes cannot be null or empty");
        this.f5223a = list;
        this.f5224b = str;
        this.f5225c = z2;
        this.f5226d = z3;
        this.f5227e = account;
        this.f5228f = str2;
        this.f5229l = str3;
        this.f5230m = z4;
    }

    public static a s() {
        return new a();
    }

    public static a z(AuthorizationRequest authorizationRequest) {
        AbstractC0643s.k(authorizationRequest);
        a aVarS = s();
        aVarS.e(authorizationRequest.v());
        boolean zX = authorizationRequest.x();
        String str = authorizationRequest.f5229l;
        String strU = authorizationRequest.u();
        Account accountT = authorizationRequest.t();
        String strW = authorizationRequest.w();
        if (str != null) {
            aVarS.g(str);
        }
        if (strU != null) {
            aVarS.b(strU);
        }
        if (accountT != null) {
            aVarS.d(accountT);
        }
        if (authorizationRequest.f5226d && strW != null) {
            aVarS.f(strW);
        }
        if (authorizationRequest.y() && strW != null) {
            aVarS.c(strW, zX);
        }
        return aVarS;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f5223a.size() == authorizationRequest.f5223a.size() && this.f5223a.containsAll(authorizationRequest.f5223a) && this.f5225c == authorizationRequest.f5225c && this.f5230m == authorizationRequest.f5230m && this.f5226d == authorizationRequest.f5226d && AbstractC0642q.b(this.f5224b, authorizationRequest.f5224b) && AbstractC0642q.b(this.f5227e, authorizationRequest.f5227e) && AbstractC0642q.b(this.f5228f, authorizationRequest.f5228f) && AbstractC0642q.b(this.f5229l, authorizationRequest.f5229l);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f5223a, this.f5224b, Boolean.valueOf(this.f5225c), Boolean.valueOf(this.f5230m), Boolean.valueOf(this.f5226d), this.f5227e, this.f5228f, this.f5229l);
    }

    public Account t() {
        return this.f5227e;
    }

    public String u() {
        return this.f5228f;
    }

    public List v() {
        return this.f5223a;
    }

    public String w() {
        return this.f5224b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.G(parcel, 1, v(), false);
        c.C(parcel, 2, w(), false);
        c.g(parcel, 3, y());
        c.g(parcel, 4, this.f5226d);
        c.A(parcel, 5, t(), i3, false);
        c.C(parcel, 6, u(), false);
        c.C(parcel, 7, this.f5229l, false);
        c.g(parcel, 8, x());
        c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5230m;
    }

    public boolean y() {
        return this.f5225c;
    }
}
