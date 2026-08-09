package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.List;

/* JADX INFO: renamed from: G.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0318a extends N.a {
    public static final Parcelable.Creator<C0318a> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GoogleSignInAccount f1530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PendingIntent f1531f;

    public C0318a(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f1526a = str;
        this.f1527b = str2;
        this.f1528c = str3;
        this.f1529d = (List) AbstractC0643s.k(list);
        this.f1531f = pendingIntent;
        this.f1530e = googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0318a)) {
            return false;
        }
        C0318a c0318a = (C0318a) obj;
        return AbstractC0642q.b(this.f1526a, c0318a.f1526a) && AbstractC0642q.b(this.f1527b, c0318a.f1527b) && AbstractC0642q.b(this.f1528c, c0318a.f1528c) && AbstractC0642q.b(this.f1529d, c0318a.f1529d) && AbstractC0642q.b(this.f1531f, c0318a.f1531f) && AbstractC0642q.b(this.f1530e, c0318a.f1530e);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1526a, this.f1527b, this.f1528c, this.f1529d, this.f1531f, this.f1530e);
    }

    public String s() {
        return this.f1527b;
    }

    public List t() {
        return this.f1529d;
    }

    public PendingIntent u() {
        return this.f1531f;
    }

    public String v() {
        return this.f1526a;
    }

    public GoogleSignInAccount w() {
        return this.f1530e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, v(), false);
        N.c.C(parcel, 2, s(), false);
        N.c.C(parcel, 3, this.f1528c, false);
        N.c.E(parcel, 4, t(), false);
        N.c.A(parcel, 5, w(), i3, false);
        N.c.A(parcel, 6, u(), i3, false);
        N.c.b(parcel, iA);
    }
}
