package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class E extends N.a {
    public static final Parcelable.Creator<E> CREATOR = new C0444e0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f3107c = new E(a.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f3108d = new E(a.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f3109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3110b;

    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new C0442d0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3115a;

        a(String str) {
            this.f3115a = str;
        }

        public static a h(String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.f3115a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3115a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f3115a);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    E(String str, String str2) {
        AbstractC0643s.k(str);
        try {
            this.f3109a = a.h(str);
            this.f3110b = str2;
        } catch (b e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return zzao.zza(this.f3109a, e3.f3109a) && zzao.zza(this.f3110b, e3.f3110b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3109a, this.f3110b});
    }

    public String s() {
        return this.f3110b;
    }

    public String t() {
        return this.f3109a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, t(), false);
        N.c.C(parcel, 3, s(), false);
        N.c.b(parcel, iA);
    }
}
