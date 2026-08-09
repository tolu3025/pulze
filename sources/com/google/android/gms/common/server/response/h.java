package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h extends N.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f5660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5661c;

    h(int i3, ArrayList arrayList, String str) {
        this.f5659a = i3;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = (f) arrayList.get(i4);
            String str2 = fVar.f5654b;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) AbstractC0643s.k(fVar.f5655c)).size();
            for (int i5 = 0; i5 < size2; i5++) {
                g gVar = (g) fVar.f5655c.get(i5);
                map2.put(gVar.f5657b, gVar.f5658c);
            }
            map.put(str2, map2);
        }
        this.f5660b = map;
        this.f5661c = (String) AbstractC0643s.k(str);
        s();
    }

    public final void s() {
        HashMap map = this.f5660b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map2 = (Map) map.get((String) it.next());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                ((a.C0110a) map2.get((String) it2.next())).B(this);
            }
        }
    }

    public final Map t(String str) {
        return (Map) this.f5660b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.f5660b;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    public final String u() {
        return this.f5661c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f5659a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f5660b;
        for (String str : map.keySet()) {
            arrayList.add(new f(str, (Map) map.get(str)));
        }
        N.c.G(parcel, 2, arrayList, false);
        N.c.C(parcel, 3, this.f5661c, false);
        N.c.b(parcel, iA);
    }
}
