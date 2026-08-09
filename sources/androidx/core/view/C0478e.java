package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import c.AbstractC0527b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0478e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f3911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f3912b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f3913c = new HashMap();

    public C0478e(Runnable runnable) {
        this.f3911a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f3912b.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public void b(Menu menu) {
        Iterator it = this.f3912b.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    public boolean c(MenuItem menuItem) {
        Iterator it = this.f3912b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC0527b.a(it.next());
        throw null;
    }

    public void d(Menu menu) {
        Iterator it = this.f3912b.iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
    }
}
