package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.f f4509a = new androidx.collection.f();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.f fVar = f4509a;
        Class cls = (Class) fVar.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        fVar.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        } catch (ClassNotFoundException e4) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists", e4);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }
}
