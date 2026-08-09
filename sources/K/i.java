package K;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0633h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleSignInOptions f2568a;

    public i(Context context, Looper looper, C0630e c0630e, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, c0630e, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(zbbj.zba());
        if (!c0630e.d().isEmpty()) {
            Iterator it = c0630e.d().iterator();
            while (it.hasNext()) {
                aVar2.d((Scope) it.next(), new Scope[0]);
            }
        }
        this.f2568a = aVar2.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new u(iBinder);
    }

    public final GoogleSignInOptions e() {
        return this.f2568a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final Intent getSignInIntent() {
        return o.a(getContext(), this.f2568a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final boolean providesSignIn() {
        return true;
    }
}
