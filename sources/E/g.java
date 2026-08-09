package E;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap f1365l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f1366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f1368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f1369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1371f;

    static {
        HashMap map = new HashMap();
        f1365l = map;
        map.put("authenticatorInfo", a.C0110a.t("authenticatorInfo", 2, i.class));
        map.put("signature", a.C0110a.w("signature", 3));
        map.put("package", a.C0110a.w("package", 4));
    }

    g(Set set, int i3, i iVar, String str, String str2, String str3) {
        this.f1366a = set;
        this.f1367b = i3;
        this.f1368c = iVar;
        this.f1369d = str;
        this.f1370e = str2;
        this.f1371f = str3;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0110a c0110a, String str, com.google.android.gms.common.server.response.a aVar) {
        int iY = c0110a.y();
        if (iY != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iY), aVar.getClass().getCanonicalName()));
        }
        this.f1368c = (i) aVar;
        this.f1366a.add(Integer.valueOf(iY));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f1365l;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0110a c0110a) {
        int iY = c0110a.y();
        if (iY == 1) {
            return Integer.valueOf(this.f1367b);
        }
        if (iY == 2) {
            return this.f1368c;
        }
        if (iY == 3) {
            return this.f1369d;
        }
        if (iY == 4) {
            return this.f1370e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0110a.y());
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0110a c0110a) {
        return this.f1366a.contains(Integer.valueOf(c0110a.y()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0110a c0110a, String str, String str2) {
        int iY = c0110a.y();
        if (iY == 3) {
            this.f1369d = str2;
        } else {
            if (iY != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iY)));
            }
            this.f1370e = str2;
        }
        this.f1366a.add(Integer.valueOf(iY));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        Set set = this.f1366a;
        if (set.contains(1)) {
            N.c.s(parcel, 1, this.f1367b);
        }
        if (set.contains(2)) {
            N.c.A(parcel, 2, this.f1368c, i3, true);
        }
        if (set.contains(3)) {
            N.c.C(parcel, 3, this.f1369d, true);
        }
        if (set.contains(4)) {
            N.c.C(parcel, 4, this.f1370e, true);
        }
        if (set.contains(5)) {
            N.c.C(parcel, 5, this.f1371f, true);
        }
        N.c.b(parcel, iA);
    }
}
