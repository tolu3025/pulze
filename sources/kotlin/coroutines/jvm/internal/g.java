package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    private static final void a(int i3, int i4) {
        if (i4 <= i3) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i3 + ", got " + i4 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String strC;
        m.e(aVar, "<this>");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        int iC = c(aVar);
        int i3 = iC < 0 ? -1 : fVarB.l()[iC];
        String strB = i.f9718a.b(aVar);
        if (strB == null) {
            strC = fVarB.c();
        } else {
            strC = strB + '/' + fVarB.c();
        }
        return new StackTraceElement(strC, fVarB.m(), fVarB.f(), i3);
    }
}
