package Z;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class a extends N.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3548d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3549e = new a("unavailable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3550f = new a("unused");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0072a f3551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3553c;

    /* JADX INFO: renamed from: Z.a$a, reason: collision with other inner class name */
    public enum EnumC0072a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<EnumC0072a> CREATOR = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3558a;

        EnumC0072a(int i3) {
            this.f3558a = i3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f3558a);
        }
    }

    public static class b extends Exception {
        public b(int i3) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i3)));
        }
    }

    private a() {
        this.f3551a = EnumC0072a.ABSENT;
        this.f3553c = null;
        this.f3552b = null;
    }

    public static EnumC0072a v(int i3) throws b {
        for (EnumC0072a enumC0072a : EnumC0072a.values()) {
            if (i3 == enumC0072a.f3558a) {
                return enumC0072a;
            }
        }
        throw new b(i3);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3551a.equals(aVar.f3551a)) {
            return false;
        }
        int iOrdinal = this.f3551a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            str = this.f3552b;
            str2 = aVar.f3552b;
        } else {
            if (iOrdinal != 2) {
                return false;
            }
            str = this.f3553c;
            str2 = aVar.f3553c;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i3;
        String str;
        int iHashCode = this.f3551a.hashCode() + 31;
        int iOrdinal = this.f3551a.ordinal();
        if (iOrdinal == 1) {
            i3 = iHashCode * 31;
            str = this.f3552b;
        } else {
            if (iOrdinal != 2) {
                return iHashCode;
            }
            i3 = iHashCode * 31;
            str = this.f3553c;
        }
        return i3 + str.hashCode();
    }

    public String s() {
        return this.f3553c;
    }

    public String t() {
        return this.f3552b;
    }

    public int u() {
        return this.f3551a.f3558a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 2, u());
        N.c.C(parcel, 3, t(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.b(parcel, iA);
    }

    a(int i3, String str, String str2) {
        try {
            this.f3551a = v(i3);
            this.f3552b = str;
            this.f3553c = str2;
        } catch (b e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    private a(String str) {
        this.f3552b = (String) AbstractC0643s.k(str);
        this.f3551a = EnumC0072a.STRING;
        this.f3553c = null;
    }
}
