package com.google.android.gms.auth.api.identity;

import N.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f5239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f5244f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f5245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f5248d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f5250f;

        public SaveAccountLinkingTokenRequest a() {
            AbstractC0643s.b(this.f5245a != null, "Consent PendingIntent cannot be null");
            AbstractC0643s.b("auth_code".equals(this.f5246b), "Invalid tokenType");
            AbstractC0643s.b(!TextUtils.isEmpty(this.f5247c), "serviceId cannot be null or empty");
            AbstractC0643s.b(this.f5248d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f5245a, this.f5246b, this.f5247c, this.f5248d, this.f5249e, this.f5250f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f5245a = pendingIntent;
            return this;
        }

        public a c(List list) {
            this.f5248d = list;
            return this;
        }

        public a d(String str) {
            this.f5247c = str;
            return this;
        }

        public a e(String str) {
            this.f5246b = str;
            return this;
        }

        public final a f(String str) {
            this.f5249e = str;
            return this;
        }

        public final a g(int i3) {
            this.f5250f = i3;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i3) {
        this.f5239a = pendingIntent;
        this.f5240b = str;
        this.f5241c = str2;
        this.f5242d = list;
        this.f5243e = str3;
        this.f5244f = i3;
    }

    public static a s() {
        return new a();
    }

    public static a x(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC0643s.k(saveAccountLinkingTokenRequest);
        a aVarS = s();
        aVarS.c(saveAccountLinkingTokenRequest.u());
        aVarS.d(saveAccountLinkingTokenRequest.v());
        aVarS.b(saveAccountLinkingTokenRequest.t());
        aVarS.e(saveAccountLinkingTokenRequest.w());
        aVarS.g(saveAccountLinkingTokenRequest.f5244f);
        String str = saveAccountLinkingTokenRequest.f5243e;
        if (!TextUtils.isEmpty(str)) {
            aVarS.f(str);
        }
        return aVarS;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f5242d.size() == saveAccountLinkingTokenRequest.f5242d.size() && this.f5242d.containsAll(saveAccountLinkingTokenRequest.f5242d) && AbstractC0642q.b(this.f5239a, saveAccountLinkingTokenRequest.f5239a) && AbstractC0642q.b(this.f5240b, saveAccountLinkingTokenRequest.f5240b) && AbstractC0642q.b(this.f5241c, saveAccountLinkingTokenRequest.f5241c) && AbstractC0642q.b(this.f5243e, saveAccountLinkingTokenRequest.f5243e) && this.f5244f == saveAccountLinkingTokenRequest.f5244f;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f5239a, this.f5240b, this.f5241c, this.f5242d, this.f5243e);
    }

    public PendingIntent t() {
        return this.f5239a;
    }

    public List u() {
        return this.f5242d;
    }

    public String v() {
        return this.f5241c;
    }

    public String w() {
        return this.f5240b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.A(parcel, 1, t(), i3, false);
        c.C(parcel, 2, w(), false);
        c.C(parcel, 3, v(), false);
        c.E(parcel, 4, u(), false);
        c.C(parcel, 5, this.f5243e, false);
        c.s(parcel, 6, this.f5244f);
        c.b(parcel, iA);
    }
}
