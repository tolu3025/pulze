package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class A extends N.a {
    public static final Parcelable.Creator<A> CREATOR = new C0438b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3086d;

    public A(byte[] bArr, String str, String str2, String str3) {
        this.f3083a = (byte[]) AbstractC0643s.k(bArr);
        this.f3084b = (String) AbstractC0643s.k(str);
        this.f3085c = str2;
        this.f3086d = (String) AbstractC0643s.k(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return Arrays.equals(this.f3083a, a3.f3083a) && AbstractC0642q.b(this.f3084b, a3.f3084b) && AbstractC0642q.b(this.f3085c, a3.f3085c) && AbstractC0642q.b(this.f3086d, a3.f3086d);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3083a, this.f3084b, this.f3085c, this.f3086d);
    }

    public String p() {
        return this.f3086d;
    }

    public String s() {
        return this.f3085c;
    }

    public byte[] t() {
        return this.f3083a;
    }

    public String u() {
        return this.f3084b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.k(parcel, 2, t(), false);
        N.c.C(parcel, 3, u(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.C(parcel, 5, p(), false);
        N.c.b(parcel, iA);
    }
}
