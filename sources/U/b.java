package U;

import U.a;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.AbstractBinderC0062a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2846a;

    private b(Object obj) {
        this.f2846a = obj;
    }

    public static Object b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f2846a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        AbstractC0643s.k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
        } catch (NullPointerException e4) {
            throw new IllegalArgumentException("Binder object is null.", e4);
        }
    }

    public static a f(Object obj) {
        return new b(obj);
    }
}
