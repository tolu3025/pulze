package r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: r0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1204g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f11130b;

    /* JADX INFO: renamed from: r0.g$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f11131a;

        private b(Class cls) {
            this.f11131a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f11131a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f11131a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // r0.C1204g.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: r0.g$c */
    interface c {
        List a(Object obj);
    }

    C1204g(Object obj, c cVar) {
        this.f11129a = obj;
        this.f11130b = cVar;
    }

    public static C1204g c(Context context, Class cls) {
        return new C1204g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e3) {
            throw new w(String.format("Could not instantiate %s.", str), e3);
        } catch (InstantiationException e4) {
            throw new w(String.format("Could not instantiate %s.", str), e4);
        } catch (NoSuchMethodException e5) {
            throw new w(String.format("Could not instantiate %s", str), e5);
        } catch (InvocationTargetException e6) {
            throw new w(String.format("Could not instantiate %s", str), e6);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f11130b.a(this.f11129a)) {
            arrayList.add(new L0.b() { // from class: r0.f
                @Override // L0.b
                public final Object get() {
                    return C1204g.d(str);
                }
            });
        }
        return arrayList;
    }
}
