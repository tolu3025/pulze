package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.InterfaceC0677g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements InterfaceC0677g {
    public static final Parcelable.Creator<F0> CREATOR = new E0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10638d;

    public F0(String str, String str2, boolean z2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        this.f10635a = str;
        this.f10636b = str2;
        this.f10637c = AbstractC1133K.d(str2);
        this.f10638d = z2;
    }

    @Override // com.google.firebase.auth.InterfaceC0677g
    public final String c() {
        return this.f10635a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC0677g
    public final Map g() {
        return this.f10637c;
    }

    @Override // com.google.firebase.auth.InterfaceC0677g
    public final String n() {
        Map map;
        String str;
        if ("github.com".equals(this.f10635a)) {
            map = this.f10637c;
            str = "login";
        } else {
            if (!"twitter.com".equals(this.f10635a)) {
                return null;
            }
            map = this.f10637c;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // com.google.firebase.auth.InterfaceC0677g
    public final boolean o() {
        return this.f10638d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, c(), false);
        N.c.C(parcel, 2, this.f10636b, false);
        N.c.g(parcel, 3, o());
        N.c.b(parcel, iA);
    }

    public F0(boolean z2) {
        this.f10638d = z2;
        this.f10636b = null;
        this.f10635a = null;
        this.f10637c = null;
    }
}
