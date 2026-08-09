package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4882b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1277d f4883a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public static final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f4884a;

        public b(androidx.savedstate.a registry) {
            m.e(registry, "registry");
            this.f4884a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4884a));
            return bundle;
        }

        public final void b(String className) {
            m.e(className, "className");
            this.f4884a.add(className);
        }
    }

    public Recreator(InterfaceC1277d owner) {
        m.e(owner, "owner");
        this.f4883a = owner;
    }

    private final void e(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0100a.class);
            m.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    m.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0100a) objNewInstance).a(this.f4883a);
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to instantiate " + str, e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Class " + str + " wasn't found", e5);
        }
    }

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        m.e(source, "source");
        m.e(event, "event");
        if (event != AbstractC0516e.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.a().c(this);
        Bundle bundleB = this.f4883a.k().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }
}
