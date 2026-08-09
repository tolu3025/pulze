package c0;

import M.C0413a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b0.InterfaceC0523e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0629d;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.common.internal.Q;

/* JADX INFO: renamed from: c0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0530a extends AbstractC0633h implements InterfaceC0523e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4990e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0630e f4992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f4993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f4994d;

    public C0530a(Context context, Looper looper, boolean z2, C0630e c0630e, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c0630e, aVar, bVar);
        this.f4991a = true;
        this.f4992b = c0630e;
        this.f4993c = bundle;
        this.f4994d = c0630e.j();
    }

    public static Bundle e(C0630e c0630e) {
        c0630e.i();
        Integer numJ = c0630e.j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0630e.a());
        if (numJ != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numJ.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // b0.InterfaceC0523e
    public final void a() {
        connect(new AbstractC0629d.C0109d(this));
    }

    @Override // b0.InterfaceC0523e
    public final void b(InterfaceC0535f interfaceC0535f) {
        AbstractC0643s.l(interfaceC0535f, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f4992b.c();
            ((C0536g) getService()).a(new C0539j(1, new Q(accountC, ((Integer) AbstractC0643s.k(this.f4994d)).intValue(), AbstractC0629d.DEFAULT_ACCOUNT.equals(accountC.name) ? K.c.b(getContext()).c() : null)), interfaceC0535f);
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC0535f.i(new C0541l(1, new C0413a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C0536g ? (C0536g) iInterfaceQueryLocalInterface : new C0536g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Bundle getGetServiceRequestExtraArgs() {
        C0630e c0630e = this.f4992b;
        if (!getContext().getPackageName().equals(c0630e.f())) {
            this.f4993c.putString("com.google.android.gms.signin.internal.realClientPackageName", c0630e.f());
        }
        return this.f4993c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f4991a;
    }
}
