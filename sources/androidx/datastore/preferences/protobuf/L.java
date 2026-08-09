package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f3997a;

    static {
        char[] cArr = new char[80];
        f3997a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i3, StringBuilder sb) {
        while (i3 > 0) {
            char[] cArr = f3997a;
            int length = i3 > cArr.length ? cArr.length : i3;
            sb.append(cArr, 0, length);
            i3 -= length;
        }
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof AbstractC0492f)) {
                return obj instanceof J ? obj == ((J) obj).b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC0492f.f4066b;
        }
        return obj.equals(obj2);
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i3 = 1; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    static void d(StringBuilder sb, int i3, String str, Object obj) {
        String strA;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i3, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            strA = d0.c((String) obj);
        } else {
            if (!(obj instanceof AbstractC0492f)) {
                if (obj instanceof AbstractC0505t) {
                    sb.append(" {");
                    e((AbstractC0505t) obj, sb, i3 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i3 + 2;
                    d(sb, i4, "key", entry.getKey());
                    d(sb, i4, "value", entry.getValue());
                }
                sb.append("\n");
                a(i3, sb);
                sb.append("}");
                return;
            }
            sb.append(": \"");
            strA = d0.a((AbstractC0492f) obj);
        }
        sb.append(strA);
        sb.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(androidx.datastore.preferences.protobuf.J r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.e(androidx.datastore.preferences.protobuf.J, java.lang.StringBuilder, int):void");
    }

    static String f(J j3, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(j3, sb, 0);
        return sb.toString();
    }
}
