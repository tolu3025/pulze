package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N.a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f5654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f5655c;

    f(int i3, String str, ArrayList arrayList) {
        this.f5653a = i3;
        this.f5654b = str;
        this.f5655c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5653a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.C(parcel, 2, this.f5654b, false);
        N.c.G(parcel, 3, this.f5655c, false);
        N.c.b(parcel, iA);
    }

    f(String str, Map map) {
        ArrayList arrayList;
        this.f5653a = 1;
        this.f5654b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.C0110a) map.get(str2)));
            }
        }
        this.f5655c = arrayList;
    }
}
