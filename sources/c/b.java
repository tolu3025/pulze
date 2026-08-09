package C;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class b extends N.a {
    public static final Parcelable.Creator<b> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Account f737d;

    b(int i3, int i4, String str, Account account) {
        this.f734a = i3;
        this.f735b = i4;
        this.f736c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f737d = account;
        } else {
            this.f737d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f734a);
        N.c.s(parcel, 2, this.f735b);
        N.c.C(parcel, 3, this.f736c, false);
        N.c.A(parcel, 4, this.f737d, i3, false);
        N.c.b(parcel, iA);
    }
}
