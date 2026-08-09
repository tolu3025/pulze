package D;

import D.a;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.internal.p000authapi.zbo;

/* JADX INFO: loaded from: classes.dex */
final class d extends a.AbstractC0106a {
    d() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, f.a aVar, f.b bVar) {
        return new zbo(context, looper, c0630e, (a.C0005a) obj, aVar, bVar);
    }
}
