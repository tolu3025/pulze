package com.google.android.gms.fido.u2f.api.common;

import N.c;
import Z.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f5718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f5719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f5720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f5721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f5722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z.a f5723f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f5725m;

    SignRequestParams(Integer num, Double d3, Uri uri, byte[] bArr, List list, Z.a aVar, String str) {
        this.f5718a = num;
        this.f5719b = d3;
        this.f5720c = uri;
        this.f5721d = bArr;
        AbstractC0643s.b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f5722e = list;
        this.f5723f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            AbstractC0643s.b((eVar.s() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            eVar.t();
            AbstractC0643s.b(true, "register request has null challenge and no default challenge isprovided");
            if (eVar.s() != null) {
                hashSet.add(Uri.parse(eVar.s()));
            }
        }
        this.f5725m = hashSet;
        AbstractC0643s.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f5724l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return AbstractC0642q.b(this.f5718a, signRequestParams.f5718a) && AbstractC0642q.b(this.f5719b, signRequestParams.f5719b) && AbstractC0642q.b(this.f5720c, signRequestParams.f5720c) && Arrays.equals(this.f5721d, signRequestParams.f5721d) && this.f5722e.containsAll(signRequestParams.f5722e) && signRequestParams.f5722e.containsAll(this.f5722e) && AbstractC0642q.b(this.f5723f, signRequestParams.f5723f) && AbstractC0642q.b(this.f5724l, signRequestParams.f5724l);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f5718a, this.f5720c, this.f5719b, this.f5722e, this.f5723f, this.f5724l, Integer.valueOf(Arrays.hashCode(this.f5721d)));
    }

    public Uri s() {
        return this.f5720c;
    }

    public Z.a t() {
        return this.f5723f;
    }

    public byte[] u() {
        return this.f5721d;
    }

    public String v() {
        return this.f5724l;
    }

    public List w() {
        return this.f5722e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.u(parcel, 2, x(), false);
        c.o(parcel, 3, y(), false);
        c.A(parcel, 4, s(), i3, false);
        c.k(parcel, 5, u(), false);
        c.G(parcel, 6, w(), false);
        c.A(parcel, 7, t(), i3, false);
        c.C(parcel, 8, v(), false);
        c.b(parcel, iA);
    }

    public Integer x() {
        return this.f5718a;
    }

    public Double y() {
        return this.f5719b;
    }
}
