package O;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.C0647w;
import com.google.android.gms.common.internal.C0650z;
import com.google.android.gms.common.internal.InterfaceC0649y;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.android.gms.common.api.e implements InterfaceC0649y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0106a f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f2727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2728d = 0;

    static {
        a.g gVar = new a.g();
        f2725a = gVar;
        g gVar2 = new g();
        f2726b = gVar2;
        f2727c = new com.google.android.gms.common.api.a("ClientTelemetry.API", gVar2, gVar);
    }

    public i(Context context, C0650z c0650z) {
        super(context, f2727c, c0650z, e.a.f5327c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0649y
    public final Task a(final C0647w c0647w) {
        AbstractC0620u.a aVarA = AbstractC0620u.a();
        aVarA.d(zad.zaa);
        aVarA.c(false);
        aVarA.b(new InterfaceC0617q() { // from class: O.h
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i3 = i.f2728d;
                ((c) ((j) obj).getService()).a(c0647w);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
