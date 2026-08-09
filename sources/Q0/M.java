package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M extends N.a {
    public static final Parcelable.Creator<M> CREATOR = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10657b;

    M(List list, List list2) {
        this.f10656a = list == null ? new ArrayList() : list;
        this.f10657b = list2 == null ? new ArrayList() : list2;
    }

    public static M t(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.J j3 = (com.google.firebase.auth.J) it.next();
            if (j3 instanceof com.google.firebase.auth.U) {
                arrayList.add((com.google.firebase.auth.U) j3);
            } else if (j3 instanceof C0666a0) {
                arrayList2.add((C0666a0) j3);
            }
        }
        return new M(arrayList, arrayList2);
    }

    public final List s() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f10656a.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.firebase.auth.U) it.next());
        }
        Iterator it2 = this.f10657b.iterator();
        while (it2.hasNext()) {
            arrayList.add((C0666a0) it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.G(parcel, 1, this.f10656a, false);
        N.c.G(parcel, 2, this.f10657b, false);
        N.c.b(parcel, iA);
    }
}
