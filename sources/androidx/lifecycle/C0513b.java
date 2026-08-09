package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0513b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C0513b f4731c = new C0513b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4732a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4733b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f4734a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f4735b;

        a(Map map) {
            this.f4735b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0516e.a aVar = (AbstractC0516e.a) entry.getValue();
                List arrayList = (List) this.f4734a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f4734a.put(aVar, arrayList);
                }
                arrayList.add((C0091b) entry.getKey());
            }
        }

        private static void b(List list, i iVar, AbstractC0516e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0091b) list.get(size)).a(iVar, aVar, obj);
                }
            }
        }

        void a(i iVar, AbstractC0516e.a aVar, Object obj) {
            b((List) this.f4734a.get(aVar), iVar, aVar, obj);
            b((List) this.f4734a.get(AbstractC0516e.a.ON_ANY), iVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0091b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f4737b;

        C0091b(int i3, Method method) {
            this.f4736a = i3;
            this.f4737b = method;
            method.setAccessible(true);
        }

        void a(i iVar, AbstractC0516e.a aVar, Object obj) {
            try {
                int i3 = this.f4736a;
                if (i3 == 0) {
                    this.f4737b.invoke(obj, new Object[0]);
                } else if (i3 == 1) {
                    this.f4737b.invoke(obj, iVar);
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    this.f4737b.invoke(obj, iVar, aVar);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0091b)) {
                return false;
            }
            C0091b c0091b = (C0091b) obj;
            return this.f4736a == c0091b.f4736a && this.f4737b.getName().equals(c0091b.f4737b.getName());
        }

        public int hashCode() {
            return (this.f4736a * 31) + this.f4737b.getName().hashCode();
        }
    }

    C0513b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i3;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f4735b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f4735b.entrySet()) {
                e(map, (C0091b) entry.getKey(), (AbstractC0516e.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            o oVar = (o) method.getAnnotation(o.class);
            if (oVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!i.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                AbstractC0516e.a aVarValue = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0516e.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC0516e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0091b(i3, method), aVarValue, cls);
                z2 = true;
            }
        }
        a aVar = new a(map);
        this.f4732a.put(cls, aVar);
        this.f4733b.put(cls, Boolean.valueOf(z2));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e3) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
        }
    }

    private void e(Map map, C0091b c0091b, AbstractC0516e.a aVar, Class cls) {
        AbstractC0516e.a aVar2 = (AbstractC0516e.a) map.get(c0091b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0091b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0091b.f4737b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f4732a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f4733b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((o) method.getAnnotation(o.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f4733b.put(cls, Boolean.FALSE);
        return false;
    }
}
