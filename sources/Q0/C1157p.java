package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: q0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1157p extends com.google.firebase.auth.L {
    public static final Parcelable.Creator<C1157p> CREATOR = new C1159s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f10772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f10773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1150i f10774e;

    private C1157p() {
    }

    public static C1157p t(String str, C1150i c1150i) {
        AbstractC0643s.e(str);
        C1157p c1157p = new C1157p();
        c1157p.f10770a = str;
        c1157p.f10774e = c1150i;
        return c1157p;
    }

    public static C1157p u(List list, String str) {
        List list2;
        com.google.firebase.auth.J j3;
        AbstractC0643s.k(list);
        AbstractC0643s.e(str);
        C1157p c1157p = new C1157p();
        c1157p.f10772c = new ArrayList();
        c1157p.f10773d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.J j4 = (com.google.firebase.auth.J) it.next();
            if (j4 instanceof com.google.firebase.auth.U) {
                list2 = c1157p.f10772c;
                j3 = (com.google.firebase.auth.U) j4;
            } else {
                if (!(j4 instanceof C0666a0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + j4.t());
                }
                list2 = c1157p.f10773d;
                j3 = (C0666a0) j4;
            }
            list2.add(j3);
        }
        c1157p.f10771b = str;
        return c1157p;
    }

    public final C1150i s() {
        return this.f10774e;
    }

    public final String v() {
        return this.f10770a;
    }

    public final boolean w() {
        return this.f10770a != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f10770a, false);
        N.c.C(parcel, 2, this.f10771b, false);
        N.c.G(parcel, 3, this.f10772c, false);
        N.c.G(parcel, 4, this.f10773d, false);
        N.c.A(parcel, 5, this.f10774e, i3, false);
        N.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f10771b;
    }

    C1157p(String str, String str2, List list, List list2, C1150i c1150i) {
        this.f10770a = str;
        this.f10771b = str2;
        this.f10772c = list;
        this.f10773d = list2;
        this.f10774e = c1150i;
    }
}
