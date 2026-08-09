package K;

import android.os.Parcel;
import com.google.android.gms.internal.p000authapi.zbb;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends zbb implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            l();
        } else {
            if (i3 != 2) {
                return false;
            }
            g();
        }
        return true;
    }
}
