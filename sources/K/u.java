package K;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbc;

/* JADX INFO: loaded from: classes.dex */
public final class u extends zba implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, tVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        zbb(103, parcelZba);
    }

    public final void b(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, tVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        zbb(102, parcelZba);
    }
}
