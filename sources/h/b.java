package H;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e {
    private static final a.g zza;
    private static final a.AbstractC0106a zzb;
    private static final com.google.android.gms.common.api.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        c cVar = new c();
        zzb = cVar;
        zzc = new com.google.android.gms.common.api.a("SmsRetriever.API", cVar, gVar);
    }

    public b(Activity activity) {
        super(activity, zzc, (a.d) a.d.f5326j, e.a.f5327c);
    }

    public abstract Task startSmsRetriever();

    public b(Context context) {
        super(context, zzc, a.d.f5326j, e.a.f5327c);
    }
}
