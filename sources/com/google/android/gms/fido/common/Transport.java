package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;

/* JADX INFO: loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.common.a
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.h(parcel.readString());
            } catch (Transport.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new Transport[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5709a;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f5709a = str;
    }

    public static Transport h(String str) throws a {
        for (Transport transport : values()) {
            if (str.equals(transport.f5709a)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new a(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5709a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f5709a);
    }
}
