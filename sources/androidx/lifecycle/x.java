package androidx.lifecycle;

import J1.AbstractC0407k;
import J1.AbstractC0411o;
import J1.AbstractC0412p;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f4786a = AbstractC0412p.j(Application.class, s.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f4787b = AbstractC0411o.d(s.class);

    public static final Constructor c(Class modelClass, List signature) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        kotlin.jvm.internal.m.e(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.m.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.m.d(parameterTypes, "constructor.parameterTypes");
            List listZ = AbstractC0407k.Z(parameterTypes);
            if (kotlin.jvm.internal.m.a(signature, listZ)) {
                kotlin.jvm.internal.m.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listZ.size() && listZ.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final y d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(params, "params");
        try {
            return (y) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + modelClass, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e5.getCause());
        }
    }
}
