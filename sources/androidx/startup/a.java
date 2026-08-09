package androidx.startup;

import A.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.AbstractC1324b;
import z.C1325c;
import z.InterfaceC1323a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f4892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f4893e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f4896c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f4895b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f4894a = new HashMap();

    a(Context context) {
        this.f4896c = context.getApplicationContext();
    }

    private Object c(Class cls, Set set) {
        Object objB;
        if (b.h()) {
            try {
                b.c(cls.getSimpleName());
            } catch (Throwable th) {
                b.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f4894a.containsKey(cls)) {
            objB = this.f4894a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC1323a interfaceC1323a = (InterfaceC1323a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = interfaceC1323a.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f4894a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                objB = interfaceC1323a.b(this.f4896c);
                set.remove(cls);
                this.f4894a.put(cls, objB);
            } catch (Throwable th2) {
                throw new C1325c(th2);
            }
        }
        b.f();
        return objB;
    }

    public static a d(Context context) {
        if (f4892d == null) {
            synchronized (f4893e) {
                try {
                    if (f4892d == null) {
                        f4892d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f4892d;
    }

    void a() {
        try {
            try {
                b.c("Startup");
                b(this.f4896c.getPackageManager().getProviderInfo(new ComponentName(this.f4896c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new C1325c(e3);
            }
        } finally {
            b.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f4896c.getString(AbstractC1324b.f12071a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC1323a.class.isAssignableFrom(cls)) {
                            this.f4895b.add(cls);
                        }
                    }
                }
                Iterator it = this.f4895b.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e3) {
                throw new C1325c(e3);
            }
        }
    }
}
