package c0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: c0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536g extends zaa implements IInterface {
    C0536g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(C0539j c0539j, InterfaceC0535f interfaceC0535f) {
        Parcel parcelZaa = zaa();
        zac.zab(parcelZaa, c0539j);
        zac.zac(parcelZaa, interfaceC0535f);
        zac(12, parcelZaa);
    }
}
