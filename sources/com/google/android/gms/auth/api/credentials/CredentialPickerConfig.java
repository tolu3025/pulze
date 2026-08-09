package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CredentialPickerConfig extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5200d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5201a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5202b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5203c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(2, this.f5201a, this.f5202b, false, this.f5203c);
        }
    }

    CredentialPickerConfig(int i3, boolean z2, boolean z3, boolean z4, int i4) {
        this.f5197a = i3;
        this.f5198b = z2;
        this.f5199c = z3;
        if (i3 < 2) {
            this.f5200d = true == z4 ? 3 : 1;
        } else {
            this.f5200d = i4;
        }
    }

    public boolean s() {
        return this.f5200d == 3;
    }

    public boolean t() {
        return this.f5198b;
    }

    public boolean u() {
        return this.f5199c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, t());
        N.c.g(parcel, 2, u());
        N.c.g(parcel, 3, s());
        N.c.s(parcel, 4, this.f5200d);
        N.c.s(parcel, 1000, this.f5197a);
        N.c.b(parcel, iA);
    }
}
