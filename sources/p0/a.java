package P0;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC0610j;
import com.google.android.gms.common.api.internal.C0609i;
import com.google.android.gms.common.api.internal.InterfaceC0611k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f2743c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2744a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2745b = new Object();

    /* JADX INFO: renamed from: P0.a$a, reason: collision with other inner class name */
    private static class C0053a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f2746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f2747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f2748c;

        public C0053a(Activity activity, Runnable runnable, Object obj) {
            this.f2746a = activity;
            this.f2747b = runnable;
            this.f2748c = obj;
        }

        public Activity a() {
            return this.f2746a;
        }

        public Object b() {
            return this.f2748c;
        }

        public Runnable c() {
            return this.f2747b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0053a)) {
                return false;
            }
            C0053a c0053a = (C0053a) obj;
            return c0053a.f2748c.equals(this.f2748c) && c0053a.f2747b == this.f2747b && c0053a.f2746a == this.f2746a;
        }

        public int hashCode() {
            return this.f2748c.hashCode();
        }
    }

    private static class b extends AbstractC0610j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2749a;

        private b(InterfaceC0611k interfaceC0611k) {
            super(interfaceC0611k);
            this.f2749a = new ArrayList();
            this.mLifecycleFragment.b("StorageOnStopCallback", this);
        }

        public static b b(Activity activity) {
            InterfaceC0611k fragment = AbstractC0610j.getFragment(new C0609i(activity));
            b bVar = (b) fragment.c("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        public void a(C0053a c0053a) {
            synchronized (this.f2749a) {
                this.f2749a.add(c0053a);
            }
        }

        public void c(C0053a c0053a) {
            synchronized (this.f2749a) {
                this.f2749a.remove(c0053a);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC0610j
        public void onStop() {
            ArrayList<C0053a> arrayList;
            synchronized (this.f2749a) {
                arrayList = new ArrayList(this.f2749a);
                this.f2749a.clear();
            }
            for (C0053a c0053a : arrayList) {
                if (c0053a != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    c0053a.c().run();
                    a.a().b(c0053a.b());
                }
            }
        }
    }

    private a() {
    }

    public static a a() {
        return f2743c;
    }

    public void b(Object obj) {
        synchronized (this.f2745b) {
            try {
                C0053a c0053a = (C0053a) this.f2744a.get(obj);
                if (c0053a != null) {
                    b.b(c0053a.a()).c(c0053a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f2745b) {
            C0053a c0053a = new C0053a(activity, runnable, obj);
            b.b(activity).a(c0053a);
            this.f2744a.put(obj, c0053a);
        }
    }
}
