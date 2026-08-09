package q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.InterfaceC0677g;
import com.google.firebase.auth.InterfaceC0681i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements InterfaceC0681i {
    public static final Parcelable.Creator<H0> CREATOR = new G0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1150i f10646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F0 f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.firebase.auth.E0 f10648c;

    public H0(C1150i c1150i) {
        C1150i c1150i2 = (C1150i) AbstractC0643s.k(c1150i);
        this.f10646a = c1150i2;
        List listC0 = c1150i2.c0();
        this.f10647b = null;
        for (int i3 = 0; i3 < listC0.size(); i3++) {
            if (!TextUtils.isEmpty(((C1142e) listC0.get(i3)).zza())) {
                this.f10647b = new F0(((C1142e) listC0.get(i3)).c(), ((C1142e) listC0.get(i3)).zza(), c1150i.d0());
            }
        }
        if (this.f10647b == null) {
            this.f10647b = new F0(c1150i.d0());
        }
        this.f10648c = c1150i.a0();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC0681i
    public final AbstractC0679h e() {
        return this.f10648c;
    }

    @Override // com.google.firebase.auth.InterfaceC0681i
    public final com.google.firebase.auth.A k() {
        return this.f10646a;
    }

    @Override // com.google.firebase.auth.InterfaceC0681i
    public final InterfaceC0677g r() {
        return this.f10647b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, k(), i3, false);
        N.c.A(parcel, 2, r(), i3, false);
        N.c.A(parcel, 3, this.f10648c, i3, false);
        N.c.b(parcel, iA);
    }

    H0(C1150i c1150i, F0 f02, com.google.firebase.auth.E0 e02) {
        this.f10646a = c1150i;
        this.f10647b = f02;
        this.f10648c = e02;
    }
}
