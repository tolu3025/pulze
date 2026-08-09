package Y;

import Y.EnumC0460q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: renamed from: Y.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0460q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC0460q> CREATOR = new Parcelable.Creator() { // from class: Y.G0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0460q.i(parcel.readInt());
            } catch (EnumC0460q.a e3) {
                throw new IllegalArgumentException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new EnumC0460q[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3203a;

    /* JADX INFO: renamed from: Y.q$a */
    public static class a extends Exception {
        public a(int i3) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i3)));
        }
    }

    EnumC0460q(int i3) {
        this.f3203a = i3;
    }

    public static EnumC0460q i(int i3) throws a {
        for (EnumC0460q enumC0460q : values()) {
            if (i3 == enumC0460q.f3203a) {
                return enumC0460q;
            }
        }
        throw new a(i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int h() {
        return this.f3203a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3203a);
    }
}
