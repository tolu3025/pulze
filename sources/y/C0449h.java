package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: renamed from: Y.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0449h extends AbstractC0453j {
    public static final Parcelable.Creator<C0449h> CREATOR = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f3159d;

    C0449h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f3156a = (byte[]) AbstractC0643s.k(bArr);
        this.f3157b = (byte[]) AbstractC0643s.k(bArr2);
        this.f3158c = (byte[]) AbstractC0643s.k(bArr3);
        this.f3159d = (String[]) AbstractC0643s.k(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0449h)) {
            return false;
        }
        C0449h c0449h = (C0449h) obj;
        return Arrays.equals(this.f3156a, c0449h.f3156a) && Arrays.equals(this.f3157b, c0449h.f3157b) && Arrays.equals(this.f3158c, c0449h.f3158c);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(Arrays.hashCode(this.f3156a)), Integer.valueOf(Arrays.hashCode(this.f3157b)), Integer.valueOf(Arrays.hashCode(this.f3158c)));
    }

    public byte[] s() {
        return this.f3158c;
    }

    public byte[] t() {
        return this.f3157b;
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f3156a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f3157b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f3158c;
        zzamVarZza.zzb("attestationObject", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzamVarZza.zzb("transports", Arrays.toString(this.f3159d));
        return zzamVarZza.toString();
    }

    public byte[] u() {
        return this.f3156a;
    }

    public String[] v() {
        return this.f3159d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.k(parcel, 2, u(), false);
        N.c.k(parcel, 3, t(), false);
        N.c.k(parcel, 4, s(), false);
        N.c.D(parcel, 5, v(), false);
        N.c.b(parcel, iA);
    }
}
