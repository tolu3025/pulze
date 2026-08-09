package D;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.internal.auth.zzbe;

/* JADX INFO: loaded from: classes.dex */
final class f extends a.AbstractC0106a {
    f() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        return new zzbe(context, looper, c0630e, (c) obj, interfaceC0606f, interfaceC0614n);
    }
}
