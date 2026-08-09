package b0;

import android.content.Context;
import android.os.Looper;
import c0.C0530a;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0520b extends a.AbstractC0106a {
    C0520b() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, f.a aVar, f.b bVar) {
        return new C0530a(context, looper, true, c0630e, C0530a.e(c0630e), aVar, bVar);
    }
}
