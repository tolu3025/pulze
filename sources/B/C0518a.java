package b;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0518a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f4921a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f4922b;

    public final void a(b listener) {
        m.e(listener, "listener");
        Context context = this.f4922b;
        if (context != null) {
            listener.a(context);
        }
        this.f4921a.add(listener);
    }

    public final void b() {
        this.f4922b = null;
    }

    public final void c(Context context) {
        m.e(context, "context");
        this.f4922b = context;
        Iterator it = this.f4921a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
