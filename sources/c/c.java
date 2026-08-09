package C;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends N.a {
    public static final Parcelable.Creator<c> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f739b;

    c(int i3, List list) {
        this.f738a = i3;
        this.f739b = (List) AbstractC0643s.k(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f738a);
        N.c.G(parcel, 2, this.f739b, false);
        N.c.b(parcel, iA);
    }
}
