package Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N.a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f2774b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f2775c = new SparseArray();

    a(int i3, ArrayList arrayList) {
        this.f2773a = i3;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            s(dVar.f2779b, dVar.f2780c);
        }
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        HashMap map = this.f2774b;
        Integer num = (Integer) map.get((String) obj);
        return num == null ? (Integer) map.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        String str = (String) this.f2775c.get(((Integer) obj).intValue());
        return (str == null && this.f2774b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public a s(String str, int i3) {
        this.f2774b.put(str, Integer.valueOf(i3));
        this.f2775c.put(i3, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f2773a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f2774b;
        for (String str : map.keySet()) {
            arrayList.add(new d(str, ((Integer) map.get(str)).intValue()));
        }
        N.c.G(parcel, 2, arrayList, false);
        N.c.b(parcel, iA);
    }
}
