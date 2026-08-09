package Y;

import Y.EnumC0468z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Y.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0464v extends N.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0468z f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f3230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zzbc f3227d = zzbc.zzk(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<C0464v> CREATOR = new W();

    public C0464v(String str, byte[] bArr, List list) {
        AbstractC0643s.k(str);
        try {
            this.f3228a = EnumC0468z.h(str);
            this.f3229b = (byte[]) AbstractC0643s.k(bArr);
            this.f3230c = list;
        } catch (EnumC0468z.a e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C0464v)) {
            return false;
        }
        C0464v c0464v = (C0464v) obj;
        if (!this.f3228a.equals(c0464v.f3228a) || !Arrays.equals(this.f3229b, c0464v.f3229b)) {
            return false;
        }
        List list2 = this.f3230c;
        if (list2 == null && c0464v.f3230c == null) {
            return true;
        }
        return list2 != null && (list = c0464v.f3230c) != null && list2.containsAll(list) && c0464v.f3230c.containsAll(this.f3230c);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3228a, Integer.valueOf(Arrays.hashCode(this.f3229b)), this.f3230c);
    }

    public byte[] s() {
        return this.f3229b;
    }

    public List t() {
        return this.f3230c;
    }

    public String u() {
        return this.f3228a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, u(), false);
        N.c.k(parcel, 3, s(), false);
        N.c.G(parcel, 4, t(), false);
        N.c.b(parcel, iA);
    }
}
