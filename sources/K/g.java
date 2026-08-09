package K;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import w.AbstractC1258a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1258a implements com.google.android.gms.common.api.internal.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f2566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f2567p;

    public g(Context context, Set set) {
        super(context);
        this.f2566o = new Semaphore(0);
        this.f2567p = set;
    }

    @Override // w.AbstractC1258a
    public final /* bridge */ /* synthetic */ Object A() {
        Iterator it = this.f2567p.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.f) it.next()).g(this)) {
                i3++;
            }
        }
        try {
            this.f2566o.tryAcquire(i3, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e3) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e3);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // w.AbstractC1259b
    protected final void o() {
        this.f2566o.drainPermits();
        h();
    }
}
