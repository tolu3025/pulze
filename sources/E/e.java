package E;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final androidx.collection.a f1358l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f1359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f1360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f1361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f1362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f1363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f1364f;

    static {
        androidx.collection.a aVar = new androidx.collection.a();
        f1358l = aVar;
        aVar.put("registered", a.C0110a.x("registered", 2));
        aVar.put("in_progress", a.C0110a.x("in_progress", 3));
        aVar.put("success", a.C0110a.x("success", 4));
        aVar.put("failed", a.C0110a.x("failed", 5));
        aVar.put("escrowed", a.C0110a.x("escrowed", 6));
    }

    e(int i3, List list, List list2, List list3, List list4, List list5) {
        this.f1359a = i3;
        this.f1360b = list;
        this.f1361c = list2;
        this.f1362d = list3;
        this.f1363e = list4;
        this.f1364f = list5;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map getFieldMappings() {
        return f1358l;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0110a c0110a) {
        switch (c0110a.y()) {
            case 1:
                return Integer.valueOf(this.f1359a);
            case 2:
                return this.f1360b;
            case 3:
                return this.f1361c;
            case 4:
                return this.f1362d;
            case 5:
                return this.f1363e;
            case 6:
                return this.f1364f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0110a.y());
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0110a c0110a) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0110a c0110a, String str, ArrayList arrayList) {
        int iY = c0110a.y();
        if (iY == 2) {
            this.f1360b = arrayList;
            return;
        }
        if (iY == 3) {
            this.f1361c = arrayList;
            return;
        }
        if (iY == 4) {
            this.f1362d = arrayList;
        } else if (iY == 5) {
            this.f1363e = arrayList;
        } else {
            if (iY != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(iY)));
            }
            this.f1364f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f1359a);
        N.c.E(parcel, 2, this.f1360b, false);
        N.c.E(parcel, 3, this.f1361c, false);
        N.c.E(parcel, 4, this.f1362d, false);
        N.c.E(parcel, 5, this.f1363e, false);
        N.c.E(parcel, 6, this.f1364f, false);
        N.c.b(parcel, iA);
    }
}
