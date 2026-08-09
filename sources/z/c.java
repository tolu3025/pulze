package Z;

import Z.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator() { // from class: Z.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return c.h(parcel.readString());
            } catch (c.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new c[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3567a;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    c(String str) {
        this.f3567a = str;
    }

    public static c h(String str) throws a {
        if (str == null) {
            return UNKNOWN;
        }
        for (c cVar : values()) {
            if (str.equals(cVar.f3567a)) {
                return cVar;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3567a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3567a);
    }
}
