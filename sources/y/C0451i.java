package Y;

import Y.EnumC0460q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;

/* JADX INFO: renamed from: Y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0451i extends AbstractC0453j {
    public static final Parcelable.Creator<C0451i> CREATOR = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0460q f3160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3162c;

    C0451i(int i3, String str, int i4) {
        try {
            this.f3160a = EnumC0460q.i(i3);
            this.f3161b = str;
            this.f3162c = i4;
        } catch (EnumC0460q.a e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0451i)) {
            return false;
        }
        C0451i c0451i = (C0451i) obj;
        return AbstractC0642q.b(this.f3160a, c0451i.f3160a) && AbstractC0642q.b(this.f3161b, c0451i.f3161b) && AbstractC0642q.b(Integer.valueOf(this.f3162c), Integer.valueOf(c0451i.f3162c));
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3160a, this.f3161b, Integer.valueOf(this.f3162c));
    }

    public int s() {
        return this.f3160a.h();
    }

    public String t() {
        return this.f3161b;
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzamVarZza.zza("errorCode", this.f3160a.h());
        String str = this.f3161b;
        if (str != null) {
            zzamVarZza.zzb("errorMessage", str);
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 2, s());
        N.c.C(parcel, 3, t(), false);
        N.c.s(parcel, 4, this.f3162c);
        N.c.b(parcel, iA);
    }
}
