package D;

import K.i;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0630e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e extends a.AbstractC0106a {
    e() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0106a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, f.a aVar, f.b bVar) {
        return new i(context, looper, c0630e, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.v();
    }
}
