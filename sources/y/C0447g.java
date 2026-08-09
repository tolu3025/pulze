package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: renamed from: Y.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0447g extends AbstractC0453j {
    public static final Parcelable.Creator<C0447g> CREATOR = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f3154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f3155e;

    C0447g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f3151a = (byte[]) AbstractC0643s.k(bArr);
        this.f3152b = (byte[]) AbstractC0643s.k(bArr2);
        this.f3153c = (byte[]) AbstractC0643s.k(bArr3);
        this.f3154d = (byte[]) AbstractC0643s.k(bArr4);
        this.f3155e = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0447g)) {
            return false;
        }
        C0447g c0447g = (C0447g) obj;
        return Arrays.equals(this.f3151a, c0447g.f3151a) && Arrays.equals(this.f3152b, c0447g.f3152b) && Arrays.equals(this.f3153c, c0447g.f3153c) && Arrays.equals(this.f3154d, c0447g.f3154d) && Arrays.equals(this.f3155e, c0447g.f3155e);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(Arrays.hashCode(this.f3151a)), Integer.valueOf(Arrays.hashCode(this.f3152b)), Integer.valueOf(Arrays.hashCode(this.f3153c)), Integer.valueOf(Arrays.hashCode(this.f3154d)), Integer.valueOf(Arrays.hashCode(this.f3155e)));
    }

    public byte[] s() {
        return this.f3153c;
    }

    public byte[] t() {
        return this.f3152b;
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f3151a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f3152b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f3153c;
        zzamVarZza.zzb("authenticatorData", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzchVarZzf4 = zzch.zzf();
        byte[] bArr4 = this.f3154d;
        zzamVarZza.zzb("signature", zzchVarZzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f3155e;
        if (bArr5 != null) {
            zzamVarZza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zzamVarZza.toString();
    }

    public byte[] u() {
        return this.f3151a;
    }

    public byte[] v() {
        return this.f3154d;
    }

    public byte[] w() {
        return this.f3155e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.k(parcel, 2, u(), false);
        N.c.k(parcel, 3, t(), false);
        N.c.k(parcel, 4, s(), false);
        N.c.k(parcel, 5, v(), false);
        N.c.k(parcel, 6, w(), false);
        N.c.b(parcel, iA);
    }
}
