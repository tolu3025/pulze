package io.grpc.internal;

import h0.AbstractC0879d;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.grpc.internal.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0936c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f8857a = TimeUnit.SECONDS.toNanos(1);

    public static List a(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!(list.get(i3) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i3), Integer.valueOf(i3), list));
            }
        }
        return list;
    }

    public static List b(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!(list.get(i3) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i3), Integer.valueOf(i3), list));
            }
        }
        return list;
    }

    private static boolean c(long j3, int i3) {
        if (j3 >= -315576000000L && j3 <= 315576000000L) {
            long j4 = i3;
            if (j4 >= -999999999 && j4 < f8857a) {
                if (j3 >= 0 && i3 >= 0) {
                    return true;
                }
                if (j3 <= 0 && i3 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List f(Map map, String str) {
        List listE = e(map, str);
        if (listE == null) {
            return null;
        }
        return a(listE);
    }

    public static List g(Map map, String str) {
        List listE = e(map, str);
        if (listE == null) {
            return null;
        }
        return b(listE);
    }

    public static Double h(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d3 = (Double) obj;
        int iIntValue = d3.intValue();
        if (iIntValue == d3.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d3);
    }

    public static Map j(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String k(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long l(Map map, String str) {
        String strK = k(map, str);
        if (strK == null) {
            return null;
        }
        try {
            return Long.valueOf(n(strK));
        } catch (ParseException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static long m(long j3, int i3) {
        long j4 = i3;
        long j5 = f8857a;
        if (j4 <= (-j5) || j4 >= j5) {
            j3 = AbstractC0879d.a(j3, j4 / j5);
            i3 = (int) (j4 % j5);
        }
        if (j3 > 0 && i3 < 0) {
            i3 = (int) (((long) i3) + j5);
            j3--;
        }
        if (j3 < 0 && i3 > 0) {
            i3 = (int) (((long) i3) - j5);
            j3++;
        }
        if (c(j3, i3)) {
            return p(TimeUnit.SECONDS.toNanos(j3), i3);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j3), Integer.valueOf(i3)));
    }

    private static long n(String str) throws ParseException {
        boolean z2;
        String strSubstring;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z2 = true;
        } else {
            z2 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j3 = Long.parseLong(strSubstring2);
        int iO = strSubstring.isEmpty() ? 0 : o(strSubstring);
        if (j3 < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z2) {
            j3 = -j3;
            iO = -iO;
        }
        try {
            return m(j3, iO);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    private static int o(String str) throws ParseException {
        int iCharAt = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            iCharAt *= 10;
            if (i3 < str.length()) {
                if (str.charAt(i3) < '0' || str.charAt(i3) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                iCharAt += str.charAt(i3) - '0';
            }
        }
        return iCharAt;
    }

    private static long p(long j3, long j4) {
        long j5 = j3 + j4;
        return (((j4 ^ j3) > 0L ? 1 : ((j4 ^ j3) == 0L ? 0 : -1)) < 0) | ((j3 ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
