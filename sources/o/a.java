package O;

import M.C0415c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.internal.base.zad;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0633h {
    public a(Context context, Looper looper, C0630e c0630e, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        super(context, looper, 449, c0630e, interfaceC0606f, interfaceC0614n);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final C0415c[] getApiFeatures() {
        return zad.zac;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 253600000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final boolean getUseDynamicLookup() {
        return true;
    }
}
