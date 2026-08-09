package com.google.android.gms.fido.u2f.api.common;

import N.c;
import Z.d;
import Z.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f5711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f5712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f5714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z.a f5715f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f5717m;

    RegisterRequestParams(Integer num, Double d3, Uri uri, List list, List list2, Z.a aVar, String str) {
        this.f5710a = num;
        this.f5711b = d3;
        this.f5712c = uri;
        AbstractC0643s.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f5713d = list;
        this.f5714e = list2;
        this.f5715f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            AbstractC0643s.b((uri == null && dVar.s() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (dVar.s() != null) {
                hashSet.add(Uri.parse(dVar.s()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            AbstractC0643s.b((uri == null && eVar.s() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (eVar.s() != null) {
                hashSet.add(Uri.parse(eVar.s()));
            }
        }
        this.f5717m = hashSet;
        AbstractC0643s.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f5716l = str;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return AbstractC0642q.b(this.f5710a, registerRequestParams.f5710a) && AbstractC0642q.b(this.f5711b, registerRequestParams.f5711b) && AbstractC0642q.b(this.f5712c, registerRequestParams.f5712c) && AbstractC0642q.b(this.f5713d, registerRequestParams.f5713d) && (((list = this.f5714e) == null && registerRequestParams.f5714e == null) || (list != null && (list2 = registerRequestParams.f5714e) != null && list.containsAll(list2) && registerRequestParams.f5714e.containsAll(this.f5714e))) && AbstractC0642q.b(this.f5715f, registerRequestParams.f5715f) && AbstractC0642q.b(this.f5716l, registerRequestParams.f5716l);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f5710a, this.f5712c, this.f5711b, this.f5713d, this.f5714e, this.f5715f, this.f5716l);
    }

    public Uri s() {
        return this.f5712c;
    }

    public Z.a t() {
        return this.f5715f;
    }

    public String u() {
        return this.f5716l;
    }

    public List v() {
        return this.f5713d;
    }

    public List w() {
        return this.f5714e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.u(parcel, 2, x(), false);
        c.o(parcel, 3, y(), false);
        c.A(parcel, 4, s(), i3, false);
        c.G(parcel, 5, v(), false);
        c.G(parcel, 6, w(), false);
        c.A(parcel, 7, t(), i3, false);
        c.C(parcel, 8, u(), false);
        c.b(parcel, iA);
    }

    public Integer x() {
        return this.f5710a;
    }

    public Double y() {
        return this.f5711b;
    }
}
