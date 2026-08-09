package Z;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC0643s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends N.a {
    public static final Parcelable.Creator<e> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f3572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f3574c;

    public e(b bVar, String str, String str2) {
        this.f3572a = (b) AbstractC0643s.k(bVar);
        this.f3574c = str;
        this.f3573b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f3574c;
        if (str == null) {
            if (eVar.f3574c != null) {
                return false;
            }
        } else if (!str.equals(eVar.f3574c)) {
            return false;
        }
        if (!this.f3572a.equals(eVar.f3572a)) {
            return false;
        }
        String str2 = this.f3573b;
        String str3 = eVar.f3573b;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3574c;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f3572a.hashCode();
        String str2 = this.f3573b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String s() {
        return this.f3573b;
    }

    public String t() {
        return this.f3574c;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f3572a.s(), 11));
            if (this.f3572a.t() != c.UNKNOWN) {
                jSONObject.put("version", this.f3572a.t().toString());
            }
            if (this.f3572a.u() != null) {
                jSONObject.put("transports", this.f3572a.u().toString());
            }
            String str = this.f3574c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f3573b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    public b u() {
        return this.f3572a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 2, u(), i3, false);
        N.c.C(parcel, 3, t(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.b(parcel, iA);
    }
}
