package O;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.C0647w;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public final class c extends zaa implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a(C0647w c0647w) {
        Parcel parcelZaa = zaa();
        zac.zab(parcelZaa, c0647w);
        zad(1, parcelZaa);
    }
}
