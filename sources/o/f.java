package O;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.gms.common.api.e implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0106a f2721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f2722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2723d = 0;

    static {
        a.g gVar = new a.g();
        f2720a = gVar;
        d dVar = new d();
        f2721b = dVar;
        f2722c = new com.google.android.gms.common.api.a("ClientNotification.API", dVar, gVar);
    }

    public f(Context context) {
        super(context, f2722c, a.d.f5326j, e.a.f5327c);
    }

    @Override // com.google.android.gms.common.internal.D
    public final Task b(final B b3) {
        AbstractC0620u.a aVarA = AbstractC0620u.a();
        aVarA.d(zad.zab);
        aVarA.c(false);
        aVarA.b(new InterfaceC0617q() { // from class: O.e
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i3 = f.f2723d;
                ((b) ((a) obj).getService()).a(b3);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
