package e0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: e0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0832m {
    public static boolean a(String str) {
        return AbstractC0828i.c(str);
    }

    public static String b(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i3 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                objArr[i4] = c(objArr[i4]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i5 = 0;
        while (i3 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i5)) != -1) {
            sb.append((CharSequence) strValueOf, i5, iIndexOf);
            sb.append(objArr[i3]);
            i5 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) strValueOf, i5, strValueOf.length());
        if (i3 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e3);
            return "<" + str + " threw " + e3.getClass().getName() + ">";
        }
    }
}
