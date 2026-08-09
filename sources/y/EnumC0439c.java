package Y;

import Y.EnumC0439c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0439c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0439c> CREATOR = new Parcelable.Creator() { // from class: Y.k0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0439c.h(parcel.readString());
            } catch (EnumC0439c.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new EnumC0439c[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3135a;

    /* JADX INFO: renamed from: Y.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC0439c(String str) {
        this.f3135a = str;
    }

    public static EnumC0439c h(String str) throws a {
        for (EnumC0439c enumC0439c : values()) {
            if (str.equals(enumC0439c.f3135a)) {
                return enumC0439c;
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
        return this.f3135a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3135a);
    }
}
