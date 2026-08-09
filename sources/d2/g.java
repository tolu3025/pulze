package d2;

import I1.n;
import I1.o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7045a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            n.a aVar = n.f2411b;
            objB = n.b(new e(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            n.a aVar2 = n.f2411b;
            objB = n.b(o.a(th));
        }
        f7045a = (f) (n.f(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            m.c(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }
}
