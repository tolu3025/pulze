package E;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashMap f1372m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f1377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PendingIntent f1378f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f1379l;

    static {
        HashMap map = new HashMap();
        f1372m = map;
        map.put("accountType", a.C0110a.w("accountType", 2));
        map.put("status", a.C0110a.v("status", 3));
        map.put("transferBytes", a.C0110a.s("transferBytes", 4));
    }

    i(Set set, int i3, String str, int i4, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f1373a = set;
        this.f1374b = i3;
        this.f1375c = str;
        this.f1376d = i4;
        this.f1377e = bArr;
        this.f1378f = pendingIntent;
        this.f1379l = aVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f1372m;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0110a c0110a) {
        int i3;
        int iY = c0110a.y();
        if (iY == 1) {
            i3 = this.f1374b;
        } else {
            if (iY == 2) {
                return this.f1375c;
            }
            if (iY != 3) {
                if (iY == 4) {
                    return this.f1377e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0110a.y());
            }
            i3 = this.f1376d;
        }
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0110a c0110a) {
        return this.f1373a.contains(Integer.valueOf(c0110a.y()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0110a c0110a, String str, byte[] bArr) {
        int iY = c0110a.y();
        if (iY == 4) {
            this.f1377e = bArr;
            this.f1373a.add(Integer.valueOf(iY));
        } else {
            throw new IllegalArgumentException("Field with id=" + iY + " is not known to be an byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0110a c0110a, String str, int i3) {
        int iY = c0110a.y();
        if (iY == 3) {
            this.f1376d = i3;
            this.f1373a.add(Integer.valueOf(iY));
        } else {
            throw new IllegalArgumentException("Field with id=" + iY + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0110a c0110a, String str, String str2) {
        int iY = c0110a.y();
        if (iY != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iY)));
        }
        this.f1375c = str2;
        this.f1373a.add(Integer.valueOf(iY));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        Set set = this.f1373a;
        if (set.contains(1)) {
            N.c.s(parcel, 1, this.f1374b);
        }
        if (set.contains(2)) {
            N.c.C(parcel, 2, this.f1375c, true);
        }
        if (set.contains(3)) {
            N.c.s(parcel, 3, this.f1376d);
        }
        if (set.contains(4)) {
            N.c.k(parcel, 4, this.f1377e, true);
        }
        if (set.contains(5)) {
            N.c.A(parcel, 5, this.f1378f, i3, true);
        }
        if (set.contains(6)) {
            N.c.A(parcel, 6, this.f1379l, i3, true);
        }
        N.c.b(parcel, iA);
    }
}
