package Y;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: Y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0456m extends AbstractC0457n {
    public static final Parcelable.Creator<C0456m> CREATOR = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0466x f3175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f3176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3177c;

    C0456m(C0466x c0466x, Uri uri, byte[] bArr) {
        this.f3175a = (C0466x) AbstractC0643s.k(c0466x);
        v(uri);
        this.f3176b = uri;
        w(bArr);
        this.f3177c = bArr;
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
        if (!(obj instanceof C0456m)) {
            return false;
        }
        C0456m c0456m = (C0456m) obj;
        return AbstractC0642q.b(this.f3175a, c0456m.f3175a) && AbstractC0642q.b(this.f3176b, c0456m.f3176b);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3175a, this.f3176b);
    }

    public byte[] s() {
        return this.f3177c;
    }

    public Uri t() {
        return this.f3176b;
    }

    public C0466x u() {
        return this.f3175a;
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
