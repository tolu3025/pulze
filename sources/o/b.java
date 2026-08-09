package O;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zaa implements IInterface {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    public final void a(B b3) {
        Parcel parcelZaa = zaa();
        zac.zab(parcelZaa, b3);
        zad(1, parcelZaa);
    }
}
