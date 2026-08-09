package androidx.lifecycle;

import J1.AbstractC0411o;
import c.AbstractC0527b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f4758a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f4759b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f4760c = new HashMap();

    private k() {
    }

    private final InterfaceC0514c a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.m.d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC0527b.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Constructor b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r12 != null ? r12.getName() : "";
            kotlin.jvm.internal.m.d(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                kotlin.jvm.internal.m.d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.m.d(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.m.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.m.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static final String c(String className) {
        kotlin.jvm.internal.m.e(className, "className");
        return b2.o.n(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f4759b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && h.class.isAssignableFrom(cls);
    }

    public static final g f(Object object) {
        kotlin.jvm.internal.m.e(object, "object");
        boolean z2 = object instanceof g;
        boolean z3 = object instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (g) object);
        }
        if (z3) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z2) {
            return (g) object;
        }
        Class<?> cls = object.getClass();
        k kVar = f4758a;
        if (kVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        Object obj = f4760c.get(cls);
        kotlin.jvm.internal.m.b(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            kVar.a((Constructor) list.get(0), object);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        InterfaceC0514c[] interfaceC0514cArr = new InterfaceC0514c[size];
        for (int i3 = 0; i3 < size; i3++) {
            f4758a.a((Constructor) list.get(i3), object);
            interfaceC0514cArr[i3] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0514cArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f4760c.put(cls, AbstractC0411o.d(constructorB));
            return 2;
        }
        if (C0513b.f4731c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.m.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f4760c.get(superclass);
            kotlin.jvm.internal.m.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.m.d(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.m.d(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f4760c.get(intrface);
                kotlin.jvm.internal.m.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4760c.put(cls, arrayList);
        return 2;
    }
}
