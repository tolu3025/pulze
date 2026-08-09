package M;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413a extends N.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f2659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f2661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0413a f2656f = new C0413a(0);
    public static final Parcelable.Creator<C0413a> CREATOR = new w();

    public C0413a(int i3) {
        this(i3, null, null);
    }

    static String y(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "SERVICE_INVALID";
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case V0.I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case V0.I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case V0.I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case V0.I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i3);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0413a)) {
            return false;
        }
        C0413a c0413a = (C0413a) obj;
        return this.f2658b == c0413a.f2658b && AbstractC0642q.b(this.f2659c, c0413a.f2659c) && AbstractC0642q.b(this.f2660d, c0413a.f2660d) && AbstractC0642q.b(this.f2661e, c0413a.f2661e);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(this.f2658b), this.f2659c, this.f2660d, this.f2661e);
    }

    public Integer s() {
        return this.f2661e;
    }

    public int t() {
        return this.f2658b;
    }

    public String toString() {
        AbstractC0642q.a aVarD = AbstractC0642q.d(this);
        aVarD.a("statusCode", y(this.f2658b));
        aVarD.a("resolution", this.f2659c);
        aVarD.a("message", this.f2660d);
        aVarD.a("clientMethodKey", this.f2661e);
        return aVarD.toString();
    }

    public String u() {
        return this.f2660d;
    }

    public PendingIntent v() {
        return this.f2659c;
    }

    public boolean w() {
        return (this.f2658b == 0 || this.f2659c == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f2657a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.s(parcel, 2, t());
        N.c.A(parcel, 3, v(), i3, false);
        N.c.C(parcel, 4, u(), false);
        N.c.u(parcel, 5, s(), false);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f2658b == 0;
    }

    C0413a(int i3, int i4, PendingIntent pendingIntent, String str, Integer num) {
        this.f2657a = i3;
        this.f2658b = i4;
        this.f2659c = pendingIntent;
        this.f2660d = str;
        this.f2661e = num;
    }

    public C0413a(int i3, PendingIntent pendingIntent) {
        this(i3, pendingIntent, null);
    }

    public C0413a(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str, null);
    }

    public C0413a(int i3, PendingIntent pendingIntent, String str, Integer num) {
        this(1, i3, pendingIntent, str, num);
    }
}
