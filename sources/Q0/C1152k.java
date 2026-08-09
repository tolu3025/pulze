package q0;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: q0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152k implements com.google.firebase.auth.B {
    public static final Parcelable.Creator<C1152k> CREATOR = new C1151j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10747b;

    public C1152k(long j3, long j4) {
        this.f10746a = j3;
        this.f10747b = j4;
    }

    public static C1152k b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C1152k(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f10746a);
            jSONObject.put("creationTimestamp", this.f10747b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.B
    public final long j() {
        return this.f10747b;
    }

    @Override // com.google.firebase.auth.B
    public final long q() {
        return this.f10746a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.v(parcel, 1, q());
        N.c.v(parcel, 2, j());
        N.c.b(parcel, iA);
    }
}
