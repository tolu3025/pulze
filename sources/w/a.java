package W;

import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g f3022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f3023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzaa f3024c;

    static {
        a.g gVar = new a.g();
        f3022a = gVar;
        f3023b = new com.google.android.gms.common.api.a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
        f3024c = new zzaa();
    }

    public static X.a a(Activity activity) {
        return new X.a(activity);
    }
}
