package Y;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: Y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0455l extends AbstractC0457n {
    public static final Parcelable.Creator<C0455l> CREATOR = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0463u f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f3173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3174c;

    C0455l(C0463u c0463u, Uri uri, byte[] bArr) {
        this.f3172a = (C0463u) AbstractC0643s.k(c0463u);
        v(uri);
        this.f3173b = uri;
        w(bArr);
        this.f3174c = bArr;
    }

    private static Uri v(Uri uri) {
        AbstractC0643s.k(uri);
        AbstractC0643s.b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC0643s.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] w(byte[] bArr) {
        boolean z2 = true;
        if (bArr != null && bArr.length != 32) {
            z2 = false;
        }
        AbstractC0643s.b(z2, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0455l)) {
            return false;
        }
        C0455l c0455l = (C0455l) obj;
        return AbstractC0642q.b(this.f3172a, c0455l.f3172a) && AbstractC0642q.b(this.f3173b, c0455l.f3173b);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3172a, this.f3173b);
    }

    public byte[] s() {
        return this.f3174c;
    }

    public Uri t() {
        return this.f3173b;
    }

    public C0463u u() {
        return this.f3172a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 2, u(), i3, false);
        N.c.A(parcel, 3, t(), i3, false);
        N.c.k(parcel, 4, s(), false);
        N.c.b(parcel, iA);
    }
}
