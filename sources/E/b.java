package E;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f1352f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f1353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f1354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f1355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f1357e;

    static {
        HashMap map = new HashMap();
        f1352f = map;
        map.put("authenticatorData", a.C0110a.u("authenticatorData", 2, g.class));
        map.put("progress", a.C0110a.t("progress", 4, e.class));
    }

    b(Set set, int i3, ArrayList arrayList, int i4, e eVar) {
        this.f1353a = set;
        this.f1354b = i3;
        this.f1355c = arrayList;
        this.f1356d = i4;
        this.f1357e = eVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeArrayInternal(a.C0110a c0110a, String str, ArrayList arrayList) {
        int iY = c0110a.y();
        if (iY != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(iY), arrayList.getClass().getCanonicalName()));
        }
        this.f1355c = arrayList;
        this.f1353a.add(Integer.valueOf(iY));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0110a c0110a, String str, com.google.android.gms.common.server.response.a aVar) {
        int iY = c0110a.y();
        if (iY != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iY), aVar.getClass().getCanonicalName()));
        }
        this.f1357e = (e) aVar;
        this.f1353a.add(Integer.valueOf(iY));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f1352f;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0110a c0110a) {
        int iY = c0110a.y();
        if (iY == 1) {
            return Integer.valueOf(this.f1354b);
        }
        if (iY == 2) {
            return this.f1355c;
        }
        if (iY == 4) {
            return this.f1357e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0110a.y());
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0110a c0110a) {
        return this.f1353a.contains(Integer.valueOf(c0110a.y()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        Set set = this.f1353a;
        if (set.contains(1)) {
            N.c.s(parcel, 1, this.f1354b);
        }
        if (set.contains(2)) {
            N.c.G(parcel, 2, this.f1355c, true);
        }
        if (set.contains(3)) {
            N.c.s(parcel, 3, this.f1356d);
        }
        if (set.contains(4)) {
            N.c.A(parcel, 4, this.f1357e, i3, true);
        }
        N.c.b(parcel, iA);
    }
}
