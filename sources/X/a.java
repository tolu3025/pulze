package X;

import Y.C0463u;
import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.C0601a;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f3052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f3053b;

    static {
        a.g gVar = new a.g();
        f3052a = gVar;
        f3053b = new com.google.android.gms.common.api.a("Fido.FIDO2_API", new zzo(), gVar);
    }

    public a(Activity activity) {
        super(activity, f3053b, a.d.f5326j, new C0601a());
    }

    public Task e(final C0463u c0463u) {
        return doRead(AbstractC0620u.a().b(new InterfaceC0617q() { // from class: X.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                a aVar = this.f3054a;
                C0463u c0463u2 = c0463u;
                ((zzs) ((zzp) obj).getService()).zzc(new c(aVar, (TaskCompletionSource) obj2), c0463u2);
            }
        }).e(5407).a());
    }
}
